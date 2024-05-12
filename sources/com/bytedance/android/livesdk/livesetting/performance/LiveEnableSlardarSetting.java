package com.bytedance.android.livesdk.livesetting.performance;

import X.B7R;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;

@SettingsKey("live_enable_slardar")
/* loaded from: classes6.dex */
public final class LiveEnableSlardarSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableSlardarSetting INSTANCE = new LiveEnableSlardarSetting();
    public static final C5H3 settingVal$delegate = C221108m2.LIZIZ(B7R.LJLIL);

    private final boolean getSettingVal() {
        return ((Boolean) settingVal$delegate.getValue()).booleanValue();
    }

    public final boolean isDisable(String str) {
        if ((!getSettingVal() && (getSettingVal() || !LiveEnableSlardarAllowList.INSTANCE.isEnable(str))) || ScalableDowngradeSetting.disableApmLog()) {
            return true;
        }
        return false;
    }
}
