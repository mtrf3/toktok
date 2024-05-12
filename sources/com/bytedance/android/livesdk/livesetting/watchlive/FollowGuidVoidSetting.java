package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@SettingsKey("avoid_conflict_logic")
/* loaded from: classes6.dex */
public final class FollowGuidVoidSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final FollowGuidVoidSetting INSTANCE = new FollowGuidVoidSetting();
    public static int settingValue = LiveLayoutPreloadThreadPriority.DEFAULT;

    public final int getValue() {
        if (settingValue == Integer.MIN_VALUE) {
            settingValue = SettingsManager.INSTANCE.getIntValue(FollowGuidVoidSetting.class);
        }
        return settingValue;
    }
}
