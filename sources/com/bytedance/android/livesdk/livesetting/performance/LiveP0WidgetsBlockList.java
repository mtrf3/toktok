package com.bytedance.android.livesdk.livesetting.performance;

import X.B7M;
import X.C221108m2;
import X.C5H3;
import X.ORZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import java.util.Set;

@SettingsKey("live_p0_widgets_block_list")
/* loaded from: classes6.dex */
public final class LiveP0WidgetsBlockList {
    public static final LiveP0WidgetsBlockList INSTANCE = new LiveP0WidgetsBlockList();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 blocklist$delegate = C221108m2.LIZIZ(B7M.LJLIL);

    public final Set<String> getBlocklist() {
        return (Set) blocklist$delegate.getValue();
    }

    public final boolean isBlock(String str) {
        return ORZ.LJLJJI(str, getBlocklist());
    }
}
