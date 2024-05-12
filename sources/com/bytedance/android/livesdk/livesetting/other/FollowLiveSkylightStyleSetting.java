package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "follow_live_skylight_style")
/* loaded from: classes6.dex */
public final class FollowLiveSkylightStyleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final FollowLiveSkylightStyleSetting INSTANCE = new FollowLiveSkylightStyleSetting();

    @Group("v2")
    public static final int V2 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FollowLiveSkylightStyleSetting.class);
    }
}
