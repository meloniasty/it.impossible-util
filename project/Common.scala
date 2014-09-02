package it.impossible.sbt

import sbt._
import Keys._
import org.scalastyle.sbt._
import com.typesafe.sbt.SbtScalariform._


object Common {
  val settings: Seq[Setting[_]] = Seq(
    organization := "it.impossible",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.11.2",
    javaOptions :=  Seq("-Xms512M", "-Xmx2024M", "-XX:-HeapDumpOnOutOfMemoryError"),
    scalacOptions ++= Seq("-encoding", "UTF-8", "-target:jvm-1.7", "-unchecked", "-Ywarn-dead-code", "-deprecation","-feature", "-language:postfixOps"),
    scalacOptions in Test ++= Seq("-Yrangepos"),
    credentials := Seq(Credentials(Path.userHome / ".ivy2" / ".credentials")),
    resolvers ++= Seq(
        Resolver.mavenLocal,
        Resolver.sonatypeRepo("releases"),
        Resolver.typesafeRepo("releases"),
        Resolver.typesafeRepo("snapshots"),
        Resolver.sonatypeRepo("snapshots"),
        "Spray Releases" at "http://repo.spray.io",
        "Spray Nightlies" at "http://nightlies.spray.io",
        "Zibra Releases" at "http://internal.zibratech.com:8081/nexus/content/repositories/releases",
        "Zibra Snapshots" at "http://internal.zibratech.com:8081/nexus/content/repositories/snapshots",
        "Twitter Maven Repo" at "http://maven.twttr.com/"
      ),
      parallelExecution in Test := false,
    artifactName in packageBin := { (sv: ScalaVersion, module: ModuleID, artifact: Artifact) =>
      module.organization + "." + artifact.name + "-" + module.revision + "." + artifact.extension
    }
  ) ++ scalariformSettings ++ ScalastylePlugin.Settings ++ net.virtualvoid.sbt.graph.Plugin.graphSettings 
}
