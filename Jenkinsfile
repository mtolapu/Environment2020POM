pipeline {
  agent any
  stages {
    stage('Build QA') {
      parallel {
        stage('Build QA') {
          steps {
            echo 'Build on  QA'
          }
        }

        stage('chrome') {
          steps {
            echo 'Chome'
          }
        }

      }
    }

    stage('Build on Stage') {
      parallel {
        stage('Build on Stage') {
          steps {
            echo 'Stage'
          }
        }

        stage('FireFox') {
          steps {
            echo 'FireFox'
          }
        }

        stage('chrome') {
          steps {
            echo 'Chrome'
          }
        }

      }
    }

  }
}