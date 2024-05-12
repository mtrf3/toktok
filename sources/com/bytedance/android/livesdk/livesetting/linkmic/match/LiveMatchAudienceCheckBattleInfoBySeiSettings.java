package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enale_sei_fallback_open_message")
/* loaded from: classes6.dex */
public final class LiveMatchAudienceCheckBattleInfoBySeiSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchAudienceCheckBattleInfoBySeiSettings INSTANCE = new LiveMatchAudienceCheckBattleInfoBySeiSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchAudienceCheckBattleInfoBySeiSettings.class);
    }
}
