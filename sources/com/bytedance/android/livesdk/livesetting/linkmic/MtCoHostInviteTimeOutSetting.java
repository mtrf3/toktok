package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_co_host_invite_time_out")
/* loaded from: classes11.dex */
public final class MtCoHostInviteTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final MtCoHostInviteTimeOutSetting INSTANCE = new MtCoHostInviteTimeOutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostInviteTimeOutSetting.class);
    }
}
