(ns ^:figwheel-no-load npmmm.dev
  (:require
    [npmmm.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
