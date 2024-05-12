package com.bytedance.android.livesdk.livesetting.watchlive.previewlive;

import X.B6A;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_card_smooth_frame_setting")
/* loaded from: classes6.dex */
public final class LiveCardSmoothFrameSetting {

    @Group(isDefault = true, value = "control_group")
    public static final int DEFAULT = 0;
    public static final LiveCardSmoothFrameSetting INSTANCE = new LiveCardSmoothFrameSetting();

    @Group("experimental_group")
    public static final int PLAYER_SOURCE = 1;
    public static final C5H3 setting$delegate = C221108m2.LIZ(EnumC221088m0.NONE, B6A.LJLIL);

    public final int getSetting() {
        return ((Number) setting$delegate.getValue()).intValue();
    }

    public final boolean isPlayerSource() {
        if (getSetting() == PLAYER_SOURCE) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getPLAYER_SOURCE() {
        return PLAYER_SOURCE;
    }
}
