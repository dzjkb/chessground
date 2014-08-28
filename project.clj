(defproject org.lichess/chessground "0.2.0"
  :description "Extendable basics for chess UIs."
  :license {:name "MIT" :url "http://opensource.org/licenses/MIT"}
  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [org.clojure/core.async "0.1.338.0-5c5012-alpha"]
                 [om "0.7.1"]]
  :cljsbuild
  {:builds [{:id "dev"
             :source-paths ["src"]
             :compiler {:output-to "chessground.js"
                        :output-dir "out"
                        :optimizations :none
                        :source-map true}}]})
