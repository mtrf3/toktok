package com.bytedance.android.livesdk.livesetting.publicscreen;

import X.B6R;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_shorten_threshold")
/* loaded from: classes6.dex */
public final class LivePublicScreenShortenThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60;
    public static final LivePublicScreenShortenThresholdSetting INSTANCE = new LivePublicScreenShortenThresholdSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, B6R.LJLIL);

    public static /* synthetic */ void getValue$annotations() {
    }

    public static final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
