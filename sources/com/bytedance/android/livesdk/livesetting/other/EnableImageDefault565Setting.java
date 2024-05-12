package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_image_default_565")
/* loaded from: classes6.dex */
public final class EnableImageDefault565Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final EnableImageDefault565Setting INSTANCE = new EnableImageDefault565Setting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableImageDefault565Setting.class);
    }
}
