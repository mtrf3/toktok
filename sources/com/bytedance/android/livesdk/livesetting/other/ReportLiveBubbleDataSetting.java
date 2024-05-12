package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_toplive_bubble_track")
/* loaded from: classes6.dex */
public final class ReportLiveBubbleDataSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final ReportLiveBubbleDataSetting INSTANCE = new ReportLiveBubbleDataSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ReportLiveBubbleDataSetting.class);
    }
}