package com.garsol

import spray.json.DefaultJsonProtocol

/**
  * Created by galmagro on 5/11/16.
  */
object MyJsonProtocol extends DefaultJsonProtocol {
   implicit val personFormat = jsonFormat3(Person)
}

case class Person(name: String, fistName: String, age: Long)
