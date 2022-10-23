<a name="">![Java 11](https://img.shields.io/badge/Java-11-cd853f "Java 11")</a>
<a name="">![Micronaut 3.7.2](https://img.shields.io/badge/Micronaut-3.7.2-6db33f "Micronaut 3.7.2")</a>
<a name="">![Built with Apache Maven](https://img.shields.io/badge/Built%20with-Apache%20Maven-f76504 "Built with Apache Maven")</a>
<a name="">![MIT License](https://img.shields.io/badge/License-MIT-1081c1 "MIT License")</a>

# Micronaut 3 &ndash; Rocker Basic Demo

This is a basic demo project that shows how to use **[Rocker](https://github.com/fizzed/rocker)** (a template engine for Java) with **[Micronaut](https://micronaut.io) 3**.

## License

This project is released under the **MIT License**, a very *permissive* free software license.

See the full text of the license: **[LICENSE.txt](LICENSE.txt)**

## How to build and run the application

You can build and run the application in different ways (depending on your environment and/or IDE).

#### 1) Using Maven to build a &ldquo;shaded&rdquo; JAR that is easy to run

From command line (in project's main directory):
* run `mvn package`
* go into the `target/` directory
* run `java -jar micronaut3-rocker-basic-demo.jar`

#### 2) Using Maven to directly build&run the application

From command line (in project's main directory):
* run `mvn mn:run`

#### 3) Using the Eclipse IDE

**IMPORTANT**: Micronaut makes use of *annotation processing*, so in Eclipse you need to have the m2e-apt. If you don't have it (or if you are not sure):

* open the marketplace (&ldquo;Help&rdquo; -> &ldquo;Eclipse Marketplace...&rdquo;)
* search: **m2e-apt** (you should find: m2e-apt X.Y.Z where X.Y.Z is a version number)
* if the button on the right shows &ldquo;Installed&rdquo;, you already have it. Otherwise, *install* it
* in any case (especially after the m2e-apt installation), check the global preferences (&ldquo;Window&rdquo; -> &ldquo;Preferences&rdquo;), section &ldquo;Maven&rdquo; -> &ldquo;Annotation Processing&rdquo; and ensure that the option &ldquo;**Automatically configure JDT APT ( ..... )**&rdquo; is checked

Then:

* import the project (&ldquo;File&rdquo; -> &ldquo;Import...&rdquo; then &ldquo;Existing Maven Projects&rdquo; etc...)

> **WARNING**: Rocker generates a Java source code for each template file. This is performed by the **`rocker-maven-plugin`**. When you import the project, Eclipse will complain that &ldquo;No marketplace entries found to handle rocker-maven-plugin:*X.Y.Z*:generate in Eclipse.&rdquo;. **Ignore** this error (there's nothing you can do to resolve, for what I know), keep &ldquo;Resolve Later&rdquo; and **finish** the import procedure.
>
> You will have an error in `HomeController.java`. This is normal since Eclipse didn't process the template file using the `rocker-maven-plugin`. You have to manually execute the *generate-sources* phase by:
>
> * running `mvn generate-sources` in project's main directory
> * or using the command &ldquo;Run As&rdquo; -> &ldquo;Maven generate-sources&rdquo; in Eclipse
>
> Then do a &ldquo;Refresh&rdquo; of the project in Eclipse. The error in `HomeController.java` should be resolved.

* build the project (if &ldquo;Build Automatically&rdquo; is not active)
* locate the `Micronaut3RockerBasicDemoApp` class and then &ldquo;Run As&rdquo; -> &ldquo;Java Application&rdquo;

**Note**: other IDEs *may* be used, however you must carefully check if and how the IDE uses *annotation processing*.

## How to use the application

Once the application is running, point your preferred browser to [http://localhost:8080](http://localhost:8080). You should see a simple page showing some version informations.
