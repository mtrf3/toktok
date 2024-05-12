package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_rtc_reply_msg_enable")
/* loaded from: classes11.dex */
public final class MtCoHostRtcReplyMsgSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MtCoHostRtcReplyMsgSetting INSTANCE = new MtCoHostRtcReplyMsgSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostRtcReplyMsgSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
