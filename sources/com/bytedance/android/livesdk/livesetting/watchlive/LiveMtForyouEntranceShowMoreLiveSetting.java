package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mt_foryou_entrance_show_more_live")
/* loaded from: classes6.dex */
public final class LiveMtForyouEntranceShowMoreLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMtForyouEntranceShowMoreLiveSetting INSTANCE = new LiveMtForyouEntranceShowMoreLiveSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMtForyouEntranceShowMoreLiveSetting.class);
    }
}
