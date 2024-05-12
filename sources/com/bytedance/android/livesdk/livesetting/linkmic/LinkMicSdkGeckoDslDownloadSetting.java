package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_remote_dsl_file_setting")
/* loaded from: classes11.dex */
public final class LinkMicSdkGeckoDslDownloadSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicSdkGeckoDslDownloadSetting INSTANCE = new LinkMicSdkGeckoDslDownloadSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicSdkGeckoDslDownloadSetting.class);
    }
}
