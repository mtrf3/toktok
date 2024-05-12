package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_remove_connect_succ_report")
/* loaded from: classes11.dex */
public final class LiveSdkRemoveConnectSuccReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkRemoveConnectSuccReportSetting INSTANCE = new LiveSdkRemoveConnectSuccReportSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkRemoveConnectSuccReportSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
