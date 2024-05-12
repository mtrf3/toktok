package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("audience_enable_multimatch_eggtask")
/* loaded from: classes6.dex */
public final class AudienceTeamMatchEnableBattleEggSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final AudienceTeamMatchEnableBattleEggSetting INSTANCE = new AudienceTeamMatchEnableBattleEggSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AudienceTeamMatchEnableBattleEggSetting.class);
    }
}
