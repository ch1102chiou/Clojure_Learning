(defn hw [x]
    do
    (
        if (= x 1)
        (print "Hello World")
        (println "Hello World")
    )

)

(defn hello_word_n_times [n]
 (
     loop [x n]
     (
        when (> x 0)
        (hw x)
        (recur (- x 1))
     )
 )
)


(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)