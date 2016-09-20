import com.tapad.docker.DockerComposePlugin.autoImport._
import com.typesafe.sbt.packager.docker.DockerPlugin.autoImport._
import sbt.Command
import sbt.Keys._

import scala.sys.process._

object DockerCompose {

  val settings = Seq(
    dockerImageCreationTask := (publishLocal in Docker).value
    //commands
  )
}