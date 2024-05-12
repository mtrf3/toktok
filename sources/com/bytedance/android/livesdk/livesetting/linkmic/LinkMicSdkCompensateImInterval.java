package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_compensate_IM_timeout_interval")
/* loaded from: classes6.dex */
public final class LinkMicSdkCompensateImInterval {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 5;
    public static final LinkMicSdkCompensateImInterval INSTANCE = new LinkMicSdkCompensateImInterval();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LinkMicSdkCompensateImInterval.class);
    }
}
