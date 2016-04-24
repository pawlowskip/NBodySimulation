package com.pp.nbody.data

/**
  * Created by pp on 4/23/16.
  */

case class Body(mass: Double, pos: Vector2D, v: Vector2D) {
  def moveBody(f: Vector2D, dt: Double): Body = {
    val a = f / mass
    val dv = a * dt
    val dx = (v + dv) * dt
    Body(mass, pos + dx, v + dv)
  }

  def gravityForce(from: Body): Vector2D = {
    val r = this.pos - from.pos
    r.norm * (Body.G * this.mass * from.mass / Math.pow(r.length, 2))
  }

}

object Body {
  val G = 6.67e-11

  def group(bodies: Seq[Body]): Body = {
    var x = 0.0
    var y = 0.0
    var m = 0.0
    for (body <- bodies) {
      m += body.mass
      x += body.pos.x * body.mass
      y += body.pos.y * body.mass
    }
    Body(m, Vector2D(x / m, y / m), Vector2D.zero)
  }
}

