package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_container_optimize")
/* loaded from: classes6.dex */
public final class LiveQuizContainerOptSetting {
    public static final LiveQuizContainerOptSetting INSTANCE = new LiveQuizContainerOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveQuizContainerOpt DEFAULT = new LiveQuizContainerOpt(false, null, null, null, false, 31, null);

    public final LiveQuizContainerOpt getValue() {
        LiveQuizContainerOpt liveQuizContainerOpt = (LiveQuizContainerOpt) SettingsManager.INSTANCE.getValueSafely(LiveQuizContainerOptSetting.class);
        if (liveQuizContainerOpt == null) {
            return DEFAULT;
        }
        return liveQuizContainerOpt;
    }
}
