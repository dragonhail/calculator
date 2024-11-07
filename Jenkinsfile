pipeline{
    agent any
    stages{
        stage("Permission"){
            steps{
                sh "chmod +x ./gradlew"
            }
        }

        stage("Compile"){
            steps{
                sh "./gradlew compileJava"
            }
        }
        stage("Code Coverage"){
            steps{
                sh "./gradlew jacocoTestCoverageVerification"
                sh "./gradlew jacocoTestReport"
        }
    }
}