package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_link_mic_default_mask")
/* loaded from: classes6.dex */
public final class LiveLinkMicDefaultMaskSetting {

    @Group(isDefault = true, value = "use only bg")
    public static final int DEFAULT = 2;
    public static final LiveLinkMicDefaultMaskSetting INSTANCE = new LiveLinkMicDefaultMaskSetting();

    @Group("use avatar and bg")
    public static final int USE_AVATAR_BG = 1;

    public final boolean useDefault() {
        if (SettingsManager.INSTANCE.getIntValue(LiveLinkMicDefaultMaskSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean useOnlyBg() {
        if (SettingsManager.INSTANCE.getIntValue(LiveLinkMicDefaultMaskSetting.class) == 2) {
            return true;
        }
        return false;
    }
}
