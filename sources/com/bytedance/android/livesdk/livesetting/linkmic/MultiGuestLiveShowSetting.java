package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58519Mxv;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_live_show")
/* loaded from: classes11.dex */
public final class MultiGuestLiveShowSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("v1")
    public static final int V1 = 1;
    public static final MultiGuestLiveShowSetting INSTANCE = new MultiGuestLiveShowSetting();
    public static final C5H3 lazyValue$delegate = C221108m2.LIZIZ(C58519Mxv.LJLIL);

    private final int getLazyValue() {
        return ((Number) lazyValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestLiveShowSetting.class);
    }

    public final boolean isV1() {
        if (getLazyValue() == 1) {
            return true;
        }
        return false;
    }
}
