package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C29306Beo;
import X.C5H3;
import X.C78996UzQ;
import X.CTO;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_update_opt")
/* loaded from: classes6.dex */
public final class LivePublicScreenUpdateOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "10")
    public static final int STOP_10 = 10;

    @Group(isDefault = false, value = "30")
    public static final int STOP_30 = 30;
    public static final LivePublicScreenUpdateOptSetting INSTANCE = new LivePublicScreenUpdateOptSetting();
    public static final C5H3 value$delegate = C78996UzQ.LJJIJIIJI(CTO.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final int getCount(DataChannel dataChannel) {
        if (C29306Beo.LJIIL(dataChannel)) {
            return INSTANCE.getValue();
        }
        return LivePublicScreenUpdateAnchorOptSetting.INSTANCE.getValue();
    }
}
