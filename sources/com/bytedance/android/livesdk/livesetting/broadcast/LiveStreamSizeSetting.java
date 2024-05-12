package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_size")
/* loaded from: classes6.dex */
public final class LiveStreamSizeSetting {
    public static final LiveStreamSizeSetting INSTANCE = new LiveStreamSizeSetting();

    @Group(isDefault = true, value = "default group")
    public static final int[] DEFAULT = new int[0];

    public final int[] getValue() {
        int[] iArr = (int[]) SettingsManager.INSTANCE.getValueSafely(LiveStreamSizeSetting.class);
        if (iArr == null) {
            return DEFAULT;
        }
        return iArr;
    }
}
