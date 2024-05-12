package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_quick_comment")
/* loaded from: classes6.dex */
public final class LiveSubscriptionQuickCommentSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSubscriptionQuickCommentSetting INSTANCE = new LiveSubscriptionQuickCommentSetting();

    public final boolean enableQuickV1() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSubscriptionQuickCommentSetting.class) == 1) {
            return true;
        }
        return false;
    }

    public final boolean enableQuickV2() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSubscriptionQuickCommentSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSubscriptionQuickCommentSetting.class);
    }
}
