package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.0yi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25120yi {
    public final String LIZ;
    public final boolean LIZIZ;
    public final List<String> LIZJ;
    public final List<String> LIZLLL;

    public C25120yi() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        if (this.LIZ.startsWith("index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = this.LIZ.hashCode();
        }
        return this.LIZLLL.hashCode() + C77339UWx.LIZ(this.LIZJ, ((hashCode * 31) + (this.LIZIZ ? 1 : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Index{name='");
        Q89.LIZIZ(LIZ, this.LIZ, '\'', ", unique=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", columns=");
        LIZ.append(this.LIZJ);
        LIZ.append(", orders=");
        return C1NE.LIZIZ(LIZ, this.LIZLLL, '}', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25120yi)) {
            return false;
        }
        C25120yi c25120yi = (C25120yi) obj;
        if (this.LIZIZ != c25120yi.LIZIZ || !this.LIZJ.equals(c25120yi.LIZJ) || !this.LIZLLL.equals(c25120yi.LIZLLL)) {
            return false;
        }
        if (this.LIZ.startsWith("index_")) {
            return c25120yi.LIZ.startsWith("index_");
        }
        return this.LIZ.equals(c25120yi.LIZ);
    }

    public C25120yi(boolean z, String str, List list, List list2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = list;
        this.LIZLLL = (list2 == null || list2.size() == 0) ? Collections.nCopies(list.size(), C0BM.ASC.name()) : list2;
    }
}
