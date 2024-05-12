package X;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.Fae, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39240Fae {
    public final String LIZ;
    public final java.util.Set<String> LIZIZ;
    public final String LIZJ;
    public final Boolean LIZLLL;

    public final int hashCode() {
        int LJ = (this.LIZLLL.booleanValue() ? 1 : 0) + C79062V1e.LJ(this.LIZJ, this.LIZ.hashCode() * 92821, 92821);
        Iterator<String> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            LJ = (LJ * 92821) + it.next().hashCode();
        }
        return LJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C39240Fae)) {
            return false;
        }
        C39240Fae c39240Fae = (C39240Fae) obj;
        if (this.LIZ.equals(c39240Fae.LIZ) && this.LIZJ.equals(c39240Fae.LIZJ) && this.LIZLLL == c39240Fae.LIZLLL && this.LIZIZ.equals(c39240Fae.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C39240Fae(PackageInfo packageInfo, boolean z) {
        String str = packageInfo.packageName;
        Signature[] signatureArr = packageInfo.signatures;
        HashSet hashSet = new HashSet();
        for (Signature signature : signatureArr) {
            try {
                hashSet.add(Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10));
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("Platform does not supportSHA-512 hashing");
            }
        }
        String str2 = packageInfo.versionName;
        this.LIZ = str;
        this.LIZIZ = hashSet;
        this.LIZJ = str2;
        this.LIZLLL = Boolean.valueOf(z);
    }
}
