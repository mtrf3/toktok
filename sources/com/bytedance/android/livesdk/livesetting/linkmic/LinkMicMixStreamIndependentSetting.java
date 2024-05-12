package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mix_stream_independent")
/* loaded from: classes6.dex */
public final class LinkMicMixStreamIndependentSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMixStreamIndependentSetting INSTANCE = new LinkMicMixStreamIndependentSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMixStreamIndependentSetting.class);
    }
}
