package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveIgnoreMessageCheckForBytestSetting;

@SettingsKey("live_mt_ignore_room_check")
/* loaded from: classes6.dex */
public final class LiveMtIgnoreRoomCheckSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtIgnoreRoomCheckSetting INSTANCE = new LiveMtIgnoreRoomCheckSetting();
    public static boolean ignoreRoomCheck;

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveMtIgnoreRoomCheckSetting.class) || ignoreRoomCheck || LiveIgnoreMessageCheckForBytestSetting.INSTANCE.getValue()) {
            return true;
        }
        return false;
    }

    public final void setIgnoreRoomCheck(boolean z) {
        ignoreRoomCheck = z;
    }
}
