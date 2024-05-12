package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_beauty_ab_group")
/* loaded from: classes6.dex */
public final class LiveAudienceBeautyAbGroupSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAudienceBeautyAbGroupSetting INSTANCE = new LiveAudienceBeautyAbGroupSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAudienceBeautyAbGroupSetting.class);
    }
}
