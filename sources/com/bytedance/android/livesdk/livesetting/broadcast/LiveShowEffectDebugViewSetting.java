package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_show_effect_debug_view")
/* loaded from: classes6.dex */
public final class LiveShowEffectDebugViewSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveShowEffectDebugViewSetting INSTANCE = new LiveShowEffectDebugViewSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveShowEffectDebugViewSetting.class);
    }
}
