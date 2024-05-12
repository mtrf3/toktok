package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_gift_expression_opti")
/* loaded from: classes14.dex */
public final class LiveLinkMicGiftExpressionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveLinkMicGiftExpressionOptSetting INSTANCE = new LiveLinkMicGiftExpressionOptSetting();

    public final boolean isSupportFLYFromSender(int i) {
        return i == 2;
    }

    public final boolean isSupportGiftAnimationFromABTest(int i) {
        return i == 1 || i == 2;
    }

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveLinkMicGiftExpressionOptSetting.class);
    }

    public final boolean isSupportFLY() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isSupportGiftAnimation() {
        if (getValue() == 1 || getValue() == 2) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
