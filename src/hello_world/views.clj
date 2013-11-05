(ns hello-world.views
  (:use [hiccup core page form]))

(defn html-doc
  [title & body]
  (html4
    [:head [:title title]]
    [:body body]))

(def hello-in
  (html-doc "Hello In"
    (form-to [:post "/hello-out"]
      "Name: "
      (text-field {:size 10} :name "World")
      [:br]
      (reset-button "Reset")
      (submit-button "Greet"))))

(defn hello-out [name]
  (html-doc "Hello Out"
    [:h1 "Hello, " name "!"]))

