pipeline {
  agent any
  stages {
    stage('Build Stage') {
        steps {
            build job: 'build_job'
        }
    }
    stage('Test stage') {
        steps {
            build job: 'test_job'
        }
    }
    stage('Deploy stage') {
        steps {
            build job: 'deploy_job'
        }
    }
  }
}