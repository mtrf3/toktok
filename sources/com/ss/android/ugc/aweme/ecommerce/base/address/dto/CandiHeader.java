package com.ss.android.ugc.aweme.ecommerce.base.address.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CandiHeader {

    @InterfaceC65349Pkn("text")
    public final String text;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CandiHeader) && o.LJ(this.text, ((CandiHeader) obj).text);
    }

    public final int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CandiHeader(text=");
        return q.LIZIZ(LIZ, this.text, ')', LIZ);
    }

    public CandiHeader(String str) {
        this.text = str;
    }
}
