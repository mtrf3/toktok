package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C30766C5q;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_request_layout_opt")
/* loaded from: classes6.dex */
public final class LiveRequestLayoutOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("text opt and online audience opt")
    public static final int EXPERIMENT1 = 3;

    @Group("layout params cache opt")
    public static final int EXPERIMENT2 = 4;

    @Group("all opt")
    public static final int EXPERIMENT3 = 7;
    public static final LiveRequestLayoutOptSetting INSTANCE = new LiveRequestLayoutOptSetting();
    public static final C5H3 v$delegate = C221108m2.LIZIZ(C30766C5q.LJLIL);

    private final int getV() {
        return ((Number) v$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRequestLayoutOptSetting.class);
    }

    public final boolean isLayoutParamsCacheEnabled() {
        if ((getV() & 4) == 4) {
            return true;
        }
        return false;
    }

    public final boolean isOnlineAudienceEnabled() {
        if ((getV() & 2) == 2) {
            return true;
        }
        return false;
    }

    public final boolean isTextOptEnabled() {
        if ((getV() & 1) == 1) {
            return true;
        }
        return false;
    }
}
