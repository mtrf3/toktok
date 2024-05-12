package X;

import Y.AUListenerS99S0100000_12;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;
import o3.IDaS470S0100000_12;
import o3.h0;

/* renamed from: X.T4n, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74053T4n extends HorizontalScrollView {
    public static final C43051mX LLFZ = new C43051mX(16);
    public final C74051T4l LJLIL;
    public final C74047T4h LJLILLLLZI;
    public ColorStateList LJLJI;
    public final int LJLJJI;
    public int LJLJJL;
    public final ArrayList<KEI> LJLJJLL;
    public KEI LJLJL;
    public int LJLJLJ;
    public boolean LJLJLLL;
    public Drawable LJLL;
    public final int LJLLI;
    public boolean LJLLILLLL;
    public final ArrayList<InterfaceC74055T4p> LJLLJ;
    public C56445MDh LJLLL;
    public ValueAnimator LJLLLL;
    public ViewPager LJLLLLLL;
    public PagerAdapter LJLZ;
    public final C62822Ol8 LJZ;
    public final C62822Ol8 LJZI;
    public final C62822Ol8 LJZL;
    public boolean LL;
    public boolean LLD;
    public final C1UB LLF;
    public boolean LLFF;
    public final String LLFFF;
    public final IDaS470S0100000_12 LLFII;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C74053T4n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
        o.LJIIIZ(context, "context");
    }

    public final void setupWithViewPager(ViewPager viewPager) {
        LJIILJJIL(this, viewPager);
    }

    private final C74054T4o getAdapterChangeListener() {
        return (C74054T4o) this.LJZL.getValue();
    }

    private final K97 getPageChangeListener() {
        return (K97) this.LJZI.getValue();
    }

    private final C74056T4q getPagerAdapterObserver() {
        return (C74056T4q) this.LJZ.getValue();
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.LJLIL.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJFF() {
        if (this.LJLLLL == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            valueAnimator.setDuration(this.LJLLI);
            valueAnimator.addUpdateListener(new AUListenerS99S0100000_12(this, 4));
            this.LJLLLL = valueAnimator;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final KEI LJII() {
        KEI kei = (KEI) LLFZ.LIZIZ();
        if (kei == null) {
            kei = new KEI();
        }
        kei.LJ = this;
        C74045T4f c74045T4f = (C74045T4f) this.LLF.LIZIZ();
        if (c74045T4f == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            c74045T4f = new C74045T4f(this, context);
        }
        c74045T4f.setTab(kei);
        c74045T4f.setFocusable(true);
        if (TextUtils.isEmpty(null)) {
            c74045T4f.setContentDescription(kei.LIZJ);
        } else {
            c74045T4f.setContentDescription(null);
        }
        h0.LJIJI(c74045T4f, this.LLFII);
        kei.LJFF = c74045T4f;
        return kei;
    }

    public final void LJIIIZ() {
        for (int childCount = this.LJLIL.getChildCount() - 1; -1 < childCount; childCount--) {
            LJIIJ(childCount);
        }
        Iterator<KEI> it = this.LJLJJLL.iterator();
        o.LJIIIIZZ(it, "tabs.iterator()");
        while (it.hasNext()) {
            KEI next = it.next();
            it.remove();
            next.LJ = null;
            next.LJFF = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            LLFZ.LIZ(next);
        }
        this.LJLJL = null;
    }

    public final void LJIILLIIL() {
        int childCount = this.LJLIL.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.LJLIL.getChildAt(i);
            o.LJIIIIZZ(childAt, "slidingTabIndicator.getChildAt(i)");
            childAt.requestLayout();
        }
    }

    public final int getSelectedTabPosition() {
        KEI kei = this.LJLJL;
        if (kei != null) {
            return kei.LIZLLL;
        }
        return -1;
    }

    public final int getTabCount() {
        return this.LJLJJLL.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ() {
        int currentItem;
        LJIIIZ();
        PagerAdapter pagerAdapter = this.LJLZ;
        if (pagerAdapter == 0) {
            return;
        }
        int count = pagerAdapter.getCount();
        int i = this.LJLJLJ;
        if (i == 1) {
            if (pagerAdapter instanceof InterfaceC74057T4r) {
                for (int i2 = 0; i2 < count; i2++) {
                    KEI LJII = LJII();
                    LJII.LIZIZ = Integer.valueOf(((InterfaceC74057T4r) pagerAdapter).LIZ());
                    C74053T4n c74053T4n = LJII.LJ;
                    if (c74053T4n != null) {
                        c74053T4n.LJIILLIIL();
                    }
                    C74045T4f c74045T4f = LJII.LJFF;
                    if (c74045T4f != null) {
                        c74045T4f.LIZ();
                    }
                    LIZJ(this, LJII, 0, false, 2);
                }
            }
        } else if (i == 0) {
            for (int i3 = 0; i3 < count; i3++) {
                KEI LJII2 = LJII();
                LJII2.LIZIZ(pagerAdapter.LJIILIIL(i3));
                LIZJ(this, LJII2, 0, false, 2);
            }
        }
        ViewPager viewPager = this.LJLLLLLL;
        if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
            LJIIJJI(LJI(currentItem), true);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getLeftFadingEdgeStrength() {
        if ((C26338AVi.LIZLLL(this) && this.LLD) || (!C26338AVi.LIZLLL(this) && this.LL)) {
            return super.getLeftFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public float getRightFadingEdgeStrength() {
        if ((C26338AVi.LIZLLL(this) && this.LL) || (!C26338AVi.LIZLLL(this) && this.LLD)) {
            return super.getRightFadingEdgeStrength();
        }
        return 0.0f;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public final boolean getHasEndFadingEdge() {
        return this.LLD;
    }

    public final boolean getHasStartFadingEdge() {
        return this.LL;
    }

    public final Drawable getTabSelectedIndicator() {
        return this.LJLL;
    }

    public final ViewPager getViewPager() {
        return this.LJLLLLLL;
    }

    private final void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LJLIL.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LJLIL.getChildAt(i2);
                o.LJIIIIZZ(childAt, "slidingTabIndicator.getChildAt(i)");
                boolean z2 = true;
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (i2 != i) {
                    z2 = false;
                }
                childAt.setActivated(z2);
            }
        }
    }

    private final void setTabIndicatorFullWidth(boolean z) {
        this.LJLLILLLL = z;
        this.LJLIL.LIZ();
        C16300kU.LJIIJ(this.LJLIL);
    }

    public final void LIZ(InterfaceC74055T4p interfaceC74055T4p) {
        if (!this.LJLLJ.contains(interfaceC74055T4p)) {
            this.LJLLJ.add(interfaceC74055T4p);
        }
    }

    public final void LIZLLL(int i) {
        ValueAnimator valueAnimator;
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C74051T4l c74051T4l = this.LJLIL;
            int childCount = c74051T4l.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c74051T4l.getChildAt(i2);
                o.LJIIIIZZ(childAt, "getChildAt(i)");
                if (childAt.getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LJ = LJ(i, 0.0f);
            if (scrollX != LJ) {
                LJFF();
                ValueAnimator valueAnimator2 = this.LJLLLL;
                if (valueAnimator2 != null) {
                    valueAnimator2.setIntValues(scrollX, LJ);
                }
                ValueAnimator valueAnimator3 = this.LJLLLL;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
            C74051T4l c74051T4l2 = this.LJLIL;
            int i3 = this.LJLLI;
            ValueAnimator valueAnimator4 = c74051T4l2.LJLIL;
            if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = c74051T4l2.LJLIL) != null) {
                valueAnimator.cancel();
            }
            c74051T4l2.LIZJ(true, i, i3);
            return;
        }
        LJIILIIL(i, 0.0f, true, true);
    }

    public final KEI LJI(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (KEI) ListProtector.get(this.LJLJJLL, i);
    }

    public final void LJIIJ(int i) {
        View childAt = this.LJLIL.getChildAt(i);
        o.LJII(childAt, "null cannot be cast to non-null type com.bytedance.tux.tab.TuxTabBar.TabView");
        C74045T4f c74045T4f = (C74045T4f) childAt;
        C74051T4l c74051T4l = this.LJLIL;
        try {
            if (C78996UzQ.LJJIIJZLJL(c74051T4l.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        c74051T4l.removeViewAt(i);
        c74045T4f.setTab(null);
        c74045T4f.setSelected(false);
        this.LLF.LIZ(c74045T4f);
        this.LLFF = true;
        requestLayout();
    }

    public final void LJIILL(int i) {
        TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), i).obtainStyledAttributes(null, new int[]{R.attr.re, R.attr.rf, R.attr.rg, R.attr.rh, R.attr.ri, R.attr.rj, R.attr.btw, R.attr.btx, R.attr.bty, R.attr.btz, R.attr.bu0}, R.attr.ko, 0);
        o.LJIIIIZZ(obtainStyledAttributes, "ContextThemeWrapper(cont…xTabBarStyle, 0\n        )");
        int color = obtainStyledAttributes.getColor(0, 0);
        int color2 = obtainStyledAttributes.getColor(1, 0);
        int color3 = obtainStyledAttributes.getColor(3, 0);
        int color4 = obtainStyledAttributes.getColor(5, 0);
        this.LJLJJL = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLJI = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{color4, C07290Qj.LJIIL(color3, (int) (C78897Uxp.LJJI(context) * Color.alpha(color3))), color3});
        setBackgroundColor(color);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(2));
        c110614Vt.LIZ = Integer.valueOf(color2);
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "context");
        this.LJLL = c110614Vt.LIZ(context2);
        this.LJLIL.setSelectedIndicatorHeight(O6R.LJJIIZ(C32151Nz.LJIIZILJ(2)));
        int childCount = this.LJLIL.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.LJLIL.getChildAt(i2);
            o.LJIIIIZZ(childAt, "slidingTabIndicator.getChildAt(i)");
            if (childAt instanceof C74045T4f) {
                ((C74045T4f) childAt).LIZ();
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) {
        o.LJIIIZ(attrs, "attrs");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        o.LJIIIIZZ(generateDefaultLayoutParams, "generateDefaultLayoutParams()");
        return generateDefaultLayoutParams;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.LLFF = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        o.LJIIIZ(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        new C17760mq(info).LJIILLIIL(C17730mn.LIZ(1, getTabCount(), 1));
    }

    public final void setHasEndFadingEdge(boolean z) {
        this.LLD = z;
        invalidate();
    }

    public final void setHasStartFadingEdge(boolean z) {
        this.LL = z;
        invalidate();
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJFF();
        ValueAnimator valueAnimator = this.LJLLLL;
        if (valueAnimator != null) {
            valueAnimator.addListener(animatorListener);
        }
    }

    public final void setTabSelectedIndicator(Drawable drawable) {
        o.LJIIIZ(drawable, "<set-?>");
        this.LJLL = drawable;
    }

    public final void setTabVariant(int i) {
        boolean z;
        this.LJLJLJ = i;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        setTabIndicatorFullWidth(z);
        requestLayout();
        invalidate();
    }

    public final void setViewPager(ViewPager viewPager) {
        this.LJLLLLLL = viewPager;
    }

    public static void LJIILJJIL(C74053T4n c74053T4n, ViewPager viewPager) {
        ViewPager viewPager2 = c74053T4n.LJLLLLLL;
        if (viewPager2 != null) {
            viewPager2.removeOnPageChangeListener(c74053T4n.getPageChangeListener());
            viewPager2.removeOnAdapterChangeListener(c74053T4n.getAdapterChangeListener());
        }
        C56445MDh c56445MDh = c74053T4n.LJLLL;
        if (c56445MDh != null) {
            c74053T4n.LJLLJ.remove(c56445MDh);
            c74053T4n.LJLLL = null;
        }
        if (viewPager != null) {
            c74053T4n.LJLLLLLL = viewPager;
            K97 pageChangeListener = c74053T4n.getPageChangeListener();
            pageChangeListener.LJLJI = 0;
            pageChangeListener.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c74053T4n.getPageChangeListener());
            C56445MDh c56445MDh2 = new C56445MDh(viewPager);
            c74053T4n.LJLLL = c56445MDh2;
            c74053T4n.LIZ(c56445MDh2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                c74053T4n.LJIIL(adapter, true);
            }
            c74053T4n.getAdapterChangeListener().LJLIL = true;
            viewPager.addOnAdapterChangeListener(c74053T4n.getAdapterChangeListener());
            c74053T4n.LJIILIIL(viewPager.getCurrentItem(), 0.0f, true, true);
            return;
        }
        c74053T4n.LJLLLLLL = null;
        c74053T4n.LJIIL(null, false);
    }

    public final int LJ(int i, float f) {
        View view;
        View childAt = this.LJLIL.getChildAt(i);
        int i2 = 0;
        if (childAt == null) {
            return 0;
        }
        int i3 = i + 1;
        if (i3 < this.LJLIL.getChildCount()) {
            view = this.LJLIL.getChildAt(i3);
        } else {
            view = null;
        }
        int width = childAt.getWidth();
        if (view != null) {
            i2 = view.getWidth();
        }
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + i2) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i4;
        }
        return left - i4;
    }

    public final void LJIIJJI(KEI kei, boolean z) {
        int i;
        int size;
        int size2;
        KEI kei2 = this.LJLJL;
        if (kei2 == kei) {
            if (kei2 != null && kei != null) {
                int size3 = this.LJLLJ.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i2 = size3 - 1;
                        InterfaceC74055T4p interfaceC74055T4p = (InterfaceC74055T4p) ListProtector.get(this.LJLLJ, size3);
                        if (interfaceC74055T4p != null) {
                            interfaceC74055T4p.LIZJ(kei);
                        }
                        if (i2 < 0) {
                            break;
                        } else {
                            size3 = i2;
                        }
                    }
                }
                LIZLLL(kei.LIZLLL);
                return;
            }
            return;
        }
        if (kei != null) {
            i = kei.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((kei2 == null || kei2.LIZLLL == -1) && i != -1) {
                LJIILIIL(i, 0.0f, true, true);
            } else {
                LIZLLL(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.LJLJL = kei;
        if (kei2 != null && this.LJLLJ.size() - 1 >= 0) {
            while (true) {
                int i3 = size2 - 1;
                InterfaceC74055T4p interfaceC74055T4p2 = (InterfaceC74055T4p) ListProtector.get(this.LJLLJ, size2);
                if (interfaceC74055T4p2 != null) {
                    interfaceC74055T4p2.LIZIZ(kei2);
                }
                if (i3 < 0) {
                    break;
                } else {
                    size2 = i3;
                }
            }
        }
        if (kei == null || this.LJLLJ.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i4 = size - 1;
            InterfaceC74055T4p interfaceC74055T4p3 = (InterfaceC74055T4p) ListProtector.get(this.LJLLJ, size);
            if (interfaceC74055T4p3 != null) {
                interfaceC74055T4p3.LIZ(kei);
            }
            if (i4 < 0) {
                return;
            } else {
                size = i4;
            }
        }
    }

    public final void LJIIL(PagerAdapter pagerAdapter, boolean z) {
        PagerAdapter pagerAdapter2 = this.LJLZ;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJII(getPagerAdapterObserver());
        }
        this.LJLZ = pagerAdapter;
        if (z && pagerAdapter != null) {
            pagerAdapter.LJIJ(getPagerAdapterObserver());
        }
        LJIIIIZZ();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LIZIZ = C7MY.LIZIZ(40);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + LIZIZ, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= LIZIZ) {
            getChildAt(0).setMinimumHeight(LIZIZ);
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            o.LJIIIIZZ(childAt, "getChildAt(0)");
            if (childAt.getMeasuredWidth() < getMeasuredWidth()) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
            }
        }
        if (this.LJLJLJ == 1) {
            View childAt2 = getChildAt(0);
            o.LJIIIIZZ(childAt2, "getChildAt(0)");
            if (childAt2.getMeasuredWidth() >= getMeasuredWidth() - (O6R.LJJIIZ(C32151Nz.LJIIZILJ(16)) * 2)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), i2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C74053T4n(android.content.Context r22, android.util.AttributeSet r23, int r24) {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74053T4n.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void LIZIZ(KEI kei, int i, boolean z) {
        if (kei.LJ == this) {
            this.LLFF = true;
            kei.LIZLLL = i;
            ListProtector.add(this.LJLJJLL, i, kei);
            int size = this.LJLJJLL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((KEI) ListProtector.get(this.LJLJJLL, i)).LIZLLL = i;
                }
            }
            C74045T4f c74045T4f = kei.LJFF;
            if (c74045T4f != null) {
                c74045T4f.setSelected(false);
                c74045T4f.setActivated(false);
                C74051T4l c74051T4l = this.LJLIL;
                int i2 = kei.LIZLLL;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                layoutParams.weight = 0.0f;
                c74051T4l.addView(c74045T4f, i2, layoutParams);
            }
            if (z) {
                kei.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void LJIILIIL(int i, float f, boolean z, boolean z2) {
        int LJ;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        int LJJIIZ = O6R.LJJIIZ(i + f);
        if (LJJIIZ < 0 || LJJIIZ >= this.LJLIL.getChildCount()) {
            return;
        }
        if (z2) {
            C74051T4l c74051T4l = this.LJLIL;
            ValueAnimator valueAnimator3 = c74051T4l.LJLIL;
            if (valueAnimator3 != null && valueAnimator3.isRunning() && (valueAnimator2 = c74051T4l.LJLIL) != null) {
                valueAnimator2.cancel();
            }
            c74051T4l.LJLILLLLZI = i;
            c74051T4l.LJLJI = f;
            c74051T4l.LIZIZ(c74051T4l.getChildAt(i), c74051T4l.getChildAt(c74051T4l.LJLILLLLZI + 1), c74051T4l.LJLJI);
        }
        ValueAnimator valueAnimator4 = this.LJLLLL;
        if (valueAnimator4 != null && valueAnimator4.isRunning() && (valueAnimator = this.LJLLLL) != null) {
            valueAnimator.cancel();
        }
        if (i < 0) {
            LJ = 0;
        } else {
            LJ = LJ(i, f);
        }
        scrollTo(LJ, 0);
        if (!z) {
            return;
        }
        setSelectedTabView(LJJIIZ);
    }

    public static /* synthetic */ void LIZJ(C74053T4n c74053T4n, KEI kei, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = c74053T4n.LJLJJLL.size();
        }
        if ((i2 & 4) != 0) {
            z = c74053T4n.LJLJJLL.isEmpty();
        }
        c74053T4n.LIZIZ(kei, i, z);
    }
}
