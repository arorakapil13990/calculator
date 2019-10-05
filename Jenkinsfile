pipeline{
agent any
stages{
stage('compile'){
steps{
sh "./mvnw compile"
}
}
stage('test'){
steps{
sh "./mvnw test"
}
}
}
}