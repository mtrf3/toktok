package com.ss.android.ugc.aweme.paidseries.consumer.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public final class PaidContentInitData extends F9E {

    @InterfaceC65349Pkn("num_series")
    public final int numSeries;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.numSeries)};
    }

    public PaidContentInitData(int i) {
        this.numSeries = i;
    }
}
