package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_dismiss_invitePanel_whenFinish")
/* loaded from: classes11.dex */
public final class LiveBattleDismissInvitePanelWhenFinishSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBattleDismissInvitePanelWhenFinishSetting INSTANCE = new LiveBattleDismissInvitePanelWhenFinishSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBattleDismissInvitePanelWhenFinishSetting.class);
    }
}
