package X;

import android.view.View;

/* renamed from: X.5Ue, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C135685Ue {
    public int LIZIZ;
    public boolean LIZLLL;
    public boolean LIZ = true;
    public final float LIZJ = AnonymousClass564.LIZIZ(1.0f);
    public final C62822Ol8 LJ = C221108m2.LIZIZ(C135805Uq.LJLIL);

    static {
        AnonymousClass564.LIZ(1.0f);
    }

    public final void LIZ(View view, float f, float f2, C5PT c5pt) {
        float f3;
        float f4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        int i4;
        if (!this.LIZ) {
            return;
        }
        float f5 = 2;
        float measuredWidth = (view.getMeasuredWidth() - f) / f5;
        float f6 = f + measuredWidth;
        float measuredHeight = (view.getMeasuredHeight() - f2) / f5;
        float f7 = f2 + measuredHeight;
        int abs = Math.abs(c5pt.LJLJJL);
        if (abs % 90 != 0) {
            this.LIZIZ = 0;
            this.LIZLLL = false;
            return;
        }
        if ((abs / 90) % 2 == 0) {
            f3 = c5pt.LJLIL;
            f4 = c5pt.LJLILLLLZI;
        } else {
            f3 = c5pt.LJLILLLLZI;
            f4 = c5pt.LJLIL;
        }
        float f8 = f3 / f5;
        if (Math.abs((c5pt.LJLJI - f8) - measuredWidth) <= this.LIZJ) {
            z = true;
        } else {
            z = false;
        }
        if (Math.abs((c5pt.LJLJI + f8) - f6) <= this.LIZJ) {
            z2 = true;
        } else {
            z2 = false;
        }
        float f9 = f4 / f5;
        if (Math.abs((c5pt.LJLJJI - f9) - measuredHeight) <= this.LIZJ) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (Math.abs((c5pt.LJLJJI + f9) - f7) <= this.LIZJ) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z) {
            i = this.LIZIZ | EnumC135745Uk.TO_LEFT.getValue();
        } else {
            int i5 = this.LIZIZ;
            EnumC135745Uk enumC135745Uk = EnumC135745Uk.TO_LEFT;
            if ((i5 & enumC135745Uk.getValue()) != 0) {
                i = this.LIZIZ ^ enumC135745Uk.getValue();
            } else {
                i = this.LIZIZ;
            }
        }
        this.LIZIZ = i;
        if (z2) {
            i2 = i | EnumC135745Uk.TO_RIGHT.getValue();
        } else {
            EnumC135745Uk enumC135745Uk2 = EnumC135745Uk.TO_RIGHT;
            if ((i & enumC135745Uk2.getValue()) != 0) {
                i2 = this.LIZIZ ^ enumC135745Uk2.getValue();
            } else {
                i2 = this.LIZIZ;
            }
        }
        this.LIZIZ = i2;
        if (z3) {
            i3 = i2 | EnumC135745Uk.TO_TOP.getValue();
        } else {
            EnumC135745Uk enumC135745Uk3 = EnumC135745Uk.TO_TOP;
            if ((i2 & enumC135745Uk3.getValue()) != 0) {
                i3 = this.LIZIZ ^ enumC135745Uk3.getValue();
            } else {
                i3 = this.LIZIZ;
            }
        }
        this.LIZIZ = i3;
        if (z4) {
            i4 = i3 | EnumC135745Uk.TO_BOTTOM.getValue();
        } else {
            EnumC135745Uk enumC135745Uk4 = EnumC135745Uk.TO_BOTTOM;
            if ((i3 & enumC135745Uk4.getValue()) != 0) {
                i4 = this.LIZIZ ^ enumC135745Uk4.getValue();
            } else {
                i4 = this.LIZIZ;
            }
        }
        this.LIZIZ = i4;
        if (z || z2 || z3 || z4) {
            if (!this.LIZLLL) {
                ((InterfaceC1283852c) this.LJ.getValue()).LIZ(view, EnumC1284052e.VIBRATE_IMPACT_LIGHT);
                this.LIZLLL = true;
                return;
            }
            return;
        }
        this.LIZLLL = false;
    }
}
