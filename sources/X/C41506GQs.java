package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.GQs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41506GQs {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41506GQs)) {
            return false;
        }
        C41506GQs c41506GQs = (C41506GQs) obj;
        return o.LJ(this.LIZ, c41506GQs.LIZ) && o.LJ(this.LIZIZ, c41506GQs.LIZIZ);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UserInfo(uid=");
        LIZ.append(this.LIZ);
        LIZ.append(", secUid=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C41506GQs(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
