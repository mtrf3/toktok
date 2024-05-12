package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_audio_chat_watermark_resolution")
/* loaded from: classes6.dex */
public final class LinkmicAudioChatWatermarkResolutionSetting {
    public static final LinkmicAudioChatWatermarkResolutionSetting INSTANCE = new LinkmicAudioChatWatermarkResolutionSetting();

    @Group(isDefault = true, value = "default group")
    public static final AudioChatWatermarkResolution DEFAULT = new AudioChatWatermarkResolution(0, 0, 3, null);

    public final AudioChatWatermarkResolution getValue() {
        AudioChatWatermarkResolution audioChatWatermarkResolution = (AudioChatWatermarkResolution) SettingsManager.INSTANCE.getValueSafely(LinkmicAudioChatWatermarkResolutionSetting.class);
        if (audioChatWatermarkResolution == null) {
            return DEFAULT;
        }
        return audioChatWatermarkResolution;
    }
}
