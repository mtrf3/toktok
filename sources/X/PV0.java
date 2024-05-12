package X;

import defpackage.i0;

/* loaded from: classes12.dex */
public final class PV0 {
    public final String LIZ = "*.twitter.com";
    public final String LIZIZ;
    public final String LIZJ;
    public final C64537PUn LIZLLL;

    public final int hashCode() {
        return this.LIZLLL.hashCode() + C79062V1e.LJ(this.LIZJ, C79062V1e.LJ(this.LIZ, 527, 31), 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LIZJ);
        LIZ.append(this.LIZLLL.base64());
        return X1D.LIZIZ(LIZ);
    }

    public PV0(String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("http://");
        LIZ.append("twitter.com");
        this.LIZIZ = C64626PXy.LJIIIZ(X1D.LIZIZ(LIZ)).LIZLLL;
        if (str.startsWith("sha1/")) {
            this.LIZJ = "sha1/";
            this.LIZLLL = C64537PUn.decodeBase64(str.substring(5));
        } else if (str.startsWith("sha256/")) {
            this.LIZJ = "sha256/";
            this.LIZLLL = C64537PUn.decodeBase64(str.substring(7));
        } else {
            throw new IllegalArgumentException(i0.LJFF("pins must start with 'sha256/' or 'sha1/': ", str));
        }
        if (this.LIZLLL != null) {
        } else {
            throw new IllegalArgumentException(i0.LJFF("pins must be base64: ", str));
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PV0) {
            PV0 pv0 = (PV0) obj;
            if (this.LIZ.equals(pv0.LIZ) && this.LIZJ.equals(pv0.LIZJ) && this.LIZLLL.equals(pv0.LIZLLL)) {
                return true;
            }
        }
        return false;
    }
}
