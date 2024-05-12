package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fans_club_api_request_switch")
/* loaded from: classes6.dex */
public final class FansClubApiRequestEnableSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubApiRequestEnableSettings INSTANCE = new FansClubApiRequestEnableSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubApiRequestEnableSettings.class);
    }
}
