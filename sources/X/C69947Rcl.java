package X;

import kotlin.jvm.internal.o;

/* renamed from: X.Rcl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C69947Rcl extends F9E implements C33Q {
    public final boolean LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;
    public final C27766Av4 LJLJJI;
    public final boolean LJLJJL;
    public final float LJLJJLL;
    public final boolean LJLJL;

    public C69947Rcl() {
        this(0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.LJLIL), Integer.valueOf(this.LJLILLLLZI), Integer.valueOf(this.LJLJI), this.LJLJJI, Boolean.valueOf(this.LJLJJL), Float.valueOf(this.LJLJJLL), Boolean.valueOf(this.LJLJL)};
    }

    public /* synthetic */ C69947Rcl(int i) {
        this(false, 0, 0, new C27766Av4(EnumC27721AuL.HEADER.getValue(), false), false, 0.0f, false);
    }

    public C69947Rcl(boolean z, int i, int i2, C27766Av4 focusTabAction, boolean z2, float f, boolean z3) {
        o.LJIIIZ(focusTabAction, "focusTabAction");
        this.LJLIL = z;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
        this.LJLJJI = focusTabAction;
        this.LJLJJL = z2;
        this.LJLJJLL = f;
        this.LJLJL = z3;
    }

    public static C69947Rcl L(C69947Rcl c69947Rcl, boolean z, int i, int i2, boolean z2, float f, boolean z3, int i3) {
        C27766Av4 focusTabAction;
        boolean z4 = z3;
        float f2 = f;
        boolean z5 = z2;
        int i4 = i2;
        boolean z6 = z;
        int i5 = i;
        if ((i3 & 1) != 0) {
            z6 = c69947Rcl.LJLIL;
        }
        if ((i3 & 2) != 0) {
            i5 = c69947Rcl.LJLILLLLZI;
        }
        if ((i3 & 4) != 0) {
            i4 = c69947Rcl.LJLJI;
        }
        if ((i3 & 8) != 0) {
            focusTabAction = c69947Rcl.LJLJJI;
        } else {
            focusTabAction = null;
        }
        if ((i3 & 16) != 0) {
            z5 = c69947Rcl.LJLJJL;
        }
        if ((i3 & 32) != 0) {
            f2 = c69947Rcl.LJLJJLL;
        }
        if ((i3 & 64) != 0) {
            z4 = c69947Rcl.LJLJL;
        }
        c69947Rcl.getClass();
        o.LJIIIZ(focusTabAction, "focusTabAction");
        return new C69947Rcl(z6, i5, i4, focusTabAction, z5, f2, z4);
    }
}
