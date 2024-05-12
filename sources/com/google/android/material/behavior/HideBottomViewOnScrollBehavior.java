package com.google.android.material.behavior;

import X.AbstractInterpolatorC07420Qw;
import X.C06C;
import X.C45621qg;
import X.C80237VeL;
import Y.ALAdapterS11S0100000_14;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes15.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends C06C<V> {
    public int LIZ;
    public int LIZIZ;
    public ViewPropertyAnimator LIZJ;

    @Override // X.C06C
    public boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
        this.LIZIZ = 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LIZIZ = 2;
    }

    @Override // X.C06C
    public boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        this.LIZ = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        return super.onLayoutChild(c45621qg, v, i);
    }

    public final void LIZ(View view, int i, long j, AbstractInterpolatorC07420Qw abstractInterpolatorC07420Qw) {
        this.LIZJ = view.animate().translationY(i).setInterpolator(abstractInterpolatorC07420Qw).setDuration(j).setListener(new ALAdapterS11S0100000_14(this, 29));
    }

    @Override // X.C06C
    public final void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            if (this.LIZIZ == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.LIZJ;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                v.clearAnimation();
            }
            this.LIZIZ = 1;
            LIZ(v, this.LIZ, 175L, C80237VeL.LIZJ);
            return;
        }
        if (i2 >= 0 || this.LIZIZ == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.LIZJ;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            v.clearAnimation();
        }
        this.LIZIZ = 2;
        LIZ(v, 0, 225L, C80237VeL.LIZLLL);
    }
}
