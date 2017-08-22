(ns ^:figwheel-no-load cljs-hangman.dev
  (:require
    [cljs-hangman.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
