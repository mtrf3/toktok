package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_link_state_loop_interval")
/* loaded from: classes6.dex */
public final class MultiHostLinkStateLoopIntervalSetting {
    public static final MultiHostLinkStateLoopIntervalSetting INSTANCE = new MultiHostLinkStateLoopIntervalSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiHostLinkStateLoopIntervalSetting.class);
    }
}
