package X;

/* renamed from: X.Vv7, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81277Vv7 extends F9E implements C33Q {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;

    public C81277Vv7() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL)};
    }

    public /* synthetic */ C81277Vv7(int i) {
        this(-1, 0, 0, false, false);
    }

    public C81277Vv7(int i, int i2, int i3, boolean z, boolean z2) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = i2;
        this.LJLJJL = i3;
    }

    public static C81277Vv7 L(C81277Vv7 c81277Vv7, boolean z, boolean z2, int i, int i2, int i3) {
        int i4;
        int i5 = i2;
        int i6 = i;
        boolean z3 = z;
        boolean z4 = z2;
        if ((i3 & 1) != 0) {
            i4 = c81277Vv7.LJLIL;
        } else {
            i4 = 0;
        }
        if ((i3 & 2) != 0) {
            z3 = c81277Vv7.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            z4 = c81277Vv7.LJLJI;
        }
        if ((i3 & 8) != 0) {
            i6 = c81277Vv7.LJLJJI;
        }
        if ((i3 & 16) != 0) {
            i5 = c81277Vv7.LJLJJL;
        }
        c81277Vv7.getClass();
        return new C81277Vv7(i4, i6, i5, z3, z4);
    }
}
