package com.bytedance.android.livesdk.livesetting.other.subscribe_enhance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_show_capsule_from_ranking")
/* loaded from: classes6.dex */
public final class SubscribeEnableRankingCapsuleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscribeEnableRankingCapsuleSetting INSTANCE = new SubscribeEnableRankingCapsuleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscribeEnableRankingCapsuleSetting.class);
    }
}
