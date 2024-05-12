package X;

import java.security.cert.Certificate;
import java.util.List;

/* loaded from: classes12.dex */
public final class PNS {
    public final EnumC64000P9w LIZ;
    public final PVG LIZIZ;
    public final List<Certificate> LIZJ;
    public final List<Certificate> LIZLLL;

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C77339UWx.LIZ(this.LIZJ, (this.LIZIZ.hashCode() + ((this.LIZ.hashCode() + 527) * 31)) * 31, 31);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.PNS LIZ(javax.net.ssl.SSLSession r5) {
        /*
            java.lang.String r1 = r5.getCipherSuite()
            if (r1 == 0) goto L60
            java.lang.String r0 = "SSL_NULL_WITH_NULL_NULL"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L58
            X.PVG r4 = X.PVG.LIZ(r1)
            java.lang.String r1 = r5.getProtocol()
            if (r1 == 0) goto L50
            java.lang.String r0 = "NONE"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L48
            X.P9w r3 = X.EnumC64000P9w.forJavaName(r1)
            java.security.cert.Certificate[] r0 = r5.getPeerCertificates()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> L2f
            if (r0 == 0) goto L2f
            java.util.List r2 = X.PVA.LJIILJJIL(r0)
            goto L33
        L2f:
            java.util.List r2 = java.util.Collections.emptyList()
        L33:
            java.security.cert.Certificate[] r0 = r5.getLocalCertificates()
            if (r0 == 0) goto L43
            java.util.List r1 = X.PVA.LJIILJJIL(r0)
        L3d:
            X.PNS r0 = new X.PNS
            r0.<init>(r3, r4, r2, r1)
            return r0
        L43:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L3d
        L48:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r1.<init>(r0)
            throw r1
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            r1.<init>(r0)
            throw r1
        L58:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == SSL_NULL_WITH_NULL_NULL"
            r1.<init>(r0)
            throw r1
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PNS.LIZ(javax.net.ssl.SSLSession):X.PNS");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PNS)) {
            return false;
        }
        PNS pns = (PNS) obj;
        if (!this.LIZ.equals(pns.LIZ) || !this.LIZIZ.equals(pns.LIZIZ) || !this.LIZJ.equals(pns.LIZJ) || !this.LIZLLL.equals(pns.LIZLLL)) {
            return false;
        }
        return true;
    }

    public PNS(EnumC64000P9w enumC64000P9w, PVG pvg, List<Certificate> list, List<Certificate> list2) {
        this.LIZ = enumC64000P9w;
        this.LIZIZ = pvg;
        this.LIZJ = list;
        this.LIZLLL = list2;
    }
}
