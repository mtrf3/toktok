package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_share_bg_support_layout_animation")
/* loaded from: classes14.dex */
public final class MultiGuestShareBgSupportLayoutAnimationSetting {

    @Group("no opt")
    public static final int ANIMATION_NO_OPT = 0;

    @Group(isDefault = true, value = "support animation")
    public static final int DEFAULT = 2;
    public static final MultiGuestShareBgSupportLayoutAnimationSetting INSTANCE = new MultiGuestShareBgSupportLayoutAnimationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestShareBgSupportLayoutAnimationSetting.class);
    }

    public final boolean isInteractType() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isOpen() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSupportAnimationType() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
