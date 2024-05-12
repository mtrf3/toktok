package X;

/* renamed from: X.Qcd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67391Qcd extends AbstractC67411Qcx {
    public final EnumC48209Iw1 LIZ;
    public final EnumC47968Is8 LIZIZ;

    public final int hashCode() {
        int hashCode;
        EnumC48209Iw1 enumC48209Iw1 = this.LIZ;
        int i = 0;
        if (enumC48209Iw1 == null) {
            hashCode = 0;
        } else {
            hashCode = enumC48209Iw1.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        EnumC47968Is8 enumC47968Is8 = this.LIZIZ;
        if (enumC47968Is8 != null) {
            i = enumC47968Is8.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetworkConnectionInfo{networkType=");
        LIZ.append(this.LIZ);
        LIZ.append(", mobileSubtype=");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67411Qcx
    public final EnumC47968Is8 LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67411Qcx
    public final EnumC48209Iw1 LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67411Qcx)) {
            return false;
        }
        AbstractC67411Qcx abstractC67411Qcx = (AbstractC67411Qcx) obj;
        EnumC48209Iw1 enumC48209Iw1 = this.LIZ;
        if (enumC48209Iw1 != null ? enumC48209Iw1.equals(abstractC67411Qcx.LIZIZ()) : abstractC67411Qcx.LIZIZ() == null) {
            EnumC47968Is8 enumC47968Is8 = this.LIZIZ;
            if (enumC47968Is8 == null) {
                if (abstractC67411Qcx.LIZ() == null) {
                    return true;
                }
            } else if (enumC47968Is8.equals(abstractC67411Qcx.LIZ())) {
                return true;
            }
        }
        return false;
    }

    public C67391Qcd(EnumC48209Iw1 enumC48209Iw1, EnumC47968Is8 enumC47968Is8) {
        this.LIZ = enumC48209Iw1;
        this.LIZIZ = enumC47968Is8;
    }
}
