package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_event_area_unity_animation_enable")
/* loaded from: classes6.dex */
public final class LiveUnityAnimationEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUnityAnimationEnableSetting INSTANCE = new LiveUnityAnimationEnableSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUnityAnimationEnableSetting.class);
    }
}
