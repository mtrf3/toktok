package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Qp9, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68167Qp9 {
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;
    public final String LJ;

    public C68167Qp9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C68167Qp9)) {
            return false;
        }
        C68167Qp9 c68167Qp9 = (C68167Qp9) obj;
        return o.LJ(this.LIZ, c68167Qp9.LIZ) && o.LJ(this.LIZIZ, c68167Qp9.LIZIZ) && o.LJ(this.LIZJ, c68167Qp9.LIZJ) && o.LJ(this.LIZLLL, c68167Qp9.LIZLLL) && o.LJ(this.LJ, c68167Qp9.LJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LIZLLL;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJ;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Builder(did=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", aid=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", channel=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(", appVersion=");
        LIZ.append((Object) this.LIZLLL);
        LIZ.append(", updateVersionCode=");
        LIZ.append((Object) this.LJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C68167Qp9(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = null;
    }
}
