package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("adm_server_cfg")
/* loaded from: classes6.dex */
public final class AdmServerCfgSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final AdmServerCfgSetting INSTANCE = new AdmServerCfgSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(AdmServerCfgSetting.class);
    }
}
