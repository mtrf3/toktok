package com.ss.android.ugc.aweme.ml.common;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;

/* loaded from: classes2.dex */
public final class HistorySaveContent {

    @InterfaceC65349Pkn("list")
    public List<HistorySaveListItem> list;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Content(list=");
        return C1NE.LIZIZ(LIZ, this.list, ')', LIZ);
    }
}
