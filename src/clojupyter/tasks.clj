(ns clojupyter.tasks
  (:require [[boot.core :refer :all]
             [clojupyter.core]
             ]))

(defn start-clojupyter [connect-info-json]
  (clojupyter.core/-main connect-info-json))

(defn start-shim-listener
  "Listens for connections from the shim program that Jupyter notebook will run when
  it wants to connect to a kernel.  That program will post a json document that holds
  the connection info describing where the notebook will try to connect to."
  [shim-port]
  )

(deftask run [
              ; task options here
              ]
  (with-pass-thru _
    (start-shim-listener 7777)
    )
  )



