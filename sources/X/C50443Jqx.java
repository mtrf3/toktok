package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.Jqx, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50443Jqx implements InterfaceC50310Joo {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50443Jqx) && o.LJ(this.LIZ, ((C50443Jqx) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SuggestEnterPreloadAction(enterFrom=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C50443Jqx(String str) {
        this.LIZ = str;
    }
}
