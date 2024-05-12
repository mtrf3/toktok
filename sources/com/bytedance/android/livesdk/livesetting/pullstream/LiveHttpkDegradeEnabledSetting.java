package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_httpk_degrade_enabled")
/* loaded from: classes6.dex */
public final class LiveHttpkDegradeEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHttpkDegradeEnabledSetting INSTANCE = new LiveHttpkDegradeEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHttpkDegradeEnabledSetting.class);
    }
}
