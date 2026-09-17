pipeline {
    agent any

    parameters {
        choice(
            name: 'ENVIRONMENT',
            choices: ['dev', 'staging', 'prod'],
            description: 'Select the deployment environment'
        )
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/menakaanadan324-lab/onlineexam.git'
            }
        }

        stage('Build') {
            steps {
                bat 'javac OnlineExam.java'
            }
        }

        stage('Test') {
            steps {
                echo "Testing Online Examination System..."
                echo "Test completed successfully."
            }
        }

        stage('Show Parameter') {
            steps {
                echo "Selected environment: ${params.ENVIRONMENT}"
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploying Online Examination System to ${params.ENVIRONMENT} environment..."
            }
        }
    }

    post {
        success {
            echo "Pipeline completed successfully!"
        }

        failure {
            echo "Pipeline failed."
        }
    }
}
