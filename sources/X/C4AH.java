package X;

/* renamed from: X.4AH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4AH extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI)};
    }

    public static C4AH L(C4AH c4ah, int i) {
        float f;
        float f2;
        float f3;
        float f4 = 0.0f;
        if ((i & 1) != 0) {
            f = c4ah.LJLIL;
        } else {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = c4ah.LJLILLLLZI;
        } else {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = c4ah.LJLJI;
        } else {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = c4ah.LJLJJI;
        }
        return new C4AH(f, f2, f3, f4);
    }

    public C4AH(float f, float f2, float f3, float f4) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
        this.LJLJJI = f4;
    }
}
