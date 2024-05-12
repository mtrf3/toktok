package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_test_automation_api_enabled")
/* loaded from: classes6.dex */
public final class LiveGiftPerformanceAutoTestSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftPerformanceAutoTestSettings INSTANCE = new LiveGiftPerformanceAutoTestSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPerformanceAutoTestSettings.class);
    }
}
