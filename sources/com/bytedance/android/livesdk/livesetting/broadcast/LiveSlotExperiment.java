package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveSlotSettings;
import com.bytedance.android.livesdk.livesetting.model.SlotBizTypeDisallow;
import java.util.Map;

@SettingsKey("live_slot_setting")
/* loaded from: classes6.dex */
public final class LiveSlotExperiment {
    public static final LiveSlotExperiment INSTANCE = new LiveSlotExperiment();

    @Group(isDefault = true, value = "default group")
    public static final LiveSlotSettings DEFAULT = new LiveSlotSettings(null, 1, null);

    public final LiveSlotSettings getValue() {
        LiveSlotSettings liveSlotSettings = (LiveSlotSettings) SettingsManager.INSTANCE.getValueSafely(LiveSlotExperiment.class);
        if (liveSlotSettings == null) {
            return DEFAULT;
        }
        return liveSlotSettings;
    }

    public final Map<String, SlotBizTypeDisallow> getBizTypeDisallow() {
        Map<String, SlotBizTypeDisallow> bizTypeDisallow = getValue().getBizTypeDisallow();
        if (bizTypeDisallow == null) {
            return C113554cx.LJJJLIIL();
        }
        return bizTypeDisallow;
    }

    public final LiveSlotSettings getDEFAULT() {
        return DEFAULT;
    }
}
