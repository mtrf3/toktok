package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "online_room_user_count_migrated")
/* loaded from: classes6.dex */
public final class OnlineAudienceShowNumberOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final OnlineAudienceShowNumberOptSetting INSTANCE = new OnlineAudienceShowNumberOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OnlineAudienceShowNumberOptSetting.class);
    }
}
