package X;

import Y.ARunnableS50S0100000_14;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.Vvd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81309Vvd extends C02Z {
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public final C81310Vve LJLJJI;
    public final ARunnableS50S0100000_14 LJLJJL;

    public final void LIZ() {
        removeCallbacks(this.LJLJJL);
        C81310Vve c81310Vve = this.LJLJJI;
        EnumC81311Vvf enumC81311Vvf = c81310Vve.LJIILL;
        EnumC81311Vvf enumC81311Vvf2 = EnumC81311Vvf.HIDDEN;
        if (enumC81311Vvf != enumC81311Vvf2) {
            c81310Vve.LIZ.removeCallbacks(c81310Vve.LJIILJJIL);
            Animator animator = c81310Vve.LJII;
            if (animator != null) {
                animator.cancel();
            }
            ValueAnimator valueAnimator = (ValueAnimator) c81310Vve.LJIIJJI.getValue();
            valueAnimator.start();
            c81310Vve.LJII = valueAnimator;
            c81310Vve.LJIILL = enumC81311Vvf2;
        }
    }

    public final void LIZIZ() {
        postDelayed(this.LJLJJL, 100L);
    }

    public final boolean getAttachToRight() {
        return this.LJLJI;
    }

    public final boolean getCollapseDown() {
        return this.LJLILLLLZI;
    }

    @Override // X.C02Z, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        float height = this.LJLJJI.LIZJ * getHeight();
        if (Math.abs(height) < 1.0f) {
            super.onDraw(canvas);
            return;
        }
        canvas.save();
        if (this.LJLJI) {
            canvas.translate(0.0f, -height);
        } else {
            canvas.translate(0.0f, height);
        }
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        float f;
        o.LJIIIZ(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent) {
            int action = event.getAction();
            if (action != 0) {
                if (action == 1 || action == 3) {
                    this.LJLJJI.LIZ();
                }
            } else {
                C81310Vve c81310Vve = this.LJLJJI;
                if (c81310Vve.LJIILL == EnumC81311Vvf.SHOWN) {
                    c81310Vve.LIZ.removeCallbacks(c81310Vve.LJIILJJIL);
                    Animator animator = c81310Vve.LJII;
                    if (animator != null) {
                        animator.cancel();
                    }
                    ValueAnimator valueAnimator = (ValueAnimator) c81310Vve.LJIIL.getValue();
                    valueAnimator.setFloatValues(c81310Vve.LJFF, c81310Vve.LJ);
                    float f2 = c81310Vve.LIZJ;
                    float f3 = c81310Vve.LJFF;
                    float f4 = c81310Vve.LJ;
                    if (f4 == f3) {
                        f = 0.0f;
                    } else {
                        f = (f2 - f3) / (f4 - f3);
                    }
                    if (Build.VERSION.SDK_INT >= 22) {
                        TimeInterpolator interpolator = valueAnimator.getInterpolator();
                        valueAnimator.setInterpolator(c81310Vve.LJIILLIIL);
                        valueAnimator.setCurrentFraction(f);
                        valueAnimator.setInterpolator(interpolator);
                    }
                    valueAnimator.start();
                    c81310Vve.LJII = valueAnimator;
                }
            }
        }
        return onTouchEvent;
    }

    public final void setAttachToRight(boolean z) {
        this.LJLJI = z;
    }

    public final void setCollapseDown(boolean z) {
        if (this.LJLILLLLZI != z) {
            this.LJLILLLLZI = z;
            this.LJLJJI.LIZIZ = z;
            requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C81309Vvd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        float applyDimension = TypedValue.applyDimension(1, 3.0f, getResources().getDisplayMetrics()) / 2;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        setProgressDrawable(new C72785ShR(applyDimension, AnonymousClass636.LJIIIIZZ(R.attr.da, context2)));
        this.LJLJJI = new C81310Vve(this, this.LJLILLLLZI);
        this.LJLJJL = new ARunnableS50S0100000_14(this, 183);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int max = Math.max(getThumb().getBounds().height(), getProgressDrawable().getBounds().height());
            C81310Vve c81310Vve = this.LJLJJI;
            float LJIIJJI = C78842Uww.LJIIJJI(max / getHeight(), 0.0f, 1.0f);
            if (c81310Vve.LIZLLL == LJIIJJI) {
                return;
            }
            c81310Vve.LIZLLL = LJIIJJI;
            float f = LJIIJJI / 2.0f;
            if (c81310Vve.LIZIZ) {
                c81310Vve.LJ = f - 0.5f;
                c81310Vve.LJFF = 0.5f;
                c81310Vve.LJI = f + 0.5f;
            } else {
                c81310Vve.LJ = 0.5f - f;
                c81310Vve.LJFF = -0.5f;
                c81310Vve.LJI = (-0.5f) - f;
            }
        }
    }
}
