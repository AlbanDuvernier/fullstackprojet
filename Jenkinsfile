pipeline{
    
    agent { dockerfile true}
    stages{
        stage('pull'){
            steps{
              git poll: false, url: 'https://github.com/Peeppers/fullstackprojet'
            }
        }

        stage('build'){
            
        }

        stage('run'){
            steps {
                sh 'docker run test'
            }
        }
    }
}