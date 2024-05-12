package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58516Mxs;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_network_request_sync")
/* loaded from: classes11.dex */
public final class LiveNetworkRequestSync {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveNetworkRequestSync INSTANCE = new LiveNetworkRequestSync();
    public static final C5H3 currentValue$delegate = C221108m2.LIZIZ(C58516Mxs.LJLIL);

    private final boolean getCurrentValue() {
        return ((Boolean) currentValue$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getCurrentValue();
    }
}
