package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("webcast_live_sdk_auto_remove_video_frame_listener")
/* loaded from: classes6.dex */
public final class LiveVideoFrameListenerSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveVideoFrameListenerSettings INSTANCE = new LiveVideoFrameListenerSettings();

    public final boolean autoRemoveFrameListener() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveVideoFrameListenerSettings.class);
    }
}
