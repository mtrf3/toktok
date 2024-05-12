package X;

/* renamed from: X.FvF, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40517FvF extends C40511Fv9 implements InterfaceC78844Uwy<Integer> {
    public static final C40517FvF LJLJJL = new C40517FvF(1, 0);

    @Override // X.InterfaceC78844Uwy
    /* renamed from: LJIILLIIL, reason: merged with bridge method [inline-methods] */
    public final Integer LJIIIIZZ() {
        return Integer.valueOf(this.LJLILLLLZI);
    }

    @Override // X.InterfaceC78844Uwy
    /* renamed from: LJIIZILJ, reason: merged with bridge method [inline-methods] */
    public final Integer getStart() {
        return Integer.valueOf(this.LJLIL);
    }

    @Override // X.C40511Fv9
    public final boolean isEmpty() {
        if (this.LJLIL > this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // X.C40511Fv9
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.LJLIL * 31) + this.LJLILLLLZI;
    }

    @Override // X.C40511Fv9
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(this.LJLIL);
        LIZ.append("..");
        LIZ.append(this.LJLILLLLZI);
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.InterfaceC78844Uwy
    public final /* bridge */ /* synthetic */ boolean LJII(Integer num) {
        return LJIILJJIL(num.intValue());
    }

    public final boolean LJIILJJIL(int i) {
        if (this.LJLIL <= i && i <= this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // X.C40511Fv9
    public final boolean equals(Object obj) {
        if (obj instanceof C40517FvF) {
            if (!isEmpty() || !((C40511Fv9) obj).isEmpty()) {
                C40511Fv9 c40511Fv9 = (C40511Fv9) obj;
                if (this.LJLIL != c40511Fv9.LJLIL || this.LJLILLLLZI != c40511Fv9.LJLILLLLZI) {
                }
            }
            return true;
        }
        return false;
    }

    public C40517FvF(int i, int i2) {
        super(i, i2, 1);
    }
}
