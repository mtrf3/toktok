package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_pts_adjust")
/* loaded from: classes6.dex */
public final class LiveEnablePtsAdjustSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnablePtsAdjustSetting INSTANCE = new LiveEnablePtsAdjustSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnablePtsAdjustSetting.class);
    }
}
