package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.SHa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71830SHa {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71830SHa)) {
            return false;
        }
        C71830SHa c71830SHa = (C71830SHa) obj;
        return o.LJ(this.LIZ, c71830SHa.LIZ) && o.LJ(this.LIZIZ, c71830SHa.LIZIZ) && o.LJ(this.LIZJ, c71830SHa.LIZJ) && o.LJ(this.LIZLLL, c71830SHa.LIZLLL);
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
        LIZ.append("VideoThumbnailData(questionId=");
        LIZ.append(this.LIZ);
        LIZ.append(", awemeId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", url=");
        LIZ.append(this.LIZJ);
        LIZ.append(", groupdId=");
        return q.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C71830SHa(String str, String str2, String str3, String str4) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
    }
}
