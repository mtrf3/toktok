package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_render_spark_opt")
/* loaded from: classes6.dex */
public final class GiftRenderSparkOptimizeSetting {
    public static final GiftRenderSparkOptimizeSetting INSTANCE = new GiftRenderSparkOptimizeSetting();

    @Group(isDefault = true, value = "default group")
    public static final GiftRenderSparkOptimize DEFAULT = new GiftRenderSparkOptimize(0, 0, 3, null);

    public final GiftRenderSparkOptimize getConfig() {
        GiftRenderSparkOptimize giftRenderSparkOptimize = (GiftRenderSparkOptimize) SettingsManager.INSTANCE.getValueSafely(GiftRenderSparkOptimizeSetting.class);
        if (giftRenderSparkOptimize == null) {
            return DEFAULT;
        }
        return giftRenderSparkOptimize;
    }

    public final boolean isEnable() {
        if (getConfig().enable > 0) {
            return true;
        }
        return false;
    }

    public final boolean isPreCreateStrategyEnable() {
        if (isEnable() && getConfig().preCreateStrategy > 0) {
            return true;
        }
        return false;
    }

    public final boolean isPreCreateWhenEnterLiveRoom() {
        if (isEnable() && getConfig().preCreateStrategy == 1) {
            return true;
        }
        return false;
    }

    public final boolean isPreCreateWhenReceiveGiftMsg() {
        if (isEnable() && getConfig().preCreateStrategy == 2) {
            return true;
        }
        return false;
    }
}
