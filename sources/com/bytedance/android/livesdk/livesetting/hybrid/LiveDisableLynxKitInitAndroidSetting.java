package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_disable_lynx_kit_init_android")
/* loaded from: classes6.dex */
public final class LiveDisableLynxKitInitAndroidSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDisableLynxKitInitAndroidSetting INSTANCE = new LiveDisableLynxKitInitAndroidSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDisableLynxKitInitAndroidSetting.class);
    }
}
