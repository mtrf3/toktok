package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_draw")
/* loaded from: classes6.dex */
public final class LiveEnableDrawSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableDrawSetting INSTANCE = new LiveEnableDrawSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableDrawSetting.class);
    }
}
