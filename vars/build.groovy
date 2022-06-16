def call() {
    sh ''' 
            echo "in parallel"
            mvn clean package
        '''
    stash includes: 'target/*', name: 'app'
}