package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_user_info_dialog_animation_opt")
/* loaded from: classes6.dex */
public final class LiveSdkMultiGuestUserInfoDialogAnimationOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveSdkMultiGuestUserInfoDialogAnimationOptSetting INSTANCE = new LiveSdkMultiGuestUserInfoDialogAnimationOptSetting();

    private final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestUserInfoDialogAnimationOptSetting.class);
    }

    public final boolean isEnable() {
        return getValue();
    }
}
