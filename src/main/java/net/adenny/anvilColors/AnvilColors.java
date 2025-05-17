package net.adenny.anvilColors;

import net.adenny.anvilColors.events.AnvilRenameListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AnvilColors extends JavaPlugin
{

    @Override
    public void onEnable()
    {
        // Plugin startup logic
        this.getLogger().info("Registering event listener...");
        this.getServer().getPluginManager().registerEvents(new AnvilRenameListener(), this);
        this.getLogger().info("Done!");
    }

    @Override
    public void onDisable()
    {
        // Plugin shutdown logic
    }
}
