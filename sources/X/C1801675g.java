package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.75g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1801675g {
    public final C75F LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1801675g)) {
            return false;
        }
        C1801675g c1801675g = (C1801675g) obj;
        return this.LIZ == c1801675g.LIZ && o.LJ(this.LIZIZ, c1801675g.LIZIZ);
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

    public /* synthetic */ C1801675g(C75F c75f) {
        this(c75f, "");
    }

    public C1801675g(C75F status, String method) {
        o.LJIIIZ(status, "status");
        o.LJIIIZ(method, "method");
        this.LIZ = status;
        this.LIZIZ = method;
    }
}
