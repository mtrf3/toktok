package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("public_screen_c2c_delay_report")
/* loaded from: classes6.dex */
public final class LiveAllMessageItemsReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAllMessageItemsReportSetting INSTANCE = new LiveAllMessageItemsReportSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAllMessageItemsReportSetting.class);
    }
}
