package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_sub_only_video")
/* loaded from: classes6.dex */
public final class EnableSubOnlyVideoSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSubOnlyVideoSetting INSTANCE = new EnableSubOnlyVideoSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSubOnlyVideoSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
