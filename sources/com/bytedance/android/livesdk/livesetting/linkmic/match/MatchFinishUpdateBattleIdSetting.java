package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_host_pk_finish_update_setting")
/* loaded from: classes6.dex */
public final class MatchFinishUpdateBattleIdSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MatchFinishUpdateBattleIdSetting INSTANCE = new MatchFinishUpdateBattleIdSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MatchFinishUpdateBattleIdSetting.class);
    }
}
