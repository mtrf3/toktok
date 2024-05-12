package com.bytedance.android.livesdk.livesetting.performance;

import X.BLQ;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "toplive_delay_create_fragment")
/* loaded from: classes6.dex */
public final class TopLiveDelayCreateFragmentSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final TopLiveDelayCreateFragmentSetting INSTANCE = new TopLiveDelayCreateFragmentSetting();
    public static final C5H3 delayCreate$delegate = C221108m2.LIZIZ(BLQ.LJLIL);

    public final boolean getDelayCreate() {
        return ((Boolean) delayCreate$delegate.getValue()).booleanValue();
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
