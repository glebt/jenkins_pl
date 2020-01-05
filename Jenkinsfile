def f

node {

    stage('Checkout') {
        checkout scm
    }    

    stage('Load') {
        f = load 'src/com/foobar/Foobar.groovy'
        f.createConfig()
    }    

    stage('Build')
    {
        echo 'this is a scripted pipeline with stage'
        f.foobarHellow()
        echo 'done'
    }
}
