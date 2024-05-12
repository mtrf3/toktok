package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9ZN, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9ZN {
    public final Long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9ZN)) {
            return false;
        }
        C9ZN c9zn = (C9ZN) obj;
        return o.LJ(this.LIZ, c9zn.LIZ) && this.LIZIZ == c9zn.LIZIZ && o.LJ(this.LIZJ, c9zn.LIZJ) && o.LJ(this.LIZLLL, c9zn.LIZLLL);
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.LIZ;
        int i = 0;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int LJ = C79062V1e.LJ(this.LIZJ, ((hashCode * 31) + this.LIZIZ) * 31, 31);
        String str = this.LIZLLL;
        if (str != null) {
            i = str.hashCode();
        }
        return LJ + i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoMessage(wslMsgId=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", content=");
        LIZ.append(this.LIZJ);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C9ZN(int i, Long l, String content, String str) {
        o.LJIIIZ(content, "content");
        this.LIZ = l;
        this.LIZIZ = i;
        this.LIZJ = content;
        this.LIZLLL = str;
    }
}
