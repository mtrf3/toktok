package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_linkmic_perf")
/* loaded from: classes6.dex */
public final class MultiGuestV3PerfSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MultiGuestV3PerfSetting INSTANCE = new MultiGuestV3PerfSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3PerfSetting.class);
    }
}
