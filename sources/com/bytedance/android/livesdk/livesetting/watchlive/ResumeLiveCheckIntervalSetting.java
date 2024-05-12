package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("resume_live_check_interval")
/* loaded from: classes6.dex */
public final class ResumeLiveCheckIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 300;
    public static final ResumeLiveCheckIntervalSetting INSTANCE = new ResumeLiveCheckIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(ResumeLiveCheckIntervalSetting.class);
    }
}
