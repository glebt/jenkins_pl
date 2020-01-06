def f

node {

    stage('Checkout') {
        checkout scm
    }    

    stage('LoadAndCreateConfig') {
        echo "my test string param ${params.TEST_STRING_PARAMETER}"
        f = load 'src/com/foobar/Foobar.groovy'
        f.createConfig(${params.TEST_STRING_PARAMETER}, ${params.CLIENT_SECRET_PARAM})
    }    

    stage('Build')
    {
        echo 'this is a scripted pipeline with stage'
        f.foobarHellow()
        echo 'done'
    }
}
