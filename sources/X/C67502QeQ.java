package X;

import java.util.List;

/* renamed from: X.QeQ, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67502QeQ extends AbstractC67503QeR {
    public final long LIZ;
    public final long LIZIZ;
    public final AbstractC67410Qcw LIZJ;
    public final Integer LIZLLL;
    public final String LJ;
    public final List<AbstractC67530Qes> LJFF;
    public final C9PH LJI;

    public C67502QeQ() {
        throw null;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        long j = this.LIZ;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.LIZIZ;
        int i2 = (i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        AbstractC67410Qcw abstractC67410Qcw = this.LIZJ;
        int i3 = 0;
        if (abstractC67410Qcw == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC67410Qcw.hashCode();
        }
        int i4 = (i2 ^ hashCode) * 1000003;
        Integer num = this.LIZLLL;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i5 = (i4 ^ hashCode2) * 1000003;
        String str = this.LJ;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i6 = (i5 ^ hashCode3) * 1000003;
        List<AbstractC67530Qes> list = this.LJFF;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i7 = (i6 ^ hashCode4) * 1000003;
        C9PH c9ph = this.LJI;
        if (c9ph != null) {
            i3 = c9ph.hashCode();
        }
        return i7 ^ i3;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogRequest{requestTimeMs=");
        LIZ.append(this.LIZ);
        LIZ.append(", requestUptimeMs=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", clientInfo=");
        LIZ.append(this.LIZJ);
        LIZ.append(", logSource=");
        LIZ.append(this.LIZLLL);
        LIZ.append(", logSourceName=");
        LIZ.append(this.LJ);
        LIZ.append(", logEvents=");
        LIZ.append(this.LJFF);
        LIZ.append(", qosTier=");
        LIZ.append(this.LJI);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67503QeR
    public final AbstractC67410Qcw LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67503QeR
    public final List<AbstractC67530Qes> LIZIZ() {
        return this.LJFF;
    }

    @Override // X.AbstractC67503QeR
    public final Integer LIZJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67503QeR
    public final String LIZLLL() {
        return this.LJ;
    }

    @Override // X.AbstractC67503QeR
    public final C9PH LJ() {
        return this.LJI;
    }

    @Override // X.AbstractC67503QeR
    public final long LJFF() {
        return this.LIZ;
    }

    @Override // X.AbstractC67503QeR
    public final long LJI() {
        return this.LIZIZ;
    }

    public final boolean equals(Object obj) {
        AbstractC67410Qcw abstractC67410Qcw;
        Integer num;
        String str;
        List<AbstractC67530Qes> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67503QeR)) {
            return false;
        }
        AbstractC67503QeR abstractC67503QeR = (AbstractC67503QeR) obj;
        if (this.LIZ == abstractC67503QeR.LJFF() && this.LIZIZ == abstractC67503QeR.LJI() && ((abstractC67410Qcw = this.LIZJ) != null ? abstractC67410Qcw.equals(abstractC67503QeR.LIZ()) : abstractC67503QeR.LIZ() == null) && ((num = this.LIZLLL) != null ? num.equals(abstractC67503QeR.LIZJ()) : abstractC67503QeR.LIZJ() == null) && ((str = this.LJ) != null ? str.equals(abstractC67503QeR.LIZLLL()) : abstractC67503QeR.LIZLLL() == null) && ((list = this.LJFF) != null ? list.equals(abstractC67503QeR.LIZIZ()) : abstractC67503QeR.LIZIZ() == null)) {
            C9PH c9ph = this.LJI;
            if (c9ph == null) {
                if (abstractC67503QeR.LJ() == null) {
                    return true;
                }
            } else if (c9ph.equals(abstractC67503QeR.LJ())) {
                return true;
            }
        }
        return false;
    }

    public C67502QeQ(long j, long j2, AbstractC67410Qcw abstractC67410Qcw, Integer num, String str, List list, C9PH c9ph) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = abstractC67410Qcw;
        this.LIZLLL = num;
        this.LJ = str;
        this.LJFF = list;
        this.LJI = c9ph;
    }
}
