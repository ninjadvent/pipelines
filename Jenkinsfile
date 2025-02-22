pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checkout code'
            }
        }
        stage('Build') {
            steps {
                echo 'Build the project'
            }
        }
        stage('Test') {
            steps {
                echo 'Run tests'
            }
        }
        stage('SonarQube analysis') {
            steps {
                echo 'Run SonarQube analysis'
            }
        }
    }
}
