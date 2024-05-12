package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mp_host")
/* loaded from: classes6.dex */
public final class LiveMPHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://webcast.us.tiktokv.com";
    public static final LiveMPHostSetting INSTANCE = new LiveMPHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMPHostSetting.class);
    }
}
