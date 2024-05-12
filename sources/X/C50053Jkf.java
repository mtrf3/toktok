package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jkf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50053Jkf implements InterfaceC50057Jkj {
    public final long LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50053Jkf)) {
            return false;
        }
        C50053Jkf c50053Jkf = (C50053Jkf) obj;
        return this.LIZ == c50053Jkf.LIZ && o.LJ(this.LIZIZ, c50053Jkf.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C16880lQ.LLJIJIL(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FirstTimeReceived(entityId=");
        LIZ.append(this.LIZ);
        LIZ.append(", entityKeyword=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C50053Jkf(long j, String str) {
        this.LIZ = j;
        this.LIZIZ = str;
    }
}
