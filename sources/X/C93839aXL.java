package X;

import kotlin.jvm.internal.o;

/* renamed from: X.aXL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93839aXL {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C93839aXL)) {
            return false;
        }
        C93839aXL c93839aXL = (C93839aXL) obj;
        return o.LJ(this.LIZ, c93839aXL.LIZ) && o.LJ(this.LIZIZ, c93839aXL.LIZIZ) && o.LJ(this.LIZJ, c93839aXL.LIZJ) && o.LJ(this.LIZLLL, c93839aXL.LIZLLL);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.LIZJ;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LIZLLL;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EffectBean(id=");
        LIZ.append(this.LIZ);
        LIZ.append(", name=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", icon=");
        LIZ.append(this.LIZJ);
        LIZ.append(", extra=");
        LIZ.append(this.LIZLLL);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C93839aXL(String id, String name, String icon, String str) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(name, "name");
        o.LJIIIZ(icon, "icon");
        this.LIZ = id;
        this.LIZIZ = name;
        this.LIZJ = icon;
        this.LIZLLL = str;
    }
}
