package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_level_badge_switch")
/* loaded from: classes6.dex */
public final class FansClubBadgeShowEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubBadgeShowEnableSetting INSTANCE = new FansClubBadgeShowEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubBadgeShowEnableSetting.class);
    }
}
