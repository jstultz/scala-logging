/*
 * Copyright 2014 Typesafe Inc. <http://www.typesafe.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.typesafe.scalalogging

import org.slf4j.Marker

/**
 * API for a performant logger based on macros.
 */
trait Logger {

  // Error

  def error(message: String): Unit

  def error(message: String, cause: Throwable): Unit

  def error(message: String, args: AnyRef*): Unit

  def error(marker: Marker, message: String): Unit

  def error(marker: Marker, message: String, cause: Throwable): Unit

  // Warn

  def warn(message: String): Unit

  def warn(message: String, cause: Throwable): Unit

  def warn(message: String, args: AnyRef*): Unit

  def warn(marker: Marker, message: String): Unit

  def warn(marker: Marker, message: String, cause: Throwable): Unit

  // Info

  def info(message: String): Unit

  def info(message: String, cause: Throwable): Unit

  def info(message: String, args: AnyRef*): Unit

  def info(marker: Marker, message: String): Unit

  def info(marker: Marker, message: String, cause: Throwable): Unit

  // Debug

  def debug(message: String): Unit

  def debug(message: String, cause: Throwable): Unit

  def debug(message: String, args: AnyRef*): Unit

  def debug(marker: Marker, message: String): Unit

  def debug(marker: Marker, message: String, cause: Throwable): Unit

  // Trace

  def trace(message: String): Unit

  def trace(message: String, cause: Throwable): Unit

  def trace(message: String, args: AnyRef*): Unit

  def trace(marker: Marker, message: String): Unit

  def trace(marker: Marker, message: String, cause: Throwable): Unit
}

/**
 * Utility to keep [[Logger]] methods abstract, because term macros cannot override abstract methods.
 */
private[scalalogging] class BaseLogger extends Logger {

  // Error

  override def error(message: String): Unit =
    ???

  override def error(message: String, cause: Throwable): Unit =
    ???

  override def error(message: String, args: AnyRef*): Unit =
    ???

  override def error(marker: Marker, message: String): Unit =
    ???

  override def error(marker: Marker, message: String, cause: Throwable): Unit =
    ???

  // Warn

  override def warn(message: String): Unit =
    ???

  override def warn(message: String, cause: Throwable): Unit =
    ???

  override def warn(message: String, args: AnyRef*): Unit =
    ???

  override def warn(marker: Marker, message: String): Unit =
    ???

  override def warn(marker: Marker, message: String, cause: Throwable): Unit =
    ???

  // Info

  override def info(message: String): Unit =
    ???

  override def info(message: String, cause: Throwable): Unit =
    ???

  override def info(message: String, args: AnyRef*): Unit =
    ???

  override def info(marker: Marker, message: String): Unit =
    ???

  override def info(marker: Marker, message: String, cause: Throwable): Unit =
    ???

  // Debug

  override def debug(message: String): Unit =
    ???

  override def debug(message: String, cause: Throwable): Unit =
    ???

  override def debug(message: String, args: AnyRef*): Unit =
    ???

  override def debug(marker: Marker, message: String): Unit =
    ???

  override def debug(marker: Marker, message: String, cause: Throwable): Unit =
    ???

  // Trace

  override def trace(message: String): Unit =
    ???

  override def trace(message: String, cause: Throwable): Unit =
    ???

  override def trace(message: String, args: AnyRef*): Unit =
    ???

  override def trace(marker: Marker, message: String): Unit =
    ???

  override def trace(marker: Marker, message: String, cause: Throwable): Unit =
    ???
}
