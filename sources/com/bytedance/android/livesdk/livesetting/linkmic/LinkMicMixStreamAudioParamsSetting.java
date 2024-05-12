package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mix_stream_audio")
/* loaded from: classes6.dex */
public final class LinkMicMixStreamAudioParamsSetting {
    public static final LinkMicMixStreamAudioParamsSetting INSTANCE = new LinkMicMixStreamAudioParamsSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicMixStreamAudioParams DEFAULT = new LinkMicMixStreamAudioParams(0, 0, 0, null, 15, null);

    public final LinkMicMixStreamAudioParams getValue() {
        LinkMicMixStreamAudioParams linkMicMixStreamAudioParams = (LinkMicMixStreamAudioParams) SettingsManager.INSTANCE.getValueSafely(LinkMicMixStreamAudioParamsSetting.class);
        if (linkMicMixStreamAudioParams == null) {
            return DEFAULT;
        }
        return linkMicMixStreamAudioParams;
    }
}
