(ns fantastic-voyage.core
  (:require [reagent.core :as r]
            [goog.dom]))

(def by-id goog.dom.getElement)

(defn app-container []
  [:p "Hello World"])

(r/render-component [app-container] (by-id "app"))
