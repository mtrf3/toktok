package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Be, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232669Be {
    public final int LIZ;
    public final String LIZIZ;

    public C232669Be() {
        this(0, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C232669Be)) {
            return false;
        }
        C232669Be c232669Be = (C232669Be) obj;
        return this.LIZ == c232669Be.LIZ && o.LJ(this.LIZIZ, c232669Be.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommerceHeaderParam(buttonType=");
        LIZ.append(this.LIZ);
        LIZ.append(", enterFrom=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C232669Be(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
