package xyz.lncvrt.chaosmcapi

import org.bukkit.plugin.java.JavaPlugin

@Suppress("unused")
class ChaosMCAPI : JavaPlugin() {
    override fun onEnable() {
        instance = this
    }

    companion object {
        private lateinit var instance: ChaosMCAPI

        fun getInstance(): ChaosMCAPI {
            return instance
        }
    }
}
