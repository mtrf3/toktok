package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_fresco_use_bitmap_565")
/* loaded from: classes6.dex */
public final class LiveSdkFrescoUseBitmap565Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkFrescoUseBitmap565Setting INSTANCE = new LiveSdkFrescoUseBitmap565Setting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkFrescoUseBitmap565Setting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
