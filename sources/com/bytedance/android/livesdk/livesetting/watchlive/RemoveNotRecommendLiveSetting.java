package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("remove_not_recommend_live")
/* loaded from: classes6.dex */
public final class RemoveNotRecommendLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final RemoveNotRecommendLiveSetting INSTANCE = new RemoveNotRecommendLiveSetting();

    @Group("v1")
    public static final int enableValue = 1;

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(RemoveNotRecommendLiveSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
