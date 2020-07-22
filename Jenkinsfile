pipeline {
    agent any

    stages {
        stage('Checkout from SCM') {
            steps {
                echo 'Checkout..'
                git branch: 'master',
                    credentialsId: 'b42b8605-6d70-4b2d-8101-ace7e3362763',
                    url: 'https://github.com/Twayn/JenkinsDemo.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Build..'
                bat "./mvnw package -Dmaven.test.skip=true"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                bat "./mvnw test"
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                bat "start java -jar ./target/demo-0.0.1-SNAPSHOT.war"
            }
        }
        stage('Waiting for deploy') {
            steps {
                echo 'Sleeping....'
                bat "ping -n 15 127.0.0.1"
            }
        }
        stage('Smoke') {
            steps {
                echo 'Smoke....'
                bat "curl http://localhost:8081/hello"
            }
        }
    }
}