package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.7Rn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185957Rn {
    public final String LIZ;

    public C185957Rn() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C185957Rn) && o.LJ(this.LIZ, ((C185957Rn) obj).LIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cursor(pageExtra=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C185957Rn(String str) {
        this.LIZ = str;
    }
}
