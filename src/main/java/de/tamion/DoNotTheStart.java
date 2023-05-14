package de.tamion;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
public final class DoNotTheStart extends JavaPlugin {
    @Override
    public void onEnable() {
        for(Plugin pl : Bukkit.getPluginManager().getPlugins()) {
            if(Bukkit.getPluginManager().getPlugins().length==1) {
                Bukkit.getConsoleSender().sendMessage("§c[UNKNOWNPLUGIN] STOPPING SERVER!!!");
                Bukkit.getConsoleSender().sendMessage("§c[UNKNOWNPLUGIN] STOPPING SERVER!!!");
                Bukkit.getConsoleSender().sendMessage("§c[UNKNOWNPLUGIN] STOPPING SERVER!!!");
                pl.getServer().shutdown();
                break;
            }
            if(!pl.getName().equals("StartLobbyPlugin")) {
                Bukkit.getConsoleSender().sendMessage("§c[" + pl.getName() + "] STOPPING SERVER!!!");
                Bukkit.getConsoleSender().sendMessage("§c[" + pl.getName() + "] STOPPING SERVER!!!");
                Bukkit.getConsoleSender().sendMessage("§c[" + pl.getName() + "] STOPPING SERVER!!!");
                pl.getServer().shutdown();
                break;
            }
        }
    }
}
