package X;

import kotlin.jvm.internal.o;

/* renamed from: X.47i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1042647i {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1042647i)) {
            return false;
        }
        C1042647i c1042647i = (C1042647i) obj;
        return o.LJ(this.LIZ, c1042647i.LIZ) && o.LJ(this.LIZIZ, c1042647i.LIZIZ) && o.LJ(this.LIZJ, c1042647i.LIZJ) && o.LJ(this.LIZLLL, c1042647i.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.LIZLLL;
        return hashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("QuotedVideoData(aid=");
        LIZ.append(this.LIZ);
        LIZ.append(", uid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", secUid=");
        LIZ.append(this.LIZJ);
        LIZ.append(", isStory=");
        return C78920UyC.LIZIZ(LIZ, this.LIZLLL, ')', LIZ);
    }

    public C1042647i(String str, String str2, String str3, Boolean bool) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = bool;
    }
}
