//import org.skat.MyLogic

def call() {
    def projectname = env.BUILD_TAG
    echo "${projectname}" 
    echo "Running mvn clean package"
    sh 'docker container run -i --rm --name "${projectname}" -v "$PWD":/usr/src/mymaven -w /usr/src/mymaven maven:3-jdk-8 mvn clean package'
    archiveArtifacts 'target/gildedrose-*.jar'
    //    def myLogic = new MyLogic()
    //    echo "${myLogic.helloFromMyMagic()}"
}
