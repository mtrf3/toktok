package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("deeplink_webcast_webview_enable")
/* loaded from: classes6.dex */
public final class DeeplinkWebcastWebviewEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final DeeplinkWebcastWebviewEnableSetting INSTANCE = new DeeplinkWebcastWebviewEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(DeeplinkWebcastWebviewEnableSetting.class);
    }
}
