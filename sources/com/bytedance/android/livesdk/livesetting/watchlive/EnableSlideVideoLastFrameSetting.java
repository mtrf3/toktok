package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_slide_video_last_frame")
/* loaded from: classes6.dex */
public final class EnableSlideVideoLastFrameSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableSlideVideoLastFrameSetting INSTANCE = new EnableSlideVideoLastFrameSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(EnableSlideVideoLastFrameSetting.class);
    }
}
