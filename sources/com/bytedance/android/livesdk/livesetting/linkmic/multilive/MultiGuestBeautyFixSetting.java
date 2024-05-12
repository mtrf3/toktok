package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_beauty_fix")
/* loaded from: classes6.dex */
public final class MultiGuestBeautyFixSetting {

    @Group(isDefault = true, value = "enable bugfix")
    public static final int DEFAULT = 1;
    public static final MultiGuestBeautyFixSetting INSTANCE = new MultiGuestBeautyFixSetting();

    public static final boolean enableBugfix() {
        if (SettingsManager.INSTANCE.getIntValue(MultiGuestBeautyFixSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
