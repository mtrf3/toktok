package X;

/* renamed from: X.Npk, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60560Npk extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final InterfaceC60583Nq7 LJLJLJ;
    public final int LJLJLLL;
    public final boolean LJLL;
    public final boolean LJLLI;
    public final boolean LJLLILLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), this.LJLJLJ, Integer.valueOf(this.LJLJLLL), Boolean.valueOf(this.LJLL), Boolean.valueOf(this.LJLLI), Boolean.valueOf(this.LJLLILLLL)};
    }

    public C60560Npk(int i, int i2, int i3, int i4, int i5, int i6, InterfaceC60583Nq7 interfaceC60583Nq7, int i7, boolean z, boolean z2, boolean z3, int i8) {
        i = (i8 & 2) != 0 ? 0 : i;
        i2 = (i8 & 4) != 0 ? 0 : i2;
        i3 = (i8 & 8) != 0 ? 0 : i3;
        i4 = (i8 & 16) != 0 ? i : i4;
        i5 = (i8 & 32) != 0 ? (int) (i2 * 0.73f) : i5;
        i6 = (i8 & 64) != 0 ? -1 : i6;
        interfaceC60583Nq7 = (i8 & 128) != 0 ? null : interfaceC60583Nq7;
        i7 = (i8 & 256) != 0 ? 0 : i7;
        z = (i8 & 512) != 0 ? false : z;
        z2 = (i8 & 1024) != 0 ? true : z2;
        z3 = (i8 & 2048) != 0 ? true : z3;
        this.LJLIL = 0;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = i3;
        this.LJLJJL = i4;
        this.LJLJJLL = i5;
        this.LJLJL = i6;
        this.LJLJLJ = interfaceC60583Nq7;
        this.LJLJLLL = i7;
        this.LJLL = z;
        this.LJLLI = z2;
        this.LJLLILLLL = z3;
    }
}
