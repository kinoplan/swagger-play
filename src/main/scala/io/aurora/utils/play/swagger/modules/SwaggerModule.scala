package io.aurora.utils.play.swagger.modules

import io.aurora.utils.play.swagger.{SwaggerPlugin, SwaggerPluginImpl}
import io.aurora.utils.play.swagger.controllers.SwaggerController
import play.api.{Configuration, Environment}
import play.api.inject.{Binding, Module}

class SwaggerModule extends Module {

  override def bindings(environment: Environment, configuration: Configuration): Seq[Binding[_]] =
    Seq(bind[SwaggerPlugin].to[SwaggerPluginImpl].eagerly(), bind[SwaggerController].toSelf.eagerly())

}
