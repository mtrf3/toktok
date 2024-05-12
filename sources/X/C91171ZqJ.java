package X;

import Y.IDUListenerS264S0100000_29;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@C0C0
/* renamed from: X.ZqJ, reason: case insensitive filesystem */
/* loaded from: classes22.dex */
public final class C91171ZqJ extends HorizontalScrollView {
    public static final C30901Je LLF = new C30901Je();
    public static final C43051mX LLFF = new C43051mX(16);
    public final ArrayList<C91169ZqH> LJLIL;
    public C91169ZqH LJLILLLLZI;
    public final C91372ZtY LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public final int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public final ArrayList<InterfaceC91162ZqA> LJLLI;
    public ValueAnimator LJLLILLLL;
    public C91373ZtZ LJLLJ;
    public boolean LJLLL;
    public float LJLLLL;
    public final int LJLLLLLL;
    public InterfaceC91161Zq9 LJLZ;
    public final C1UB LJZ;
    public boolean LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child) {
        o.LJIIIZ(child, "child");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child, int i) {
        o.LJIIIZ(child, "child");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View child, int i, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View child, ViewGroup.LayoutParams params) {
        o.LJIIIZ(child, "child");
        o.LJIIIZ(params, "params");
    }

    private final int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(this.LJLIL, i);
            o.LJIIIIZZ(obj, "mTabs[i]");
            View view = ((C91169ZqH) obj).LIZIZ;
            if (view != null && view.getHeight() > 58) {
                return 58;
            }
        }
        return 48;
    }

    private final int getTabMinWidth() {
        int i = this.LJLJJLL;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    private final int getTabScrollRange() {
        int width = ((this.LJLJI.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight();
        if (width > 0) {
            return width;
        }
        return 0;
    }

    public final void LIZIZ() {
        C16310kV.LJIIJ(this.LJLJI, 0, 0, 0, 0);
        int i = this.LJLJLLL;
        if (i != 0) {
            if (i == 1) {
                this.LJLJI.setGravity(1);
            }
        } else {
            this.LJLJI.setGravity(8388611);
        }
        LJIIIZ(true);
    }

    public final void LJ() {
        if (this.LJLLILLLL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LJLLILLLL = valueAnimator;
            valueAnimator.setInterpolator(LLF);
            ValueAnimator valueAnimator2 = this.LJLLILLLL;
            o.LJI(valueAnimator2);
            valueAnimator2.setDuration(200L);
            ValueAnimator valueAnimator3 = this.LJLLILLLL;
            o.LJI(valueAnimator3);
            valueAnimator3.addUpdateListener(new IDUListenerS264S0100000_29(this, 8));
        }
    }

    public final int getSelectedTabPosition() {
        C91169ZqH c91169ZqH = this.LJLILLLLZI;
        if (c91169ZqH != null) {
            o.LJI(c91169ZqH);
            return c91169ZqH.LIZ;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LJLIL.size();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public final boolean getEnableAnimation() {
        return this.LJZL;
    }

    public final int getMMode() {
        return this.LJLJLLL;
    }

    public final C91373ZtZ getMPageChangeListener() {
        return this.LJLLJ;
    }

    public final int getMTabBackgroundResId() {
        return this.LJLJJI;
    }

    public final int getMTabGravity() {
        return this.LJLJLJ;
    }

    public final boolean getRepeatAnim() {
        return this.LJZI;
    }

    public final boolean getSwipeMode() {
        return this.LL;
    }

    public final int getTabMode() {
        return this.LJLJLLL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C91171ZqJ(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        this.LJLIL = new ArrayList<>();
        this.LJLJJL = Integer.MAX_VALUE;
        this.LJLLI = new ArrayList<>();
        this.LJZ = new C1UB(12);
        this.LJZI = true;
        this.LJZL = true;
        setHorizontalScrollBarEnabled(false);
        C91372ZtY c91372ZtY = new C91372ZtY(this, context);
        this.LJLJI = c91372ZtY;
        super.addView(c91372ZtY, 0, new FrameLayout.LayoutParams(-2, -1));
        c91372ZtY.setSelectedIndicatorHeight(0);
        c91372ZtY.setSelectedIndicatorColor(0);
        this.LJLJJLL = -1;
        this.LJLJL = -1;
        this.LJLJJI = 0;
        this.LJLJLLL = 1;
        this.LJLJLJ = 0;
        KL2.LIZJ(getContext(), 1.5f);
        KL2.LIZJ(getContext(), 1.5f);
        this.LJLLLLLL = getResources().getConfiguration().orientation;
        LIZIZ();
    }

    private final void setSelectedTabView(int i) {
        int intValue;
        boolean z;
        int childCount = this.LJLJI.getChildCount();
        if (this.LLD) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.cl, context);
            if (LJI != null) {
                intValue = LJI.intValue();
            }
            intValue = 0;
        } else if (i == 0) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.do, context2);
            if (LJI2 != null) {
                intValue = LJI2.intValue();
            }
            intValue = 0;
        } else {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI3 = C79045V0n.LJI(R.attr.cl, context3);
            if (LJI3 != null) {
                intValue = LJI3.intValue();
            }
            intValue = 0;
        }
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LJLJI.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (childAt instanceof C91170ZqI) {
                    C91170ZqI c91170ZqI = (C91170ZqI) childAt;
                    TextView mCustomTextView$music_dsp_release = c91170ZqI.getMCustomTextView$music_dsp_release();
                    if (mCustomTextView$music_dsp_release != null) {
                        mCustomTextView$music_dsp_release.setTextColor(intValue);
                    }
                    if (c91170ZqI.isSelected()) {
                        if (mCustomTextView$music_dsp_release != null) {
                            mCustomTextView$music_dsp_release.setAlpha(1.0f);
                        }
                    } else if (mCustomTextView$music_dsp_release != null) {
                        mCustomTextView$music_dsp_release.setAlpha(this.LJLJI.LLD);
                    }
                }
            }
        }
    }

    private final void setTabMinWidth(int i) {
        this.LJLJJLL = i;
    }

    public final void LIZ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C91372ZtY c91372ZtY = this.LJLJI;
            int childCount = c91372ZtY.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c91372ZtY.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LIZJ = LIZJ(i, 0.0f);
            if (scrollX != LIZJ) {
                LJ();
                ValueAnimator valueAnimator = this.LJLLILLLL;
                o.LJI(valueAnimator);
                valueAnimator.setIntValues(scrollX, LIZJ);
                ValueAnimator valueAnimator2 = this.LJLLILLLL;
                o.LJI(valueAnimator2);
                valueAnimator2.start();
            }
            this.LJLJI.LIZ(i, 200);
            return;
        }
        LJIIIIZZ(i, 0.0f, true, true);
    }

    public final int LIZLLL(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C91169ZqH LJFF(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C91169ZqH) ListProtector.get(this.LJLIL, i);
    }

    public final void LJIIIZ(boolean z) {
        int childCount = this.LJLJI.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            if (this.LJLJLLL == 1 && this.LJLJLJ == 0) {
                layoutParams2.width = 0;
                layoutParams2.weight = 1.0f;
            } else {
                layoutParams2.width = -2;
                layoutParams2.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        if (computeHorizontalScrollRange() - computeHorizontalScrollExtent() == 0) {
            return false;
        }
        if (i < 0) {
            if (computeHorizontalScrollOffset - this.LJLLLL <= 0.0f) {
                return false;
            }
        } else if (computeHorizontalScrollOffset + this.LJLLLL >= r4 - 1) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        o.LJIIIIZZ(generateDefaultLayoutParams, "generateDefaultLayoutParams()");
        return generateDefaultLayoutParams;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.LJLLL && super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setAutoFillWhenScrollable(boolean z) {
        this.LJLL = z;
    }

    public final void setEnableAnimation(boolean z) {
        this.LJZL = z;
    }

    public final void setMMode(int i) {
        this.LJLJLLL = i;
    }

    public final void setMPageChangeListener(C91373ZtZ c91373ZtZ) {
        this.LJLLJ = c91373ZtZ;
    }

    public final void setMTabBackgroundResId(int i) {
        this.LJLJJI = i;
    }

    public final void setMTabGravity(int i) {
        this.LJLJLJ = i;
    }

    public final void setOnTabClickListener(InterfaceC91161Zq9 interfaceC91161Zq9) {
        this.LJLZ = interfaceC91161Zq9;
    }

    public final void setOverBorderOffset(float f) {
        this.LJLLLL = f;
    }

    public final void setOverBorderTransparentWidth(float f) {
        this.LJLJI.setOverBorderWidth(f);
    }

    public final void setRepeatAnim(boolean z) {
        this.LJZI = z;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJ();
        ValueAnimator valueAnimator = this.LJLLILLLL;
        o.LJI(valueAnimator);
        valueAnimator.addListener(animatorListener);
    }

    public final void setSelectedTabIndicatorColor(int i) {
        this.LJLJI.setSelectedIndicatorColor(i);
    }

    public final void setSelectedTabIndicatorHeight(int i) {
        this.LJLJI.setSelectedIndicatorHeight(i);
    }

    public final void setSwipeMode(boolean z) {
        this.LL = z;
    }

    public final void setTabBarrierColor(int i) {
        int intValue;
        L41.LIZ.getClass();
        if (L41.LIZJ()) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(R.attr.dn, context);
            if (LJI != null) {
                intValue = LJI.intValue();
            }
            intValue = 0;
        } else if (i == 0) {
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            Integer LJI2 = C79045V0n.LJI(R.attr.dv, context2);
            if (LJI2 != null) {
                intValue = LJI2.intValue();
            }
            intValue = 0;
        } else {
            Context context3 = getContext();
            o.LJIIIIZZ(context3, "context");
            Integer LJI3 = C79045V0n.LJI(R.attr.dn, context3);
            if (LJI3 != null) {
                intValue = LJI3.intValue();
            }
            intValue = 0;
        }
        this.LJLJI.setTabBarrierColor(intValue);
    }

    public final void setTabMode(int i) {
        if (i != this.LJLJLLL) {
            this.LJLJLLL = i;
            LIZIZ();
        }
    }

    public final void setTabStripMargin(float f) {
        this.LJLJI.setTabStripMargin(f);
    }

    public final void setTouchable(boolean z) {
        this.LJLLL = z;
    }

    public final void setXTabStyle(boolean z) {
        this.LLD = z;
    }

    public final int LIZJ(int i, float f) {
        View view;
        int i2;
        int i3;
        if (this.LJLJLLL != 0) {
            return 0;
        }
        View childAt = this.LJLJI.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.LJLJI.getChildCount()) {
            view = this.LJLJI.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        } else {
            i3 = 0;
        }
        o.LJI(childAt);
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) ((i2 + i3) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C91169ZqH LJI(View view, String tag) {
        o.LJIIIZ(tag, "tag");
        C91169ZqH c91169ZqH = (C91169ZqH) LLFF.LIZIZ();
        if (c91169ZqH == null) {
            c91169ZqH = new C91169ZqH();
        }
        c91169ZqH.LIZJ = this;
        c91169ZqH.LJ = tag;
        C91170ZqI c91170ZqI = (C91170ZqI) this.LJZ.LIZIZ();
        if (c91170ZqI == null) {
            c91170ZqI = new C91170ZqI(this, getContext());
        }
        c91170ZqI.setFocusable(true);
        c91170ZqI.setMinimumWidth(getTabMinWidth());
        c91169ZqH.LIZLLL = c91170ZqI;
        if (!o.LJ(c91169ZqH, c91170ZqI.LJLIL)) {
            c91170ZqI.LJLIL = c91169ZqH;
        }
        c91169ZqH.LIZIZ = view;
        C91170ZqI c91170ZqI2 = c91169ZqH.LIZLLL;
        if (c91170ZqI2 != null) {
            c91170ZqI2.LIZ();
        }
        return c91169ZqH;
    }

    public final void LJII(C91169ZqH c91169ZqH, boolean z) {
        int i;
        int size;
        int size2;
        C91169ZqH c91169ZqH2 = this.LJLILLLLZI;
        if (o.LJ(c91169ZqH2, c91169ZqH)) {
            if (c91169ZqH2 != null) {
                o.LJI(c91169ZqH);
                int size3 = this.LJLLI.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        ((InterfaceC91162ZqA) ListProtector.get(this.LJLLI, size3)).LIZ();
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LIZ(c91169ZqH.LIZ);
                return;
            }
            return;
        }
        if (c91169ZqH != null) {
            i = c91169ZqH.LIZ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c91169ZqH2 == null || c91169ZqH2.LIZ == -1) && i != -1) {
                LJIIIIZZ(i, 0.0f, true, true);
            } else {
                LIZ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c91169ZqH2 != null && this.LJLLI.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                ((InterfaceC91162ZqA) ListProtector.get(this.LJLLI, size2)).LIZIZ(c91169ZqH2);
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        this.LJLILLLLZI = c91169ZqH;
        if (c91169ZqH == null || this.LJLLI.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            ((InterfaceC91162ZqA) ListProtector.get(this.LJLLI, size)).LIZJ(c91169ZqH);
            if (i4 < 0) {
                return;
            } else {
                size = i4;
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZLLL = LIZLLL(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(LIZLLL, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(LIZLLL, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.LJLJL;
            if (i3 <= 0) {
                i3 = size - LIZLLL(56);
            }
            this.LJLJJL = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.LJLJLLL;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    public final void LJIIIIZZ(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C91372ZtY c91372ZtY = this.LJLJI;
            ValueAnimator valueAnimator = c91372ZtY.LJLLI;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = c91372ZtY.LJLLI;
                o.LJI(valueAnimator2);
                valueAnimator2.cancel();
            }
            c91372ZtY.LJLJJLL = i;
            c91372ZtY.LJLJL = f;
            c91372ZtY.LIZIZ();
        }
        ValueAnimator valueAnimator3 = this.LJLLILLLL;
        if (valueAnimator3 != null) {
            o.LJI(valueAnimator3);
            if (valueAnimator3.isRunning()) {
                ValueAnimator valueAnimator4 = this.LJLLILLLL;
                o.LJI(valueAnimator4);
                valueAnimator4.cancel();
            }
        }
        scrollTo(LIZJ(i, f), 0);
        if (!z) {
            return;
        }
        setSelectedTabView(round);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        C91372ZtY c91372ZtY = this.LJLJI;
        if (c91372ZtY.LL.LJLLL && i3 > 0 && c91372ZtY.LJLJJI > 0.0f) {
            C16300kU.LJIIJ(c91372ZtY);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 10, i8, z);
    }
}
