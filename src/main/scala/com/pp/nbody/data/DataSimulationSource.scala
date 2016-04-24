package com.pp.nbody.data
import scala.concurrent.Future
/**
  * Created by pp on 4/23/16.
  */
trait DataSimulationSource {
  def fetch(): Future[Array[Body]]
}

