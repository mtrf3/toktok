package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.159, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass159 {
    public final int LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass159)) {
            return false;
        }
        AnonymousClass159 anonymousClass159 = (AnonymousClass159) obj;
        return this.LIZ == anonymousClass159.LIZ && this.LIZIZ == anonymousClass159.LIZIZ && o.LJ(this.LIZJ, anonymousClass159.LIZJ) && o.LJ(this.LIZLLL, anonymousClass159.LIZLLL);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        String str = this.LIZJ;
        int hashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LIZLLL;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkErrorData(code1=");
        LIZ.append(this.LIZ);
        LIZ.append(", code2=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", errorMsg=");
        LIZ.append(this.LIZJ);
        LIZ.append(", error_type=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public AnonymousClass159(int i, int i2, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
