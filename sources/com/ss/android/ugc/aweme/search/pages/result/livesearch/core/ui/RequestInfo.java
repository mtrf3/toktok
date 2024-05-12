package com.ss.android.ugc.aweme.search.pages.result.livesearch.core.ui;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes7.dex */
public final class RequestInfo extends F9E {

    @InterfaceC65349Pkn("duration")
    public final long duration;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.duration)};
    }

    public RequestInfo(long j) {
        this.duration = j;
    }
}
