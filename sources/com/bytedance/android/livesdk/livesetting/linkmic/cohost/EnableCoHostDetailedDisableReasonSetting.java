package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_detailed_cohost_disable_reason")
/* loaded from: classes14.dex */
public final class EnableCoHostDetailedDisableReasonSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableCoHostDetailedDisableReasonSetting INSTANCE = new EnableCoHostDetailedDisableReasonSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableCoHostDetailedDisableReasonSetting.class);
    }
}
