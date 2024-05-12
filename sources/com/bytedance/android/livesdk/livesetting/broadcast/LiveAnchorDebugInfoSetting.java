package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_debug_info_setting")
/* loaded from: classes6.dex */
public final class LiveAnchorDebugInfoSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAnchorDebugInfoSetting INSTANCE = new LiveAnchorDebugInfoSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveAnchorDebugInfoSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
