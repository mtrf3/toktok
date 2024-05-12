package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.I4u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46032I4u {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46032I4u)) {
            return false;
        }
        C46032I4u c46032I4u = (C46032I4u) obj;
        return o.LJ(this.LIZ, c46032I4u.LIZ) && o.LJ(this.LIZIZ, c46032I4u.LIZIZ) && o.LJ(this.LIZJ, c46032I4u.LIZJ) && o.LJ(this.LIZLLL, c46032I4u.LIZLLL);
    }

    public final int hashCode() {
        int hashCode = this.LIZ.hashCode() * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZLLL;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EntranceMobData(eventName=");
        LIZ.append(this.LIZ);
        LIZ.append(", propSelectedFrom=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", musicId=");
        LIZ.append(this.LIZJ);
        LIZ.append(", stickerId=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public /* synthetic */ C46032I4u(String str, String str2, int i) {
        this(str, (i & 2) != 0 ? null : str2, null, null);
    }

    public C46032I4u(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
