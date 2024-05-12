package X;

/* renamed from: X.IyK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48352IyK implements InterfaceC78843Uwx<Float> {
    public final float LJLIL;
    public final float LJLILLLLZI;

    @Override // X.InterfaceC78844Uwy
    public final Comparable LJIIIIZZ() {
        return Float.valueOf(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78844Uwy
    public final Comparable getStart() {
        return Float.valueOf(this.LJLIL);
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
        return (Float.valueOf(this.LJLIL).hashCode() * 31) + Float.valueOf(this.LJLILLLLZI).hashCode();
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
        float floatValue = ((Number) comparable).floatValue();
        if (floatValue >= this.LJLIL && floatValue <= this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48352IyK)) {
            return false;
        }
        if (!isEmpty() || !((C48352IyK) obj).isEmpty()) {
            C48352IyK c48352IyK = (C48352IyK) obj;
            if (this.LJLIL != c48352IyK.LJLIL || this.LJLILLLLZI != c48352IyK.LJLILLLLZI) {
                return false;
            }
        }
        return true;
    }

    public C48352IyK(float f, float f2) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
    }

    @Override // X.InterfaceC78843Uwx
    public final boolean LIZJ(Float f, Float f2) {
        if (f.floatValue() <= f2.floatValue()) {
            return true;
        }
        return false;
    }
}
