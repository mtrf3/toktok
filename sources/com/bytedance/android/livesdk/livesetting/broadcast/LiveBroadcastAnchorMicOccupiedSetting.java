package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("anchor_mic_occupied_toast")
/* loaded from: classes6.dex */
public final class LiveBroadcastAnchorMicOccupiedSetting {

    @Group(isDefault = true, value = "Default")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastAnchorMicOccupiedSetting INSTANCE = new LiveBroadcastAnchorMicOccupiedSetting();

    @Group("ShowToast")
    public static final int SETTING1 = 1;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastAnchorMicOccupiedSetting.class);
    }

    public final boolean shouldShowToast() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
