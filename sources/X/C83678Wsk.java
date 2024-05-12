package X;

/* renamed from: X.Wsk, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83678Wsk extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;

    public C83678Wsk() {
        this(false, 3);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI)};
    }

    public C83678Wsk(boolean z, int i) {
        this.LJLIL = (i & 1) != 0 ? false : z;
        this.LJLILLLLZI = false;
    }
}
