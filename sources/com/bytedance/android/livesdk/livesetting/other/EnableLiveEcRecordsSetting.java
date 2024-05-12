package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "enable_live_ec_records")
/* loaded from: classes6.dex */
public final class EnableLiveEcRecordsSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveEcRecordsSetting INSTANCE = new EnableLiveEcRecordsSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableLiveEcRecordsSetting.class);
    }
}
