package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_invite_each_other")
/* loaded from: classes6.dex */
public final class LiveBattleInviteEachOtherSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveBattleInviteEachOtherSetting INSTANCE = new LiveBattleInviteEachOtherSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBattleInviteEachOtherSetting.class);
    }
}
