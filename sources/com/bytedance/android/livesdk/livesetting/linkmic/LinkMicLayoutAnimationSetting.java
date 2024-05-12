package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("link_mic_layout_animation")
/* loaded from: classes6.dex */
public final class LinkMicLayoutAnimationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkMicLayoutAnimationSetting INSTANCE = new LinkMicLayoutAnimationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicLayoutAnimationSetting.class);
    }

    public final boolean useAnimation() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
