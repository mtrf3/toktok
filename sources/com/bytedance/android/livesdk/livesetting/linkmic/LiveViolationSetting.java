package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_guest_violation_use_perception")
/* loaded from: classes6.dex */
public final class LiveViolationSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveViolationSetting INSTANCE = new LiveViolationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveViolationSetting.class);
    }
}
