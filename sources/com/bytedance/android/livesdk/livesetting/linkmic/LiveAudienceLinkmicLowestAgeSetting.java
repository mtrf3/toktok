package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_linkmic_lowest_age")
/* loaded from: classes6.dex */
public final class LiveAudienceLinkmicLowestAgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 16;
    public static final LiveAudienceLinkmicLowestAgeSetting INSTANCE = new LiveAudienceLinkmicLowestAgeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAudienceLinkmicLowestAgeSetting.class);
    }
}
