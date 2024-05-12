package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_quick_linkmic_start_interact_delay")
/* loaded from: classes6.dex */
public final class LiveCoHostQuickLinkmicStartDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHostQuickLinkmicStartDelaySetting INSTANCE = new LiveCoHostQuickLinkmicStartDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostQuickLinkmicStartDelaySetting.class);
    }
}
