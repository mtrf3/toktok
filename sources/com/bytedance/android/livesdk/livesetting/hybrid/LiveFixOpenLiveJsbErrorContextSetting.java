package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_fix_open_live_jsb_error_context")
/* loaded from: classes6.dex */
public final class LiveFixOpenLiveJsbErrorContextSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveFixOpenLiveJsbErrorContextSetting INSTANCE = new LiveFixOpenLiveJsbErrorContextSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFixOpenLiveJsbErrorContextSetting.class);
    }
}
