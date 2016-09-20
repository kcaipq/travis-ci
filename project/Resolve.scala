import sbt.Keys._
import sbt._

object Resolve {

  val settings = Seq(
    //credentials += Credentials("Bintray API Realm", "api.bintray.com", System.getenv("ARTIFACTORY_USER"), System.getenv("ARTIFACTORY_PASS")),
    resolvers += Resolver.bintrayRepo("kcaipq","maven")
  )
}