package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pre_create_surface")
/* loaded from: classes6.dex */
public final class LivePreCreateSurfaceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePreCreateSurfaceSetting INSTANCE = new LivePreCreateSurfaceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreCreateSurfaceSetting.class);
    }
}
