package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_screen_audience_union_toolbar")
/* loaded from: classes6.dex */
public final class LiveUnionPraiseGiftInToolBarSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 0;

    @Group("experiment_group")
    public static final int ENABLE = 1;
    public static final LiveUnionPraiseGiftInToolBarSetting INSTANCE = new LiveUnionPraiseGiftInToolBarSetting();

    public static final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveUnionPraiseGiftInToolBarSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
