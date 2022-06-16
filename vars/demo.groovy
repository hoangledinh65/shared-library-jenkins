def call(message) {
    echo "this is message from my library: ${message}"
    sh 'mvn --version'
}