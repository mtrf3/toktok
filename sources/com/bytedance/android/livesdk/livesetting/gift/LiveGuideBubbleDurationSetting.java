package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_bubble_duration")
/* loaded from: classes6.dex */
public final class LiveGuideBubbleDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveGuideBubbleDurationSetting INSTANCE = new LiveGuideBubbleDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideBubbleDurationSetting.class);
    }
}
