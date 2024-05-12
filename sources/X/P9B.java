package X;

/* loaded from: classes12.dex */
public final class P9B extends P97 {
    public final P95 LIZ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public P9B(P95 p95) {
        this.LIZ = p95;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof P9B) && ((P9B) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0046 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:1: B:26:0x0056->B:36:?, LOOP_END, SYNTHETIC] */
    @Override // X.P97
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List LIZ(java.lang.String r10, java.util.List r11) {
        /*
            r9 = this;
            java.util.ArrayDeque r5 = new java.util.ArrayDeque
            r5.<init>(r11)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.Object r0 = r5.removeFirst()
            r4.add(r0)
            r6 = 0
            r8 = 0
        L13:
            r0 = 9
            if (r6 >= r0) goto L9e
            r1 = 1
            java.lang.Object r7 = X.AnonymousClass028.LIZIZ(r4, r1, r4)
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7
            X.P95 r0 = r9.LIZ
            java.security.cert.X509Certificate r2 = r0.LIZ(r7)
            if (r2 == 0) goto L52
            int r0 = r4.size()
            if (r0 > r1) goto L32
            boolean r0 = r7.equals(r2)
            if (r0 != 0) goto L35
        L32:
            r4.add(r2)
        L35:
            java.security.Principal r1 = r2.getIssuerDN()
            java.security.Principal r0 = r2.getSubjectDN()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L49
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L47
            return r4
        L47:
            r8 = 1
            goto L79
        L49:
            java.security.PublicKey r0 = r2.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L43
            r2.verify(r0)     // Catch: java.security.GeneralSecurityException -> L43
            r0 = 1
            goto L44
        L52:
            java.util.Iterator r3 = r5.iterator()
        L56:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L85
            java.lang.Object r2 = r3.next()
            java.security.cert.X509Certificate r2 = (java.security.cert.X509Certificate) r2
            java.security.Principal r1 = r7.getIssuerDN()
            java.security.Principal r0 = r2.getSubjectDN()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L7c
        L70:
            r0 = 0
        L71:
            if (r0 == 0) goto L56
            r3.remove()
            r4.add(r2)
        L79:
            int r6 = r6 + 1
            goto L13
        L7c:
            java.security.PublicKey r0 = r2.getPublicKey()     // Catch: java.security.GeneralSecurityException -> L70
            r7.verify(r0)     // Catch: java.security.GeneralSecurityException -> L70
            r0 = 1
            goto L71
        L85:
            if (r8 == 0) goto L88
            return r4
        L88:
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Failed to find a trusted cert that signed "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        L9e:
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "Certificate chain too long: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9B.LIZ(java.lang.String, java.util.List):java.util.List");
    }
}
