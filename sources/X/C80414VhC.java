package X;

import android.R;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;

/* renamed from: X.VhC, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80414VhC {
    public static final int[] LJIJ = {R.attr.state_checked};
    public static final double LJIJI = Math.cos(Math.toRadians(45.0d));
    public final C80413VhB LIZ;
    public final C80418VhG LIZJ;
    public final C80418VhG LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public Drawable LJII;
    public Drawable LJIIIIZZ;
    public ColorStateList LJIIIZ;
    public ColorStateList LJIIJ;
    public C80416VhE LJIIJJI;
    public ColorStateList LJIIL;
    public Drawable LJIILIIL;
    public LayerDrawable LJIILJJIL;
    public C80418VhG LJIILL;
    public boolean LJIIZILJ;
    public final Rect LIZIZ = new Rect();
    public boolean LJIILLIIL = false;

    public final float LIZ() {
        float LIZIZ = LIZIZ(this.LJIIJJI.LIZ, this.LIZJ.LJII());
        UCH uch = this.LJIIJJI.LIZIZ;
        C80418VhG c80418VhG = this.LIZJ;
        float max = Math.max(LIZIZ, LIZIZ(uch, c80418VhG.LJLIL.LIZ.LJFF.LIZ(c80418VhG.LJI())));
        UCH uch2 = this.LJIIJJI.LIZJ;
        C80418VhG c80418VhG2 = this.LIZJ;
        float LIZIZ2 = LIZIZ(uch2, c80418VhG2.LJLIL.LIZ.LJI.LIZ(c80418VhG2.LJI()));
        UCH uch3 = this.LJIIJJI.LIZLLL;
        C80418VhG c80418VhG3 = this.LIZJ;
        return Math.max(max, Math.max(LIZIZ2, LIZIZ(uch3, c80418VhG3.LJLIL.LIZ.LJII.LIZ(c80418VhG3.LJI()))));
    }

    public final Drawable LIZJ() {
        if (this.LJIILIIL == null) {
            this.LJIILL = new C80418VhG(this.LJIIJJI);
            this.LJIILIIL = new RippleDrawable(this.LJIIIZ, null, this.LJIILL);
        }
        if (this.LJIILJJIL == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = this.LJIIIIZZ;
            if (drawable != null) {
                stateListDrawable.addState(LJIJ, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.LJIILIIL, this.LIZLLL, stateListDrawable});
            this.LJIILJJIL = layerDrawable;
            layerDrawable.setId(2, com.zhiliaoapp.musically.R.id.go9);
        }
        return this.LJIILJJIL;
    }

    public final boolean LJI() {
        if (this.LIZ.getPreventCornerOverlap() && this.LIZJ.LJIIIZ() && this.LIZ.getUseCompatPadding()) {
            return true;
        }
        return false;
    }

    public final void LJII() {
        float f;
        boolean z = true;
        if ((!this.LIZ.getPreventCornerOverlap() || this.LIZJ.LJIIIZ()) && !LJI()) {
            z = false;
        }
        float f2 = 0.0f;
        if (z) {
            f = LIZ();
        } else {
            f = 0.0f;
        }
        if (this.LIZ.getPreventCornerOverlap() && this.LIZ.getUseCompatPadding()) {
            f2 = (float) ((1.0d - LJIJI) * this.LIZ.getCardViewRadius());
        }
        int i = (int) (f - f2);
        C80413VhB c80413VhB = this.LIZ;
        Rect rect = this.LIZIZ;
        c80413VhB.LJFF(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void LJIIIIZZ() {
        if (!this.LJIILLIIL) {
            this.LIZ.setBackgroundInternal(LIZLLL(this.LIZJ));
        }
        this.LIZ.setForeground(LIZLLL(this.LJII));
    }

    public final C80415VhD LIZLLL(Drawable drawable) {
        int i;
        int i2;
        float f;
        if (this.LIZ.getUseCompatPadding()) {
            float maxCardElevation = this.LIZ.getMaxCardElevation() * 1.5f;
            float f2 = 0.0f;
            if (LJI()) {
                f = LIZ();
            } else {
                f = 0.0f;
            }
            i2 = (int) Math.ceil(maxCardElevation + f);
            float maxCardElevation2 = this.LIZ.getMaxCardElevation();
            if (LJI()) {
                f2 = LIZ();
            }
            i = (int) Math.ceil(maxCardElevation2 + f2);
        } else {
            i = 0;
            i2 = 0;
        }
        return new C80415VhD(drawable, i, i2, i, i2);
    }

    public final void LJ(Drawable drawable) {
        this.LJIIIIZZ = drawable;
        if (drawable != null) {
            Drawable LJFF = C07840Sm.LJFF(drawable.mutate());
            this.LJIIIIZZ = LJFF;
            C07820Sk.LJII(LJFF, this.LJIIJ);
        }
        if (this.LJIILJJIL != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.LJIIIIZZ;
            if (drawable2 != null) {
                stateListDrawable.addState(LJIJ, drawable2);
            }
            this.LJIILJJIL.setDrawableByLayerId(com.zhiliaoapp.musically.R.id.go9, stateListDrawable);
        }
    }

    public final void LJFF(C80416VhE c80416VhE) {
        this.LJIIJJI = c80416VhE;
        this.LIZJ.setShapeAppearanceModel(c80416VhE);
        this.LIZJ.LLD = !r1.LJIIIZ();
        C80418VhG c80418VhG = this.LIZLLL;
        if (c80418VhG != null) {
            c80418VhG.setShapeAppearanceModel(c80416VhE);
        }
        C80418VhG c80418VhG2 = this.LJIILL;
        if (c80418VhG2 != null) {
            c80418VhG2.setShapeAppearanceModel(c80416VhE);
        }
    }

    public C80414VhC(C80413VhB c80413VhB, AttributeSet attributeSet) {
        this.LIZ = c80413VhB;
        C80418VhG c80418VhG = new C80418VhG(c80413VhB.getContext(), attributeSet, com.zhiliaoapp.musically.R.attr.b01, com.zhiliaoapp.musically.R.style.a08);
        this.LIZJ = c80418VhG;
        c80418VhG.LJIIIIZZ(c80413VhB.getContext());
        c80418VhG.LJIILIIL(-12303292);
        C80416VhE c80416VhE = c80418VhG.LJLIL.LIZ;
        c80416VhE.getClass();
        C80417VhF c80417VhF = new C80417VhF(c80416VhE);
        TypedArray obtainStyledAttributes = c80413VhB.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.minWidth, R.attr.minHeight, com.zhiliaoapp.musically.R.attr.a1h, com.zhiliaoapp.musically.R.attr.a1i, com.zhiliaoapp.musically.R.attr.a1j, com.zhiliaoapp.musically.R.attr.a1l, com.zhiliaoapp.musically.R.attr.a1m, com.zhiliaoapp.musically.R.attr.a1n, com.zhiliaoapp.musically.R.attr.a76, com.zhiliaoapp.musically.R.attr.a77, com.zhiliaoapp.musically.R.attr.a79, com.zhiliaoapp.musically.R.attr.a7_, com.zhiliaoapp.musically.R.attr.a7b}, com.zhiliaoapp.musically.R.attr.b01, com.zhiliaoapp.musically.R.style.h4);
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            c80417VhF.LJ = new C80323Vfj(dimension);
            c80417VhF.LJFF = new C80323Vfj(dimension);
            c80417VhF.LJI = new C80323Vfj(dimension);
            c80417VhF.LJII = new C80323Vfj(dimension);
        }
        this.LIZLLL = new C80418VhG();
        LJFF(new C80416VhE(c80417VhF));
        obtainStyledAttributes.recycle();
    }

    public static float LIZIZ(UCH uch, float f) {
        if (uch instanceof V1D) {
            return (float) ((1.0d - LJIJI) * f);
        }
        if (uch instanceof V1C) {
            return f / 2.0f;
        }
        return 0.0f;
    }
}
