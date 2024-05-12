package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_quiz_audio_fix_setting")
/* loaded from: classes6.dex */
public final class LiveQuizAudioFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveQuizAudioFixSetting INSTANCE = new LiveQuizAudioFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveQuizAudioFixSetting.class);
    }
}
