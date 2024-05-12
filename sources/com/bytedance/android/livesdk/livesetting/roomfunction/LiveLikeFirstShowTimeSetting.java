package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_like_first_show_time")
/* loaded from: classes6.dex */
public final class LiveLikeFirstShowTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3000;
    public static final LiveLikeFirstShowTimeSetting INSTANCE = new LiveLikeFirstShowTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLikeFirstShowTimeSetting.class);
    }
}
