package com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes2.dex */
public final class RelationFetchMissingPage extends F9E {

    @InterfaceC65349Pkn("max_time")
    public final long toFetchMaxTime;

    @InterfaceC65349Pkn("min_time")
    public final long toFetchMinTime;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.toFetchMaxTime), Long.valueOf(this.toFetchMinTime)};
    }

    public RelationFetchMissingPage(long j, long j2) {
        this.toFetchMaxTime = j;
        this.toFetchMinTime = j2;
    }
}
