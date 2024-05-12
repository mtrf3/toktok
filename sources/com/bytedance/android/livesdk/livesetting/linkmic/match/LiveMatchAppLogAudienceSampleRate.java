package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_match_audience_tea_monitor_sample_percentage")
/* loaded from: classes6.dex */
public final class LiveMatchAppLogAudienceSampleRate {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final LiveMatchAppLogAudienceSampleRate INSTANCE = new LiveMatchAppLogAudienceSampleRate();

    public final int getRate() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchAppLogAudienceSampleRate.class);
    }
}
