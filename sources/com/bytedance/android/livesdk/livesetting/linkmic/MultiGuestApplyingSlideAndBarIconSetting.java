package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_applying_slide_and_bar_icon")
/* loaded from: classes6.dex */
public final class MultiGuestApplyingSlideAndBarIconSetting {

    @Group("ban slide, icon change")
    public static final int BAN_SLIDE_ICON_CHANGE = 1;

    @Group(isDefault = true, value = "ban slide, icon not change")
    public static final int DEFAULT = 0;
    public static final MultiGuestApplyingSlideAndBarIconSetting INSTANCE = new MultiGuestApplyingSlideAndBarIconSetting();

    @Group("slide, icon change")
    public static final int SLIDE_ICON_CHANGE = 3;

    @Group("slide with second confirm, icon change")
    public static final int SLIDE_WITH_SECOND_CONFIRM_ICON_CHANGE = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestApplyingSlideAndBarIconSetting.class);
    }

    public final boolean enableApplyAnimation() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean needSecondConfirmWhenSlide() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableSlideAfterApply(boolean z) {
        if (z) {
            if (getValue() != 3) {
                return false;
            }
        } else if (getValue() != 3 && getValue() != 2) {
            return false;
        }
        return true;
    }
}
