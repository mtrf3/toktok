package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_cancel_invite_timer")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestV3ServiceCancelInviteTimerSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 120;
    public static final LinkMicMultiGuestV3ServiceCancelInviteTimerSetting INSTANCE = new LinkMicMultiGuestV3ServiceCancelInviteTimerSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LinkMicMultiGuestV3ServiceCancelInviteTimerSetting.class);
    }
}
