package de.einjojo.worldgenerator.generator;

import org.bukkit.Bukkit;
import org.bukkit.DyeColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.material.Wool;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class ChessMapGenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random random, int chunkX, int chunkZ, BiomeGrid grid) {
        ChunkData chunkData = createChunkData(world);
        chunkX = Math.abs(chunkX) % 2;
        chunkZ = Math.abs(chunkZ) % 2;
        if(chunkX == chunkZ){
            chunkData.setRegion(0,1,0,16,64,16, Material.GRAY_WOOL);
        } else {
            chunkData.setRegion(0,1,0,16,64,16, Material.LIGHT_GRAY_WOOL);
        }
        return chunkData;
    }
}
