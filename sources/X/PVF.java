package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.net.ssl.SSLSocket;

/* loaded from: classes12.dex */
public final class PVF {
    public static final PVF LJ;
    public static final PVF LJFF;
    public static final PVF LJI;
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final String[] LIZJ;
    public final String[] LIZLLL;

    static {
        PVG pvg = PVG.LJIILLIIL;
        PVG pvg2 = PVG.LJIIZILJ;
        PVG pvg3 = PVG.LJIJ;
        PVG pvg4 = PVG.LJIJI;
        PVG pvg5 = PVG.LJIJJ;
        PVG pvg6 = PVG.LJIIJ;
        PVG pvg7 = PVG.LJIIL;
        PVG pvg8 = PVG.LJIIJJI;
        PVG pvg9 = PVG.LJIILIIL;
        PVG pvg10 = PVG.LJIILL;
        PVG pvg11 = PVG.LJIILJJIL;
        PVG[] pvgArr = {pvg, pvg2, pvg3, pvg4, pvg5, pvg6, pvg7, pvg8, pvg9, pvg10, pvg11, PVG.LJIIIIZZ, PVG.LJIIIZ, PVG.LJI, PVG.LJII, PVG.LJ, PVG.LJFF, PVG.LIZLLL};
        PVH pvh = new PVH(true);
        pvh.LIZIZ(pvg, pvg2, pvg3, pvg4, pvg5, pvg6, pvg7, pvg8, pvg9, pvg10, pvg11);
        EnumC64000P9w enumC64000P9w = EnumC64000P9w.TLS_1_3;
        EnumC64000P9w enumC64000P9w2 = EnumC64000P9w.TLS_1_2;
        pvh.LIZLLL(enumC64000P9w, enumC64000P9w2);
        pvh.LIZLLL = true;
        new PVF(pvh);
        PVH pvh2 = new PVH(true);
        pvh2.LIZIZ(pvgArr);
        EnumC64000P9w enumC64000P9w3 = EnumC64000P9w.TLS_1_0;
        pvh2.LIZLLL(enumC64000P9w, enumC64000P9w2, EnumC64000P9w.TLS_1_1, enumC64000P9w3);
        pvh2.LIZLLL = true;
        LJ = new PVF(pvh2);
        PVH pvh3 = new PVH(true);
        pvh3.LIZIZ(pvgArr);
        pvh3.LIZLLL(enumC64000P9w3);
        pvh3.LIZLLL = true;
        LJFF = new PVF(pvh3);
        LJI = new PVF(new PVH(false));
    }

    public final int hashCode() {
        if (this.LIZ) {
            return ((((527 + Arrays.hashCode(this.LIZJ)) * 31) + Arrays.hashCode(this.LIZLLL)) * 31) + (!this.LIZIZ ? 1 : 0);
        }
        return 17;
    }

    public final String toString() {
        String str;
        if (!this.LIZ) {
            return "ConnectionSpec()";
        }
        String[] strArr = this.LIZJ;
        String str2 = "[all enabled]";
        if (strArr == null) {
            str = "[all enabled]";
        } else {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str3 : strArr) {
                arrayList.add(PVG.LIZ(str3));
            }
            str = Collections.unmodifiableList(arrayList).toString();
        }
        String[] strArr2 = this.LIZLLL;
        if (strArr2 != null) {
            ArrayList arrayList2 = new ArrayList(strArr2.length);
            for (String str4 : strArr2) {
                arrayList2.add(EnumC64000P9w.forJavaName(str4));
            }
            str2 = Collections.unmodifiableList(arrayList2).toString();
        }
        StringBuilder LIZLLL = C06540Nm.LIZLLL("ConnectionSpec(cipherSuites=", str, ", tlsVersions=", str2, ", supportsTlsExtensions=");
        return C19U.LIZ(LIZLLL, this.LIZIZ, ")", LIZLLL);
    }

    public PVF(PVH pvh) {
        this.LIZ = pvh.LIZ;
        this.LIZJ = pvh.LIZIZ;
        this.LIZLLL = pvh.LIZJ;
        this.LIZIZ = pvh.LIZLLL;
    }

    public final boolean LIZ(SSLSocket sSLSocket) {
        if (!this.LIZ) {
            return false;
        }
        String[] strArr = this.LIZLLL;
        if (strArr != null && !PVA.LJIIZILJ(PVA.LJIILJJIL, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.LIZJ;
        if (strArr2 != null && !PVA.LJIIZILJ(PVG.LIZIZ, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PVF)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        PVF pvf = (PVF) obj;
        boolean z = this.LIZ;
        if (z != pvf.LIZ) {
            return false;
        }
        if (z && (!Arrays.equals(this.LIZJ, pvf.LIZJ) || !Arrays.equals(this.LIZLLL, pvf.LIZLLL) || this.LIZIZ != pvf.LIZIZ)) {
            return false;
        }
        return true;
    }
}
