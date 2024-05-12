package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("tt_live_webview_monitor_config_slardar_android")
/* loaded from: classes6.dex */
public final class TTLiveWebviewMonitorConfigSlardarAndroidSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final TTLiveWebviewMonitorConfigSlardarAndroidSetting INSTANCE = new TTLiveWebviewMonitorConfigSlardarAndroidSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(TTLiveWebviewMonitorConfigSlardarAndroidSetting.class);
    }
}
