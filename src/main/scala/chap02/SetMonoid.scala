package chap02

import scala.collection.immutable.Set
import scala.language.implicitConversions

//Exercise 2.4
object SetMonoid {
  implicit def union[A] = new Monoid[Set[A]] {
    override def combine(x: Set[A], y: Set[A]) = x ++ y
    def empty = Set.empty[A]
  }
}
