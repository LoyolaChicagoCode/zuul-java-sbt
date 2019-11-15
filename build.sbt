name := "zuul"

version := "0.1"

javacOptions in compile += "-Xlint:all"

javaOptions += "-enableassertions"

libraryDependencies ++= Seq(
 "org.jline"    %  "jline"            % "3.13.1",
 "com.novocode" %  "junit-interface"  % "0.11" % Test
)

enablePlugins(JavaAppPackaging)
