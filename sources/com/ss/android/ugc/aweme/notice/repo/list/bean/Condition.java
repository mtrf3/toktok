package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes12.dex */
public final class Condition extends F9E {
    public int LJLIL;

    @InterfaceC65349Pkn("threshold")
    public final int threshold;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.threshold)};
    }

    public Condition(int i) {
        this.threshold = i;
    }
}
