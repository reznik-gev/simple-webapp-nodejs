pipeline {
    agent any

    options { skipDefaultCheckout() }
    
    stages {
        stage('Clean') {
            steps {
                cleanWs()
            }
        }
        stage('Clone') {
            steps {
                git 'https://github.com/reznik-gev/simple-webapp-nodejs.git'
            }
        }
        stage('Build') {
            steps {
                nodejs('NodeJS-8') {
                    sh 'npm install'
                }
            }
        }
        stage('Test') {
            steps {
                nodejs('NodeJS-8') {
                    sh 'npm test'
                }
            }
        }
    }
}
