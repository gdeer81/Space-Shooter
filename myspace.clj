(ns myspace (:require [arcadia.core :as c]))

(c/log "myspace loaded")

;;;;player controller;;;;;;;;;;;
;;default values:
;;speed 10
;;tilt 3
;;xMin -6.5 xMax 6.5 zMin -4 zMax 8
;;shot is a bolt prefab
;;shot spawn is a transform
;;fire rate 0.25
;;default values hardcoded for brevity

(defn move-player []
  (let [move-horizonal (Input/GetAxis "Horizontal")
        move-vertical (Input/GetAxis "Vertical")
        speed 10
        ]))

;(c/cmpt (c/object-named "player") UnityEngine.Rigidbody)
; (require '[arcadia.linear :as l])

; (l/v3 (Mathf/Clamp 1 2 3) 0.0 (Mathf/Clamp 1 2 3))
