name := "sparkStreaming"

version := "0.1"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq (

  "org.apache.spark" %% "spark-core" % "2.2.1",
  "org.apache.spark" %% "spark-streaming" % "2.2.1",
  "org.apache.spark" %% "spark-sql" % "2.2.1",

  // https://mvnrepository.com/artifact/com.twitter/util-core
  // https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core
  "org.apache.logging.log4j" % "log4j-core" % "2.11.0",
  "org.apache.bahir" %% "spark-streaming-twitter" % "2.2.0",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kafka
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.3"
// https://mvnrepository.com/artifact/org.apache.spark/spark-streaming-kinesis-asl
libraryDependencies += "org.apache.spark" %% "spark-streaming-kinesis-asl" % "2.3.1"
// https://mvnrepository.com/artifact/com.datastax.spark/spark-cassandra-connector
libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "2.3.1"

// https://mvnrepository.com/artifact/org.apache.spark/spark-mllib
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.3.1" % "runtime"





