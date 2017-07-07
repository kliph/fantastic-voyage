(defproject fantastic-voyage "0.1.0-SNAPSHOT"
  :license {:name "The MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :clean-targets ^{:protect false} [:target-path "out" "resources/public/js"]
  :repl-options {:init-ns dev.repl}
  :min-lein-version "2.5.3"
  :dependencies [[org.clojure/clojure "1.9.0-alpha17"]
                 [org.clojure/clojurescript "1.9.562"]
                 [reagent "0.6.2"]]
  :plugins [[lein-cljsbuild "1.1.6"]]
  :figwheel {:css-dirs ["resources/public/css"]
             :server-port 3450}
  :profiles {:dev {:dependencies [[com.cemerick/piggieback "0.2.2"]
                                  [figwheel-sidecar "0.5.10"]
                                  [binaryage/devtools "0.9.4"]]
                   :source-paths ["src" "dev"]
                   :cljsbuild {:builds [{:id "dev"
                                         :source-paths ["src"]
                                         :figwheel true
                                         :compiler {:main "fantastic_voyage.core"
                                                    :preloads [devtools.preload]
                                                    :asset-path "js/out"
                                                    :output-to "resources/public/js/main.js"
                                                    :output-dir "resources/public/js/out"
                                                    :optimizations :none
                                                    :recompile-dependents true
                                                    :source-map true}}]}}})
