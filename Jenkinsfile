import com.foobar.*

node{
    stage('Build')
    {
        echo 'this is a scripted pipeline with stage'
        def f = load 'src/com/foobar/Foobar.groovy'
        f.foobarHellow()
        echo 'done'
    }
}
