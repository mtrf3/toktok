package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("max_tns_piracy_report_data_size")
/* loaded from: classes6.dex */
public final class MaxTnsPiracyReportDataSize {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 600;
    public static final MaxTnsPiracyReportDataSize INSTANCE = new MaxTnsPiracyReportDataSize();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MaxTnsPiracyReportDataSize.class);
    }
}
