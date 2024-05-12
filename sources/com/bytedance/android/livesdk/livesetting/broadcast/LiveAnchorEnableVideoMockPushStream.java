package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_enable_video_mock_push_stream")
/* loaded from: classes6.dex */
public final class LiveAnchorEnableVideoMockPushStream {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAnchorEnableVideoMockPushStream INSTANCE = new LiveAnchorEnableVideoMockPushStream();
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue(LiveAnchorEnableVideoMockPushStream.class);

    public final boolean getValue() {
        return value;
    }

    public static final void setValue(boolean z) {
        value = z;
    }
}
