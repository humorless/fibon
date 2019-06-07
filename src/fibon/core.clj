(ns fibon.core
  (:gen-class))

(defn my-frequencies [coll]
  (reduce (fn [m v]
            (update-in m [v] (fnil inc 0)))
          {} coll))

(defn fibon [n]
  (map first
       (take n
             (iterate
              (juxt #(apply + %) first)
              [1 0]))))

(defn doSomething []
  (prn "xx"))
