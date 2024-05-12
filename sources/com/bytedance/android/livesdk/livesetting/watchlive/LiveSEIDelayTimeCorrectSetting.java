package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C30727C4d;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_sei_delay_time_correct")
/* loaded from: classes6.dex */
public final class LiveSEIDelayTimeCorrectSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 0;
    public static final LiveSEIDelayTimeCorrectSetting INSTANCE = new LiveSEIDelayTimeCorrectSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30727C4d.LJLIL);

    public final boolean enableSEITimeCorrect() {
        if (INSTANCE.getValue() == 1) {
            return true;
        }
        return false;
    }

    public final long getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).longValue();
    }

    public final long getValue() {
        return getSettingValue();
    }
}
