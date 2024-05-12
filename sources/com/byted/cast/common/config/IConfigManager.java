package com.byted.cast.common.config;

/* loaded from: classes29.dex */
public interface IConfigManager {
    void destroy();

    void fetchConfig(ConfigParam configParam, IConfigListener iConfigListener);

    Object getConfig(int i);

    boolean isConfigAvailable();
}
