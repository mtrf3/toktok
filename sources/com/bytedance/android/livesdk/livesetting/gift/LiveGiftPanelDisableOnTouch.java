package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C31162CKw;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_panel_disable_on_touch")
/* loaded from: classes6.dex */
public final class LiveGiftPanelDisableOnTouch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftPanelDisableOnTouch INSTANCE = new LiveGiftPanelDisableOnTouch();
    public static final C5H3 touchAnimDisabled$delegate = C221108m2.LIZIZ(C31162CKw.LJLIL);

    public final boolean getTouchAnimDisabled() {
        return ((Boolean) touchAnimDisabled$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftPanelDisableOnTouch.class);
    }
}
