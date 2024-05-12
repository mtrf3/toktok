package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.75E, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C75E {
    public final C75D LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C75E)) {
            return false;
        }
        C75E c75e = (C75E) obj;
        return this.LIZ == c75e.LIZ && o.LJ(this.LIZIZ, c75e.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("VisibleStatusEvent(status=");
        LIZ.append(this.LIZ);
        LIZ.append(", method=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public /* synthetic */ C75E(C75D c75d) {
        this(c75d, "");
    }

    public C75E(C75D status, String method) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(method, "method");
        this.LIZ = status;
        this.LIZIZ = method;
    }
}
