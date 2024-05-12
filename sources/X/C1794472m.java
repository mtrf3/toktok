package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.72m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1794472m {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1794472m)) {
            return false;
        }
        C1794472m c1794472m = (C1794472m) obj;
        return o.LJ(this.LIZ, c1794472m.LIZ) && o.LJ(this.LIZIZ, c1794472m.LIZIZ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public C1794472m() {
        this("", "");
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CommentMentionMobParams(enterFrom=");
        LIZ.append(this.LIZ);
        LIZ.append(", nowType=");
        return q.LIZIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C1794472m(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
