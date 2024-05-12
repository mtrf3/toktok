package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("test_enable_effect")
/* loaded from: classes6.dex */
public final class TestEnableEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final TestEnableEffectSetting INSTANCE = new TestEnableEffectSetting();

    public final boolean disable() {
        return !SettingsManager.INSTANCE.getBooleanValue(TestEnableEffectSetting.class);
    }
}
