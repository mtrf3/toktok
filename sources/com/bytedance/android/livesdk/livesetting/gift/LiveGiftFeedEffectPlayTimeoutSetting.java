package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58471Mx9;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_effect_max_download_duration")
/* loaded from: classes11.dex */
public final class LiveGiftFeedEffectPlayTimeoutSetting {
    public static final LiveGiftFeedEffectPlayTimeoutSetting INSTANCE = new LiveGiftFeedEffectPlayTimeoutSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final C5H3 timeoutInSec$delegate = C221108m2.LIZIZ(C58471Mx9.LJLIL);

    public final int getTimeoutInSec() {
        return ((Number) timeoutInSec$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftFeedEffectPlayTimeoutSetting.class);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
