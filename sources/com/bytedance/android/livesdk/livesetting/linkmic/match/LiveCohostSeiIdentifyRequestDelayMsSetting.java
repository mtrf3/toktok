package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_sei_identify_request_delay_time_ms")
/* loaded from: classes6.dex */
public final class LiveCohostSeiIdentifyRequestDelayMsSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2000;
    public static final LiveCohostSeiIdentifyRequestDelayMsSetting INSTANCE = new LiveCohostSeiIdentifyRequestDelayMsSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveCohostSeiIdentifyRequestDelayMsSetting.class);
    }
}
