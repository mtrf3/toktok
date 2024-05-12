package com.bytedance.ies.ugc.aweme.commercialize.intelligence.pitaya.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class FeedActionData extends F9E {

    @InterfaceC65349Pkn("show_time")
    public final long showTime;

    public FeedActionData() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.showTime)};
    }

    public FeedActionData(long j) {
        this.showTime = j;
    }

    public /* synthetic */ FeedActionData(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
