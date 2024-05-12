package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlivestreamer_access_velive_pusher")
/* loaded from: classes6.dex */
public final class LiveAccessVeLivePusherSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAccessVeLivePusherSetting INSTANCE = new LiveAccessVeLivePusherSetting();

    public final boolean enableVelivePusher() {
        if (SettingsManager.INSTANCE.getIntValue(LiveAccessVeLivePusherSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
