pipeline {
    agent any

    stages {
       

        stage('Build & Test') {
            steps {
                echo '🔧 Building and testing Spring Boot app...'
               
            }
        }

        stage('Package') {
            steps {
                echo ' Packaging the app...'
                sh './mvnw clean package -DskipTests'
            }
        }

        stage('Deploy') {
            steps {
                echo ' Deploying application...'
               
            }
        }
    }

   
}
