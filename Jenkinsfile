pipeline {
  agent any
  stages {
    stage('Build Stage') {
        steps {
            build job: 'build_job'
        }
    }
    stage('Staging test') {
        steps {
            build job: 'staging_test_job'
        }
    }
    stage('Staging deploy') {
        steps {
            build job: 'staging_deploy_job'
        }
    }
    stage('Production test') {
        steps {
            build job: 'production_test_job'
        }
    }
    stage('Production deploy') {
        steps {
            build job: 'production_deploy_job'
        }
    }
  }
}