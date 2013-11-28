## [giter8](http://github.com/n8han/giter8) template for simple Scala sbt project

### uses
* Scala 2.10.2
* specs2 2.1.1
* scalatest 1.9.1
* junit 4.11

### predefined sbt plugins (require sbt 0.12.4):
* sbteclipse 2.2.0
* sbt-idea 1.5.1


### usage:
Follow g8 [installation instructions](http://github.com/n8han/giter8#readme)  
go to your favourite shell and enter  

    g8 git://github.it.nicta.com.au/etorreborre/simple-scala.g8
    cd [app-name]
    sbt compile

   
generate project files for your favourite IDE

    sbt eclipse
    sbt gen-idea    

add Apache license headers to all files (modify the license in header.txt if you want another license)

    mvn license:format
