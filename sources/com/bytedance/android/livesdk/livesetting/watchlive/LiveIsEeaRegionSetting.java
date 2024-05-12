package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_is_eea_region")
/* loaded from: classes6.dex */
public final class LiveIsEeaRegionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveIsEeaRegionSetting INSTANCE = new LiveIsEeaRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveIsEeaRegionSetting.class);
    }
}
