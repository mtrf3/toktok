package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_preview_stream_scale_optimize")
/* loaded from: classes6.dex */
public final class TtliveGamePreviewStreamScaleOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TtliveGamePreviewStreamScaleOptimizeSetting INSTANCE = new TtliveGamePreviewStreamScaleOptimizeSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(TtliveGamePreviewStreamScaleOptimizeSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
