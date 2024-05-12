package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_bitrate")
/* loaded from: classes6.dex */
public final class LiveStreamBitrateSetting {
    public static final LiveStreamBitrateSetting INSTANCE = new LiveStreamBitrateSetting();

    @Group(isDefault = true, value = "default group")
    public static final int[] DEFAULT = new int[0];

    public final int[] getValue() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely(LiveStreamBitrateSetting.class);
        if (iArr == null) {
            return DEFAULT;
        }
        return iArr;
    }
}
