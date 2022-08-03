package com.github.dreamonex.mirai.botagent;

import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;

public final class BotAgentPlugin extends JavaPlugin {
    public static final BotAgentPlugin INSTANCE = new BotAgentPlugin();

    private BotAgentPlugin() {
        super(new JvmPluginDescriptionBuilder("com.github.dreamonex.mirai.botagent", "0.1.0")
                .name("Bot Agent")
                .author("DreamOneX")
                .build());
    }

    @Override
    public void onEnable() {
        getLogger().info("Plugin loaded!");
    }
}
