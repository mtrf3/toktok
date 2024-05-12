package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_other_mask_layer_optimize")
/* loaded from: classes6.dex */
public final class TtliveGameOtherMaskLayerOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TtliveGameOtherMaskLayerOptimizeSetting INSTANCE = new TtliveGameOtherMaskLayerOptimizeSetting();

    public final boolean showMaskLayer() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGameOtherMaskLayerOptimizeSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
