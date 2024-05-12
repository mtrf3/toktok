package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Vg2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80342Vg2 extends AbstractC80331Vfr {
    public final C80344Vg4 LIZLLL;
    public final ViewOnFocusChangeListenerC80361VgL LJ;
    public final C80340Vg0 LJFF;
    public final C80341Vg1 LJI;
    public final C80346Vg6 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public StateListDrawable LJIIJJI;
    public C80418VhG LJIIL;
    public AccessibilityManager LJIILIIL;
    public ValueAnimator LJIILJJIL;
    public ValueAnimator LJIILL;

    @Override // X.AbstractC80331Vfr
    public final boolean LIZIZ(int i) {
        return i != 0;
    }

    @Override // X.AbstractC80331Vfr
    public final void LIZ() {
        float dimensionPixelOffset = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.a3f);
        float dimensionPixelOffset2 = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.a1x);
        int dimensionPixelOffset3 = this.LIZIZ.getResources().getDimensionPixelOffset(R.dimen.a1z);
        C80418VhG LIZLLL = LIZLLL(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C80418VhG LIZLLL2 = LIZLLL(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.LJIIL = LIZLLL;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.LJIIJJI = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, LIZLLL);
        this.LJIIJJI.addState(new int[0], LIZLLL2);
        this.LIZ.setEndIconDrawable(C20110qd.LIZ(this.LIZIZ, R.drawable.brz));
        C80315Vfb c80315Vfb = this.LIZ;
        c80315Vfb.setEndIconContentDescription(c80315Vfb.getResources().getText(R.string.g7x));
        this.LIZ.setEndIconOnClickListener(new ViewOnClickListenerC80357VgH(this));
        C80315Vfb c80315Vfb2 = this.LIZ;
        C80341Vg1 c80341Vg1 = this.LJI;
        c80315Vfb2.LLILZLL.add(c80341Vg1);
        if (c80315Vfb2.LJLJJL != null) {
            c80341Vg1.LIZ(c80315Vfb2);
        }
        this.LIZ.LLJI.add(this.LJII);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = C80237VeL.LIZ;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new C80354VgE(this));
        this.LJIILL = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new C80354VgE(this));
        this.LJIILJJIL = ofFloat2;
        ofFloat2.addListener(new C80352VgC(this));
        this.LJIILIIL = (AccessibilityManager) C16880lQ.LLILL(this.LIZIZ, "accessibility");
    }

    public C80342Vg2(C80315Vfb c80315Vfb) {
        super(c80315Vfb);
        this.LIZLLL = new C80344Vg4(this);
        this.LJ = new ViewOnFocusChangeListenerC80361VgL(this);
        this.LJFF = new C80340Vg0(this, c80315Vfb);
        this.LJI = new C80341Vg1(this);
        this.LJII = new C80346Vg6(this);
        this.LJIIIIZZ = false;
        this.LJIIIZ = false;
        this.LJIIJ = Long.MAX_VALUE;
    }

    public final void LJ(boolean z) {
        if (this.LJIIIZ != z) {
            this.LJIIIZ = z;
            this.LJIILL.cancel();
            this.LJIILJJIL.start();
        }
    }

    public final void LJFF(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.LJIIJ;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.LJIIIIZZ = false;
        }
        if (!this.LJIIIIZZ) {
            LJ(!this.LJIIIZ);
            if (this.LJIIIZ) {
                autoCompleteTextView.requestFocus();
                autoCompleteTextView.showDropDown();
                return;
            } else {
                autoCompleteTextView.dismissDropDown();
                return;
            }
        }
        this.LJIIIIZZ = false;
    }

    public final C80418VhG LIZLLL(float f, float f2, float f3, int i) {
        C80417VhF c80417VhF = new C80417VhF();
        c80417VhF.LJ = new C80323Vfj(f);
        c80417VhF.LJFF = new C80323Vfj(f);
        c80417VhF.LJII = new C80323Vfj(f2);
        c80417VhF.LJI = new C80323Vfj(f2);
        C80416VhE c80416VhE = new C80416VhE(c80417VhF);
        Context context = this.LIZIZ;
        int LIZIZ = C78972Uz2.LIZIZ(context, R.attr.a4y, C16880lQ.LJLLJ(C80418VhG.class));
        C80418VhG c80418VhG = new C80418VhG();
        c80418VhG.LJIIIIZZ(context);
        c80418VhG.LJIIJJI(ColorStateList.valueOf(LIZIZ));
        c80418VhG.LJIIJ(f3);
        c80418VhG.setShapeAppearanceModel(c80416VhE);
        C80421VhJ c80421VhJ = c80418VhG.LJLIL;
        if (c80421VhJ.LJII == null) {
            c80421VhJ.LJII = new Rect();
        }
        c80418VhG.LJLIL.LJII.set(0, i, 0, i);
        c80418VhG.invalidateSelf();
        return c80418VhG;
    }
}
