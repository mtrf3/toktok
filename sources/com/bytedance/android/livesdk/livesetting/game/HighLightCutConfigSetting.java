package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("highlight_cut_config_setting")
/* loaded from: classes6.dex */
public final class HighLightCutConfigSetting {
    public static final HighLightCutConfigSetting INSTANCE = new HighLightCutConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final DefaultHighLightCutConfig DEFAULT = new DefaultHighLightCutConfig();

    public final DefaultHighLightCutConfig getValue() {
        DefaultHighLightCutConfig defaultHighLightCutConfig = (DefaultHighLightCutConfig) SettingsManager.INSTANCE.getValueSafely(HighLightCutConfigSetting.class);
        if (defaultHighLightCutConfig == null) {
            return DEFAULT;
        }
        return defaultHighLightCutConfig;
    }
}
