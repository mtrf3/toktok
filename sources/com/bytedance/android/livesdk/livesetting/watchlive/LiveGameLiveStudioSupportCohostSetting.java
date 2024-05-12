package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_studio_support_cohost")
/* loaded from: classes6.dex */
public final class LiveGameLiveStudioSupportCohostSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveGameLiveStudioSupportCohostSetting INSTANCE = new LiveGameLiveStudioSupportCohostSetting();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGameLiveStudioSupportCohostSetting.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
