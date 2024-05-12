package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_rtc_permit_msg_enable")
/* loaded from: classes11.dex */
public final class MtCoHostRtcPermitMsgSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MtCoHostRtcPermitMsgSetting INSTANCE = new MtCoHostRtcPermitMsgSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostRtcPermitMsgSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}