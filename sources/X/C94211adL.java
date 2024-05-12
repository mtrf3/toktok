package X;

/* renamed from: X.adL, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94211adL extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Float.valueOf(this.LJLJJL)};
    }

    public C94211adL(float f, float f2, float f3, float f4, float f5) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
        this.LJLJJI = f4;
        this.LJLJJL = f5;
    }

    public static C94211adL L(C94211adL c94211adL, float f, float f2, float f3, float f4, float f5, int i) {
        float f6 = f5;
        float f7 = f4;
        float f8 = f3;
        float f9 = f;
        float f10 = f2;
        if ((i & 1) != 0) {
            f9 = c94211adL.LJLIL;
        }
        if ((i & 2) != 0) {
            f10 = c94211adL.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            f8 = c94211adL.LJLJI;
        }
        if ((i & 8) != 0) {
            f7 = c94211adL.LJLJJI;
        }
        if ((i & 16) != 0) {
            f6 = c94211adL.LJLJJL;
        }
        return new C94211adL(f9, f10, f8, f7, f6);
    }
}
