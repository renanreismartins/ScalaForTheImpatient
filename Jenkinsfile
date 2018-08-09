pipeline {
    agent { docker { image 'bigtruedata/scala:2.12.2' } }
    stages {
        stage('build') {
            steps {
                sh 'sbt version'
            }
        }
    }
}
