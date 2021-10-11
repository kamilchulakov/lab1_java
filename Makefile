JAVAC=javac
Second.class: Second.java
	$(JAVAC) -cp . Second.java
Third.class: Third.java
	$(JAVAC) -cp . Third.java
Main.class: Second.java Third.java Main.java
	$(JAVAC) -cp . Main.java
all: Main.class Second.class Third.class
