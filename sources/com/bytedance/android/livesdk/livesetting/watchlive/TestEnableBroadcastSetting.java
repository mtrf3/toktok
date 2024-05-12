package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_enable_broadcast")
/* loaded from: classes6.dex */
public final class TestEnableBroadcastSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final TestEnableBroadcastSetting INSTANCE = new TestEnableBroadcastSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(TestEnableBroadcastSetting.class);
    }
}
