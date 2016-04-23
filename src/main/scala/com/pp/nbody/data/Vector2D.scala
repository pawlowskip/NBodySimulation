package com.pp.nbody.data

/**
  * Created by pp on 4/23/16.
  */
case class Vector2D(x: Double, y: Double) {
  val length = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2))
  def +(that: Vector2D): Vector2D = Vector2D(this.x + that.x, this.y + that.y)
  def -(that: Vector2D): Vector2D = Vector2D(that.x - this.x, that.y - this.y)
  def distance(that: Vector2D): Double = (this - that).length
  def *(scalar: Double): Vector2D = Vector2D(x * scalar, y * scalar)
  def /(scalar: Double): Vector2D = Vector2D(x / scalar, y / scalar)
  def norm = this / length
}

object Vector2D {
  val zero = Vector2D(0.0, 0.0)
}
