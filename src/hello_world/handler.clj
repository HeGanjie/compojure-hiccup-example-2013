(ns hello-world.handler
  (:use compojure.core
        hello-world.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.handler :as handler]
            [compojure.route :as route]))

(defroutes app-routes
  (GET "/" [] "Hello World.")
  (GET "/hello" [] hello-in)
  (POST "/hello-out" [name] (hello-out name))
  (route/resources "/")
  (route/not-found "Not Found"))

(def app
  (-> (handler/site app-routes)
      (wrap-base-url)))
