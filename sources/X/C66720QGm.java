package X;

/* renamed from: X.QGm, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66720QGm extends AbstractC66722QGo {
    public final String LIZIZ;
    public final EnumC66725QGr LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final long LJI;
    public final String LJII;

    @Override // X.AbstractC66722QGo
    public final C66721QGn LJII() {
        return new C66721QGn(this);
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.LIZIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.LIZJ.hashCode()) * 1000003;
        String str2 = this.LIZLLL;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.LJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        long j = this.LJFF;
        int i3 = (((i2 ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.LJI;
        int i4 = (i3 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.LJII;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PersistedInstallationEntry{firebaseInstallationId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", registrationStatus=");
        LIZ.append(this.LIZJ);
        LIZ.append(", authToken=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", refreshToken=");
        LIZ.append(this.LJ);
        LIZ.append(", expiresInSecs=");
        LIZ.append(this.LJFF);
        LIZ.append(", tokenCreationEpochInSecs=");
        LIZ.append(this.LJI);
        LIZ.append(", fisError=");
        return JBR.LJFF(LIZ, this.LJII, "}", LIZ);
    }

    @Override // X.AbstractC66722QGo
    public final String LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC66722QGo
    public final long LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC66722QGo
    public final String LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC66722QGo
    public final String LIZLLL() {
        return this.LJII;
    }

    @Override // X.AbstractC66722QGo
    public final String LJ() {
        return this.LJ;
    }

    @Override // X.AbstractC66722QGo
    public final EnumC66725QGr LJFF() {
        return this.LIZJ;
    }

    @Override // X.AbstractC66722QGo
    public final long LJI() {
        return this.LJI;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC66722QGo)) {
            return false;
        }
        AbstractC66722QGo abstractC66722QGo = (AbstractC66722QGo) obj;
        String str3 = this.LIZIZ;
        if (str3 != null ? str3.equals(abstractC66722QGo.LIZJ()) : abstractC66722QGo.LIZJ() == null) {
            if (this.LIZJ.equals(abstractC66722QGo.LJFF()) && ((str = this.LIZLLL) != null ? str.equals(abstractC66722QGo.LIZ()) : abstractC66722QGo.LIZ() == null) && ((str2 = this.LJ) != null ? str2.equals(abstractC66722QGo.LJ()) : abstractC66722QGo.LJ() == null) && this.LJFF == abstractC66722QGo.LIZIZ() && this.LJI == abstractC66722QGo.LJI()) {
                String str4 = this.LJII;
                if (str4 == null) {
                    if (abstractC66722QGo.LIZLLL() == null) {
                        return true;
                    }
                } else if (str4.equals(abstractC66722QGo.LIZLLL())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C66720QGm(String str, EnumC66725QGr enumC66725QGr, String str2, String str3, long j, long j2, String str4) {
        this.LIZIZ = str;
        this.LIZJ = enumC66725QGr;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = j;
        this.LJI = j2;
        this.LJII = str4;
    }
}
