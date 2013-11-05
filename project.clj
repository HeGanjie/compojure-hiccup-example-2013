(defproject hello-world "0.1.0-SNAPSHOT"
  :description "Example Compojure & Hiccup project, (GET & POST)"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]]
  :plugins [[lein-ring "0.8.8"]]
  :ring {:handler hello-world.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]
                        [hiccup "1.0.4"]]}})
