package it.impossible.random

import org.specs2.mutable._

import it.impossible.random._

class DatesSpec extends Specification {
  "Random date " should {

    "be datetime" in {
      val d = Dates.nextDate()
      d.getYear must be > 0
    }

    "be datetime in past" in {
      val d = Dates.nextDateInPast()
      d.isBeforeNow must beTrue
    }

    "be datetime in future" in {
      val d = Dates.nextDateInFuture()
      d.isAfterNow must beTrue

    }

  }
}
