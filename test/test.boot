(set-env!
 :dependencies '[[boot-clojupyter "0.1.0-SNAPSHOT"]] )

(require '[clojupyter.tasks :refer (jupyter)])
(task-options!
   jupyter {
       :shim-port 7777
   }
)
