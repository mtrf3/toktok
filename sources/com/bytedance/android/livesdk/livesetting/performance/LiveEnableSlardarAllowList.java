package com.bytedance.android.livesdk.livesetting.performance;

import X.B7L;
import X.C221108m2;
import X.C5H3;
import X.ORZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Set;

@SettingsKey("live_enable_slardar_allow_list")
/* loaded from: classes6.dex */
public final class LiveEnableSlardarAllowList {
    public static final LiveEnableSlardarAllowList INSTANCE = new LiveEnableSlardarAllowList();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 allowListSet$delegate = C221108m2.LIZIZ(B7L.LJLIL);

    private final Set<String> getAllowListSet() {
        return (Set) allowListSet$delegate.getValue();
    }

    public final boolean isDisable(String str) {
        return !isEnable(str);
    }

    public final boolean isEnable(String str) {
        return ORZ.LJLJJI(str, getAllowListSet());
    }
}
