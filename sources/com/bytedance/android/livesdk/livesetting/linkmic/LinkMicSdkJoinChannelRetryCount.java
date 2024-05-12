package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_join_channel_retry_count")
/* loaded from: classes6.dex */
public final class LinkMicSdkJoinChannelRetryCount {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 1;
    public static final LinkMicSdkJoinChannelRetryCount INSTANCE = new LinkMicSdkJoinChannelRetryCount();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LinkMicSdkJoinChannelRetryCount.class);
    }
}
