package com.ss.android.ugc.aweme.shortvideo.edit.audioedit.common.vc;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class VCExtra {

    @InterfaceC65349Pkn("logid")
    public final String logId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VCExtra) && o.LJ(this.logId, ((VCExtra) obj).logId);
    }

    public final int hashCode() {
        String str = this.logId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VCExtra(logId=");
        return q.LIZIZ(LIZ, this.logId, ')', LIZ);
    }

    public VCExtra(String str) {
        this.logId = str;
    }
}
