package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_layout_params_start_caching_call_count")
/* loaded from: classes6.dex */
public final class LiveLayoutParamsStartCachingCallCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveLayoutParamsStartCachingCallCountSetting INSTANCE = new LiveLayoutParamsStartCachingCallCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLayoutParamsStartCachingCallCountSetting.class);
    }
}
