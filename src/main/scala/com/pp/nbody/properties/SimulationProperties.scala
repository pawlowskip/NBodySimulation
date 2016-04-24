package com.pp.nbody.properties
import com.typesafe.config.ConfigFactory
/**
  * Created by pp on 4/23/16.
  */
case class SimulationProperties(spaceWidth: Double,
                                spaceHeight: Double,
                                dt: Double,
                                theta: Double)

object SimulationProperties {
  val baseRelativePath = "simulation.conf"
  val config = ConfigFactory.load(baseRelativePath)

  val get = SimulationProperties(spaceWidth = config.getDouble("spaceWidth"),
                                 spaceHeight = config.getDouble("space Height"),
                                 dt = config.getDouble("dt"),
                                 theta = config.getDouble("theta"))
}
