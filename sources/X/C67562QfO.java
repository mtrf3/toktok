package X;

/* renamed from: X.QfO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67562QfO extends AbstractC67565QfR {
    public final String LIZ;
    public final Long LIZIZ = null;

    @Override // X.AbstractC67565QfR
    public final Long LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67565QfR
    public final String LIZIZ() {
        return this.LIZ;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.LIZ.hashCode() ^ 1000003;
        Long l = this.LIZIZ;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        String str = this.LIZ;
        Long l = this.LIZIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("IntegrityTokenRequest{nonce=");
        LIZ.append(str);
        LIZ.append(", cloudProjectNumber=");
        LIZ.append(l);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC67565QfR) {
            AbstractC67565QfR abstractC67565QfR = (AbstractC67565QfR) obj;
            if (this.LIZ.equals(abstractC67565QfR.LIZIZ()) && ((l = this.LIZIZ) != null ? l.equals(abstractC67565QfR.LIZ()) : abstractC67565QfR.LIZ() == null)) {
                return true;
            }
        }
        return false;
    }
}
