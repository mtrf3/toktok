package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_audience_time_out")
/* loaded from: classes6.dex */
public final class LiveInteractAudienceTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 180;
    public static final LiveInteractAudienceTimeOutSetting INSTANCE = new LiveInteractAudienceTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveInteractAudienceTimeOutSetting.class);
    }
}
