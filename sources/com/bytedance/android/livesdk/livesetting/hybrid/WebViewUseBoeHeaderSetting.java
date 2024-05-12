package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_webview_use_boe_header")
/* loaded from: classes6.dex */
public final class WebViewUseBoeHeaderSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final WebViewUseBoeHeaderSetting INSTANCE = new WebViewUseBoeHeaderSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebViewUseBoeHeaderSetting.class);
    }
}
