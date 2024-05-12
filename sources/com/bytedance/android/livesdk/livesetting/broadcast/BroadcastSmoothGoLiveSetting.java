package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C29701BlB;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "live_broadcast_smooth_go_live_setting")
/* loaded from: classes6.dex */
public final class BroadcastSmoothGoLiveSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final BroadcastSmoothGoLiveSetting INSTANCE = new BroadcastSmoothGoLiveSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C29701BlB.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getEnable();
    }
}
