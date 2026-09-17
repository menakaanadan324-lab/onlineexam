pipeline {
    agent any

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

        stage('Generate Report') {
            steps {
                bat 'java OnlineExam'
            }
        }

        stage('Archive Report') {
            steps {
                archiveArtifacts artifacts: 'report.txt',
                    fingerprint: true
            }
        }
    }
}
