pipeline {
    agent any
    
    stages{
        stage('compile stage'){
        	steps{
	        	withMaven(maven : 'maven-3.5.3'){
	        	   sh 'mvn clean compile'
	        	}        	    
        	}
        } 
        stage('testing stage'){
         steps{
         	withMaven(maven : 'maven-3.5.3'){
            	sh 'mvn test'
            	}
         }
     	}
     	stage('install stage'){
     	    steps{
     	    withMaven(maven : 'maven-3.5.3'){
     	        sh 'mvn clean install'
     	        }
     	    }
     	}       
    }
}

