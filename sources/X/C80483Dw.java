package X;

/* renamed from: X.3Dw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80483Dw extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C80483Dw(boolean z, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        z2 = (i & 2) != 0 ? false : z2;
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
    }
}
