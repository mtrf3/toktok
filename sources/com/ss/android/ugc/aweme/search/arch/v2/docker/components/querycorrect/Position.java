package com.ss.android.ugc.aweme.search.arch.v2.docker.components.querycorrect;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes9.dex */
public final class Position extends F9E {

    @InterfaceC65349Pkn("begin")
    public final int begin;

    @InterfaceC65349Pkn("end")
    public final int end;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.begin), Integer.valueOf(this.end)};
    }

    public Position(int i, int i2) {
        this.begin = i;
        this.end = i2;
    }
}
