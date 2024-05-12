package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("alog_to_applog_switch")
/* loaded from: classes6.dex */
public final class LinkMicALogToAppLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicALogToAppLogSetting INSTANCE = new LinkMicALogToAppLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicALogToAppLogSetting.class);
    }
}
