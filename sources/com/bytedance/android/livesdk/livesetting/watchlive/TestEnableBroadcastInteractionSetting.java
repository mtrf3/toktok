package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_enable_broadcast_interaction")
/* loaded from: classes6.dex */
public final class TestEnableBroadcastInteractionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final TestEnableBroadcastInteractionSetting INSTANCE = new TestEnableBroadcastInteractionSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(TestEnableBroadcastInteractionSetting.class);
    }
}
