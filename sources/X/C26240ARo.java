package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.ARo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26240ARo {
    public final String LIZ = "MainActivity";
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26240ARo)) {
            return false;
        }
        C26240ARo c26240ARo = (C26240ARo) obj;
        return o.LJ(this.LIZ, c26240ARo.LIZ) && o.LJ(this.LIZIZ, c26240ARo.LIZIZ) && o.LJ(this.LIZJ, c26240ARo.LIZJ) && o.LJ(this.LIZLLL, c26240ARo.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[curActivity: ");
        LIZ.append(this.LIZ);
        LIZ.append("][curTab: ");
        LIZ.append(this.LIZIZ);
        LIZ.append("][class: ");
        LIZ.append(this.LIZJ);
        LIZ.append("][trace: ");
        return q.LIZIZ(LIZ, this.LIZLLL, ']', LIZ);
    }

    public C26240ARo(String str, String str2, String str3) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = str3;
    }
}
