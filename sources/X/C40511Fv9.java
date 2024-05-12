package X;

/* renamed from: X.Fv9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C40511Fv9 implements Iterable<Integer>, InterfaceC90533gv {
    public static final /* synthetic */ int LJLJJI = 0;
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    @Override // java.lang.Iterable
    /* renamed from: LJIIIZ, reason: merged with bridge method [inline-methods] */
    public final C118234kV iterator() {
        return new C118234kV(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public boolean isEmpty() {
        if (this.LJLJI > 0) {
            if (this.LJLIL > this.LJLILLLLZI) {
                return true;
            }
        } else if (this.LJLIL < this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder LIZ;
        int i;
        if (this.LJLJI > 0) {
            LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append("..");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(" step ");
            i = this.LJLJI;
        } else {
            LIZ = X1D.LIZ();
            LIZ.append(this.LJLIL);
            LIZ.append(" downTo ");
            LIZ.append(this.LJLILLLLZI);
            LIZ.append(" step ");
            i = -this.LJLJI;
        }
        LIZ.append(i);
        return X1D.LIZIZ(LIZ);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.LJLIL * 31) + this.LJLILLLLZI) * 31) + this.LJLJI;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C40511Fv9) {
            if (!isEmpty() || !((C40511Fv9) obj).isEmpty()) {
                C40511Fv9 c40511Fv9 = (C40511Fv9) obj;
                if (this.LJLIL != c40511Fv9.LJLIL || this.LJLILLLLZI != c40511Fv9.LJLILLLLZI || this.LJLJI != c40511Fv9.LJLJI) {
                }
            }
            return true;
        }
        return false;
    }

    public C40511Fv9(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.LJLIL = i;
                this.LJLILLLLZI = C78939UyV.LJIJ(i, i2, i3);
                this.LJLJI = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }
}
