package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_keep_linked_after_cancel_apply_error")
/* loaded from: classes14.dex */
public final class MultiGuestV3CancelApplyOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestV3CancelApplyOptSetting INSTANCE = new MultiGuestV3CancelApplyOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestV3CancelApplyOptSetting.class);
    }
}
