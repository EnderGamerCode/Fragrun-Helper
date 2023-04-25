package de.endergamer;

import cc.polyfrost.oneconfig.events.EventManager;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import cc.polyfrost.oneconfig.libs.eventbus.Subscribe;
import de.endergamer.commands.SettingsCommand;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = FragHelper.MODID,name = FragHelper.NAME,version = FragHelper.VERSION,clientSideOnly = true)
public class FragHelper {

    public static final String MODID = "fraghelper",
                               NAME = "Fragrun Helper",
                               VERSION = "1.1.0",
                               PREFIX = "§6[§bFragrunHelper§6]" ;

    public static SettingsGui config;


    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new SettingsCommand());
    }
    @Subscribe
    public void onInitConfig(InitializationEvent event){
        config = new SettingsGui();
    }
}
