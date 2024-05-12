package X;

/* renamed from: X.A3n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25615A3n extends F9E {
    public final boolean LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final int LJLJJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C25615A3n() {
        this(false, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Boolean.valueOf(this.LJLILLLLZI), Boolean.valueOf(this.LJLJI), Integer.valueOf(this.LJLJJI)};
    }

    public C25615A3n(boolean z, boolean z2, boolean z3, int i) {
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = z3;
        this.LJLJJI = i;
    }

    public /* synthetic */ C25615A3n(boolean z, boolean z2, boolean z3, int i, int i2) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, 0);
    }
}
