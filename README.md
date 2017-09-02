## No Embed Wrapper

Simple wrapper of [noEmbed](https://noembed.com/) for the JVM written in Kotlin

```kotlin
val testNoEmbed: NoEmbed = noEmbed.get("https://www.youtube.com/watch?v=d9IxdwEFk1c123")
println(testNoEmbed.providerName) // YouTube

val testNoEmbed = noEmbed.get("https://bad_url.com") // `NoEmbedException`
```
