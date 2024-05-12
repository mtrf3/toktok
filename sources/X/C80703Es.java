package X;

import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.3Es, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80703Es implements InterfaceC80653En {
    public final String LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final String LJLJI;

    public C80703Es() {
        this(null, 7);
    }

    public final int hashCode() {
        int hashCode;
        String str = this.LJLIL;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        java.util.Map<String, String> map = this.LJLILLLLZI;
        if (map != null) {
            i = map.hashCode();
        }
        return this.LJLJI.hashCode() + ((i2 + i) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NearbyHomePageMobParam(isCityName=");
        LIZ.append(this.LJLIL);
        LIZ.append(", extraParam=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", sourceId=");
        return q.LIZIZ(LIZ, this.LJLJI, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80703Es)) {
            return false;
        }
        C80703Es c80703Es = (C80703Es) obj;
        if (o.LJ(this.LJLIL, c80703Es.LJLIL) && o.LJ(this.LJLILLLLZI, c80703Es.LJLILLLLZI) && o.LJ(this.LJLJI, c80703Es.LJLJI)) {
            return true;
        }
        return false;
    }

    public C80703Es(String str, int i) {
        String sourceId;
        str = (i & 1) != 0 ? null : str;
        if ((i & 4) != 0) {
            sourceId = "NearbyHomePageMobParam";
        } else {
            sourceId = null;
        }
        o.LJIIIZ(sourceId, "sourceId");
        this.LJLIL = str;
        this.LJLILLLLZI = null;
        this.LJLJI = sourceId;
    }
}
