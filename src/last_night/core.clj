(ns last-night.core
  (:gen-class))

; word bank
(def single-fixes (list "The" "A" "One"))
(def plural-fixes (list "The" "Some" "A group of"))
(def adjectives (list "emo" "hairy" "old" "young" "cool" "hip" 
                      "hot" "sexy" "ugly" "dull" "dashing" 
                      "radical" "hipster" "famous"))
(def single-nouns (list "man" "woman" "dog" "boy" "girl"
                        "gangster" "nigga" "scientist" "cop"
                        "lady" "stoner" "crackhead" "hippie"
                        "priest" "wizard" "giraffe" "cat"))
(def plural-nouns (list "men" "women" "dogs" "boys" "girls"
                        "gangsters" "niggas" "scientists" 
                        "cops" "ladies" "stoners" "crackheads"
                        "hippies" "priests" "wizards"
                        "giraffes" "cats"))
(def verbs (list "walked home" "ran away" "ran around" 
                 "swam to shore" "swam in the pool" 
                 "danced all night" "got really fucked up"
                 "got mildly stoned" "died a gruesome death"
                 "partied 'til the sun came up"
                 "did absolutely nothing"
              	 "drank plenty of alchohol"))

; choose a random word from a list
(defn word
  [word-list]
  (nth word-list (rand-int (count word-list))))

; pick a random boolean (for singular/plural)
(defn singular? []
  (if (= (rand-int 2) 1)
    true
    false))

; create a randomized sentence using the word bank
(defn create-sentence []
  (if (= (singular?) true)
    (str (word single-fixes) " " (word adjectives) " "
         (word single-nouns) " "(word verbs) ".")
    (str (word plural-fixes) " " (word adjectives) " "
         (word plural-nouns) " " (word verbs) ".")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (create-sentence)))
