package X;

import java.util.Arrays;

/* renamed from: X.Qer, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67529Qer extends AbstractC67530Qes {
    public final long LIZ;
    public final Integer LIZIZ;
    public final long LIZJ;
    public final byte[] LIZLLL;
    public final String LJ;
    public final long LJFF;
    public final AbstractC67411Qcx LJI;

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.LIZ;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.LIZIZ;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.LIZJ;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.LIZLLL)) * 1000003;
        String str = this.LJ;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.LJFF;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC67411Qcx abstractC67411Qcx = this.LJI;
        if (abstractC67411Qcx != null) {
            i2 = abstractC67411Qcx.hashCode();
        }
        return i3 ^ i2;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LogEvent{eventTimeMs=");
        LIZ.append(this.LIZ);
        LIZ.append(", eventCode=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", eventUptimeMs=");
        LIZ.append(this.LIZJ);
        LIZ.append(", sourceExtension=");
        LIZ.append(Arrays.toString(this.LIZLLL));
        LIZ.append(", sourceExtensionJsonProto3=");
        LIZ.append(this.LJ);
        LIZ.append(", timezoneOffsetSeconds=");
        LIZ.append(this.LJFF);
        LIZ.append(", networkConnectionInfo=");
        LIZ.append(this.LJI);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67530Qes
    public final Integer LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67530Qes
    public final long LIZIZ() {
        return this.LIZ;
    }

    @Override // X.AbstractC67530Qes
    public final long LIZJ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC67530Qes
    public final AbstractC67411Qcx LIZLLL() {
        return this.LJI;
    }

    @Override // X.AbstractC67530Qes
    public final byte[] LJ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC67530Qes
    public final String LJFF() {
        return this.LJ;
    }

    @Override // X.AbstractC67530Qes
    public final long LJI() {
        return this.LJFF;
    }

    public final boolean equals(Object obj) {
        Integer num;
        byte[] LJ;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67530Qes)) {
            return false;
        }
        AbstractC67530Qes abstractC67530Qes = (AbstractC67530Qes) obj;
        if (this.LIZ == abstractC67530Qes.LIZIZ() && ((num = this.LIZIZ) != null ? num.equals(abstractC67530Qes.LIZ()) : abstractC67530Qes.LIZ() == null) && this.LIZJ == abstractC67530Qes.LIZJ()) {
            byte[] bArr = this.LIZLLL;
            if (abstractC67530Qes instanceof C67529Qer) {
                LJ = ((C67529Qer) abstractC67530Qes).LIZLLL;
            } else {
                LJ = abstractC67530Qes.LJ();
            }
            if (Arrays.equals(bArr, LJ) && ((str = this.LJ) != null ? str.equals(abstractC67530Qes.LJFF()) : abstractC67530Qes.LJFF() == null) && this.LJFF == abstractC67530Qes.LJI()) {
                AbstractC67411Qcx abstractC67411Qcx = this.LJI;
                if (abstractC67411Qcx == null) {
                    if (abstractC67530Qes.LIZLLL() == null) {
                        return true;
                    }
                } else if (abstractC67411Qcx.equals(abstractC67530Qes.LIZLLL())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C67529Qer(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC67411Qcx abstractC67411Qcx) {
        this.LIZ = j;
        this.LIZIZ = num;
        this.LIZJ = j2;
        this.LIZLLL = bArr;
        this.LJ = str;
        this.LJFF = j3;
        this.LJI = abstractC67411Qcx;
    }
}
