package noEmbed

object NoEmbedCommand {

    @Throws(NoEmbedException::class)
    @JvmStatic
    fun fetch(url: String): String {
        val json = khttp.get("https://noEmbed.com/embed?url=$url")
        val jsonObject = json.jsonObject
        if(jsonObject.has("error")) {
            throw NoEmbedException("NoEmbedWrapper could not get response for: $url")
        } else {
            return jsonObject.toString()
        }
    }
}
