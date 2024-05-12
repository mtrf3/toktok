package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_lazy_init_pb_decode_enable")
/* loaded from: classes6.dex */
public final class LiveLazyInitPBDecoderSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLazyInitPBDecoderSetting INSTANCE = new LiveLazyInitPBDecoderSetting();
    public static volatile Boolean enable;

    public final boolean getValue() {
        Boolean bool = enable;
        if (bool == null) {
            bool = Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveLazyInitPBDecoderSetting.class));
            enable = bool;
        }
        return bool.booleanValue();
    }
}
