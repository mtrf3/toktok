package X;

/* renamed from: X.6A2, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6A2 extends F9E {
    public float LJLIL;
    public float LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public float LJLJJL;
    public final int LJLJJLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Float.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL)};
    }

    public C6A2(float f, float f2, float f3, float f4, int i) {
        f = (i & 1) != 0 ? 1.0f : f;
        f2 = (i & 2) != 0 ? 1.0f : f2;
        f3 = (i & 8) != 0 ? 0.0f : f3;
        f4 = (i & 16) != 0 ? 0.0f : f4;
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = 0.0f;
        this.LJLJJI = f3;
        this.LJLJJL = f4;
        this.LJLJJLL = 0;
    }
}
