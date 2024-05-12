package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.9Z3, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9Z3 {
    public final long LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9Z3)) {
            return false;
        }
        C9Z3 c9z3 = (C9Z3) obj;
        return this.LIZ == c9z3.LIZ && this.LIZIZ == c9z3.LIZIZ && o.LJ(this.LIZJ, c9z3.LIZJ) && o.LJ(this.LIZLLL, c9z3.LIZLLL) && o.LJ(this.LJ, c9z3.LJ);
    }

    public final int hashCode() {
        int LLJIJIL = ((C16880lQ.LLJIJIL(this.LIZ) * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int hashCode = (LLJIJIL + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("KeywordMessage(messageId=");
        LIZ.append(this.LIZ);
        LIZ.append(", status=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", keyword=");
        LIZ.append(this.LIZJ);
        LIZ.append(", content=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", message=");
        return q.LIZIZ(LIZ, this.LJ, ')', LIZ);
    }

    public /* synthetic */ C9Z3(int i, String str, String str2, long j) {
        this(i, str, str2, j, null);
    }

    public C9Z3(int i, String str, String str2, long j, String str3) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
