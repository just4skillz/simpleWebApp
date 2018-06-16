pipeline {
  agent any
  stages {
    stage('Build Stage') {
        build job: 'build_job'
    }
    stage('Test stage') {
        build job: 'test_job'
    }
    stage('Deploy stage') {
        build job: 'deploy_job'
    }
  }
}