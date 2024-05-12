package X;

/* renamed from: X.43w, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1033643w extends F9E {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C1033643w() {
        this(0, 0, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI)};
    }

    public C1033643w(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 2) != 0 ? -1 : i2;
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }
}
