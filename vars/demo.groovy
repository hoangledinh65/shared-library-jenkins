def call(String message, String person, boolean toggle) {
    echo "this is message from my library: ${message}"
    sh 'mvn --version'
    echo "Hello ${person}"
    echo "Toggle: ${toggle}"
    def scriptContent = libraryResource 'demo'
    writeFile file: "demo", text: scriptContent
    sh 'cat demo'
}