package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_play_confirm_interval_setting")
/* loaded from: classes6.dex */
public final class LivePlayConfirmIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;
    public static final LivePlayConfirmIntervalSetting INSTANCE = new LivePlayConfirmIntervalSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LivePlayConfirmIntervalSetting.class);
    }
}
