package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("webview_native_image_loading")
/* loaded from: classes6.dex */
public final class WebviewNativeImageLoadingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final WebviewNativeImageLoadingSetting INSTANCE = new WebviewNativeImageLoadingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebviewNativeImageLoadingSetting.class);
    }
}
