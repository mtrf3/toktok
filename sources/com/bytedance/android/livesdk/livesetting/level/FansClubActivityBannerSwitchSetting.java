package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_banner_switch")
/* loaded from: classes6.dex */
public final class FansClubActivityBannerSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubActivityBannerSwitchSetting INSTANCE = new FansClubActivityBannerSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubActivityBannerSwitchSetting.class);
    }
}
