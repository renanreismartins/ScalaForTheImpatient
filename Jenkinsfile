pipeline {
    agent { docker { image 'bigtruedata/sbt' } }
    stages {
        stage('build') {
            steps {
                sh 'sbt version'
            }
        }
    }
}
