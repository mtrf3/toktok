package X;

/* renamed from: X.9Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232719Bj extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final int LJLJI;

    public C232719Bj() {
        this(false, 7);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public /* synthetic */ C232719Bj(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false, 0);
    }

    public C232719Bj(boolean z, boolean z2, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = i;
    }
}
