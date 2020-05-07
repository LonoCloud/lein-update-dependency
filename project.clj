(defproject localize/lein-update-dependency "0.1.2"
  :description "Programmatically update a Leiningen dependency"
  :url "https://github.com/LonoCloud/lein-update-dependency"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[rewrite-clj "0.4.12"]]
  :plugins [[s3-wagon-private "1.3.1"]]
  :eval-in-leiningen true)
