package com.ss.android.ugc.aweme.ml.common;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;

/* loaded from: classes7.dex */
public final class HistorySaveListItem {

    @InterfaceC65349Pkn("key")
    public String key;

    @InterfaceC65349Pkn("value")
    public String value;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Item(key=");
        LIZ.append(this.key);
        LIZ.append(", value=");
        return q.LIZIZ(LIZ, this.value, ')', LIZ);
    }
}
