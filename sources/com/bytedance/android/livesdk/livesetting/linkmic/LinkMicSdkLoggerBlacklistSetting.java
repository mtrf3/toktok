package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_logger_blacklist_conf")
/* loaded from: classes6.dex */
public final class LinkMicSdkLoggerBlacklistSetting {
    public static final LinkMicSdkLoggerBlacklistSetting INSTANCE = new LinkMicSdkLoggerBlacklistSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LinkMicSdkLoggerBlacklistSetting.class);
    }
}
