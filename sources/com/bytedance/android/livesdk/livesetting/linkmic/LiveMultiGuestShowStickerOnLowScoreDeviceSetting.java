package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_multi_guest_show_sticker_on_low_score_device_android")
/* loaded from: classes6.dex */
public final class LiveMultiGuestShowStickerOnLowScoreDeviceSetting {

    @Group(isDefault = true, value = "high score device")
    public static final int DEFAULT = 0;
    public static final LiveMultiGuestShowStickerOnLowScoreDeviceSetting INSTANCE = new LiveMultiGuestShowStickerOnLowScoreDeviceSetting();

    @Group("not show multi_guest sticker entrance")
    public static final int V1 = 1;

    @Group("show multi_guest panel stickers, not show more icon")
    public static final int V2 = 2;

    @Group("show multi_guest panel and broadcast panel stickers, show more icon")
    public static final int V3 = 3;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMultiGuestShowStickerOnLowScoreDeviceSetting.class);
    }

    public final boolean canShowBroadCastStickers() {
        if (getValue() % 3 == 0) {
            return true;
        }
        return false;
    }

    public final boolean canShowMoreIcon() {
        if (getValue() % 3 == 0) {
            return true;
        }
        return false;
    }

    public final boolean canShowStickerEntrance() {
        if (getValue() != 1) {
            return true;
        }
        return false;
    }

    public final boolean needLimitStickerCount() {
        if (getValue() != 2) {
            return true;
        }
        return false;
    }
}
