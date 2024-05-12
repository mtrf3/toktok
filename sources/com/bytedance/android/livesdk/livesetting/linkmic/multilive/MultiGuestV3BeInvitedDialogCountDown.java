package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_receival_panel_countdown")
/* loaded from: classes6.dex */
public final class MultiGuestV3BeInvitedDialogCountDown {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3BeInvitedDialogCountDown INSTANCE = new MultiGuestV3BeInvitedDialogCountDown();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3BeInvitedDialogCountDown.class);
    }
}
