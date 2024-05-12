package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_enable_tfo_preconnect")
/* loaded from: classes6.dex */
public final class LiveSdkEnableTfoPreconnectSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSdkEnableTfoPreconnectSetting INSTANCE = new LiveSdkEnableTfoPreconnectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkEnableTfoPreconnectSetting.class);
    }
}
