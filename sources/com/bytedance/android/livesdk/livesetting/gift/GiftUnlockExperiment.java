package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_lock")
/* loaded from: classes6.dex */
public final class GiftUnlockExperiment {

    @Group("hide")
    public static final int HIDE = 0;
    public static final GiftUnlockExperiment INSTANCE = new GiftUnlockExperiment();

    @Group(isDefault = true, value = "show")
    public static final int DEFAULT = 1;

    public static final boolean showLock() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GiftUnlockExperiment.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getHIDE() {
        return HIDE;
    }
}
