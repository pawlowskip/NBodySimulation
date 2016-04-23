package com.pp.nbody.actors

import akka.actor.{Actor, ActorLogging, Props}
import com.pp.nbody.properties.SimulationProperties

/**
  * Created by pp on 4/23/16.
  */
object Root {
  def props(properties: SimulationProperties) = Props(new Root(properties))

  trait RootMessages
  case object StartSimulation extends RootMessages
}

class Root(properties: SimulationProperties) extends Actor with ActorLogging {
  override def receive: Receive = ???
}
