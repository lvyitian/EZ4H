package me.liuli.ez4h.command.commands;

import me.liuli.ez4h.bedrock.Client;
import me.liuli.ez4h.command.CommandBase;
import me.liuli.ez4h.command.CommandManager;

import java.util.ArrayList;

public class HelpCommand implements CommandBase {
    @Override
    public String getHelpMessage() {
        return null;
    }

    @Override
    public void exec(String[] args, Client client) {
        ArrayList<String> commandList= CommandManager.getCommandList();
        client.sendAlert("EZ4H COMMANDS("+commandList.size()+" TOTAL)");
        for(String commandName:commandList){
            CommandBase commandBase= CommandManager.getCommandBase(commandName);
            client.sendMessage("`"+commandName+" - "+commandBase.getHelpMessage());
        }
    }
}