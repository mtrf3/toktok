package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_linkmic_remote_video_frozen")
/* loaded from: classes6.dex */
public final class RemoteVideoFrozenSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 200;
    public static final RemoteVideoFrozenSetting INSTANCE = new RemoteVideoFrozenSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(RemoteVideoFrozenSetting.class);
    }
}
