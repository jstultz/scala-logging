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
package slf4j

import org.slf4j.{ Logger => Underlying }
import org.slf4j.Marker

/**
 * Companion for [[Logger]].
 */
object Logger {

  /**
   * Create a [[Logger]] wrapping the given underlying `org.slf4j.Logger`.
   */
  def apply(underlying: Underlying): Logger =
    new Logger(underlying)
}

/**
 * Implementation for a performant logger based on macros and an underlying `org.slf4j.Logger`.
 */
final class Logger private (val underlying: Underlying) extends BaseLogger {

  // Error

  override def error(message: String): Unit = macro LoggerMacro.errorMessage

  override def error(message: String, cause: Throwable): Unit = macro LoggerMacro.errorMessageCause

  override def error(message: String, args: AnyRef*): Unit = macro LoggerMacro.errorMessageArgs

  override def error(marker: Marker, message: String): Unit = macro LoggerMacro.errorMessageMarker

  override def error(marker: Marker, message: String, cause: Throwable): Unit = macro LoggerMacro.errorMessageCauseMarker

  // Warn

  override def warn(message: String): Unit = macro LoggerMacro.warnMessage

  override def warn(message: String, cause: Throwable): Unit = macro LoggerMacro.warnMessageCause

  override def warn(message: String, args: AnyRef*): Unit = macro LoggerMacro.warnMessageArgs

  override def warn(marker: Marker, message: String): Unit = macro LoggerMacro.warnMessageMarker

  override def warn(marker: Marker, message: String, cause: Throwable): Unit = macro LoggerMacro.warnMessageCauseMarker

  // Info

  override def info(message: String): Unit = macro LoggerMacro.infoMessage

  override def info(message: String, cause: Throwable): Unit = macro LoggerMacro.infoMessageCause

  override def info(message: String, args: AnyRef*): Unit = macro LoggerMacro.infoMessageArgs

  override def info(marker: Marker, message: String): Unit = macro LoggerMacro.infoMessageMarker

  override def info(marker: Marker, message: String, cause: Throwable): Unit = macro LoggerMacro.infoMessageCauseMarker

  // Debug

  override def debug(message: String): Unit = macro LoggerMacro.debugMessage

  override def debug(message: String, cause: Throwable): Unit = macro LoggerMacro.debugMessageCause

  override def debug(message: String, args: AnyRef*): Unit = macro LoggerMacro.debugMessageArgs

  override def debug(marker: Marker, message: String): Unit = macro LoggerMacro.debugMessageMarker

  override def debug(marker: Marker, message: String, cause: Throwable): Unit = macro LoggerMacro.debugMessageCauseMarker

  // Trace

  override def trace(message: String): Unit = macro LoggerMacro.traceMessage

  override def trace(message: String, cause: Throwable): Unit = macro LoggerMacro.traceMessageCause

  override def trace(message: String, args: AnyRef*): Unit = macro LoggerMacro.traceMessageArgs

  override def trace(marker: Marker, message: String): Unit = macro LoggerMacro.traceMessageMarker

  override def trace(marker: Marker, message: String, cause: Throwable): Unit = macro LoggerMacro.traceMessageCauseMarker
}
