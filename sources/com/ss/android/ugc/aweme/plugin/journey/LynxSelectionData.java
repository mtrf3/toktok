package com.ss.android.ugc.aweme.plugin.journey;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class LynxSelectionData extends F9E {

    @InterfaceC65349Pkn("data")
    public final LynxSelection data;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data};
    }

    public LynxSelectionData(LynxSelection data) {
        o.LJIIIZ(data, "data");
        this.data = data;
    }
}
