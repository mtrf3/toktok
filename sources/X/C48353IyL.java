package X;

/* renamed from: X.IyL, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48353IyL implements InterfaceC78843Uwx<Double> {
    public final double LJLIL;
    public final double LJLILLLLZI;

    @Override // X.InterfaceC78844Uwy
    public final Comparable LJIIIIZZ() {
        return Double.valueOf(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78844Uwy
    public final Comparable getStart() {
        return Double.valueOf(this.LJLIL);
    }

    @Override // X.InterfaceC78843Uwx
    public final boolean isEmpty() {
        if (this.LJLIL > this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.LJLIL).hashCode() * 31) + Double.valueOf(this.LJLILLLLZI).hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("..");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC78844Uwy
    public final boolean LJII(Comparable comparable) {
        double doubleValue = ((Number) comparable).doubleValue();
        if (doubleValue >= this.LJLIL && doubleValue <= this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48353IyL)) {
            return false;
        }
        if (!isEmpty() || !((C48353IyL) obj).isEmpty()) {
            C48353IyL c48353IyL = (C48353IyL) obj;
            if (this.LJLIL != c48353IyL.LJLIL || this.LJLILLLLZI != c48353IyL.LJLILLLLZI) {
                return false;
            }
        }
        return true;
    }

    public C48353IyL(double d, double d2) {
        this.LJLIL = d;
        this.LJLILLLLZI = d2;
    }

    @Override // X.InterfaceC78843Uwx
    public final boolean LIZJ(Double d, Double d2) {
        if (d.doubleValue() <= d2.doubleValue()) {
            return true;
        }
        return false;
    }
}
