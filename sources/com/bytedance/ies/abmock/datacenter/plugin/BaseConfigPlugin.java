package com.bytedance.ies.abmock.datacenter.plugin;

import com.bytedance.ies.abmock.ConfigItem;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract class BaseConfigPlugin {
    public Map<String, ConfigItem> configMap = new HashMap();

    public void addConfigStub() {
    }

    public BaseConfigPlugin() {
        addConfigStub();
    }

    public Map<String, ConfigItem> getConfigMap() {
        return this.configMap;
    }
}
