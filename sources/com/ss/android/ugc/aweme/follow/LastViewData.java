package com.ss.android.ugc.aweme.follow;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class LastViewData extends F9E {

    @InterfaceC65349Pkn("index")
    public final int index;

    @InterfaceC65349Pkn("msg")
    public final String lastViewHint;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.index), this.lastViewHint};
    }

    public LastViewData(int i, String lastViewHint) {
        o.LJIIIZ(lastViewHint, "lastViewHint");
        this.index = i;
        this.lastViewHint = lastViewHint;
    }
}
