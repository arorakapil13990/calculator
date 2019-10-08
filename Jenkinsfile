pipeline{
agent any
stages{
stage('compile'){
steps{
sh "./mvnw clean compile"
}
}
stage('test'){
steps{
sh "./mvnw test"
}
}
stage('code-coverage'){
steps{
sh "./mvnw clean verify"
publishHTML (target: [
reportDir: 'build/reports/jacoco/test/html',
reportFiles: 'index.html',
reportNsme: "Jacoco Report"])
}
}
}
}