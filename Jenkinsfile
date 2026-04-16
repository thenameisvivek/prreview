pipeline {
    agent any

    environment {
        SONAR_TOKEN = credentials('sonarqube-token')
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo "Build stage running"
            }
        }

        stage('SonarQube Test') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    echo "SonarQube connection successful"
                }
            }
        }

    }
}
