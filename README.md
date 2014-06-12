instrumentation-agent
=====================

To start a clojure repl with the agent

```
java -javaagent:agent.jar -cp <clojure-project-uberjar> clojure.main
```

Check the size of an object

```clj
(aspasia.util.MyAgent/getObjectSize "lala")
