package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_profile")
/* loaded from: classes6.dex */
public final class LiveStreamProfileSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = -1;
    public static final LiveStreamProfileSetting INSTANCE = new LiveStreamProfileSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStreamProfileSetting.class);
    }
}
