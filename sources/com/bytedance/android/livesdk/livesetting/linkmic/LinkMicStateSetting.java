package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C5H3;
import X.C75828TpQ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("linkmic_state_cmd")
/* loaded from: classes14.dex */
public final class LinkMicStateSetting {
    public static final LinkMicStateSetting INSTANCE = new LinkMicStateSetting();

    @Group(isDefault = true, value = "default group")
    public static final StateConfig DEFAULT = new StateConfig(0, false, false, false, 0, 0, 63, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C75828TpQ.LJLIL);

    private final boolean isEnable(int i, int i2) {
        return (i2 & i) == i;
    }

    public final boolean enableIMReceive() {
        return isEnable$default(this, 2, 0, 1, null);
    }

    public final boolean enableIMSend() {
        return isEnable$default(this, 1, 0, 1, null);
    }

    public final boolean enableRTCReceive() {
        return isEnable$default(this, 8, 0, 1, null);
    }

    public final boolean enableRTCSend() {
        return isEnable$default(this, 4, 0, 1, null);
    }

    private final StateConfig getSettingValue() {
        return (StateConfig) settingValue$delegate.getValue();
    }

    public final boolean timeCostReport() {
        return LinkMicIMTimeCostSetting.INSTANCE.getValue();
    }

    private final StateConfig config() {
        return getSettingValue();
    }

    public final int checkDuration() {
        return getSettingValue().getCheckDuration();
    }

    public final boolean enableStatReport() {
        return getSettingValue().getEnableStat();
    }

    public final boolean filterStateType() {
        return getSettingValue().getFilterStateType();
    }

    public final boolean rtcDoubleCheck() {
        return isEnable(2, getSettingValue().getDoubleCheck());
    }

    public final boolean stateDoubleCheck() {
        return isEnable(1, getSettingValue().getDoubleCheck());
    }

    public final boolean syncWithRTC() {
        return getSettingValue().getSyncWithRTC();
    }

    public static /* synthetic */ boolean isEnable$default(LinkMicStateSetting linkMicStateSetting, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = linkMicStateSetting.getSettingValue().getImConfig();
        }
        return linkMicStateSetting.isEnable(i, i2);
    }
}
