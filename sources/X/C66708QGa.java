package X;

/* renamed from: X.QGa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66708QGa extends AbstractC66709QGb {
    public final String LIZ;
    public final long LIZIZ;
    public final EnumC66714QGg LIZJ;

    public final int hashCode() {
        int hashCode;
        String str = this.LIZ;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.LIZIZ;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        EnumC66714QGg enumC66714QGg = this.LIZJ;
        if (enumC66714QGg != null) {
            i = enumC66714QGg.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TokenResult{token=");
        LIZ.append(this.LIZ);
        LIZ.append(", tokenExpirationTimestamp=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", responseCode=");
        LIZ.append(this.LIZJ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC66709QGb
    public final EnumC66714QGg LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC66709QGb
    public final String LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC66709QGb
    public final long LIZJ() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC66709QGb)) {
            return false;
        }
        AbstractC66709QGb abstractC66709QGb = (AbstractC66709QGb) obj;
        String str = this.LIZ;
        if (str != null ? str.equals(abstractC66709QGb.LIZIZ()) : abstractC66709QGb.LIZIZ() == null) {
            if (this.LIZIZ == abstractC66709QGb.LIZJ()) {
                EnumC66714QGg enumC66714QGg = this.LIZJ;
                if (enumC66714QGg == null) {
                    if (abstractC66709QGb.LIZ() == null) {
                        return true;
                    }
                } else if (enumC66714QGg.equals(abstractC66709QGb.LIZ())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C66708QGa(String str, long j, EnumC66714QGg enumC66714QGg) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = enumC66714QGg;
    }
}
