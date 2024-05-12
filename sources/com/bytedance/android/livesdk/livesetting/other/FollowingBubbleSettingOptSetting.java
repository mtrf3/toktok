package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C58463Mx1;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_following_bubble_setting_get_opt_alogger")
/* loaded from: classes11.dex */
public final class FollowingBubbleSettingOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FollowingBubbleSettingOptSetting INSTANCE = new FollowingBubbleSettingOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C58463Mx1.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isOpt() {
        return getValue();
    }
}
