package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_interact_battle_contribute_list_url")
/* loaded from: classes6.dex */
public final class LiveInteractBattleContributeListUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://inapp.tiktokv.com/falcon/webcast_mt/page/live_match/panel/index.html";
    public static final LiveInteractBattleContributeListUrlSetting INSTANCE = new LiveInteractBattleContributeListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveInteractBattleContributeListUrlSetting.class);
    }
}
