package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_adm_ns_config")
/* loaded from: classes6.dex */
public final class LiveAdmNsTypeSetting {

    @Group(isDefault = true, value = "default group")
    public static final AdmNsConfig DEFAULT;
    public static final LiveAdmNsTypeSetting INSTANCE = new LiveAdmNsTypeSetting();
    public static final AdmNsConfig settingValue;

    static {
        AdmNsConfig admNsConfig = new AdmNsConfig(0, false, null, false, 15, null);
        DEFAULT = admNsConfig;
        AdmNsConfig admNsConfig2 = (AdmNsConfig) SettingsManager.INSTANCE.getValueSafely(LiveAdmNsTypeSetting.class);
        if (admNsConfig2 != null) {
            admNsConfig = admNsConfig2;
        }
        settingValue = admNsConfig;
    }

    public final int getAdmNsType() {
        return settingValue.nsType;
    }

    public final String getAdmNsUrl() {
        return settingValue.nsUrl;
    }

    public final boolean isDebugEnable() {
        return settingValue.enableDebug;
    }

    public final boolean isHeadsetEnabled() {
        return settingValue.enable;
    }
}
