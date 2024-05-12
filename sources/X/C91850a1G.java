package X;

import kotlin.jvm.internal.o;

/* renamed from: X.a1G, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91850a1G {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public C91850a1G() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C91850a1G)) {
            return false;
        }
        C91850a1G c91850a1G = (C91850a1G) obj;
        return o.LJ(this.LIZ, c91850a1G.LIZ) && o.LJ(this.LIZIZ, c91850a1G.LIZIZ) && o.LJ(this.LIZJ, c91850a1G.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceWrapper(name=");
        LIZ.append((Object) this.LIZ);
        LIZ.append(", geonameid=");
        LIZ.append((Object) this.LIZIZ);
        LIZ.append(", code=");
        LIZ.append((Object) this.LIZJ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C91850a1G(String str, String str2, String str3, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
