package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C5H3;
import X.C78996UzQ;
import X.CTN;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_update_anchor_opt")
/* loaded from: classes6.dex */
public final class LivePublicScreenUpdateAnchorOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "10")
    public static final int STOP_10 = 10;

    @Group(isDefault = false, value = "30")
    public static final int STOP_30 = 30;
    public static final LivePublicScreenUpdateAnchorOptSetting INSTANCE = new LivePublicScreenUpdateAnchorOptSetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(CTN.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
