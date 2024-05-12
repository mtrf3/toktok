package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mix_stream_video")
/* loaded from: classes6.dex */
public final class LinkMicMixStreamVideoParamsSetting {
    public static final LinkMicMixStreamVideoParamsSetting INSTANCE = new LinkMicMixStreamVideoParamsSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicMixStreamVideoParams DEFAULT = new LinkMicMixStreamVideoParams(null, 0, 0, 7, null);

    public final LinkMicMixStreamVideoParams getValue() {
        LinkMicMixStreamVideoParams linkMicMixStreamVideoParams = (LinkMicMixStreamVideoParams) SettingsManager.INSTANCE.getValueSafely(LinkMicMixStreamVideoParamsSetting.class);
        if (linkMicMixStreamVideoParams == null) {
            return DEFAULT;
        }
        return linkMicMixStreamVideoParams;
    }
}
