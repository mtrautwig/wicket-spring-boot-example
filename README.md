# Spring Boot with Wicket example

This small example shows how Wicket can be run inside Spring Boot.

## Build

This example uses Gradle as its build tool. In order to build the source code, run:

```$ ./gradlew build``` 

In order to run the example, run:

```$ ./gradlew bootRun```

Alternatively, run the _WicketSpringApplication_ class directly from your IDE.

## How it works

_WicketApplication_ is registered as a Spring Bean, so that it gets access to the _ApplicationContext_. During 
initialization, it adds a _SpringComponentInjector_ from _wicket-spring_ which provides the injection support for
Wicket Pages and Behaviors. _WicketSpringApplication_ adds the _WicketFilter_ to the Servlet container and initializes 
it with the _WicketApplication_ instance.

## Notes

* In the context of Wicket (pages and behaviors), use _@SpringBean_ or _@Inject_. The injection support
  is provided by wicket-spring, which does not support _@Autowired_.
* The presence of the _Objenesis_ library on the classpath allows to inject Beans without a noargs-constructor 
  (otherwise _Cglib_ is used, which does not).
* Spring WebMVC can still be used alongside Wicket, eg. to provide a REST API.

## References

* [Official Gradle documentation](https://docs.gradle.org)
* [Wicket Guide](https://ci.apache.org/projects/wicket/guide/8.x/single.html)
* [Spring Boot Servlet support](https://docs.spring.io/spring-boot/docs/2.1.7.RELEASE/reference/html/boot-features-developing-web-applications.html#boot-features-embedded-container)
