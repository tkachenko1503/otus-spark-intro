package com.tkachenko

import org.apache.spark.sql.SparkSession

import org.json4s._
import org.json4s.jackson.JsonMethods._
import org.json4s.Formats

case class Wine(id: Option[Int],
                country: Option[String],
                points: Option[Int],
                price: Option[Double],
                title: Option[String],
                variety: Option[String],
                winery: Option[String])

object JsonReader extends App {
  implicit val formats = DefaultFormats

  val spark = SparkSession
    .builder()
    .master("local[*]")
    .appName("Spark Homework")
    .getOrCreate()

  import spark.implicits._

  val filename = args(0)
  val jsonData = spark.sparkContext
    .textFile(filename)
    .map(x => parse(x).extract[Wine])
    .collect()

  println(jsonData.deep.mkString("\n"))
}
