package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("webview_destroy_mode")
/* loaded from: classes6.dex */
public final class WebviewDestroyModeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final WebviewDestroyModeSetting INSTANCE = new WebviewDestroyModeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(WebviewDestroyModeSetting.class);
    }
}
