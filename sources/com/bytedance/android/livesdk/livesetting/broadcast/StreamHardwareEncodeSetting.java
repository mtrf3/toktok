package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("stream_hardware_encode")
/* loaded from: classes6.dex */
public final class StreamHardwareEncodeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final StreamHardwareEncodeSetting INSTANCE = new StreamHardwareEncodeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(StreamHardwareEncodeSetting.class);
    }
}
