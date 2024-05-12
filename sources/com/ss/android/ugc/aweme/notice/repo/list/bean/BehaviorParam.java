package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public final class BehaviorParam extends F9E {

    @InterfaceC65349Pkn("op_type")
    public final int type;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.type)};
    }

    public BehaviorParam(int i) {
        this.type = i;
    }
}
