package noEmbed

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty

@JsonIgnoreProperties(ignoreUnknown = true)
data class NoEmbed(val html: String,
                   val title: String,
                   val url: String,
                   @JsonProperty ("provider_name") val providerName: String)
