package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_model_create_opt_anchor_setting")
/* loaded from: classes6.dex */
public final class LiveModelCreateAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveModelCreateAnchorSetting INSTANCE = new LiveModelCreateAnchorSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveModelCreateAnchorSetting.class);
    }
}
