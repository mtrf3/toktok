package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C30765C5p;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_audio_mode_opt_anchor")
/* loaded from: classes6.dex */
public final class LinkmicAudioModeOptAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("stop video capture")
    public static final int STOP_VIDEO = 1;

    @Group("stop video capture and un publish stream")
    public static final int STOP_VIDEO_AND_UN_PUBLISH = 2;
    public static final LinkmicAudioModeOptAnchorSetting INSTANCE = new LinkmicAudioModeOptAnchorSetting();
    public static final C5H3 strategy$delegate = C221108m2.LIZIZ(C30765C5p.LJLIL);

    private final int getStrategy() {
        return ((Number) strategy$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicAudioModeOptAnchorSetting.class);
    }

    public final int getAudioStrategy() {
        return getStrategy();
    }
}
