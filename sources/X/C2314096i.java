package X;

import Y.AUListenerS93S0100000_4;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.96i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2314096i extends FrameLayout {
    public boolean LJLIL;
    public final ValueAnimator LJLILLLLZI;
    public int LJLJI;
    public float LJLJJI;
    public boolean LJLJJL;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLILLLLZI.cancel();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2314096i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJLILLLLZI = ofFloat;
        this.LJLJJL = true;
        ofFloat.setInterpolator(C55953Lxd.LJ());
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS93S0100000_4(this, 27));
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: X.96j
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animation) {
                o.LJIIIZ(animation, "animation");
                C2314096i c2314096i = C2314096i.this;
                c2314096i.LJLIL = false;
                c2314096i.requestLayout();
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animation, boolean z) {
                o.LJIIIZ(animation, "animation");
                super.onAnimationStart(animation, z);
                C2314096i.this.LJLIL = true;
            }
        });
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLIL) {
            if (this.LJLJI <= 0) {
                super.onMeasure(i, i2);
                this.LJLJI = getMeasuredHeight();
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (this.LJLJI * this.LJLJJI), 1073741824));
            return;
        }
        if (this.LJLJJL) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, 1073741824));
            this.LJLJI = 0;
        } else {
            super.onMeasure(i, i2);
            this.LJLJI = 0;
        }
    }
}
