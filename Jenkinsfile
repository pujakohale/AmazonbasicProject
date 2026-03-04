pipeline {
    agent any
    
    parameters{
		choice(name: 'browser' , choices: ['Chrome', 'Edge'], description:'Select browser')
	}

    tools {
        maven 'Maven3'
      
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/puja293/amazonproject.git'
            }
        }
        }
        stage('Parallel Tests'){
			parallel{
				stage('Chrome Test'){
					steps{
						bat "mvn test -Dbrowser=chrome"
					}
					}
					stage('Edge Test'){
					steps{
						bat "mvn test -Dbrowser=edge"
					}
				}
			}
		}

        stage('Build') {
            steps {
               bat 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                bat "mvn test -Dbrowser=${params.browser}"
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
    }

    post {
        always {
            junit '**/target/surefire-reports/*.xml'
            archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
        }
    }
}
