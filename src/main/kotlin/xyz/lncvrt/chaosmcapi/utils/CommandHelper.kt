package xyz.lncvrt.chaosmcapi.utils

import org.bukkit.entity.Player
import xyz.lncvrt.chaosmcapi.ChaosMCAPI

@Suppress("unused")
class CommandHelper {
    fun executeAsPlayer(player: Player, command: String) {
        player.performCommand(command)
    }

    fun executeAsConsole(command: String) {
        val instance = ChaosMCAPI.getInstance()
        instance.server.dispatchCommand(instance.server.consoleSender, command)
    }
}