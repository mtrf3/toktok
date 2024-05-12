package com.bytedance.router.plugin;

import java.util.List;

/* loaded from: classes11.dex */
public interface SupportPluginCallback {
    List<Plugin> initPlugins();

    void loadPlugin(Plugin plugin, String str);
}
