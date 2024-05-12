package X;

import Y.AUListenerS94S0100000_5;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.a1;

/* loaded from: classes6.dex */
public final class CUV extends C47141t8 {
    public int LJLJJL;
    public final ValueAnimator LJLJJLL;
    public final ObjectAnimator LJLJL;
    public boolean LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public boolean LJLLI;

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJLJJLL.cancel();
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        super.requestLayout();
        this.LJLL = true;
    }

    public final boolean getHeightAnimationEnabled() {
        return this.LJLJLJ;
    }

    public static final /* synthetic */ void LIZ(CUV cuv) {
        super.requestLayout();
    }

    public final void LIZIZ(int i) {
        this.LJLJLLL = i;
        this.LJLJJLL.cancel();
        if (this.LJLJLJ) {
            this.LJLJJLL.setIntValues(this.LJLJJL, this.LJLJLLL);
            this.LJLJJLL.start();
        }
    }

    public final void setHeightAnimationEnabled(boolean z) {
        if (this.LJLJLJ != z) {
            this.LJLJLJ = z;
            this.LJLJJLL.cancel();
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CUV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(230L);
        valueAnimator.addUpdateListener(new AUListenerS94S0100000_5(this, 8));
        this.LJLJJLL = valueAnimator;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe(FrameLayout.ALPHA, Keyframe.ofFloat(0.0f, 0.0f), Keyframe.ofFloat(0.6969697f, 0.3f), Keyframe.ofFloat(1.0f, 1.0f)));
        ofPropertyValuesHolder.setDuration(330L);
        this.LJLJL = ofPropertyValuesHolder;
        this.LJLJLJ = true;
        this.LJLLI = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.LJLL) {
            super.onMeasure(i, i2);
            int measuredHeight = getMeasuredHeight();
            if (this.LJLJLLL != measuredHeight && this.LJLLI) {
                LIZIZ(measuredHeight);
            }
        }
        if (this.LJLJLJ) {
            setMeasuredDimension(getMeasuredWidth(), this.LJLJJL);
        } else {
            this.LJLJJL = this.LJLJLLL;
            setMeasuredDimension(getMeasuredWidth(), this.LJLJLLL);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LJLL = false;
    }
}
