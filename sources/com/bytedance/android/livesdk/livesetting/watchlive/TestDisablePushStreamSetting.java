package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_disable_push_stream")
/* loaded from: classes6.dex */
public final class TestDisablePushStreamSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final TestDisablePushStreamSetting INSTANCE = new TestDisablePushStreamSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(TestDisablePushStreamSetting.class);
    }
}
