# fofa-spring-boot-starter

[![GitHub (pre-)release](https://img.shields.io/github/release/0nise/fofa-spring-boot-starter/all.svg)](https://github.com/0nise/fofa-java/releases)
[![stars](https://img.shields.io/github/stars/0nise/fofa-spring-boot-starter.svg)](https://github.com/0nise/fofa-java/stargazers)
[![license](https://img.shields.io/github/license/0nise/fofa-spring-boot-starter.svg)](https://github.com/0nise/fofa-java/blob/master/LICENSE)

[中文文档](https://github.com/0nise/fofa-spring-boot-starter/blob/master/README_zh.md)

## FOFA Pro API
[`FOFA Pro API`](https://fofa.so/api) is an asset search engine [`FOFA Pro`](https://fofa.so) provides a `RESTful API` interface for developers, allowing developers to integrate [`FOFA Pro`](https://fofa.so) functionality into their projects.

## FOFA SDK

A [`FOFA Pro`](https://fofa.so) SDK for `Spring Boot`, based on the [`FOFA Pro API`](https://fofa.so/api), makes it easy for Java developers to quickly integrate [`FOFA Pro`](https://fofa.so) into their projects.

## add dependency

### Apache Maven

```java
<dependency>
  <groupId>com.r4v3zn.fofa</groupId>
  <artifactId>fofa-spring-boot-starter</artifactId>
  <version>1.0.7</version>
</dependency>
```

### Gradle Groovy DSL

```java
implementation 'com.r4v3zn.fofa:fofa-spring-boot-starter:1.0.7'
```

### Gradle Kotlin DSL

```java
compile("com.r4v3zn.fofa:fofa-spring-boot-starter:1.0.7")
```

### Scala SBT

```java
libraryDependencies += "com.r4v3zn.fofa" % "fofa-spring-boot-starter" % "1.0.7"
```

### Apache Ivy

```java
<dependency org="com.r4v3zn.fofa" name="fofa-spring-boot-starter" rev="1.0.7" />
```

### Groovy Grape

```java
@Grapes(
  @Grab(group='com.r4v3zn.fofa', module='fofa-spring-boot-starter', version='1.0.7')
)
```

### Leiningen

```java
[com.r4v3zn.fofa/fofa-spring-boot-starter "1.0.7"]
```

### Apache Buildr

```java
'com.r4v3zn.fofa:fofa-spring-boot-starter:jar:1.0.7'
```

### Maven Central Badge

```java
[![Maven Central](https://img.shields.io/maven-central/v/com.r4v3zn.fofa/fofa-spring-boot-starter.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22com.r4v3zn.fofa%22%20AND%20a:%22fofa-spring-boot-starter%22)
```

### PURL

```java
pkg:maven/com.r4v3zn.fofa/fofa-spring-boot-starter@1.0.7
```

### Bazel

```java
maven_jar(
    name = "fofa-spring-boot-starter",
    artifact = "com.r4v3zn.fofa:fofa-spring-boot-starter:1.0.7",
    sha1 = "eb6ae92fcb15ceba8833e5af8965fc5e96f840da",
)
```

## USE

|field|description|
|:---------:|:-----------------:|
| `email` |User login [`FOFA Pro`](https://fofa.so) mailbox `Email`|
|`key`| Please go to the [`personal center`](https://fofa.so/user/users/info) to view `API Key`|

### Configuration

Configure the `application.yml` or `application.properties` file.

#### application.yml
```yaml
fofa:
  email: 
  key: 
  url:
```
#### application.properties
```properties
fofa.email=
fofa.key=
fofa.url=
```

### User info

```java
public static void main(String[] args) throws Exception {
    // FOFA Pro email
    String email = "";
    // FOFA Pro key
    String key = "";
    FofaClient client = new FofaClient(email, key);
    System.out.println(client.getUser());
}
```

### Search all

#### Code

```java
public static void main(String[] args) throws Exception {
    // FOFA Pro email
    String email = "";
    // FOFA Pro key
    String key = "";
    BASE_URL = "https://fofa.info";
    FofaClient fofaClient = new FofaClient(email, key);
    FofaSearch fofaSearch = new FofaSearch(fofaClient);
    String query = "host=\"fofa.info\"";
    System.out.println(fofaSearch.all(query));
}
```

#### Response

```java
FofaData{mode='extended', page=1, size=74, totalPage=1, query='host="fofa.info"', results=[www.fofa.info, fofa.info, static.fofa.info, https://static.fofa.info, https://fofa.info, api.fofa.info, api.jw.fofa.info:7088, api.g.fofa.info:88, api.jw.fofa.info:88, api.g.fofa.info:8084, api.jw.fofa.info:84, api.jw.fofa.info:81, api.jw.fofa.info:8003, api.g.fofa.info:8083, api.g.fofa.info:7088, api.g.fofa.info:808, https://g.fofa.info, api.jw.fofa.info:8181, https://jw.fofa.info, api.g.fofa.info:8003, api.jw.fofa.info:8083, https://img.gamma.fofa.info, api.g.fofa.info:81, api.g.fofa.info:7070, api.jw.fofa.info:8084, api.jw.fofa.info:808, api.g.fofa.info:8181, api.jw.fofa.info:7070, img.gamma.fofa.info, jw.fofa.info, g.fofa.info, api.g.fofa.info:84, https://35.81.36.22:443, 47.93.92.246:88, https://140.249.61.184:443, 47.93.92.246:808, 47.93.92.246:8003, 47.93.92.246:81, https://106.75.10.35:443, 106.75.10.35:80, 47.93.92.246:7088, 47.93.92.246:84, 140.249.61.184:80, 47.93.92.246:8181, 47.93.92.246:8084, 47.93.92.246:88, 47.93.92.246:7070, 47.93.92.246:81, 47.93.92.246:7070, 47.93.92.246:84, 47.93.92.246:8084, 47.93.92.246:8003, 47.93.92.246:8083, 106.75.10.35:80, 47.93.92.246:808, 47.93.92.246:8083, 47.93.92.246:8181, 47.93.92.246:7088, https://gamma.fofa.info, https://api.gamma.fofa.info, gamma.fofa.info, api.gamma.fofa.info, 1.71.148.8:80, https://1.71.148.8:443, https://79.168.42.251:443, 122.143.5.67:80, https://api.fofa.info, 81.150.11.126:22, www.fofa.info:6443, 117.50.16.112:80, 150.138.167.141:6443, 117.50.16.112:80, https://117.50.16.112:443, https://117.50.16.112:443]}
```

### Search stats agg

#### Code

```java
public static void main(String[] args) throws Exception {
    // FOFA Pro email
    String email = "";
    // FOFA Pro key
    String key = "";
    BASE_URL = "https://fofa.info";
    FofaClient fofaClient = new FofaClient(email, key);
    FofaSearch fofaSearch = new FofaSearch(fofaClient);
    String query = "host=\"fofa.info\"";
    System.out.println(fofaSearch.stats(query));
}
```

#### Response

```java
StatsData{distinct={ip=16}, aggs={countries=[{code=aG9zdD0iZm9mYS5pbmZvIiAmJiBjb3VudHJ5PSJDTiI=, count=71, name=China, name_code=CN, regions=[{code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249IkJlaWppbmci, count=41, name=Beijing}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249IiI=, count=27, name=Unknown}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249Ikd1YW5nZG9uZyI=, count=2, name=Guangdong}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249IkppbGluIg==, count=1, name=Jilin}]}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiBjb3VudHJ5PSJHQiI=, count=1, name=United Kingdom of Great Britain and Northern Ireland, name_code=GB, regions=[{code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249IiI=, count=1, name=Unknown}]}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiBjb3VudHJ5PSJQVCI=, count=1, name=Portugal, name_code=PT, regions=[{code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249Ikxpc2JvbiI=, count=1, name=Lisbon}]}, {code=aG9zdD0iZm9mYS5pbmZvIiAmJiBjb3VudHJ5PSJVUyI=, count=1, name=United States of America, name_code=US, regions=[{code=aG9zdD0iZm9mYS5pbmZvIiAmJiByZWdpb249Ik9yZWdvbiI=, count=1, name=Oregon}]}]}}
```

### Host Agg

#### Code

```java
public static void main(String[] args) throws Exception {
    // FOFA Pro email
    String email = "";
    // FOFA Pro key
    String key = "";
    BASE_URL = "https://fofa.info";
    FofaClient fofaClient = new FofaClient(email, key);
    FofaHost fofaHost = new FofaHost(fofaClient);
    String host = "fofa.info";
    System.out.println(fofaHost.host(host));
}
```

#### Response

```
HostData{host='fofa.info', ip='124.239.250.54', asn=58539, org='null', countryName='China', countryCode='CN', protocol=[http, https, ssh], port=[443, 22, 8080, 9527, 8069, 8089, 80], category=null, product=null}
```

## Update Log

2022-05-29

```
- add search stats api
- add host api
- add search fields
- Update jackson version
- fix bug
```

2022-04-27

    - upgrade `java-fofa` to `1.0.5.RELEASE`

2020-04-27

    - upgrade `java-fofa` to `1.0.2.RELEASE`

2019-06-17

    - open source
