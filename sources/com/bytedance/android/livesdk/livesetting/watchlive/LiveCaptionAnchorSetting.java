package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_caption_anchor_setting")
/* loaded from: classes6.dex */
public final class LiveCaptionAnchorSetting {
    public static final LiveCaptionAnchorSetting INSTANCE = new LiveCaptionAnchorSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {""};

    public static final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveCaptionAnchorSetting.class);
    }
}
