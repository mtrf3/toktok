package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_force_lynx_fallback")
/* loaded from: classes6.dex */
public final class LiveForceLynxFallback {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveForceLynxFallback INSTANCE = new LiveForceLynxFallback();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveForceLynxFallback.class);
    }
}
