package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58469Mx7;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_effect_follow_page")
/* loaded from: classes11.dex */
public final class LiveGiftFeedEffectPlayFollowingTabSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftFeedEffectPlayFollowingTabSetting INSTANCE = new LiveGiftFeedEffectPlayFollowingTabSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C58469Mx7.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftFeedEffectPlayFollowingTabSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
