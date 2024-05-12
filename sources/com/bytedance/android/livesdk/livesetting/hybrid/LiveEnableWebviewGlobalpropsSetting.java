package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_webview_globalprops")
/* loaded from: classes6.dex */
public final class LiveEnableWebviewGlobalpropsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableWebviewGlobalpropsSetting INSTANCE = new LiveEnableWebviewGlobalpropsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableWebviewGlobalpropsSetting.class);
    }
}
