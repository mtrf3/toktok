package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KAN {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KAN)) {
            return false;
        }
        KAN kan = (KAN) obj;
        return this.LIZ == kan.LIZ && o.LJ(this.LIZIZ, kan.LIZIZ) && o.LJ(this.LIZJ, kan.LIZJ);
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
        LIZ.append("EcSugSingleLifeData(tabIndex=");
        LIZ.append(this.LIZ);
        LIZ.append(", searchPosition=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", searchType=");
        return q.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public KAN(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
