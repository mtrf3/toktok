package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_enable_pushstream_dns_opt")
/* loaded from: classes6.dex */
public final class PushStreamSupportDnsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("disable group")
    public static final int DISABLE = 0;

    @Group("enable group")
    public static final int ENABLE = 1;
    public static final PushStreamSupportDnsSetting INSTANCE = new PushStreamSupportDnsSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(PushStreamSupportDnsSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
