package com.bytedance.android.livesdk.livesetting.message;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_im_ws_delay_disconnect_interval")
/* loaded from: classes6.dex */
public final class LiveMessageReleaseDelayDisconnectSetting {
    public static final LiveMessageReleaseDelayDisconnectSetting INSTANCE = new LiveMessageReleaseDelayDisconnectSetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 30000;

    public final long releaseDelayDisconnectTime() {
        return SettingsManager.INSTANCE.getLongValue(LiveMessageReleaseDelayDisconnectSetting.class);
    }
}
