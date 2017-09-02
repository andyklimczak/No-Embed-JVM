package noEmbed

@Throws(NoEmbedException::class)
fun get(url: String): NoEmbed {
    val resource = NoEmbedResource()
    return resource.get(url)
}
