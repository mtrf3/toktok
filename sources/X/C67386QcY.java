package X;

/* renamed from: X.QcY, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67386QcY extends AbstractC67410Qcw {
    public final EnumC46458ILe LIZ;
    public final AbstractC67535Qex LIZIZ;

    public final int hashCode() {
        int hashCode;
        EnumC46458ILe enumC46458ILe = this.LIZ;
        int i = 0;
        if (enumC46458ILe == null) {
            hashCode = 0;
        } else {
            hashCode = enumC46458ILe.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        AbstractC67535Qex abstractC67535Qex = this.LIZIZ;
        if (abstractC67535Qex != null) {
            i = abstractC67535Qex.hashCode();
        }
        return i2 ^ i;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientInfo{clientType=");
        LIZ.append(this.LIZ);
        LIZ.append(", androidClientInfo=");
        LIZ.append(this.LIZIZ);
        LIZ.append("}");
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC67410Qcw
    public final AbstractC67535Qex LIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC67410Qcw
    public final EnumC46458ILe LIZIZ() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC67410Qcw)) {
            return false;
        }
        AbstractC67410Qcw abstractC67410Qcw = (AbstractC67410Qcw) obj;
        EnumC46458ILe enumC46458ILe = this.LIZ;
        if (enumC46458ILe != null ? enumC46458ILe.equals(abstractC67410Qcw.LIZIZ()) : abstractC67410Qcw.LIZIZ() == null) {
            AbstractC67535Qex abstractC67535Qex = this.LIZIZ;
            if (abstractC67535Qex == null) {
                if (abstractC67410Qcw.LIZ() == null) {
                    return true;
                }
            } else if (abstractC67535Qex.equals(abstractC67410Qcw.LIZ())) {
                return true;
            }
        }
        return false;
    }

    public C67386QcY(EnumC46458ILe enumC46458ILe, AbstractC67535Qex abstractC67535Qex) {
        this.LIZ = enumC46458ILe;
        this.LIZIZ = abstractC67535Qex;
    }
}
