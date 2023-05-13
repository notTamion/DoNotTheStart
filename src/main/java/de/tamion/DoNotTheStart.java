package de.tamion;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
public final class DoNotTheStart extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.shutdown();

    }
}
