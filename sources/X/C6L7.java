package X;

/* renamed from: X.6L7, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6L7 extends F9E {
    public final int LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final boolean LJLJJI;
    public final boolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), Boolean.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
    }

    public C6L7(int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.LJLIL = i;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = z3;
        this.LJLJJL = z4;
        this.LJLJJLL = z5;
        this.LJLJL = z6;
    }

    public static C6L7 L(C6L7 c6l7, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i2) {
        boolean z7 = z6;
        boolean z8 = z;
        int i3 = i;
        boolean z9 = z2;
        boolean z10 = z3;
        boolean z11 = z4;
        boolean z12 = z5;
        if ((i2 & 1) != 0) {
            i3 = c6l7.LJLIL;
        }
        if ((i2 & 2) != 0) {
            z8 = c6l7.LJLILLLLZI;
        }
        if ((i2 & 4) != 0) {
            z9 = c6l7.LJLJI;
        }
        if ((i2 & 8) != 0) {
            z10 = c6l7.LJLJJI;
        }
        if ((i2 & 16) != 0) {
            z11 = c6l7.LJLJJL;
        }
        if ((i2 & 32) != 0) {
            z12 = c6l7.LJLJJLL;
        }
        if ((i2 & 64) != 0) {
            z7 = c6l7.LJLJL;
        }
        c6l7.getClass();
        return new C6L7(i3, z8, z9, z10, z11, z12, z7);
    }
}
