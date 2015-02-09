rm *.class
scalac -cp ../lib/java/*:. prueba.scala
scala -cp ../lib/java/*:. -Djava.library.path=../lib/linux prueba
