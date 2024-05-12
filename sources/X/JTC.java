package X;

import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JTC {
    public final JTD LIZ;
    public final String LIZIZ;
    public final Boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JTC)) {
            return false;
        }
        JTC jtc = (JTC) obj;
        return o.LJ(this.LIZ, jtc.LIZ) && o.LJ(this.LIZIZ, jtc.LIZIZ) && o.LJ(this.LIZJ, jtc.LIZJ);
    }

    public final int hashCode() {
        JTD jtd = this.LIZ;
        int hashCode = (jtd == null ? 0 : jtd.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.LIZJ;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public JTC() {
        this(null, null, Boolean.FALSE);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SearchLynxSSRInfo(lynxSSRConfig=");
        LIZ.append(this.LIZ);
        LIZ.append(", lynxSSRHydrateHexData=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", disableHydrate=");
        return C78920UyC.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public JTC(JTD jtd, String str, Boolean bool) {
        this.LIZ = jtd;
        this.LIZIZ = str;
        this.LIZJ = bool;
    }
}
