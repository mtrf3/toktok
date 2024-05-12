package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ve_camera2_setting")
/* loaded from: classes6.dex */
public final class LiveVECamera2Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveVECamera2Setting INSTANCE = new LiveVECamera2Setting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveVECamera2Setting.class);
    }
}
