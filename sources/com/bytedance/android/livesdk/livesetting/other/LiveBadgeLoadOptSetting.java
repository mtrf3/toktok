package com.bytedance.android.livesdk.livesetting.other;

import X.C221108m2;
import X.C5H3;
import X.CHJ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_badge_load_opt_setting")
/* loaded from: classes6.dex */
public final class LiveBadgeLoadOptSetting {
    public static final int BADGE_LOAD_DEFAULT = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBadgeLoadOptSetting INSTANCE = new LiveBadgeLoadOptSetting();
    public static final C5H3 v$delegate = C221108m2.LIZIZ(CHJ.LJLIL);
    public static final int BADGE_LOAD_V1 = 1;
    public static final int BADGE_LOAD_V2 = 2;
    public static final int BADGE_LOAD_V3 = 3;

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBadgeLoadOptSetting.class);
    }

    public final int getV() {
        return ((Number) v$delegate.getValue()).intValue();
    }

    public final boolean diskCacheOpt() {
        int v = getV();
        if (v == BADGE_LOAD_V1 || v == BADGE_LOAD_V3) {
            return true;
        }
        return false;
    }

    public final boolean lazyLoad() {
        if (getV() >= BADGE_LOAD_V2) {
            return true;
        }
        return false;
    }

    public final int getBADGE_LOAD_DEFAULT() {
        return BADGE_LOAD_DEFAULT;
    }

    public final int getBADGE_LOAD_V1() {
        return BADGE_LOAD_V1;
    }

    public final int getBADGE_LOAD_V2() {
        return BADGE_LOAD_V2;
    }

    public final int getBADGE_LOAD_V3() {
        return BADGE_LOAD_V3;
    }
}
