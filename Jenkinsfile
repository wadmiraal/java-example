node {
  stage('SCM') {
    checkout scm
  }

  stage('SonarQube Analysis') {
    withSonarQubeEnv() {
      // Requires https://plugins.jenkins.io/pipeline-maven/ AND the `maven:` parameter
      // is required if nothing is overridden in the Build config.
      withMaven(maven: 'Default Maven') {
        sh "mvn sonar:sonar"
      }
    }
  }
}
