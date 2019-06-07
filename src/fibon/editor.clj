(ns fibon.editor
  (:gen-class))

(+ 1 2 3 4 5 10)

(def xyz {:x 1 :y 2 :z 3})

(defn prependKeyAndDouble [[k v]]
  (str (name k) (* 2 v)))

(map prependKeyAndDouble xyz) ;;=> ("x2" "y4" "z6")

(defn d [[k v]]
  [k (* 2 v)])

(into {} (map d xyz))         ;;=> {:x 2, :y 4, :z 6}}
