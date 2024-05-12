package X;

/* renamed from: X.7wQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202067wQ extends F9E {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;
    public final float LJLJJI;
    public final float LJLJJL;
    public final float LJLJJLL;
    public final boolean LJLJL;
    public final float LJLJLJ;
    public final float LJLJLLL;
    public final float LJLL;
    public final float LJLLI;
    public final boolean LJLLILLLL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Float.valueOf(this.LJLIL), Float.valueOf(this.LJLILLLLZI), Float.valueOf(this.LJLJI), Float.valueOf(this.LJLJJI), Float.valueOf(this.LJLJJL), Float.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL), Float.valueOf(this.LJLJLJ), Float.valueOf(this.LJLJLLL), Float.valueOf(this.LJLL), Float.valueOf(this.LJLLI), Boolean.valueOf(this.LJLLILLLL)};
    }

    public static C202067wQ L(C202067wQ c202067wQ, float f, boolean z, int i) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        boolean z2;
        float f8;
        float f9;
        float f10;
        float f11 = f;
        boolean z3 = z;
        if ((i & 1) != 0) {
            f2 = c202067wQ.LJLIL;
        } else {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = c202067wQ.LJLILLLLZI;
        } else {
            f3 = 0.0f;
        }
        if ((i & 4) != 0) {
            f4 = c202067wQ.LJLJI;
        } else {
            f4 = 0.0f;
        }
        if ((i & 8) != 0) {
            f5 = c202067wQ.LJLJJI;
        } else {
            f5 = 0.0f;
        }
        if ((i & 16) != 0) {
            f6 = c202067wQ.LJLJJL;
        } else {
            f6 = 0.0f;
        }
        if ((i & 32) != 0) {
            f7 = c202067wQ.LJLJJLL;
        } else {
            f7 = 0.0f;
        }
        if ((i & 64) != 0) {
            z2 = c202067wQ.LJLJL;
        } else {
            z2 = false;
        }
        if ((i & 128) != 0) {
            f8 = c202067wQ.LJLJLJ;
        } else {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = c202067wQ.LJLJLLL;
        } else {
            f9 = 0.0f;
        }
        if ((i & 512) != 0) {
            f10 = c202067wQ.LJLL;
        } else {
            f10 = 0.0f;
        }
        if ((i & 1024) != 0) {
            f11 = c202067wQ.LJLLI;
        }
        if ((i & 2048) != 0) {
            z3 = c202067wQ.LJLLILLLL;
        }
        c202067wQ.getClass();
        return new C202067wQ(f2, f3, f4, f5, f6, f7, z2, f8, f9, f10, f11, z3);
    }

    public /* synthetic */ C202067wQ(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, int i) {
        this(f, f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4, (i & 16) != 0 ? 0.0f : f5, f6, (i & 64) != 0 ? false : z, (i & 128) != 0 ? 0.0f : f7, (i & 256) != 0 ? 0.0f : f8, 0.0f, 0.0f, false);
    }

    public C202067wQ(float f, float f2, float f3, float f4, float f5, float f6, boolean z, float f7, float f8, float f9, float f10, boolean z2) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
        this.LJLJJI = f4;
        this.LJLJJL = f5;
        this.LJLJJLL = f6;
        this.LJLJL = z;
        this.LJLJLJ = f7;
        this.LJLJLLL = f8;
        this.LJLL = f9;
        this.LJLLI = f10;
        this.LJLLILLLL = z2;
    }
}
