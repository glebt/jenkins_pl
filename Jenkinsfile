def f

node {

    stage('Checkout') {
        checkout scm
    }    

    stage('LoadAndCreateConfig') {
        echo "my test string param ${params.TEST_STRING_PARAMETER}"
        f = load 'src/com/foobar/Foobar.groovy'
        f.createConfig( "client_id_ax1fsd4j9fd", "access_token_asdv8rr90qw77" )
    }    

    stage('Build')
    {
        echo 'this is a scripted pipeline with stage'
        f.foobarHellow()
        echo 'done'
    }
}
