package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.3F0, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3F0 {
    public final C109544Rq LIZ;
    public List<? extends C109544Rq> LIZIZ;

    public C3F0() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3F0)) {
            return false;
        }
        C3F0 c3f0 = (C3F0) obj;
        return o.LJ(this.LIZ, c3f0.LIZ) && o.LJ(this.LIZIZ, c3f0.LIZIZ);
    }

    public final int hashCode() {
        C109544Rq c109544Rq = this.LIZ;
        int hashCode = (c109544Rq == null ? 0 : c109544Rq.hashCode()) * 31;
        List<? extends C109544Rq> list = this.LIZIZ;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ReportMessages(msg=");
        LIZ.append(this.LIZ);
        LIZ.append(", defaultSelectedMessages=");
        return C1NE.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C3F0(C109544Rq c109544Rq, int i) {
        this.LIZ = (i & 1) != 0 ? null : c109544Rq;
        this.LIZIZ = null;
    }
}
