package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58515Mxr;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_network_sync_allow")
/* loaded from: classes11.dex */
public final class LiveNetworkSyncAllowList {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveNetworkSyncAllowList INSTANCE = new LiveNetworkSyncAllowList();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C58515Mxr.LJLIL);

    public final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }
}
