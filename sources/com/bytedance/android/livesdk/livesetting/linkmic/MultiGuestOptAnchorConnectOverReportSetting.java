package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_opt_anchor_connect_over_report")
/* loaded from: classes11.dex */
public final class MultiGuestOptAnchorConnectOverReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestOptAnchorConnectOverReportSetting INSTANCE = new MultiGuestOptAnchorConnectOverReportSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestOptAnchorConnectOverReportSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
