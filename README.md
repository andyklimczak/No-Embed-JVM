## No Embed Wrapper

Simple wrapper of [noEmbed](https://noembed.com/) for the JVM written in Kotlin

```kotlin
val exampleURL: String = "https://www.youtube.com/watch?v=d9IxdwEFk1c"
if (noEmbed.containsNoEmbedUrl(url)) {
    val testNoEmbed: NoEmbed = noEmbed.get(exampleURL)
    println(testNoEmbed.providerName) // YouTube
}

val testNoEmbed = noEmbed.get("https://bad_url.com") // `NoEmbedException`
```

### Install

```xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
```
```xml
	<dependency>
	    <groupId>com.github.andyklimczak</groupId>
	    <artifactId>No-Embed-JVM</artifactId>
	    <version>-SNAPSHOT</version>
	</dependency>
```
