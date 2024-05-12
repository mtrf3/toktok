package X;

import Y.ALAdapterS10S0100000_13;
import Y.ARunnableS49S0100000_13;
import Y.AUListenerS100S0100000_13;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestFixPreviewLayoutSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Tiv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75425Tiv extends C75422Tis {
    public final View LJIJJ;
    public final View LJIJJLI;
    public final View LJIL;
    public final View LJJ;
    public final ViewOnLayoutChangeListenerC75426Tiw LJJI;
    public AnimatorSet LJJIFFI;

    @Override // X.C75422Tis
    public final void LJII() {
        View view;
        if (C19N.LIZLLL() && (view = this.LIZLLL) != null) {
            view.post(new ARunnableS49S0100000_13(this, 130));
        }
    }

    public final void LJIJ() {
        FrameLayout.LayoutParams layoutParams;
        if (C19N.LIZLLL()) {
            ViewGroup viewGroup = this.LJFF;
            if (viewGroup != null) {
                viewGroup.addOnLayoutChangeListener(this.LJJI);
            }
            LJII();
            View view = this.LJIJJ;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                if (!(layoutParams2 instanceof FrameLayout.LayoutParams) || (layoutParams = (FrameLayout.LayoutParams) layoutParams2) == null) {
                    return;
                }
                layoutParams.gravity = 48;
            }
        }
    }

    @Override // X.C75422Tis
    public final ValueAnimator LJ() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
        }
        ValueAnimator LJFF = C75422Tis.LJFF(1.0f, 0.0f, this.LIZ);
        LJFF.addUpdateListener(new AUListenerS100S0100000_13(this, 76));
        return LJFF;
    }

    public final int LJIIZILJ() {
        boolean z;
        OSZ osz;
        View childAt;
        View childAt2;
        View childAt3;
        View childAt4;
        int i;
        int i2;
        int i3;
        int LIZ;
        int LIZ2;
        ViewGroup viewGroup = this.LIZ;
        int i4 = 0;
        if (viewGroup != null && C29306Beo.LJJIIJ(viewGroup)) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.LIZ.getAlpha() > 0.0f && C29306Beo.LJJIIJ(this.LIZ.getChildAt(0))) {
            osz = new OSZ(Boolean.TRUE, this.LIZ);
        } else {
            ViewGroup viewGroup2 = this.LIZIZ;
            if (viewGroup2 != null && C29306Beo.LJJIIJ(viewGroup2) && this.LIZIZ.getAlpha() > 0.0f && (((childAt3 = this.LIZIZ.getChildAt(0)) != null && C29306Beo.LJJIIJ(childAt3)) || ((childAt4 = this.LIZIZ.getChildAt(1)) != null && C29306Beo.LJJIIJ(childAt4)))) {
                osz = new OSZ(Boolean.TRUE, this.LIZIZ);
            } else {
                ViewGroup viewGroup3 = this.LIZJ;
                if (viewGroup3 != null && C29306Beo.LJJIIJ(viewGroup3) && this.LIZJ.getAlpha() > 0.0f && (((childAt = this.LIZJ.getChildAt(0)) != null && C29306Beo.LJJIIJ(childAt)) || ((childAt2 = this.LIZJ.getChildAt(1)) != null && C29306Beo.LJJIIJ(childAt2)))) {
                    osz = new OSZ(Boolean.TRUE, this.LIZJ);
                } else {
                    osz = new OSZ(Boolean.FALSE, null);
                }
            }
        }
        boolean booleanValue = ((Boolean) osz.getFirst()).booleanValue();
        Object second = osz.getSecond();
        ViewGroup viewGroup4 = this.LJFF;
        if (viewGroup4 == null) {
            return C15380j0.LIZ(12.0f);
        }
        int measuredHeight = viewGroup4.getMeasuredHeight();
        ViewGroup viewGroup5 = this.LIZ;
        if (viewGroup5 != null) {
            i = viewGroup5.getMeasuredHeight();
        } else {
            i = 0;
        }
        ViewGroup viewGroup6 = this.LIZIZ;
        if (viewGroup6 != null) {
            i2 = viewGroup6.getMeasuredHeight();
        } else {
            i2 = 0;
        }
        int max = Math.max(i, i2);
        ViewGroup viewGroup7 = this.LIZJ;
        if (viewGroup7 != null) {
            i3 = viewGroup7.getMeasuredHeight();
        } else {
            i3 = 0;
        }
        int max2 = (measuredHeight - Math.max(max, i3)) - C15380j0.LIZ(8.0f);
        if (booleanValue) {
            if (o.LJ(second, this.LIZ)) {
                LIZ2 = C15380j0.LIZ(51.0f);
            } else if (o.LJ(second, this.LIZIZ)) {
                ViewGroup viewGroup8 = this.LIZIZ;
                if (viewGroup8 != null) {
                    i4 = viewGroup8.getMeasuredHeight();
                }
                max2 += i4;
                LIZ2 = C15380j0.LIZ(8.0f) * 2;
            } else {
                if (o.LJ(second, this.LIZJ)) {
                    return C15380j0.LIZ(12.0f) + this.LJFF.getMeasuredHeight();
                }
                int measuredHeight2 = this.LJFF.getMeasuredHeight();
                View view = this.LJIJJLI;
                if (view != null) {
                    i4 = view.getPaddingBottom();
                }
                return measuredHeight2 + i4;
            }
            return LIZ2 + max2;
        }
        if (this.LJIIIIZZ) {
            LIZ = C15380j0.LIZ(8.0f);
        } else {
            if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                i4 = 32;
            }
            LIZ = C15380j0.LIZ(i4 + 51.0f);
        }
        return LIZ + max2;
    }

    @Override // X.C75422Tis
    public final ValueAnimator LJIIIIZZ() {
        ValueAnimator LJIIIIZZ = super.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            LJIIIIZZ.addUpdateListener(new AUListenerS100S0100000_13(this, 77));
        }
        return LJIIIIZZ;
    }

    @Override // X.C75422Tis
    public final ValueAnimator LJIIIZ() {
        ValueAnimator LJIIIZ = super.LJIIIZ();
        if (LJIIIZ != null) {
            LJIIIZ.addUpdateListener(new AUListenerS100S0100000_13(this, 78));
        }
        return LJIIIZ;
    }

    @Override // X.C75422Tis
    public final ValueAnimator LIZJ(ViewGroup viewGroup) {
        float f;
        if (viewGroup != null) {
            f = viewGroup.getAlpha();
        } else {
            f = 0.0f;
        }
        ValueAnimator LJFF = C75422Tis.LJFF(f, 0.0f, viewGroup);
        LJFF.addUpdateListener(new AUListenerS100S0100000_13(viewGroup, 75));
        return LJFF;
    }

    @Override // X.C75422Tis
    public final AnimatorSet LJI(ConstraintLayout constraintLayout) {
        AnimatorSet LJI = super.LJI(constraintLayout);
        if (LJI != null) {
            LJI.addListener(new ALAdapterS10S0100000_13(this, 42));
        }
        return LJI;
    }

    @Override // X.C75422Tis
    public final ValueAnimator LJIILLIIL(ConstraintLayout constraintLayout) {
        ValueAnimator LJIILLIIL = super.LJIILLIIL(constraintLayout);
        if (LJIILLIIL != null) {
            LJIILLIIL.addUpdateListener(new AUListenerS100S0100000_13(this, 82));
        }
        return LJIILLIIL;
    }

    @Override // X.C75422Tis
    public final AnimatorSet LJIIJ(boolean z, boolean z2) {
        AnimatorSet LJIIJ = super.LJIIJ(z, z2);
        if (LJIIJ != null) {
            LJIIJ.addListener(new ALAdapterS10S0100000_13(this, 40));
        }
        return LJIIJ;
    }

    @Override // X.C75422Tis
    public final AnimatorSet LJIIL(boolean z, boolean z2) {
        AnimatorSet LJIIL = super.LJIIL(z, z2);
        if (LJIIL != null) {
            LJIIL.addListener(new ALAdapterS10S0100000_13(this, 41));
        }
        return LJIIL;
    }

    public final void LJIJI(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        ViewGroup.LayoutParams layoutParams;
        View view = this.LIZLLL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 instanceof C018905p) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i;
                marginLayoutParams.topMargin = C15380j0.LIZ(12.0f);
            }
        } else {
            marginLayoutParams = null;
        }
        if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
            int i4 = (i2 * 10) / 13;
            C29306Beo.LJJLIIIJJIZ(i4, i2, this.LJIJJ);
            if (marginLayoutParams != null) {
                marginLayoutParams.height = i2;
                marginLayoutParams.width = i4;
            }
        } else {
            View view2 = this.LJIJJ;
            if (view2 != null && (layoutParams = view2.getLayoutParams()) != null) {
                i3 = layoutParams.width;
            } else {
                i3 = 0;
            }
            C29306Beo.LJJLIIIJJIZ(i3, i2, view2);
            if (marginLayoutParams != null) {
                marginLayoutParams.height = i2;
            }
        }
        this.LIZLLL.setLayoutParams(marginLayoutParams);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("need expand new bottom ");
        LIZ.append(C15380j0.LIZ(260.0f) + this.LIZLLL.getTop());
        C0NB.LIZIZ("MultiGuestPreviewAnimationHelper", X1D.LIZIZ(LIZ));
    }

    public final void LJIJJ(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int i3;
        int i4;
        View view = this.LIZLLL;
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C018905p) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        } else {
            marginLayoutParams = null;
        }
        if (marginLayoutParams != null) {
            i3 = marginLayoutParams.bottomMargin;
            i4 = marginLayoutParams.height;
        } else {
            i3 = 0;
            i4 = 0;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i3, i);
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i4, i2);
        ofInt.setInterpolator(new LinearInterpolator());
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt.setDuration(250L);
        ofInt2.setDuration(250L);
        ofInt.addUpdateListener(new AUListenerS100S0100000_13(this, 79));
        if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
            ofInt2.addUpdateListener(new AUListenerS100S0100000_13(this, 80));
        } else {
            ofInt2.addUpdateListener(new AUListenerS100S0100000_13(this, 81));
        }
        AnimatorSet animatorSet = this.LJJIFFI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(ofInt, ofInt2);
        this.LJJIFFI = animatorSet2;
        animatorSet2.start();
    }

    public final void LJIJJLI(boolean z, boolean z2, boolean z3) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = this.LIZLLL;
        if (view == null || view.getMeasuredHeight() <= 0 || this.LJIJJLI == null || this.LJIL == null || this.LJFF == null || this.LJJ == null || this.LIZLLL == null) {
            return;
        }
        int LJIIZILJ = LJIIZILJ();
        float LJIIJJI = (((float) (C15380j0.LJIIJJI() * 0.8d)) - LJIIZILJ) - C15380j0.LJFF(R.dimen.a4j);
        View view2 = this.LJJ;
        if (view2 != null) {
            i = view2.getMeasuredHeight();
        } else {
            i = 0;
        }
        float f = LJIIJJI - i;
        if (f <= this.LIZLLL.getMeasuredHeight() && z2) {
            int i2 = (int) f;
            if (!z3) {
                LJIJI(LJIIZILJ, i2);
            } else {
                LJIJJ(LJIIZILJ, i2);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("need compress new bottom ");
            LIZ.append(this.LIZLLL.getTop() + f);
            C0NB.LIZIZ("MultiGuestPreviewAnimationHelper", X1D.LIZIZ(LIZ));
            return;
        }
        if (f > this.LIZLLL.getMeasuredHeight() + 1 && z) {
            int min = Math.min((int) f, C15380j0.LIZ(260.0f));
            if (!z3) {
                LJIJI(LJIIZILJ, min);
                return;
            } else {
                LJIJJ(LJIIZILJ, min);
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = this.LIZLLL.getLayoutParams();
        if (layoutParams instanceof C018905p) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null && LJIIZILJ == marginLayoutParams.bottomMargin) {
                return;
            }
        } else {
            marginLayoutParams = null;
        }
        if (!z3) {
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = LJIIZILJ;
            }
            if (MultiGuestFixPreviewLayoutSetting.INSTANCE.isEnable()) {
                if (marginLayoutParams != null) {
                    marginLayoutParams.height = C15380j0.LIZ(260.0f);
                    marginLayoutParams.width = C15380j0.LIZ(200.0f);
                }
            } else if (marginLayoutParams != null) {
                marginLayoutParams.height = C15380j0.LIZ(260.0f);
            }
            this.LIZLLL.setLayoutParams(marginLayoutParams);
        } else {
            LJIJJ(LJIIZILJ, C15380j0.LIZ(260.0f));
        }
        C012403c.LJ("maxHeigtPanel > current panel adjust bottom ", LJIIZILJ, "MultiGuestPreviewAnimationHelper");
    }

    public C75425Tiv(ConstraintLayout constraintLayout, ViewGroup viewGroup, ViewGroup viewGroup2, View view, View view2, View view3, View view4, View view5, ViewGroup viewGroup3, ViewGroup viewGroup4, InterfaceC65784Pro interfaceC65784Pro) {
        super(constraintLayout, viewGroup, viewGroup2, view, viewGroup3, viewGroup4, interfaceC65784Pro);
        ConstraintLayout constraintLayout2;
        this.LJIJJ = view2;
        this.LJIJJLI = view3;
        this.LJIL = view4;
        this.LJJ = view5;
        if ((view3 instanceof ConstraintLayout) && (constraintLayout2 = (ConstraintLayout) view3) != null) {
            constraintLayout2.setMaxHeight(C15380j0.LIZ(20.0f) + ((int) (C15380j0.LJIIJJI() * 0.8d)));
        }
        this.LJJI = new ViewOnLayoutChangeListenerC75426Tiw(viewGroup4, this, view);
    }
}
