package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.JvY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50728JvY implements InterfaceC50310Joo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50728JvY) && o.LJ(this.LIZ, ((C50728JvY) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UpdateLastSugAction(lastSug=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50728JvY(String str) {
        this.LIZ = str;
    }
}
