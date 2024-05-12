package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_live_studio_pause_widget")
/* loaded from: classes6.dex */
public final class LiveGameLiveStudioPauseWidget {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int GROUP_EXPERIMENT = 1;
    public static final LiveGameLiveStudioPauseWidget INSTANCE = new LiveGameLiveStudioPauseWidget();

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGameLiveStudioPauseWidget.class);
    }

    public final boolean isExperimentGroup() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
