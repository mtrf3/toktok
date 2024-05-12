package X;

import defpackage.b0;
import kotlin.jvm.internal.o;

/* renamed from: X.3rk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97243rk {
    public final C109544Rq LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C97243rk)) {
            return false;
        }
        C97243rk c97243rk = (C97243rk) obj;
        return o.LJ(this.LIZ, c97243rk.LIZ) && this.LIZIZ == c97243rk.LIZIZ;
    }

    public final int hashCode() {
        C109544Rq c109544Rq = this.LIZ;
        return ((c109544Rq == null ? 0 : c109544Rq.hashCode()) * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MinusHeightInfo(msg=");
        LIZ.append(this.LIZ);
        LIZ.append(", minusHeight=");
        return b0.LIZJ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C97243rk(int i, C109544Rq c109544Rq) {
        this.LIZ = c109544Rq;
        this.LIZIZ = i;
    }
}
