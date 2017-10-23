(set-env!
 :source-paths #{"src"}
 :resource-paths #{"resources"}

 :dependencies '[[clojupyter "0.1.0"]
                 ]
 )

(task-options!
 pom {
      :project 'boot-clojupyter
      :version "0.1.0-SNAPSHOT"
      :description "boot tasks to use Jupyter notebook as REPL"
      :url "http://github.com/pragsmike/boot-clojupyter"
      :license {:name "MIT"}
      }
 )

;;;  :jvm-opts ["-Xmx250m"]
;;;  :keep-non-project-classes true
