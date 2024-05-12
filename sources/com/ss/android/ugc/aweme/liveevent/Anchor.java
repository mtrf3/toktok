package com.ss.android.ugc.aweme.liveevent;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Anchor {

    @InterfaceC65349Pkn("anchorId")
    public String anchorId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Anchor) && o.LJ(this.anchorId, ((Anchor) obj).anchorId);
    }

    public final int hashCode() {
        String str = this.anchorId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Anchor(anchorId=");
        return q.LIZIZ(LIZ, this.anchorId, ')', LIZ);
    }

    public Anchor(String str) {
        this.anchorId = str;
    }
}
