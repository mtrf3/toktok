package X;

import kotlin.jvm.internal.o;

/* renamed from: X.XLa, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84674XLa<T> {
    public final int LIZ;
    public final String LIZIZ;
    public final T LIZJ;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C84674XLa() {
        /*
            r3 = this;
            r2 = 0
            r1 = 7
            r0 = 0
            r3.<init>(r0, r2, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C84674XLa.<init>():void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C84674XLa)) {
            return false;
        }
        C84674XLa c84674XLa = (C84674XLa) obj;
        return this.LIZ == c84674XLa.LIZ && o.LJ(this.LIZIZ, c84674XLa.LIZIZ) && o.LJ(this.LIZJ, c84674XLa.LIZJ);
    }

    public final boolean LIZ() {
        if (this.LIZ != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.LIZIZ, this.LIZ * 31, 31);
        T t = this.LIZJ;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ExecuteResult(ret=");
        LIZ.append(this.LIZ);
        LIZ.append(", failedMsg=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", data=");
        return U26.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C84674XLa(int i, String failedMsg, T t) {
        o.LJIIIZ(failedMsg, "failedMsg");
        this.LIZ = i;
        this.LIZIZ = failedMsg;
        this.LIZJ = t;
    }

    public /* synthetic */ C84674XLa(int i, String str, Object obj, int i2) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? null : obj);
    }
}
