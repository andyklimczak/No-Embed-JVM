package noEmbed

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

class NoEmbedResource {
    val mapper = jacksonObjectMapper()

    @Throws(NoEmbedException::class)
    fun get(url: String): NoEmbed {
        var json = NoEmbedCommand.fetch(url)
        return mapper.readValue(json)
    }
}
