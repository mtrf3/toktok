package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "end_live_schema_v2_enable")
/* loaded from: classes6.dex */
public final class EndLiveSchemaV2EnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EndLiveSchemaV2EnableSetting INSTANCE = new EndLiveSchemaV2EnableSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EndLiveSchemaV2EnableSetting.class);
    }

    public static final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
