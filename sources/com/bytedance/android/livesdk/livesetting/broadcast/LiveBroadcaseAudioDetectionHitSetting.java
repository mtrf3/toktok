package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_audio_check")
/* loaded from: classes6.dex */
public final class LiveBroadcaseAudioDetectionHitSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcaseAudioDetectionHitSetting INSTANCE = new LiveBroadcaseAudioDetectionHitSetting();

    @Group("show when microphone is used")
    public static final boolean SHOW_HIT_DIALOG = true;

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcaseAudioDetectionHitSetting.class);
    }

    public final boolean showHitDialog() {
        if (getValue()) {
            return true;
        }
        return false;
    }
}
