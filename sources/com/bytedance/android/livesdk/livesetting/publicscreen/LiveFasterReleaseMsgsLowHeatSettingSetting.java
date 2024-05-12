package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.C29306Beo;
import X.C30794C6s;
import X.C5H3;
import X.C78996UzQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveFasterReleaseMsgsLowHeatAudienceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@SettingsKey(preciseExperiment = false, value = "live_faster_release_msgs_low_heat_setting")
/* loaded from: classes6.dex */
public final class LiveFasterReleaseMsgsLowHeatSettingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFasterReleaseMsgsLowHeatSettingSetting INSTANCE = new LiveFasterReleaseMsgsLowHeatSettingSetting();
    public static final C5H3 enable$delegate = C78996UzQ.LJJIJIIJI(C30794C6s.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public static final boolean enable(DataChannel dataChannel) {
        if (C29306Beo.LJIIL(dataChannel)) {
            return LiveFasterReleaseMsgsLowHeatAudienceSetting.INSTANCE.getValue();
        }
        return INSTANCE.getEnable();
    }
}
