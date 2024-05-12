package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("allow_html_video")
/* loaded from: classes6.dex */
public final class AllowHtmlVideoSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final AllowHtmlVideoSetting INSTANCE = new AllowHtmlVideoSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AllowHtmlVideoSetting.class);
    }
}
