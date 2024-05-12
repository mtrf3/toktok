package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_effect_favorite_tab_type")
/* loaded from: classes6.dex */
public final class LiveStickerFavoriteAnimationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStickerFavoriteAnimationSetting INSTANCE = new LiveStickerFavoriteAnimationSetting();

    @Group("show text")
    public static final int V1 = 1;

    @Group("show text with animation")
    public static final int V2 = 2;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStickerFavoriteAnimationSetting.class);
    }

    public final boolean isDefault() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isV2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
