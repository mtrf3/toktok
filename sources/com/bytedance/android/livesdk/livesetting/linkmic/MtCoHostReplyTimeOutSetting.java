package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_co_host_reply_time_out")
/* loaded from: classes11.dex */
public final class MtCoHostReplyTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final MtCoHostReplyTimeOutSetting INSTANCE = new MtCoHostReplyTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostReplyTimeOutSetting.class);
    }
}
