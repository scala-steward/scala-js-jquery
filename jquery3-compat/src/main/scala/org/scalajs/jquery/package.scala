package org.scalajs

import org.scalajs.dom.html.Element
import org.scalajs.dom.EventTarget

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

package object jquery {
  @js.native
  @JSImport(module = "jquery", name = "jQuery", globalFallback = "jQuery")
  object jQuery extends JQueryStatic

  type JQuery = net.exoego.scalajs.jquery.JQuery[Element]
  type JQueryAjaxSettings = net.exoego.scalajs.jquery.JQuery.AjaxSettings
  type JQueryCallback = net.exoego.scalajs.jquery.JQuery.Callbacks
  type JQueryPromise = net.exoego.scalajs.jquery.JQuery.Promise[js.Any,js.Any,js.Any]
  type JQueryDeferred = net.exoego.scalajs.jquery.JQuery.Deferred[js.Any,js.Any,js.Any]
  type JQuerySupport = net.exoego.scalajs.jquery.JQuerySupport
  type JQueryStatic = net.exoego.scalajs.jquery.JQueryStatic
  type JQueryEventObject = net.exoego.scalajs.jquery.JQuery.Event
  type JQueryTriggeredEventObject = net.exoego.scalajs.jquery.JQuery.TriggeredEvent[Element, Unit, EventTarget, EventTarget]
  type JQueryTransport = net.exoego.scalajs.jquery.JQuery.Transport
  type JQueryXHR =  net.exoego.scalajs.jquery.JQuery.jqXHR
}
