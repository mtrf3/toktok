package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58470Mx8;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_effect_foru_page")
/* loaded from: classes11.dex */
public final class LiveGiftFeedEffectPlayForYouTabSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftFeedEffectPlayForYouTabSetting INSTANCE = new LiveGiftFeedEffectPlayForYouTabSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58470Mx8.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftFeedEffectPlayForYouTabSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
