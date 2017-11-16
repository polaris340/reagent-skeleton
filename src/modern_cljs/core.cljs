(ns modern-cljs.core
  (:require [reagent.core :as r]
            [cljsjs.marked]))

(defn comment-box []
      [:div "Hello, world!"])


(r/render [comment-box] (.getElementById js/document "app"))