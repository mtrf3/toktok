package com.bytedance.android.livesdkapi.depend.model.live;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class PinInfo {

    @InterfaceC65349Pkn("display_duration")
    public long displayDuration;

    @InterfaceC65349Pkn("has_pin")
    public boolean pinEnabled;

    public PinInfo() {
        this(false, 0L, 3, null);
    }

    public PinInfo(boolean z, long j) {
        this.pinEnabled = z;
        this.displayDuration = j;
    }

    public /* synthetic */ PinInfo(boolean z, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? 0L : j);
    }
}
