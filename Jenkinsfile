pipeline {
  agent any
  stages {
    stage('Build QA') {
      parallel {
        stage('Build QA') {
          steps {
            sh 'echo"PrintQA"'
          }
        }

        stage('chrome') {
          steps {
            sh 'echo "run on chrome"'
          }
        }

      }
    }

    stage('Build on Stage') {
      parallel {
        stage('Build on Stage') {
          steps {
            sh 'echo "run on stage"'
          }
        }

        stage('FireFox') {
          steps {
            sh 'echo "run on FF"'
          }
        }

        stage('chrome') {
          steps {
            sh 'echo "run on chrome"'
          }
        }

      }
    }

  }
}