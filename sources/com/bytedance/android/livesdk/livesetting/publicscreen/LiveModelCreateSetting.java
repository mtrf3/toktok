package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_model_create_setting")
/* loaded from: classes6.dex */
public final class LiveModelCreateSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveModelCreateSetting INSTANCE = new LiveModelCreateSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveModelCreateSetting.class);
    }
}
