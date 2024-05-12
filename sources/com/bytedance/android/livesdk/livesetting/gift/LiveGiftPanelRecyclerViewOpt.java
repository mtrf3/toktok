package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C31164CKy;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_panel_recycler_view_opt")
/* loaded from: classes6.dex */
public final class LiveGiftPanelRecyclerViewOpt {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelRecyclerViewOpt INSTANCE = new LiveGiftPanelRecyclerViewOpt();
    public static final C5H3 isEnabled$delegate = C221108m2.LIZIZ(C31164CKy.LJLIL);

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelRecyclerViewOpt.class);
    }

    public final boolean isEnabled() {
        return ((Boolean) isEnabled$delegate.getValue()).booleanValue();
    }
}
