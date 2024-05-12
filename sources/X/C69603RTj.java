package X;

import kotlin.jvm.internal.o;

/* renamed from: X.RTj, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69603RTj {
    public final String LIZ;
    public final String LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C69603RTj)) {
            return false;
        }
        C69603RTj c69603RTj = (C69603RTj) obj;
        return o.LJ(this.LIZ, c69603RTj.LIZ) && o.LJ(this.LIZIZ, c69603RTj.LIZIZ) && o.LJ(this.LIZJ, c69603RTj.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.LIZJ;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NavigateUserProfileData(userId=");
        LIZ.append(this.LIZ);
        LIZ.append(", secId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", questionId=");
        return JBR.LJ(LIZ, this.LIZJ, ')', LIZ);
    }

    public C69603RTj(String str, String str2, Long l) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = l;
    }
}
