package X;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.LinkedHashSet;

/* renamed from: X.PUz, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64549PUz {
    public static final C64549PUz LIZJ = new C64549PUz(new LinkedHashSet(new PV1().LIZ), null);
    public final java.util.Set<PV0> LIZ;
    public final P97 LIZIZ;

    public final int hashCode() {
        int i;
        P97 p97 = this.LIZIZ;
        if (p97 != null) {
            i = p97.hashCode();
        } else {
            i = 0;
        }
        return this.LIZ.hashCode() + (i * 31);
    }

    public static String LIZIZ(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sha256/");
            LIZ.append(C64537PUn.of(certificate.getPublicKey().getEncoded()).sha256().base64());
            return X1D.LIZIZ(LIZ);
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C64549PUz) {
            C64549PUz c64549PUz = (C64549PUz) obj;
            if (PVA.LJIIJ(this.LIZIZ, c64549PUz.LIZIZ) && this.LIZ.equals(c64549PUz.LIZ)) {
                return true;
            }
        }
        return false;
    }

    public C64549PUz(java.util.Set<PV0> set, P97 p97) {
        this.LIZ = set;
        this.LIZIZ = p97;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.String r19, java.util.List<java.security.cert.Certificate> r20) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64549PUz.LIZ(java.lang.String, java.util.List):void");
    }
}
