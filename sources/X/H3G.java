package X;

/* loaded from: classes8.dex */
public final class H3G extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public H3G() {
        this(0, 0, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    public H3G(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? 0 : i;
        i2 = (i3 & 2) != 0 ? 0 : i2;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
