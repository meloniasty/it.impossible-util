package it.impossible.sbt
import sbt._


object Dependencies {

  import Dependency._

  val common = Seq(typesafeConfig, jodaTime, jodaConvert) ++ logging

  val test = Seq(mockito, scalatest, specs2)

  val db = Seq(mysql, slickJodaMapper, slick, h2, boneCp)

  val akka = Seq(akkaActor, akkaSlf4j, akkaTestkit, akkaKernel, akkaSlf4j)

  val core = Seq(sprayJson, quartz, csv, scopt)

  val all = common ++ db ++ test ++ core
}

object Dependency {

  // Versions
  object V {
    val spark     = "1.0.2"

    val hadoop    = "2.4.0"

    val Akka = "2.3.3"

    val AkkaSlf4j = "2.3.3"

    val logback = "1.1.2"

    val typesafeConfig = "1.2.1"

    val typesafeSlf4jlogging = "1.1.0"

    val jodaConvert = "1.7"

    val jodaTime = "2.4"

    val sprayJson = "1.2.6"
    val spray = "1.2.0"

    val slf4jVersion = "1.7.7"

    val slick = "2.1.0"
    val slickJodaMapper = "1.2.0"

    val scalaTest = "2.2.1"
    val mockitoAll = "1.9.5"
    val specs2 = "2.4"

    val h2 = "1.4.181"
    val mysql = "5.1.32"
    val boneCp = "0.8.0.RELEASE"
  }

  val slf4jApi = "org.slf4j" % "slf4j-api" % V.slf4jVersion

  val akkaActor = "com.typesafe.akka" %% "akka-actor" % V.Akka
  val akkaTestkit = "com.typesafe.akka" %% "akka-testkit" % V.Akka
  val akkaKernel = "com.typesafe.akka" %% "akka-kernel" % V.Akka
  val akkaSlf4j = "com.typesafe.akka" %% "akka-slf4j" % V.AkkaSlf4j

  val logback = "ch.qos.logback" % "logback-classic" % V.logback //exclude("org.slf4j","slf4j-api")

  val typesafeConfig = "com.typesafe" % "config" % V.typesafeConfig
  val typesafeSlf4jlogging = "com.typesafe.scala-logging" %% "scala-logging-slf4j" % "2.1.2"

  val logging = Seq(slf4jApi, logback, typesafeSlf4jlogging)

  val jodaConvert = "org.joda" % "joda-convert" % V.jodaConvert
  val jodaTime = "joda-time" % "joda-time" % V.jodaTime

  val sprayJson = "io.spray" %% "spray-json" % V.sprayJson

  //test
  val mockito = "org.mockito" % "mockito-all" % V.mockitoAll % "test"
  val scalatest = "org.scalatest" %% "scalatest" % V.scalaTest % "test"
  val specs2 = "org.specs2" %% "specs2-core" % V.specs2 % "test"

  //db
  val h2 = "com.h2database" % "h2" % V.h2
  val mysql = "mysql" % "mysql-connector-java" % V.mysql
  val boneCp = "com.jolbox" % "bonecp" % V.boneCp

  val slick = "com.typesafe.slick" % "slick_2.10" % V.slick

  val slickJodaMapper = "com.github.tototoshi" % "slick-joda-mapper_2.10" % V.slickJodaMapper



  val csv = "com.github.tototoshi" % "scala-csv_2.10" % "1.0.0"

  val quartz = "org.quartz-scheduler" % "quartz" % "2.2.1"

  val maxmindGeoip = "com.snowplowanalytics"  % "scala-maxmind-geoip_2.10"  % "0.0.5"

  val scopt = "com.github.scopt" %% "scopt" % "3.2.0"

  val scalaRainbow = "pl.project13.scala" %% "rainbow" % "0.2"

  val sparkCore = "org.apache.spark" %% "spark-core" % V.spark excludeAll ExclusionRule("org.slf4j")
  val sparkStreaming = "org.apache.spark" %% "spark-streaming" % V.spark excludeAll ExclusionRule("org.slf4j")
  val sparkTools = "org.apache.spark" %% "spark-tools" % V.spark excludeAll ExclusionRule("org.slf4j")

  val commonsLogging = "commons-logging" % "commons-logging" % "1.2"

}