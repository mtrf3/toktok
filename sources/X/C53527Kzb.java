package X;

/* renamed from: X.Kzb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53527Kzb extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final int LJLJJI;

    public C53527Kzb() {
        this(0, 0, 15);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C53527Kzb(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 4) != 0 ? 0 : i2;
        this.LJLIL = i;
        this.LJLILLLLZI = 0;
        this.LJLJI = i2;
        this.LJLJJI = 0;
    }
}
