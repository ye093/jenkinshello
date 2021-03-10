pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }

        stage('Test') {
            steps {
                sh './gradlew check'
            }
        }

    }

    post {
        failure {
            mail to: 'ye_093@163.com',
                 subject: "Failed pipeline: ${currentBuild.fullDisplayName}",
                 body: "Something is wrong with ${env.Build_URL}"
        }
    }
}