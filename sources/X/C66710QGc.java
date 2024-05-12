package X;

/* renamed from: X.QGc, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66710QGc extends AbstractC66711QGd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final AbstractC66709QGb LIZLLL;
    public final EnumC66712QGe LJ;

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.LIZIZ;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.LIZJ;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        AbstractC66709QGb abstractC66709QGb = this.LIZLLL;
        if (abstractC66709QGb == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = abstractC66709QGb.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        EnumC66712QGe enumC66712QGe = this.LJ;
        if (enumC66712QGe != null) {
            i = enumC66712QGe.hashCode();
        }
        return i5 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InstallationResponse{uri=");
        LIZ.append(this.LIZ);
        LIZ.append(", fid=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", refreshToken=");
        LIZ.append(this.LIZJ);
        LIZ.append(", authToken=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", responseCode=");
        LIZ.append(this.LJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC66711QGd
    public final AbstractC66709QGb LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC66711QGd
    public final String LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC66711QGd
    public final String LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC66711QGd
    public final EnumC66712QGe LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC66711QGd
    public final String LJ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC66711QGd)) {
            return false;
        }
        AbstractC66711QGd abstractC66711QGd = (AbstractC66711QGd) obj;
        String str = this.LIZ;
        if (str != null ? str.equals(abstractC66711QGd.LJ()) : abstractC66711QGd.LJ() == null) {
            String str2 = this.LIZIZ;
            if (str2 != null ? str2.equals(abstractC66711QGd.LIZIZ()) : abstractC66711QGd.LIZIZ() == null) {
                String str3 = this.LIZJ;
                if (str3 != null ? str3.equals(abstractC66711QGd.LIZJ()) : abstractC66711QGd.LIZJ() == null) {
                    AbstractC66709QGb abstractC66709QGb = this.LIZLLL;
                    if (abstractC66709QGb != null ? abstractC66709QGb.equals(abstractC66711QGd.LIZ()) : abstractC66711QGd.LIZ() == null) {
                        EnumC66712QGe enumC66712QGe = this.LJ;
                        if (enumC66712QGe == null) {
                            if (abstractC66711QGd.LIZLLL() == null) {
                                return true;
                            }
                        } else if (enumC66712QGe.equals(abstractC66711QGd.LIZLLL())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public C66710QGc(String str, String str2, String str3, AbstractC66709QGb abstractC66709QGb, EnumC66712QGe enumC66712QGe) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = abstractC66709QGb;
        this.LJ = enumC66712QGe;
    }
}
