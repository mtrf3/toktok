package com.ss.android.ugc.aweme.ecommerce.base.ordercenter.repository.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ListOrderPromptReq {

    @InterfaceC65349Pkn("tab")
    public final Integer tab;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ListOrderPromptReq) && o.LJ(this.tab, ((ListOrderPromptReq) obj).tab);
    }

    public final int hashCode() {
        Integer num = this.tab;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ListOrderPromptReq(tab=");
        return s0.LIZJ(LIZ, this.tab, ')', LIZ);
    }

    public ListOrderPromptReq(Integer num) {
        this.tab = num;
    }
}
