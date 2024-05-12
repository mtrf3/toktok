package X;

import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes6.dex */
public final class CV7 extends FrameLayout {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public long LJLJL;
    public final ValueAnimator LJLJLJ;
    public final ValueAnimator LJLJLLL;

    public final void LIZLLL() {
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
            LIZJ(0);
            LIZIZ(0);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LJLIL = true;
    }

    public final long getAnimationDuration() {
        return this.LJLJL;
    }

    public final void LIZIZ(int i) {
        this.LJLJJI = i;
        this.LJLJLJ.cancel();
        this.LJLJLJ.setIntValues(this.LJLILLLLZI, this.LJLJJI);
        this.LJLJLJ.start();
    }

    public final void LIZJ(int i) {
        this.LJLJJL = i;
        this.LJLJLLL.cancel();
        this.LJLJLLL.setIntValues(this.LJLJI, this.LJLJJL);
        this.LJLJLLL.start();
    }

    public final void setAnimationDuration(long j) {
        this.LJLJL = j;
        this.LJLJLJ.setDuration(j);
        this.LJLJLLL.setDuration(this.LJLJL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CV7(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLJL = 180L;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(this.LJLJL);
        valueAnimator.addUpdateListener(new AUListenerS94S0100000_5(this, 0));
        this.LJLJLJ = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.setDuration(this.LJLJL);
        valueAnimator2.addUpdateListener(new AUListenerS94S0100000_5(this, 1));
        this.LJLJLLL = valueAnimator2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLIL) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            int measuredWidth = getMeasuredWidth();
            if (measuredHeight != this.LJLJJI && this.LJLJJLL) {
                LIZIZ(measuredHeight);
            }
            if (measuredWidth != this.LJLJJL && this.LJLJJLL) {
                LIZJ(measuredWidth);
            }
            setMeasuredDimension(this.LJLJI, this.LJLILLLLZI);
            return;
        }
        if (this.LJLJLJ.isRunning()) {
            setMeasuredDimension(this.LJLJI, this.LJLILLLLZI);
            return;
        }
        int i3 = this.LJLILLLLZI;
        if (i3 != 0 && this.LJLJI != 0) {
            super.onMeasure(i, i2);
            this.LJLILLLLZI = getMeasuredHeight();
            int measuredWidth2 = getMeasuredWidth();
            this.LJLJI = measuredWidth2;
            this.LJLJJI = this.LJLILLLLZI;
            this.LJLJJL = measuredWidth2;
            return;
        }
        setMeasuredDimension(this.LJLJI, i3);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            childAt.layout((getMeasuredWidth() - childAt.getMeasuredWidth()) / 2, getMeasuredHeight() - childAt.getMeasuredHeight(), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
        this.LJLIL = false;
    }
}
