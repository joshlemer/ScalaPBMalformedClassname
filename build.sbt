name := "scalapb-malformed-classname"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "com.google.openrtb" % "openrtb-core" % "1.5.0" % "protobuf",
  "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf",

  "org.apache.flink" %% "flink-scala" % "1.4.0",
  "org.apache.flink" %% "flink-streaming-scala" % "1.4.0"
)

PB.protoSources in Compile ++= Seq(
  target.value / "protobuf_external"
)

PB.targets in Compile := Seq(
  scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value
)
