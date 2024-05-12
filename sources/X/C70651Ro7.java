package X;

/* renamed from: X.Ro7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70651Ro7 extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final int LJLLI;
    public final int LJLLILLLL;

    public C70651Ro7() {
        this(0, 0, 0, 0, 0, 0, 0, 4095);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI), Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), Integer.valueOf(this.LJLJL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLL), Integer.valueOf(this.LJLLI), Integer.valueOf(this.LJLLILLLL)};
    }

    public C70651Ro7(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        i = (i8 & 1) != 0 ? -1 : i;
        if ((i8 & 2) != 0) {
            i9 = -2;
        } else {
            i9 = 0;
        }
        int i10 = (i8 & 4) == 0 ? 0 : -2;
        i2 = (i8 & 32) != 0 ? 0 : i2;
        i3 = (i8 & 128) != 0 ? 0 : i3;
        i4 = (i8 & 256) != 0 ? 0 : i4;
        i5 = (i8 & 512) != 0 ? 0 : i5;
        i6 = (i8 & 1024) != 0 ? 0 : i6;
        i7 = (i8 & 2048) != 0 ? 17 : i7;
        this.LJLIL = i;
        this.LJLILLLLZI = i9;
        this.LJLJI = i10;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = i2;
        this.LJLJL = 0;
        this.LJLJLJ = i3;
        this.LJLJLLL = i4;
        this.LJLL = i5;
        this.LJLLI = i6;
        this.LJLLILLLL = i7;
    }
}
