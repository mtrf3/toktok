package X;

/* renamed from: X.QcO, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67376QcO extends AbstractC67375QcN {
    public final String LIZ;
    public final Integer LIZIZ;
    public final C67366QcE LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final java.util.Map<String, String> LJFF;

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.LIZ.hashCode() ^ 1000003) * 1000003;
        Integer num = this.LIZIZ;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.LIZJ.hashCode()) * 1000003;
        long j = this.LIZLLL;
        int i = (hashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.LJ;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EventInternal{transportName=");
        LIZ.append(this.LIZ);
        LIZ.append(", code=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", encodedPayload=");
        LIZ.append(this.LIZJ);
        LIZ.append(", eventMillis=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", uptimeMillis=");
        LIZ.append(this.LJ);
        LIZ.append(", autoMetadata=");
        LIZ.append(this.LJFF);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67375QcN
    public final java.util.Map<String, String> LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC67375QcN
    public final Integer LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67375QcN
    public final C67366QcE LIZLLL() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67375QcN
    public final long LJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67375QcN
    public final String LJI() {
        return this.LIZ;
    }

    @Override // X.AbstractC67375QcN
    public final long LJII() {
        return this.LJ;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67375QcN)) {
            return false;
        }
        AbstractC67375QcN abstractC67375QcN = (AbstractC67375QcN) obj;
        if (this.LIZ.equals(abstractC67375QcN.LJI()) && ((num = this.LIZIZ) != null ? num.equals(abstractC67375QcN.LIZJ()) : abstractC67375QcN.LIZJ() == null) && this.LIZJ.equals(abstractC67375QcN.LIZLLL()) && this.LIZLLL == abstractC67375QcN.LJ() && this.LJ == abstractC67375QcN.LJII() && this.LJFF.equals(abstractC67375QcN.LIZIZ())) {
            return true;
        }
        return false;
    }

    public C67376QcO(String str, Integer num, C67366QcE c67366QcE, long j, long j2, java.util.Map map) {
        this.LIZ = str;
        this.LIZIZ = num;
        this.LIZJ = c67366QcE;
        this.LIZLLL = j;
        this.LJ = j2;
        this.LJFF = map;
    }
}
