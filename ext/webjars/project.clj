;; Copyright © 2014-2017, JUXT LTD.

(def VERSION "1.2.0")

(defproject yada/webjars VERSION
  :pedantic? :abort
  :dependencies [[yada/core ~VERSION]
                 [org.webjars/webjars-locator "0.32"]])
