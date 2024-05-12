package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("link_co_host_need_wait_rtc_joinchannel_succeed")
/* loaded from: classes11.dex */
public final class CoHostNeedWaitRtcJoinChannelSucceed {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CoHostNeedWaitRtcJoinChannelSucceed INSTANCE = new CoHostNeedWaitRtcJoinChannelSucceed();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostNeedWaitRtcJoinChannelSucceed.class);
    }
}
