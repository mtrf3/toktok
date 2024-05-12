package com.bytedance.android.livesdk.livesetting.watchlive;

import X.BKF;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_backstage_traffic_opt")
/* loaded from: classes6.dex */
public final class LiveBackstageTrafficOpt {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveBackstageTrafficOpt INSTANCE = new LiveBackstageTrafficOpt();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(BKF.LJLIL);

    public final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }
}
