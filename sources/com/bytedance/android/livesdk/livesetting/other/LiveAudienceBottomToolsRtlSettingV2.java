package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_audience_bottom_tools_rtl_v2")
/* loaded from: classes6.dex */
public final class LiveAudienceBottomToolsRtlSettingV2 {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAudienceBottomToolsRtlSettingV2 INSTANCE = new LiveAudienceBottomToolsRtlSettingV2();

    public static final boolean isNotSupportRtl() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAudienceBottomToolsRtlSettingV2.class);
    }
}
