package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_enable_livecore")
/* loaded from: classes6.dex */
public final class TestEnableLiveCoreSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final TestEnableLiveCoreSetting INSTANCE = new TestEnableLiveCoreSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(TestEnableLiveCoreSetting.class);
    }

    public final boolean disable() {
        return !enable();
    }
}
