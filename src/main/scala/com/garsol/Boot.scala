package com.garsol

import akka.actor.{ActorSystem, Props}
import akka.io.IO
import akka.util.Timeout
import akka.pattern.ask
import spray.can.Http
import scala.concurrent.duration._

/**
  * Created by galmagro on 5/11/16.
  */
object Boot extends App {

  //create our actor system with name garsol
  implicit val system = ActorSystem("garsol")
  val service = system.actorOf(Props[ServiceActor], "sj-rest-service")

  implicit val timeout = Timeout(5.seconds)
  IO(Http) ? Http.Bind(service, interface = "localhost" , port = 8080)
}
