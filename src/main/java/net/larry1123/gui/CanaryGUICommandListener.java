package net.larry1123.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import net.minecraft.server.MinecraftServer;

public class CanaryGUICommandListener implements ActionListener {

    // $FF: synthetic field
    final JTextField a;
    // $FF: synthetic field
    final CanaryGUI b;

    private final CommandLog commandlog;
    private final AutoCommands autocommands;

    CanaryGUICommandListener(CanaryGUI var1, JTextField var2,
	    CommandLog commandlog, AutoCommands autocommands) {
	b = var1;
	a = var2;
	this.commandlog = commandlog;
	this.autocommands = autocommands;
    }

    @Override
    public void actionPerformed(ActionEvent var1) {
	String var2 = a.getText().trim();
	if (var2.length() > 0) {
	    commandlog.addCommand(var2);
	    autocommands.reset();
	    CanaryGUI.a(b).a(var2, MinecraftServer.D());
	}

	a.setText("");
    }

}
