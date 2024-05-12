package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_bottom_tools_rtl")
/* loaded from: classes6.dex */
public final class LiveAudienceBottomToolsRtlSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAudienceBottomToolsRtlSetting INSTANCE = new LiveAudienceBottomToolsRtlSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAudienceBottomToolsRtlSetting.class);
    }
}
