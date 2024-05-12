package com.bytedance.android.livesdk.livesetting.comment;

import X.C81185Vtd;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_comment_width_opt")
/* loaded from: classes6.dex */
public final class LiveCommentWidthOptSetting {
    public static final LiveCommentWidthOptSetting INSTANCE = new LiveCommentWidthOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final Config DEFAULT = new Config(false, 0, 3, null);

    private final Config getConfig() {
        Config config = (Config) SettingsManager.INSTANCE.getValueSafely(LiveCommentWidthOptSetting.class);
        if (config == null) {
            return DEFAULT;
        }
        return config;
    }

    public final boolean isStrategyEnable() {
        if (C81185Vtd.LIZIZ() / C81185Vtd.LIZLLL() <= 1.7777778f && getConfig().isStrategyEnable) {
            return true;
        }
        return false;
    }

    public final boolean isStrategyFirst() {
        if (isStrategyEnable() && getConfig().strategyOpt == 1) {
            return true;
        }
        return false;
    }

    public final boolean isStrategySecond() {
        if (isStrategyEnable() && getConfig().strategyOpt == 2) {
            return true;
        }
        return false;
    }
}
