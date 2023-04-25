package de.endergamer;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.annotations.Switch;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import cc.polyfrost.oneconfig.config.data.OptionSize;
import cc.polyfrost.oneconfig.events.EventManager;

public class SettingsGui extends Config {
    public SettingsGui() {
        super(new Mod("Fragrun Helper", ModType.SKYBLOCK), "config.json");
        initialize();
    }
    @Switch(
            name = "Toggle Switch (1x)",
            size = OptionSize.SINGLE // optional
    )
    public static boolean bob = false;

}
