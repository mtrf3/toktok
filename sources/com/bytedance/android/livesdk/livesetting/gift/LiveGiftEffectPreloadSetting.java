package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C30999CEp;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_effect_preloading_strategy")
/* loaded from: classes6.dex */
public final class LiveGiftEffectPreloadSetting {
    public static final LiveGiftEffectPreloadSetting INSTANCE = new LiveGiftEffectPreloadSetting();

    @Group(isDefault = true, value = "default group")
    public static final EffectPreloadParams DEFAULT = new EffectPreloadParams(false, 0, 3, null);
    public static final C5H3 settingParams$delegate = C221108m2.LIZIZ(C30999CEp.LJLIL);

    private final EffectPreloadParams getSettingParams() {
        return (EffectPreloadParams) settingParams$delegate.getValue();
    }

    public final long getPreloadDelay() {
        return getSettingParams().preloadDelay;
    }

    public final boolean shouldPreloadOnEnter() {
        return getSettingParams().preloadOnEnter;
    }

    public final EffectPreloadParams getDEFAULT() {
        return DEFAULT;
    }
}
