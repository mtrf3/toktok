package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import o3.h0;

/* renamed from: X.03A, reason: invalid class name */
/* loaded from: classes.dex */
public final class C03A {
    public final View LIZ;
    public C012102z LIZLLL;
    public C012102z LJ;
    public C012102z LJFF;
    public int LIZJ = -1;
    public final C03R LIZIZ = C03R.LIZ();

    public final void LJ() {
        this.LIZJ = -1;
        LJI(null);
        LIZ();
    }

    public final void LIZ() {
        Drawable background = this.LIZ.getBackground();
        if (background != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 ? i == 21 : this.LIZLLL != null) {
                if (this.LJFF == null) {
                    this.LJFF = new C012102z();
                }
                C012102z c012102z = this.LJFF;
                c012102z.LIZ = null;
                c012102z.LIZLLL = false;
                c012102z.LIZIZ = null;
                c012102z.LIZJ = false;
                ColorStateList LJI = C16360ka.LJI(this.LIZ);
                if (LJI != null) {
                    c012102z.LIZLLL = true;
                    c012102z.LIZ = LJI;
                }
                PorterDuff.Mode LJII = C16360ka.LJII(this.LIZ);
                if (LJII != null) {
                    c012102z.LIZJ = true;
                    c012102z.LIZIZ = LJII;
                }
                if (c012102z.LIZLLL || c012102z.LIZJ) {
                    C03R.LJ(background, c012102z, this.LIZ.getDrawableState());
                    return;
                }
            }
            C012102z c012102z2 = this.LJ;
            if (c012102z2 != null) {
                C03R.LJ(background, c012102z2, this.LIZ.getDrawableState());
                return;
            }
            C012102z c012102z3 = this.LIZLLL;
            if (c012102z3 == null) {
                return;
            }
            C03R.LJ(background, c012102z3, this.LIZ.getDrawableState());
        }
    }

    public final ColorStateList LIZIZ() {
        C012102z c012102z = this.LJ;
        if (c012102z != null) {
            return c012102z.LIZ;
        }
        return null;
    }

    public final PorterDuff.Mode LIZJ() {
        C012102z c012102z = this.LJ;
        if (c012102z != null) {
            return c012102z.LIZIZ;
        }
        return null;
    }

    public C03A(View view) {
        this.LIZ = view;
    }

    public final void LJFF(int i) {
        ColorStateList colorStateList;
        this.LIZJ = i;
        C03R c03r = this.LIZIZ;
        if (c03r != null) {
            Context context = this.LIZ.getContext();
            synchronized (c03r) {
                colorStateList = c03r.LIZ.LJIIIZ(i, context);
            }
        } else {
            colorStateList = null;
        }
        LJI(colorStateList);
        LIZ();
    }

    public final void LJI(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.LIZLLL == null) {
                this.LIZLLL = new C012102z();
            }
            C012102z c012102z = this.LIZLLL;
            c012102z.LIZ = colorStateList;
            c012102z.LIZLLL = true;
        } else {
            this.LIZLLL = null;
        }
        LIZ();
    }

    public final void LJII(ColorStateList colorStateList) {
        if (this.LJ == null) {
            this.LJ = new C012102z();
        }
        C012102z c012102z = this.LJ;
        c012102z.LIZ = colorStateList;
        c012102z.LIZLLL = true;
        LIZ();
    }

    public final void LJIIIIZZ(PorterDuff.Mode mode) {
        if (this.LJ == null) {
            this.LJ = new C012102z();
        }
        C012102z c012102z = this.LJ;
        c012102z.LIZIZ = mode;
        c012102z.LIZJ = true;
        LIZ();
    }

    public final void LIZLLL(AttributeSet attributeSet, int i) {
        ColorStateList LJIIIZ;
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(this.LIZ.getContext(), attributeSet, new int[]{R.attr.background, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.xl}, i, 0);
        View view = this.LIZ;
        h0.LJIJ(view, view.getContext(), new int[]{R.attr.background, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.xl}, attributeSet, LJIILIIL.LIZIZ, i);
        try {
            if (LJIILIIL.LJIIJJI(0)) {
                this.LIZJ = LJIILIIL.LJIIIIZZ(0, -1);
                C03R c03r = this.LIZIZ;
                Context context = this.LIZ.getContext();
                int i2 = this.LIZJ;
                synchronized (c03r) {
                    LJIIIZ = c03r.LIZ.LJIIIZ(i2, context);
                }
                if (LJIIIZ != null) {
                    LJI(LJIIIZ);
                }
            }
            if (LJIILIIL.LJIIJJI(1)) {
                h0.LJIL(this.LIZ, LJIILIIL.LIZIZ(1));
            }
            if (LJIILIIL.LJIIJJI(2)) {
                h0.LJJ(this.LIZ, C03D.LIZLLL(LJIILIIL.LJII(2, -1), null));
            }
        } finally {
            LJIILIIL.LJIILJJIL();
        }
    }
}
