package com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ExtraFeeButton {

    @InterfaceC65349Pkn("name")
    public final String btnName;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ExtraFeeButton) && o.LJ(this.btnName, ((ExtraFeeButton) obj).btnName);
    }

    public final int hashCode() {
        String str = this.btnName;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExtraFeeButton(btnName=");
        return q.LIZIZ(LIZ, this.btnName, ')', LIZ);
    }

    public ExtraFeeButton(String str) {
        this.btnName = str;
    }
}
