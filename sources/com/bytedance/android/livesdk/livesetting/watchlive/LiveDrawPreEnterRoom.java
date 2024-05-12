package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_draw_pre_enter_room")
/* loaded from: classes6.dex */
public final class LiveDrawPreEnterRoom {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveDrawPreEnterRoom INSTANCE = new LiveDrawPreEnterRoom();

    @Group("v1")
    public static final boolean enableValue = true;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveDrawPreEnterRoom.class)) {
            return true;
        }
        return false;
    }
}
