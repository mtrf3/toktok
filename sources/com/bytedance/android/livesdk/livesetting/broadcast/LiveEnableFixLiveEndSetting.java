package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_fix_live_end")
/* loaded from: classes6.dex */
public final class LiveEnableFixLiveEndSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableFixLiveEndSetting INSTANCE = new LiveEnableFixLiveEndSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableFixLiveEndSetting.class);
    }
}
