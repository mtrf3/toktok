package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_hide_second_user_badge")
/* loaded from: classes6.dex */
public final class FansClubHideSecondUserBadgeSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final FansClubHideSecondUserBadgeSettings INSTANCE = new FansClubHideSecondUserBadgeSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubHideSecondUserBadgeSettings.class);
    }
}
