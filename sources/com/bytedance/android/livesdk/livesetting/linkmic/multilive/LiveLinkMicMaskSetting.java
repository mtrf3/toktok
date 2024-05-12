package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_mask_drawable")
/* loaded from: classes6.dex */
public final class LiveLinkMicMaskSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveLinkMicMaskSetting INSTANCE = new LiveLinkMicMaskSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLinkMicMaskSetting.class);
    }
}
