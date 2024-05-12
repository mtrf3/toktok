package X;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import javax.security.auth.x500.X500Principal;

/* renamed from: X.PCi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64064PCi implements P95 {
    public final java.util.Map<X500Principal, java.util.Set<X509Certificate>> LIZ = new LinkedHashMap();

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C64064PCi(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            java.util.Set<X509Certificate> set = this.LIZ.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet<>(1);
                this.LIZ.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    @Override // X.P95
    public final X509Certificate LIZ(X509Certificate x509Certificate) {
        java.util.Set<X509Certificate> set = (java.util.Set) ((LinkedHashMap) this.LIZ).get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof C64064PCi) && ((C64064PCi) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }
}
