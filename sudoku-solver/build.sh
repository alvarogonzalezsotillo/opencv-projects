rm *.class
CP=/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar:../lib/java/opencv-2410.jar
scalac -cp $CP SudokuSolver.scala
scala -J-Xmx4G -Djava.library.path=../lib/linux -cp $CP:. Sudoku2go 
