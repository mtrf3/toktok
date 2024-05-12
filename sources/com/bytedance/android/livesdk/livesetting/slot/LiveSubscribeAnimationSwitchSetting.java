package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_enable_play_subscribe_animation")
/* loaded from: classes6.dex */
public final class LiveSubscribeAnimationSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveSubscribeAnimationSwitchSetting INSTANCE = new LiveSubscribeAnimationSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSubscribeAnimationSwitchSetting.class);
    }
}
