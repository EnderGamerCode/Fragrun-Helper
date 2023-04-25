package de.endergamer.commands;

import net.minecraft.command.ICommandSender;

public abstract class AbstrCommandBase extends net.minecraft.command.CommandBase {
    private final String name;

    protected AbstrCommandBase(String name) {
        this.name = name;
    }

    @Override
    public String getCommandName() {
        return name;
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "/" + name;
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender sender) {
        return true;
    }
}