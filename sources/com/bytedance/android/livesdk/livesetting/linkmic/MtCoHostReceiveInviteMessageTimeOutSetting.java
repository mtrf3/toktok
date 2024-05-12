package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_co_host_receive_invite_message_time_out")
/* loaded from: classes11.dex */
public final class MtCoHostReceiveInviteMessageTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 15;
    public static final MtCoHostReceiveInviteMessageTimeOutSetting INSTANCE = new MtCoHostReceiveInviteMessageTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostReceiveInviteMessageTimeOutSetting.class);
    }
}
