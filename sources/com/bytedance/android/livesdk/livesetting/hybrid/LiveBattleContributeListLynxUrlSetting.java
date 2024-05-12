package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_battle_contribute_list_lynx_url")
/* loaded from: classes11.dex */
public final class LiveBattleContributeListLynxUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveBattleContributeListLynxUrlSetting INSTANCE = new LiveBattleContributeListLynxUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBattleContributeListLynxUrlSetting.class);
    }
}