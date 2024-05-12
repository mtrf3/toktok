package X;

/* renamed from: X.5k0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C143405k0 extends F9E {
    public final float LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final float LJLJJI;

    public C143405k0() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI)};
    }

    public /* synthetic */ C143405k0(int i) {
        this(-1.0f, -1.0f, -1, -1);
    }

    public C143405k0(float f, float f2, int i, int i2) {
        this.LJLIL = f;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = f2;
    }

    public static C143405k0 L(C143405k0 c143405k0, float f, int i, int i2, float f2, int i3) {
        if ((i3 & 1) != 0) {
            f = c143405k0.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i = c143405k0.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            i2 = c143405k0.LJLJI;
        }
        if ((i3 & 8) != 0) {
            f2 = c143405k0.LJLJJI;
        }
        return new C143405k0(f, f2, i, i2);
    }
}
