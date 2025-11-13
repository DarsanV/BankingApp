pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/DarsanV/BankingApp.git'
            }
        }

        stage('Build & Test') {
            steps {
                echo '🔧 Building and testing Spring Boot app...'
                sh './mvnw clean test'  // uses your Maven wrapper
            }
        }

        stage('Package') {
            steps {
                echo '📦 Packaging the app...'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo '🚀 Deploying application...'
                sh '''
                pkill -f "java -jar" || true
                nohup java -jar target/*.jar > app.log 2>&1 &
                '''
            }
        }
    }

    post {
        success {
            echo '✅ Deployment successful!'
        }
        failure {
            echo '❌ Build failed. Check logs.'
        }
    }
}
