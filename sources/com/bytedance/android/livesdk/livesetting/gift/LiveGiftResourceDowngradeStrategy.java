package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_resource_downgrade_strategy")
/* loaded from: classes6.dex */
public final class LiveGiftResourceDowngradeStrategy {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftResourceDowngradeStrategy INSTANCE = new LiveGiftResourceDowngradeStrategy();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftResourceDowngradeStrategy.class);
    }

    public final boolean enableDeleteOldResourceDownloadDemotion() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }

    public final boolean enableDownloadDegradeResource() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean enableJustDeleteOldResource() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
