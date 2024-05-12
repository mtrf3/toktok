package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_disable_webview_file_uri_mt")
/* loaded from: classes6.dex */
public final class LiveDisableWebviewFileUriMtSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveDisableWebviewFileUriMtSetting INSTANCE = new LiveDisableWebviewFileUriMtSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDisableWebviewFileUriMtSetting.class);
    }
}
