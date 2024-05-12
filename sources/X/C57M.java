package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.57M, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C57M {
    public final Exception LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57M)) {
            return false;
        }
        C57M c57m = (C57M) obj;
        return o.LJ(this.LIZ, c57m.LIZ) && this.LIZIZ == c57m.LIZIZ;
    }

    public final int hashCode() {
        Exception exc = this.LIZ;
        return ((exc == null ? 0 : exc.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExceptionResultData(exception=");
        LIZ.append(this.LIZ);
        LIZ.append(", errorCode=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C57M(Exception exc, int i) {
        this.LIZ = exc;
        this.LIZIZ = i;
    }
}
