package de.einjojo.worldgenerator;

import de.einjojo.worldgenerator.generator.ChessMapGenerator;
import org.bukkit.Bukkit;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class WorldGenerator extends JavaPlugin {

    public WorldGenerator instance;

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§cChessWorldGenerator §7developed by Ein_Jojo");
    }

    @Override
    public void onDisable() {

    }

    @Override
    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new ChessMapGenerator();
    }
}
