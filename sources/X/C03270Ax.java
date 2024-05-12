package X;

import android.view.View;

/* renamed from: X.0Ax, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03270Ax {
    public final InterfaceC03260Aw LIZ;
    public final C03250Av LIZIZ = new C03250Av();

    public C03270Ax(InterfaceC03260Aw interfaceC03260Aw) {
        this.LIZ = interfaceC03260Aw;
    }

    public final boolean LIZIZ(View view) {
        C03250Av c03250Av = this.LIZIZ;
        int LIZLLL = this.LIZ.LIZLLL();
        int LIZ = this.LIZ.LIZ();
        int LIZJ = this.LIZ.LIZJ(view);
        int LJ = this.LIZ.LJ(view);
        c03250Av.LIZIZ = LIZLLL;
        c03250Av.LIZJ = LIZ;
        c03250Av.LIZLLL = LIZJ;
        c03250Av.LJ = LJ;
        C03250Av c03250Av2 = this.LIZIZ;
        c03250Av2.LIZ = 24579;
        return c03250Av2.LIZ();
    }

    public final View LIZ(int i, int i2, int i3, int i4) {
        int i5;
        int LIZLLL = this.LIZ.LIZLLL();
        int LIZ = this.LIZ.LIZ();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View LIZIZ = this.LIZ.LIZIZ(i);
            int LIZJ = this.LIZ.LIZJ(LIZIZ);
            int LJ = this.LIZ.LJ(LIZIZ);
            C03250Av c03250Av = this.LIZIZ;
            c03250Av.LIZIZ = LIZLLL;
            c03250Av.LIZJ = LIZ;
            c03250Av.LIZLLL = LIZJ;
            c03250Av.LJ = LJ;
            if (i3 != 0) {
                c03250Av.LIZ = i3;
                if (c03250Av.LIZ()) {
                    return LIZIZ;
                }
            }
            if (i4 != 0) {
                C03250Av c03250Av2 = this.LIZIZ;
                c03250Av2.LIZ = i4;
                if (c03250Av2.LIZ()) {
                    view = LIZIZ;
                }
            }
            i += i5;
        }
        return view;
    }
}
