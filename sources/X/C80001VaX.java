package X;

import Y.ALAdapterS5S0110000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import defpackage.a1;
import kotlin.jvm.internal.o;

/* renamed from: X.VaX, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80001VaX extends LinearLayout implements C1V0 {
    public boolean LJLIL;
    public int LJLILLLLZI;
    public InterfaceC65784Pro<C76800UCe> LJLJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJI;
    public InterfaceC88472Yns<? super ViewGroup, C76800UCe> LJLJJL;
    public boolean LJLJJLL;
    public final C16690l7 LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public int LJLL;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View target, float f, float f2, boolean z) {
        o.LJIIIZ(target, "target");
        return false;
    }

    public final void LIZ() {
        if (!this.LJLJJLL) {
            return;
        }
        if (C26338AVi.LIZLLL(this)) {
            if (getScrollX() > (-this.LJLILLLLZI)) {
                return;
            }
        } else if (getScrollX() < this.LJLILLLLZI) {
            return;
        }
        this.LJLJJLL = false;
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJI;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        if (!this.LJLIL) {
            return super.computeHorizontalScrollRange();
        }
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            i += getChildAt(i2).getWidth();
        }
        return i;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C16690l7 c16690l7 = this.LJLJL;
        return c16690l7.LIZIZ | c16690l7.LIZ;
    }

    public final double LIZIZ() {
        if (!C26338AVi.LIZLLL(this)) {
            return Math.max(0.05d, 1 - Math.pow(getScrollX() / this.LJLJLJ, 0.9d));
        }
        return Math.max(0.05d, 1 - Math.pow((-getScrollX()) / this.LJLJLJ, 0.9d));
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() == 2) {
            if (getChildAt(0) instanceof InterfaceC33971Uz) {
                View childAt = getChildAt(0);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                layoutParams.width = -1;
                childAt.setLayoutParams(layoutParams);
                return;
            }
            throw new IllegalArgumentException("first child must be an instance of NestedScrollingChild2");
        }
        throw new IllegalArgumentException("ScrollToOpenLayout must have two child");
    }

    public final boolean getEnable() {
        return this.LJLIL;
    }

    public final int getMinScrollThreshold() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88472Yns<ViewGroup, C76800UCe> getOnNestedScrollAcceptedListener() {
        return this.LJLJJL;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnScrollThresholdHitListener() {
        return this.LJLJJI;
    }

    public final InterfaceC65784Pro<C76800UCe> getOnScrollToEndListener() {
        return this.LJLJI;
    }

    public final void LIZJ(float f) {
        if (f < 0.0f) {
            return;
        }
        if (!C26338AVi.LIZLLL(this)) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, (int) (this.LJLJLJ * 0.66d * f), 0);
            ofInt.setDuration(600 * f);
            ofInt.setInterpolator(new LinearInterpolator());
            ofInt.addUpdateListener(new AUListenerS101S0100000_14(this, 4));
            ofInt.start();
            return;
        }
        ValueAnimator ofInt2 = ValueAnimator.ofInt(0, (int) (this.LJLJLJ * 0.66d * f), 0);
        ofInt2.setDuration(600 * f);
        ofInt2.setInterpolator(new LinearInterpolator());
        ofInt2.addUpdateListener(new AUListenerS101S0100000_14(this, 5));
        ofInt2.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.LJLJJLL = true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void setEnable(boolean z) {
        this.LJLIL = z;
    }

    public final void setMinScrollThreshold(int i) {
        this.LJLILLLLZI = i;
    }

    public final void setOnNestedScrollAcceptedListener(InterfaceC88472Yns<? super ViewGroup, C76800UCe> interfaceC88472Yns) {
        this.LJLJJL = interfaceC88472Yns;
    }

    public final void setOnScrollThresholdHitListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJJI = interfaceC65784Pro;
    }

    public final void setOnScrollToEndListener(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLJI = interfaceC65784Pro;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80001VaX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLIL = true;
        this.LJLILLLLZI = C7MY.LIZIZ(80);
        this.LJLJJLL = true;
        this.LJLJL = new C16690l7();
        setOrientation(0);
    }

    @Override // X.C1V0
    public final void LJIILJJIL(int i, View target) {
        boolean z;
        boolean z2;
        o.LJIIIZ(target, "target");
        this.LJLJL.LIZIZ(i);
        if (i == 0) {
            if (!C26338AVi.LIZLLL(this)) {
                if (getScrollX() <= 0) {
                    return;
                }
                if (getScrollX() >= this.LJLILLLLZI) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ValueAnimator ofInt = ValueAnimator.ofInt(getScrollX(), 0);
                ofInt.setDuration((long) ((getScrollX() / this.LJLJLJ) * 200));
                ofInt.addUpdateListener(new AUListenerS101S0100000_14(this, 40));
                ofInt.addListener(new ALAdapterS5S0110000_14(this, z2, 2));
                ofInt.start();
                return;
            }
            if (getScrollX() >= 0) {
                return;
            }
            if (getScrollX() <= (-this.LJLILLLLZI)) {
                z = true;
            } else {
                z = false;
            }
            ValueAnimator ofInt2 = ValueAnimator.ofInt(-getScrollX(), 0);
            ofInt2.setDuration((long) (((-getScrollX()) / this.LJLJLJ) * 200));
            ofInt2.addUpdateListener(new AUListenerS101S0100000_14(this, 41));
            ofInt2.addListener(new ALAdapterS5S0110000_14(this, z, 3));
            ofInt2.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LJLJLJ = getChildAt(1).getMeasuredWidth();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View target, float f, float f2) {
        o.LJIIIZ(target, "target");
        if (!this.LJLIL) {
            return false;
        }
        OverScroller overScroller = new OverScroller(target.getContext());
        overScroller.fling(0, 0, (int) f, (int) f2, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE, LiveLayoutPreloadThreadPriority.DEFAULT, Integer.MAX_VALUE);
        this.LJLJLLL = overScroller.getFinalX();
        this.LJLL = 0;
        return false;
    }

    @Override // X.C1V0
    public final void LJIILL(View child, View target, int i, int i2) {
        InterfaceC88472Yns<? super ViewGroup, C76800UCe> interfaceC88472Yns;
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        if (this.LJLIL && C26338AVi.LIZLLL(this) && (interfaceC88472Yns = this.LJLJJL) != null) {
            interfaceC88472Yns.invoke(this);
        }
        this.LJLJL.LIZ(i, i2);
    }

    @Override // X.C1V0
    public final boolean LJJLIIJ(View child, View target, int i, int i2) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        if ((!this.LJLIL && C48054ItW.LIZ()) || i != 1) {
            return false;
        }
        return true;
    }

    @Override // X.C1V0
    public final void LJJIIJ(View target, int i, int i2, int[] iArr, int i3) {
        o.LJIIIZ(target, "target");
        if (this.LJLIL && i3 == 0) {
            if (!C26338AVi.LIZLLL(this)) {
                if (i < 0 && getScrollX() > 0) {
                    scrollBy(Math.max((int) (i * LIZIZ()), -getScrollX()), 0);
                    iArr[0] = i;
                    return;
                }
                return;
            }
            if (i <= 0 || getScrollX() >= 0) {
                return;
            }
            scrollBy(Math.min((int) (i * LIZIZ()), -getScrollX()), 0);
            iArr[0] = i;
        }
    }

    @Override // X.C1V0
    public final void LJJ(View target, int i, int i2, int i3, int i4, int i5) {
        o.LJIIIZ(target, "target");
        if (!this.LJLIL) {
            return;
        }
        if (!C26338AVi.LIZLLL(this)) {
            if (i5 == 0) {
                LIZ();
                if (i3 > 0) {
                    requestDisallowInterceptTouchEvent(true);
                    scrollBy(Math.min((int) (i3 * LIZIZ()), this.LJLJLJ - getScrollX()), 0);
                    return;
                }
                return;
            }
            if (i <= 0) {
                return;
            }
            LIZ();
            int i6 = this.LJLL + i;
            this.LJLL = i6;
            if (i3 <= 0) {
                return;
            }
            int i7 = this.LJLJLLL - i6;
            float applyDimension = TypedValue.applyDimension(1, 800.0f, getContext().getResources().getDisplayMetrics());
            LIZJ(Math.min(i7, applyDimension) / applyDimension);
            return;
        }
        if (i5 == 0) {
            LIZ();
            if (i3 >= 0) {
                return;
            }
            requestDisallowInterceptTouchEvent(true);
            scrollBy(Math.max((int) (i3 * LIZIZ()), (-this.LJLJLJ) - getScrollX()), 0);
            return;
        }
        if (i >= 0) {
            return;
        }
        LIZ();
        int i8 = this.LJLL - i;
        this.LJLL = i8;
        if (i3 >= 0) {
            return;
        }
        int i9 = i8 - this.LJLJLLL;
        float applyDimension2 = TypedValue.applyDimension(1, 800.0f, getContext().getResources().getDisplayMetrics());
        LIZJ(Math.min(i9, applyDimension2) / applyDimension2);
    }
}
