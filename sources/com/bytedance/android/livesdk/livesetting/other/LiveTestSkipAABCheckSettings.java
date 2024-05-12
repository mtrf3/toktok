package com.bytedance.android.livesdk.livesetting.other;

import X.C30922CBq;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_test_skip_aab_check")
/* loaded from: classes6.dex */
public final class LiveTestSkipAABCheckSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveTestSkipAABCheckSettings INSTANCE = new LiveTestSkipAABCheckSettings();

    public final boolean getValue() {
        if (C30922CBq.LIZIZ) {
            return true;
        }
        return SettingsManager.INSTANCE.getBooleanValue(LiveTestSkipAABCheckSettings.class);
    }
}
