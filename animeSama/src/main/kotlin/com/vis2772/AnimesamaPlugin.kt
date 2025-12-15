package com.vis2772

import com.lagradost.cloudstream3.plugins.CloudstreamPlugin
import com.lagradost.cloudstream3.plugins.Plugin
import android.content.Context

@CloudstreamPlugin
class AnimesamaPlugin: Plugin() {
    override fun load(context: Context) {
        // Toutes les providers doivent être enregistrés ici
        registerMainAPI(AnimesamaProvider())
    }
}