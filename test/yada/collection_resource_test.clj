;; Copyright © 2015, JUXT LTD.

(ns yada.collection-resource-test
  (:require
   [clojure.test :refer :all]
   [ring.mock.request :refer [request]]
   [clojure.java.io :as io]
   [yada.test.util :refer (given)]
   [yada.yada :refer [yada]]
   yada.collection-resource))

;; Collections are resource too