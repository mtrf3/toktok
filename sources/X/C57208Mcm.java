package X;

/* renamed from: X.Mcm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57208Mcm extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public static C57208Mcm L(C57208Mcm c57208Mcm, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8 = i3;
        int i9 = i;
        int i10 = i2;
        if ((i4 & 1) != 0) {
            i9 = c57208Mcm.LJLIL;
        }
        if ((i4 & 2) != 0) {
            i10 = c57208Mcm.LJLILLLLZI;
        }
        if ((i4 & 4) != 0) {
            i5 = c57208Mcm.LJLJI;
        } else {
            i5 = 0;
        }
        if ((i4 & 8) != 0) {
            i8 = c57208Mcm.LJLJJI;
        }
        if ((i4 & 16) != 0) {
            i6 = c57208Mcm.LJLJJL;
        } else {
            i6 = 0;
        }
        if ((i4 & 32) != 0) {
            i7 = c57208Mcm.LJLJJLL;
        } else {
            i7 = 0;
        }
        return new C57208Mcm(i9, i10, i5, i8, i6, i7);
    }

    public C57208Mcm(int i, int i2, int i3, int i4, int i5, int i6) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
        this.LJLJJI = i4;
        this.LJLJJL = i5;
        this.LJLJJLL = i6;
    }

    public /* synthetic */ C57208Mcm(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, 0, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 0 : i4, (i6 & 32) != 0 ? 0 : i5);
    }
}
