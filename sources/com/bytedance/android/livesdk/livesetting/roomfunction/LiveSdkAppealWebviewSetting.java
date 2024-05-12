package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_appeal_webview")
/* loaded from: classes6.dex */
public final class LiveSdkAppealWebviewSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveSdkAppealWebviewSetting INSTANCE = new LiveSdkAppealWebviewSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSdkAppealWebviewSetting.class);
    }
}
