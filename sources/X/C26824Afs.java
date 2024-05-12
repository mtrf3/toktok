package X;

import defpackage.q;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Afs, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26824Afs {
    public final List<String> LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26824Afs)) {
            return false;
        }
        C26824Afs c26824Afs = (C26824Afs) obj;
        return o.LJ(this.LIZ, c26824Afs.LIZ) && o.LJ(this.LIZIZ, c26824Afs.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FreeShippingCouponVO(contents=");
        LIZ.append(this.LIZ);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C26824Afs(List<String> contents, String str) {
        o.LJIIIZ(contents, "contents");
        this.LIZ = contents;
        this.LIZIZ = str;
    }
}
