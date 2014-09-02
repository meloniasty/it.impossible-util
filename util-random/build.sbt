it.impossible.sbt.Common.settings

name := "util-random"

libraryDependencies ++= Seq(
  it.impossible.sbt.Dependency.jodaTime,
  it.impossible.sbt.Dependency.jodaConvert
)


libraryDependencies ++= it.impossible.sbt.Dependencies.test