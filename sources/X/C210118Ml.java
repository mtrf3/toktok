package X;

import Y.AUListenerS67S0101000_3;
import Y.AUListenerS7S0102000_3;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.8Ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C210118Ml extends LinearLayout {
    public static final /* synthetic */ int LJLL = 0;
    public final Context LJLIL;
    public int LJLILLLLZI;
    public final float LJLJI;
    public float LJLJJI;
    public C210078Mh LJLJJL;
    public boolean LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public final AnimatorSet LJLJLLL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C210118Ml(Context ctx, AttributeSet attributeSet) {
        this(ctx, attributeSet, 4);
        o.LJIIIZ(ctx, "ctx");
    }

    public final C210128Mm LIZIZ() {
        Context mContext = this.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        C210128Mm c210128Mm = new C210128Mm(mContext);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.width = this.LJLJL;
        c210128Mm.setLayoutParams(layoutParams);
        C210078Mh c210078Mh = this.LJLJJL;
        if (c210078Mh != null) {
            c210128Mm.setProgressBarConfig(c210078Mh);
        }
        return c210128Mm;
    }

    public final int getCurrentPosition() {
        return this.LJLILLLLZI;
    }

    public final void LIZ(int i) {
        float f;
        if (i <= 0) {
            return;
        }
        C210078Mh c210078Mh = this.LJLJJL;
        if (c210078Mh != null) {
            f = c210078Mh.LIZJ;
        } else {
            f = this.LJLJI;
        }
        this.LJLJJI = f;
        int measuredWidth = getMeasuredWidth();
        if (measuredWidth <= 0) {
            return;
        }
        this.LJLJLJ = getMeasuredHeight();
        float f2 = this.LJLJJI;
        int i2 = (int) ((measuredWidth - ((i - 1) * f2)) / i);
        this.LJLJL = i2;
        if (i2 < f2) {
            int i3 = (measuredWidth / ((i * 2) - 1)) + 1;
            this.LJLJL = i3;
            this.LJLJJI = i3;
        }
    }

    public final void LIZJ(int i) {
        float f;
        float f2;
        int childCount = getChildCount();
        if (i > this.LJLILLLLZI) {
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof C210128Mm) {
                    if (i2 < i) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    ((C210128Mm) childAt).LIZIZ(f2, false);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; -1 < i3; i3--) {
            View childAt2 = getChildAt(i3);
            if (childAt2 instanceof C210128Mm) {
                if (i3 >= i) {
                    f = 0.0f;
                } else {
                    f = 1.0f;
                }
                ((C210128Mm) childAt2).LIZIZ(f, false);
            }
        }
    }

    public final void LJ(final int i) {
        int childCount;
        float f;
        View childAt;
        View childAt2;
        if (getVisibility() != 0 || (childCount = getChildCount()) == i) {
            return;
        }
        if (childCount > 0 && !this.LJLJJLL) {
            if (childCount < i) {
                int childCount2 = getChildCount();
                if (i <= childCount2 || (childAt2 = getChildAt(childCount2 - 1)) == null) {
                    return;
                }
                for (int i2 = childCount2; i2 < i; i2++) {
                    addView(LIZIZ());
                }
                LIZ(i);
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                childAt2.setLayoutParams(layoutParams);
                float measuredWidth = childAt2.getMeasuredWidth();
                float f2 = this.LJLJL;
                ValueAnimator ofFloat = ObjectAnimator.ofFloat(measuredWidth, f2);
                o.LJIIIIZZ(ofFloat, "ofFloat(originalWidth, targetWidth)");
                ofFloat.addUpdateListener(new AUListenerS67S0101000_3(childCount2, this, 4));
                ValueAnimator ofFloat2 = ObjectAnimator.ofFloat(0.0f, f2);
                o.LJIIIIZZ(ofFloat2, "ofFloat(0F, targetWidth)");
                ofFloat2.addUpdateListener(new AUListenerS7S0102000_3(childCount2, i, this, 0));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(ofFloat).with(ofFloat2);
                animatorSet.start();
                return;
            }
            final int childCount3 = getChildCount();
            if (i >= childCount3 || (childAt = getChildAt(i - 1)) == null) {
                return;
            }
            LIZ(i);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            o.LJII(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
            layoutParams3.rightMargin = 0;
            layoutParams3.setMarginEnd(0);
            childAt.setLayoutParams(layoutParams3);
            float measuredWidth2 = childAt.getMeasuredWidth();
            ValueAnimator ofFloat3 = ObjectAnimator.ofFloat(measuredWidth2, this.LJLJL);
            o.LJIIIIZZ(ofFloat3, "ofFloat(originalWidth, targetWidth)");
            ofFloat3.addUpdateListener(new AUListenerS67S0101000_3(i, this, 5));
            ValueAnimator ofFloat4 = ObjectAnimator.ofFloat(measuredWidth2, 0.0f);
            o.LJIIIIZZ(ofFloat4, "ofFloat(originalWidth, 0F)");
            ofFloat4.addUpdateListener(new AUListenerS7S0102000_3(i, childCount3, this, 1));
            C16880lQ.LJLJJL(this.LJLJLLL);
            if (ofFloat4.isRunning() || ofFloat4.isStarted()) {
                ofFloat4.cancel();
            }
            this.LJLJLLL.play(ofFloat4).with(ofFloat3);
            this.LJLJLLL.addListener(new Animator.AnimatorListener() { // from class: X.8Mo
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    int i3 = childCount3 - 1;
                    if (i > i3) {
                        return;
                    }
                    while (true) {
                        View childAt3 = this.getChildAt(i3);
                        if (childAt3 != null) {
                            C210118Ml c210118Ml = this;
                            if (C78996UzQ.LJJIIJZLJL(childAt3)) {
                                C78996UzQ.LJI();
                            }
                            c210118Ml.removeView(childAt3);
                        }
                        if (i3 != i) {
                            i3--;
                        } else {
                            return;
                        }
                    }
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animation) {
                    o.LJIIIZ(animation, "animation");
                    int i3 = childCount3 - 1;
                    if (i > i3) {
                        return;
                    }
                    while (true) {
                        View childAt3 = this.getChildAt(i3);
                        if (childAt3 != null) {
                            C210118Ml c210118Ml = this;
                            if (C78996UzQ.LJJIIJZLJL(childAt3)) {
                                C78996UzQ.LJI();
                            }
                            c210118Ml.removeView(childAt3);
                        }
                        if (i3 != i) {
                            i3--;
                        } else {
                            return;
                        }
                    }
                }
            });
            this.LJLJLLL.start();
            return;
        }
        this.LJLILLLLZI = 0;
        this.LJLJL = 0;
        this.LJLJLJ = 0;
        C210078Mh c210078Mh = this.LJLJJL;
        if (c210078Mh != null) {
            f = c210078Mh.LIZJ;
        } else {
            f = this.LJLJI;
        }
        this.LJLJJI = f;
        LIZJ(0);
        removeAllViews();
        LIZ(i);
        for (int i3 = 0; i3 < i; i3++) {
            addView(LIZIZ());
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        super.setOrientation(0);
    }

    public final void setProgressBarConfig(C210078Mh c210078Mh) {
        this.LJLJJL = c210078Mh;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LIZ(getChildCount());
        int i3 = this.LJLJL;
        if (i3 < 0) {
            i3 = 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int i4 = this.LJLJLJ;
        if (i4 < 0) {
            i4 = 0;
        }
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.LJLJJLL) {
            this.LJLJJLL = false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C210118Ml(android.content.Context r2, android.util.AttributeSet r3, int r4) {
        /*
            r1 = this;
            r0 = r4 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            java.lang.String r0 = "ctx"
            defpackage.a1.LJFF(r2, r0)
            r0 = 0
            r1.<init>(r2, r3, r0)
            android.content.Context r0 = r1.getContext()
            r1.LJLIL = r0
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            r1.LJLJI = r0
            r1.LJLJJI = r0
            r0 = 1
            r1.LJLJJLL = r0
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1.LJLJLLL = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C210118Ml.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZLLL(float f, int i, long j) {
        if (this.LJLILLLLZI != i) {
            LIZJ(i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                View childAt = getChildAt(i2);
                if (childAt instanceof C210128Mm) {
                    ((C210128Mm) childAt).LIZIZ(1.0f, false);
                }
            }
            int childCount = getChildCount();
            for (int i3 = i + 1; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2 instanceof C210128Mm) {
                    ((C210128Mm) childAt2).LIZIZ(0.0f, false);
                }
            }
            if (i >= 0 && i < getChildCount()) {
                View childAt3 = getChildAt(i);
                if (childAt3 instanceof C210128Mm) {
                    C210128Mm c210128Mm = (C210128Mm) childAt3;
                    c210128Mm.setAnimationInterval(j);
                    c210128Mm.LIZIZ(f, true);
                }
            }
        }
        this.LJLILLLLZI = i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        if (C26338AVi.LIZLLL(this)) {
            int childCount = getChildCount();
            while (i5 < childCount) {
                View childAt = getChildAt(i5);
                int width = getWidth() - ((O6R.LJJIIZ(this.LJLJJI) + childAt.getWidth()) * i5);
                childAt.layout(width - childAt.getWidth(), childAt.getTop(), width, childAt.getBottom());
                i5++;
            }
            return;
        }
        int childCount2 = getChildCount();
        while (i5 < childCount2) {
            View childAt2 = getChildAt(i5);
            int LJJIIZ = (O6R.LJJIIZ(this.LJLJJI) + childAt2.getWidth()) * i5;
            childAt2.layout(LJJIIZ, childAt2.getTop(), childAt2.getWidth() + LJJIIZ, childAt2.getBottom());
            i5++;
        }
    }
}
