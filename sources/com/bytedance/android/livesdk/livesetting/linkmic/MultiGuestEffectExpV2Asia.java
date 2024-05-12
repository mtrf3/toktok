package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_effect_exp_v2_asia")
/* loaded from: classes6.dex */
public final class MultiGuestEffectExpV2Asia {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final MultiGuestEffectExpV2Asia INSTANCE = new MultiGuestEffectExpV2Asia();

    public static final boolean useNewEffect() {
        if (SettingsManager.INSTANCE.getIntValue(MultiGuestEffectExpV2Asia.class) != 0) {
            return true;
        }
        return false;
    }
}
