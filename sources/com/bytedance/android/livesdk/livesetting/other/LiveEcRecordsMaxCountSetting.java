package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_ec_records_max_count")
/* loaded from: classes6.dex */
public final class LiveEcRecordsMaxCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEcRecordsMaxCountSetting INSTANCE = new LiveEcRecordsMaxCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEcRecordsMaxCountSetting.class);
    }
}
