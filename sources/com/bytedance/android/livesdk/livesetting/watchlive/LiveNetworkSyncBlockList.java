package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58523Mxz;
import X.C5H3;
import X.ORY;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_network_sync_block_list")
/* loaded from: classes11.dex */
public final class LiveNetworkSyncBlockList {
    public static final LiveNetworkSyncBlockList INSTANCE = new LiveNetworkSyncBlockList();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C58523Mxz.LJLIL);

    private final String[] getCurrentValue() {
        return (String[]) currentValue$delegate.getValue();
    }

    public final boolean enable(String str) {
        String[] currentValue = getCurrentValue();
        if (currentValue != null && currentValue.length != 0 && ORY.LJJIJIIJIL(str, getCurrentValue())) {
            return false;
        }
        return true;
    }
}
