package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_spark_inject_prefix_to_host")
/* loaded from: classes6.dex */
public final class LivePrefixInjectToHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivePrefixInjectToHostSetting INSTANCE = new LivePrefixInjectToHostSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePrefixInjectToHostSetting.class);
    }
}
