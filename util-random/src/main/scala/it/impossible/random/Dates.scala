package it.impossible.random

import org.joda.time.DateTime

import scala.util.Random

object Dates {

  private lazy val MAX_NO_OF_YEARS = 1000

  def nextDate(): DateTime = {
    val max = DateTime.now().plusYears(MAX_NO_OF_YEARS).getMillis

    val r = Random.nextLong() % max

    new DateTime(r)
  }

  def nextDateInPast(): DateTime = {
    val max = DateTime.now().getMillis

    val r = Random.nextLong() % max

    new DateTime(r)
  }

  def nextDateInFuture(): DateTime = {
    val max = DateTime.now().plusYears(MAX_NO_OF_YEARS).getMillis
    val now = DateTime.now().getMillis
    val r = Random.nextInt((max - now).toInt)
    new DateTime(now + r)
  }
}
