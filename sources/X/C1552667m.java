package X;

/* renamed from: X.67m, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1552667m extends F9E {
    public final boolean LJLIL;
    public final float LJLILLLLZI;
    public final int LJLJI;

    public C1552667m() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI)};
    }

    public final float L() {
        float f = this.LJLILLLLZI;
        if (f == 0.0f) {
            return 1.0f;
        }
        return 1 / f;
    }

    public /* synthetic */ C1552667m(int i) {
        this(1.0f, -1, true);
    }

    public C1552667m(float f, int i, boolean z) {
        this.LJLIL = z;
        this.LJLILLLLZI = f;
        this.LJLJI = i;
    }
}
