package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_guide_watting_duration")
/* loaded from: classes6.dex */
public final class LiveGuideWattingDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveGuideWattingDurationSetting INSTANCE = new LiveGuideWattingDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGuideWattingDurationSetting.class);
    }
}
