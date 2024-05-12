package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.NBx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58957NBx extends NC2 {
    public final String LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C58957NBx) && o.LJ(this.LIZ, ((C58957NBx) obj).LIZ);
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
        LIZ.append("ShowFailed(failReason=");
        return q.LIZIZ(LIZ, this.LIZ, ')', LIZ);
    }

    public C58957NBx(String str) {
        this.LIZ = str;
    }
}
