(ns fantastic-voyage.core
  (:require [reagent.core :as r]
            [goog.dom]))

(js/console.log "Hello from cljs, yo")

(def by-id goog.dom.getElement)

(defn app-container []
  [:p "Hello World"])

(r/render-component [app-container] (by-id "app"))
