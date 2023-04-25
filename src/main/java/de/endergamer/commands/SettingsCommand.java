package de.endergamer.commands;

import cc.polyfrost.oneconfig.config.Config;
import cc.polyfrost.oneconfig.config.data.Mod;
import cc.polyfrost.oneconfig.config.data.ModType;
import de.endergamer.SettingsGui;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;

public class SettingsCommand extends AbstrCommandBase {
    public SettingsCommand() {
        super("Fragrun Helper");
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        new SettingsGui().openGui();
    }
}
