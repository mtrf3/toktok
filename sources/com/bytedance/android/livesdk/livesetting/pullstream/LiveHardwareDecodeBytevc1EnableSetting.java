package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_hardware_decode_bytevc1_enable")
/* loaded from: classes6.dex */
public final class LiveHardwareDecodeBytevc1EnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeBytevc1EnableSetting INSTANCE = new LiveHardwareDecodeBytevc1EnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHardwareDecodeBytevc1EnableSetting.class);
    }
}
