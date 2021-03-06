package net.larry1123.gui.player;

import javax.swing.JTextField;

import net.larry1123.gui.updaters.Reload;
import net.larry1123.gui.updaters.Reset;
import net.larry1123.gui.updaters.Save;

public class Hunger extends JTextField implements Reload, Save, Reset {

    private final PlayerSettings playerSettings;

    public Hunger(PlayerSettings playerSettings) {
        this.playerSettings = playerSettings;
        this.playerSettings.getUpdater().addUpdater(this);
    }

    @Override
    public void reset() {
        this.setText("" + playerSettings.getPlayer().getHunger());
    }

    @Override
    public void save() {
        playerSettings.getPlayer().setHunger(Integer.parseInt(getText()));
    }

    @Override
    public void reload() {
        reset();
    }

}
