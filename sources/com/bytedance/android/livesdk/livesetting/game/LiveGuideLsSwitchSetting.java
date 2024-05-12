package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("open_feature_show_guideLS")
/* loaded from: classes6.dex */
public final class LiveGuideLsSwitchSetting {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final LiveGuideLsSwitchSetting INSTANCE = new LiveGuideLsSwitchSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGuideLsSwitchSetting.class);
    }
}
