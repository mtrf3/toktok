package X;

import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.4ap, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C112234ap {
    public final String LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C112234ap)) {
            return false;
        }
        C112234ap c112234ap = (C112234ap) obj;
        return o.LJ(this.LIZ, c112234ap.LIZ) && this.LIZIZ == c112234ap.LIZIZ && o.LJ(this.LIZJ, c112234ap.LIZJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        boolean z = this.LIZIZ;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        Integer num = this.LIZJ;
        return i2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ActivityStatusAccuracyInfo(toUid=");
        LIZ.append(this.LIZ);
        LIZ.append(", isOnline=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", rankIdx=");
        return s0.LIZJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C112234ap(Integer num, String toUid, boolean z) {
        o.LJIIIZ(toUid, "toUid");
        this.LIZ = toUid;
        this.LIZIZ = z;
        this.LIZJ = num;
    }
}
