package X;

/* renamed from: X.4sP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C123134sP extends F9E {
    public final int LJLIL;
    public final long LJLILLLLZI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), Long.valueOf(this.LJLILLLLZI)};
    }

    public C123134sP(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.LJLIL = i;
        this.LJLILLLLZI = currentTimeMillis;
    }
}
