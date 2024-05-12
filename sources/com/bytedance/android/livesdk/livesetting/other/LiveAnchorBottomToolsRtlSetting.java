package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_bottom_tools_rtl")
/* loaded from: classes6.dex */
public final class LiveAnchorBottomToolsRtlSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAnchorBottomToolsRtlSetting INSTANCE = new LiveAnchorBottomToolsRtlSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorBottomToolsRtlSetting.class);
    }
}
