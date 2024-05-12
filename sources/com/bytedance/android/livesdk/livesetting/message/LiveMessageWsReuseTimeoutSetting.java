package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_ws_im_enter_room_timeout")
/* loaded from: classes6.dex */
public final class LiveMessageWsReuseTimeoutSetting {
    public static final LiveMessageWsReuseTimeoutSetting INSTANCE = new LiveMessageWsReuseTimeoutSetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;

    public final long wsImEnterRoomTimeout() {
        return SettingsManager.INSTANCE.getLongValue(LiveMessageWsReuseTimeoutSetting.class);
    }
}
