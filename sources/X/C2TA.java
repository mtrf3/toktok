package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2TA, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2TA {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2TA)) {
            return false;
        }
        C2TA c2ta = (C2TA) obj;
        return this.LIZ == c2ta.LIZ && o.LJ(this.LIZIZ, c2ta.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("{code=");
        LIZ.append(this.LIZ);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.LIZIZ, '}', LIZ);
    }

    public C2TA(int i, String msg) {
        o.LJIIIZ(msg, "msg");
        this.LIZ = i;
        this.LIZIZ = msg;
    }
}
