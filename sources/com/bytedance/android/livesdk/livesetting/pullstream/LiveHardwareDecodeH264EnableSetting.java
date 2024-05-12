package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_hardware_decode_h264_enable")
/* loaded from: classes6.dex */
public final class LiveHardwareDecodeH264EnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveHardwareDecodeH264EnableSetting INSTANCE = new LiveHardwareDecodeH264EnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHardwareDecodeH264EnableSetting.class);
    }
}
