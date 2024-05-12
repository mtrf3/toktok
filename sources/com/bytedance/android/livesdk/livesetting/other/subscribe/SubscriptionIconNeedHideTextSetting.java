package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("sub_icon_need_hide_text")
/* loaded from: classes6.dex */
public final class SubscriptionIconNeedHideTextSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final SubscriptionIconNeedHideTextSetting INSTANCE = new SubscriptionIconNeedHideTextSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscriptionIconNeedHideTextSetting.class);
    }
}
