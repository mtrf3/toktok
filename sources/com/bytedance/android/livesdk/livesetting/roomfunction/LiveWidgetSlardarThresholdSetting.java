package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_widget_slardar_threshold")
/* loaded from: classes6.dex */
public final class LiveWidgetSlardarThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LiveWidgetSlardarThresholdSetting INSTANCE = new LiveWidgetSlardarThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveWidgetSlardarThresholdSetting.class);
    }
}
