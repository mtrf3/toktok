package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C30922CBq;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_disable_pull_stream")
/* loaded from: classes6.dex */
public final class TestDisablePullStreamSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisablePullStreamSetting INSTANCE = new TestDisablePullStreamSetting();

    public final boolean getValue() {
        if (C30922CBq.LIZIZ) {
            return SettingsManager.INSTANCE.getBooleanValue(TestDisablePullStreamSetting.class);
        }
        return false;
    }
}
