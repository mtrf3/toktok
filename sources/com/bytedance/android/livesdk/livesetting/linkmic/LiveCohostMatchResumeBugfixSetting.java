package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_match_resume_bugfix_setting")
/* loaded from: classes6.dex */
public final class LiveCohostMatchResumeBugfixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveCohostMatchResumeBugfixSetting INSTANCE = new LiveCohostMatchResumeBugfixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCohostMatchResumeBugfixSetting.class);
    }
}
