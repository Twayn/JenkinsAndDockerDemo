pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'master',
                        credentialsId: 'b42b8605-6d70-4b2d-8101-ace7e3362763',
                        url: 'https://github.com/Twayn/JenkinsDemo.git'

                bat "./mvnw package"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}