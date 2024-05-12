package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.8C9, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8C9 implements InterfaceC198557ql {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C8C9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8C9)) {
            return false;
        }
        C8C9 c8c9 = (C8C9) obj;
        return this.LIZ == c8c9.LIZ && o.LJ(this.LIZIZ, c8c9.LIZIZ) && o.LJ(this.LIZJ, c8c9.LIZJ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZJ;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditPlayListNameFragmentData(openFragmentType=");
        LIZ.append(this.LIZ);
        LIZ.append(", lastName=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", mixId=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C8C9(int i) {
        this(1, null, null);
    }

    public C8C9(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
