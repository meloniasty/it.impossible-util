package it.impossible.random

import org.joda.time.DateTime

import scala.util.Random

object Dates {

  private lazy val MAX_NO_OF_YEARS = 1000

  private def max = DateTime.now().plusYears(MAX_NO_OF_YEARS).getMillis

  def nextDate(): DateTime = new DateTime(Random.nextLong() % max)

  def nextDateInPast(): DateTime = new DateTime(Random.nextLong() % DateTime.now().getMillis)

  def nextDateInFuture(): DateTime = new DateTime(DateTime.now().getMillis + Random.nextInt((max - DateTime.now().getMillis).toInt))
}
