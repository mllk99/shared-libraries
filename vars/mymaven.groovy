//import org.skat.MyLogic

def call() {

    sh 'docker container run -i --rm --name my-maven-project -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn clean package'
    archiveArtifacts 'target/gildedrose-*.jar'
    //    def myLogic = new MyLogic()
//    echo "${myLogic.helloFromMyMagic()}"
}
