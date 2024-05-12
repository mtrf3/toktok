package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_new_sub_notify_time_limit")
/* loaded from: classes6.dex */
public final class SubscribeQuickCommentLimitTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final SubscribeQuickCommentLimitTimeSetting INSTANCE = new SubscribeQuickCommentLimitTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SubscribeQuickCommentLimitTimeSetting.class);
    }
}
