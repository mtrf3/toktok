package com.ss.android.ugc.aweme.notice.repo.list.bean;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Behavior extends F9E {

    @InterfaceC65349Pkn("action")
    public final int action;

    @InterfaceC65349Pkn("params")
    public final BehaviorParam params;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.action), this.params};
    }

    public Behavior(int i, BehaviorParam params) {
        o.LJIIIZ(params, "params");
        this.action = i;
        this.params = params;
    }
}
