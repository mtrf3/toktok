package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vh0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80402Vh0 {
    public final C80400Vgy LIZ;
    public C80416VhE LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public PorterDuff.Mode LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public ColorStateList LJIIJ;
    public ColorStateList LJIIJJI;
    public C80418VhG LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public LayerDrawable LJIIZILJ;
    public int LJIJ;

    public final void LJFF() {
        C80418VhG LIZIZ = LIZIZ(false);
        C80418VhG LIZIZ2 = LIZIZ(true);
        if (LIZIZ != null) {
            float f = this.LJII;
            ColorStateList colorStateList = this.LJIIJ;
            LIZIZ.LJLIL.LJIIJ = f;
            LIZIZ.invalidateSelf();
            C80421VhJ c80421VhJ = LIZIZ.LJLIL;
            if (c80421VhJ.LIZLLL != colorStateList) {
                c80421VhJ.LIZLLL = colorStateList;
                LIZIZ.onStateChange(LIZIZ.getState());
            }
            if (LIZIZ2 != null) {
                float f2 = this.LJII;
                int LJJIII = this.LJIILIIL ? C78966Uyw.LJJIII(R.attr.a4y, this.LIZ) : 0;
                LIZIZ2.LJLIL.LJIIJ = f2;
                LIZIZ2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(LJJIII);
                C80421VhJ c80421VhJ2 = LIZIZ2.LJLIL;
                if (c80421VhJ2.LIZLLL != valueOf) {
                    c80421VhJ2.LIZLLL = valueOf;
                    LIZIZ2.onStateChange(LIZIZ2.getState());
                }
            }
        }
    }

    public final InterfaceC80411Vh9 LIZ() {
        LayerDrawable layerDrawable = this.LJIIZILJ;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.LJIIZILJ.getNumberOfLayers() > 2) {
                return (InterfaceC80411Vh9) this.LJIIZILJ.getDrawable(2);
            }
            return (InterfaceC80411Vh9) this.LJIIZILJ.getDrawable(1);
        }
        return null;
    }

    public final void LJ() {
        int i;
        C80400Vgy c80400Vgy = this.LIZ;
        C80418VhG c80418VhG = new C80418VhG(this.LIZIZ);
        c80418VhG.LJIIIIZZ(this.LIZ.getContext());
        C07820Sk.LJII(c80418VhG, this.LJIIIZ);
        PorterDuff.Mode mode = this.LJIIIIZZ;
        if (mode != null) {
            C07820Sk.LJIIIIZZ(c80418VhG, mode);
        }
        float f = this.LJII;
        ColorStateList colorStateList = this.LJIIJ;
        c80418VhG.LJLIL.LJIIJ = f;
        c80418VhG.invalidateSelf();
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LIZLLL != colorStateList) {
            c80421VhJ.LIZLLL = colorStateList;
            c80418VhG.onStateChange(c80418VhG.getState());
        }
        C80418VhG c80418VhG2 = new C80418VhG(this.LIZIZ);
        c80418VhG2.setTint(0);
        float f2 = this.LJII;
        if (this.LJIILIIL) {
            i = C78966Uyw.LJJIII(R.attr.a4y, this.LIZ);
        } else {
            i = 0;
        }
        c80418VhG2.LJLIL.LJIIJ = f2;
        c80418VhG2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        C80421VhJ c80421VhJ2 = c80418VhG2.LJLIL;
        if (c80421VhJ2.LIZLLL != valueOf) {
            c80421VhJ2.LIZLLL = valueOf;
            c80418VhG2.onStateChange(c80418VhG2.getState());
        }
        C80418VhG c80418VhG3 = new C80418VhG(this.LIZIZ);
        this.LJIIL = c80418VhG3;
        C07820Sk.LJI(c80418VhG3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(C80270Ves.LIZJ(this.LJIIJJI), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c80418VhG2, c80418VhG}), this.LIZJ, this.LJ, this.LIZLLL, this.LJFF), this.LJIIL);
        this.LJIIZILJ = rippleDrawable;
        c80400Vgy.setInternalBackground(rippleDrawable);
        C80418VhG LIZIZ = LIZIZ(false);
        if (LIZIZ != null) {
            LIZIZ.LJIIJ(this.LJIJ);
        }
    }

    public final C80418VhG LIZIZ(boolean z) {
        LayerDrawable layerDrawable = this.LJIIZILJ;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            return (C80418VhG) ((LayerDrawable) ((InsetDrawable) this.LJIIZILJ.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void LIZJ(C80416VhE c80416VhE) {
        this.LIZIZ = c80416VhE;
        if (LIZIZ(false) != null) {
            LIZIZ(false).setShapeAppearanceModel(c80416VhE);
        }
        if (LIZIZ(true) != null) {
            LIZIZ(true).setShapeAppearanceModel(c80416VhE);
        }
        if (LIZ() != null) {
            LIZ().setShapeAppearanceModel(c80416VhE);
        }
    }

    public C80402Vh0(C80400Vgy c80400Vgy, C80416VhE c80416VhE) {
        this.LIZ = c80400Vgy;
        this.LIZIZ = c80416VhE;
    }

    public final void LIZLLL(int i, int i2) {
        int LJFF = C16310kV.LJFF(this.LIZ);
        int paddingTop = this.LIZ.getPaddingTop();
        int LJ = C16310kV.LJ(this.LIZ);
        int paddingBottom = this.LIZ.getPaddingBottom();
        int i3 = this.LJ;
        int i4 = this.LJFF;
        this.LJFF = i2;
        this.LJ = i;
        if (!this.LJIILJJIL) {
            LJ();
        }
        C16310kV.LJIIJ(this.LIZ, LJFF, (paddingTop + i) - i3, LJ, (paddingBottom + i2) - i4);
    }
}
