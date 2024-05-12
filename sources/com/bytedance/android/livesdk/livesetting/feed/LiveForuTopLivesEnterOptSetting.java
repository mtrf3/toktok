package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_foru_toplives_enter_opt_new")
/* loaded from: classes6.dex */
public final class LiveForuTopLivesEnterOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveForuTopLivesEnterOptSetting INSTANCE = new LiveForuTopLivesEnterOptSetting();

    @Group("Continue live after the feed returns")
    public static final int V1 = 1;

    @Group("exit live directly")
    public static final int V2 = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveForuTopLivesEnterOptSetting.class);
    }

    public final boolean cancelFeed() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
