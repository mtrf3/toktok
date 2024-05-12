package X;

import Y.AUListenerS100S0100000_13;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

@C0C0
/* renamed from: X.VlE, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80664VlE extends HorizontalScrollView {
    public static final C43051mX LLIIIL = new C43051mX(16);
    public static final C30901Je LLIIIZ = new C30901Je();
    public static final int[] LLIIJI = {R.attr.a4r};
    public final ArrayList<C76956UIe> LJLIL;
    public C76956UIe LJLILLLLZI;
    public final C80665VlF LJLJI;
    public int LJLJJI;
    public final int LJLJJL;
    public final int LJLJJLL;
    public final int LJLJL;
    public final int LJLJLJ;
    public ColorStateList LJLJLLL;
    public final int LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public int LJLLLLLL;
    public int LJLZ;
    public boolean LJZ;
    public InterfaceC77393UYz LJZI;
    public final ArrayList<InterfaceC77393UYz> LJZL;
    public C76957UIf LL;
    public ValueAnimator LLD;
    public ViewPager LLF;
    public PagerAdapter LLFF;
    public C80668VlI LLFFF;
    public C80666VlG LLFII;
    public C80667VlH LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public final C1UB LLIIIILZ;
    public final int LLIIIJ;

    public void setIndicatorDrawProxy(InterfaceC80669VlJ interfaceC80669VlJ) {
    }

    public void setOnTabClickListener(InterfaceC80670VlK interfaceC80670VlK) {
    }

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C76956UIe c76956UIe = (C76956UIe) ListProtector.get(this.LJLIL, i);
            if (c76956UIe != null && c76956UIe.LIZIZ != null && !TextUtils.isEmpty(c76956UIe.LIZJ)) {
                return 72;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.LJLLILLLL;
        if (i != -1) {
            return i;
        }
        if (this.LJLZ == 0) {
            return this.LJLLL;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LJLJI.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJFF() {
        int i;
        if (this.LJLZ == 0) {
            i = Math.max(0, this.LJLLLL - this.LJLJJL);
        } else {
            i = 0;
        }
        C16310kV.LJIIJ(this.LJLJI, i, 0, 0, 0);
        int i2 = this.LJLZ;
        if (i2 != 0) {
            if (i2 == 1) {
                this.LJLJI.setGravity(1);
            }
        } else {
            this.LJLJI.setGravity(8388611);
        }
        LJIJ(true);
    }

    public final void LJIIIIZZ() {
        if (this.LLD == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLD = valueAnimator;
            valueAnimator.setInterpolator(LLIIIZ);
            this.LLD.setDuration(300L);
            this.LLD.addUpdateListener(new AUListenerS100S0100000_13(this, 50));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C76956UIe LJIIJ() {
        C80663VlD c80663VlD;
        C76956UIe c76956UIe = (C76956UIe) LLIIIL.LIZIZ();
        if (c76956UIe == null) {
            c76956UIe = new C76956UIe();
        }
        c76956UIe.LJI = this;
        C1UB c1ub = this.LLIIIILZ;
        if (c1ub == null || (c80663VlD = (C80663VlD) c1ub.LIZIZ()) == null) {
            c80663VlD = new C80663VlD(this, getContext());
        }
        c80663VlD.setTab(c76956UIe);
        c80663VlD.setFocusable(true);
        c80663VlD.setMinimumWidth(getTabMinWidth());
        c76956UIe.LJII = c80663VlD;
        return c76956UIe;
    }

    public final void LJIIJJI() {
        int currentItem;
        if (!this.LLIFFJFJJ) {
            return;
        }
        LJIIL();
        PagerAdapter pagerAdapter = this.LLFF;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C76956UIe LJIIJ = LJIIJ();
                LJIIJ.LIZJ = this.LLFF.LJIILIIL(i);
                C80663VlD c80663VlD = LJIIJ.LJII;
                if (c80663VlD != null) {
                    c80663VlD.LIZ();
                }
                LIZJ(LJIIJ, this.LJLIL.size(), false);
            }
            ViewPager viewPager = this.LLF;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILIIL(LJIIIZ(currentItem), true, false);
            }
        }
    }

    public final void LJIIL() {
        for (int childCount = this.LJLJI.getChildCount() - 1; childCount >= 0; childCount--) {
            C80663VlD c80663VlD = (C80663VlD) this.LJLJI.getChildAt(childCount);
            C80665VlF c80665VlF = this.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c80665VlF.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c80665VlF.removeViewAt(childCount);
            if (c80663VlD != null) {
                c80663VlD.setTab(null);
                c80663VlD.setSelected(false);
                this.LLIIIILZ.LIZ(c80663VlD);
            }
            requestLayout();
        }
        Iterator<C76956UIe> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C76956UIe next = it.next();
            it.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            LLIIIL.LIZ(next);
        }
        this.LJLILLLLZI = null;
    }

    public int getSelectedTabPosition() {
        C76956UIe c76956UIe = this.LJLILLLLZI;
        if (c76956UIe != null) {
            return c76956UIe.LIZLLL;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LJLIL.size();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLF == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIILLIIL((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLI) {
            setupWithViewPager(null);
            this.LLI = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public C76956UIe getCurSelectedTab() {
        return this.LJLILLLLZI;
    }

    public int getTabGravity() {
        return this.LJLLLLLL;
    }

    public int getTabMaxWidth() {
        return this.LJLLI;
    }

    public int getTabMode() {
        return this.LJLZ;
    }

    public ColorStateList getTabTextColors() {
        return this.LJLJLLL;
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.LJLJI.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.LJLJI.getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
            }
        }
    }

    public final void LIZIZ(InterfaceC77393UYz interfaceC77393UYz) {
        if (!this.LJZL.contains(interfaceC77393UYz)) {
            this.LJZL.add(interfaceC77393UYz);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C80671VlL) {
            C76956UIe LJIIJ = LJIIJ();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                view.getContentDescription();
                C80663VlD c80663VlD = LJIIJ.LJII;
                if (c80663VlD != null) {
                    c80663VlD.LIZ();
                }
            }
            LIZJ(LJIIJ, this.LJLIL.size(), this.LJLIL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C80665VlF c80665VlF = this.LJLJI;
            int childCount = c80665VlF.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c80665VlF.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LJI = LJI(i, 0.0f);
            if (scrollX != LJI) {
                LJIIIIZZ();
                this.LLD.setIntValues(scrollX, LJI);
                this.LLD.start();
            }
            this.LJLJI.LIZ(i, 300);
            return;
        }
        LJIILL(i, 0.0f, true, true);
    }

    public final int LJII(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C76956UIe LJIIIZ(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C76956UIe) ListProtector.get(this.LJLIL, i);
    }

    public final void LJIIZILJ(LinearLayout.LayoutParams layoutParams) {
        if (this.LJLZ == 1 && this.LJLLLLLL == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.LJLJJI;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = i;
        }
    }

    public final void LJIJ(boolean z) {
        for (int i = 0; i < this.LJLJI.getChildCount(); i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIIZILJ((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LIZLLL(view);
    }

    public void setAutoFillWhenScrollable(boolean z) {
        this.LJZ = z;
    }

    public void setDefaultAddTab(boolean z) {
        this.LLIFFJFJJ = z;
    }

    public void setFixedIndicatorWidth(int i) {
        this.LJLJI.LJLJJL = i;
    }

    public void setHideIndicatorView(boolean z) {
        this.LLII = z;
    }

    public void setOnTabSelectedListener(InterfaceC77393UYz interfaceC77393UYz) {
        InterfaceC77393UYz interfaceC77393UYz2 = this.LJZI;
        if (interfaceC77393UYz2 != null) {
            this.LJZL.remove(interfaceC77393UYz2);
        }
        this.LJZI = interfaceC77393UYz;
        if (interfaceC77393UYz != null) {
            LIZIZ(interfaceC77393UYz);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIIZZ();
        this.LLD.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C80665VlF c80665VlF = this.LJLJI;
        if (c80665VlF.LJLILLLLZI.getColor() != i) {
            c80665VlF.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c80665VlF);
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C80665VlF c80665VlF = this.LJLJI;
        c80665VlF.getClass();
        if (f >= 0.0f) {
            if (c80665VlF.LJLJLLL != f || c80665VlF.LJLL != f) {
                c80665VlF.LJLJLLL = f;
                c80665VlF.LJLL = f;
                C16300kU.LJIIJ(c80665VlF);
            }
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C80665VlF c80665VlF = this.LJLJI;
        if (c80665VlF.LJLIL != i) {
            c80665VlF.LJLIL = i;
            C16300kU.LJIIJ(c80665VlF);
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.LLIIII = z;
    }

    public void setTabGravity(int i) {
        if (this.LJLLLLLL != i) {
            this.LJLLLLLL = i;
            LJFF();
        }
    }

    public void setTabMargin(int i) {
        this.LJLJJI = LJII(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJII(i);
            marginLayoutParams.rightMargin = LJII(i);
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i) {
        if (i != this.LJLZ) {
            this.LJLZ = i;
            LJFF();
        }
    }

    public void setTabStripLeftPadding(int i) {
        C80665VlF c80665VlF = this.LJLJI;
        c80665VlF.setPadding(i, c80665VlF.getPaddingTop(), this.LJLJI.getPaddingRight(), this.LJLJI.getPaddingBottom());
    }

    public void setTabStripRightPadding(int i) {
        C80665VlF c80665VlF = this.LJLJI;
        c80665VlF.setPadding(c80665VlF.getPaddingLeft(), this.LJLJI.getPaddingTop(), i, this.LJLJI.getPaddingBottom());
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LJLJLLL != colorStateList) {
            this.LJLJLLL = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                C80663VlD c80663VlD = ((C76956UIe) ListProtector.get(this.LJLIL, i)).LJII;
                if (c80663VlD != null) {
                    c80663VlD.LIZ();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILJJIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILLIIL(viewPager, true, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C80664VlE(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList<>();
        this.LJLLI = Integer.MAX_VALUE;
        this.LJZL = new ArrayList<>();
        this.LLIFFJFJJ = true;
        this.LLIIII = true;
        this.LLIIIILZ = new C1UB(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(LLIIJI);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C80665VlF c80665VlF = new C80665VlF(this, context);
            this.LJLJI = c80665VlF;
            super.addView(c80665VlF, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, 0, R.style.y_);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(11, 0);
            if (c80665VlF.LJLIL != dimensionPixelSize) {
                c80665VlF.LJLIL = dimensionPixelSize;
                C16300kU.LJIIJ(c80665VlF);
            }
            int color = obtainStyledAttributes2.getColor(8, 0);
            if (c80665VlF.LJLILLLLZI.getColor() != color) {
                c80665VlF.LJLILLLLZI.setColor(color);
                C16300kU.LJIIJ(c80665VlF);
            }
            int dimensionPixelSize2 = obtainStyledAttributes2.getDimensionPixelSize(16, 0);
            this.LJLJLJ = dimensionPixelSize2;
            this.LJLJL = dimensionPixelSize2;
            this.LJLJJLL = dimensionPixelSize2;
            this.LJLJJL = dimensionPixelSize2;
            this.LJLJJL = obtainStyledAttributes2.getDimensionPixelSize(19, dimensionPixelSize2);
            this.LJLJJLL = obtainStyledAttributes2.getDimensionPixelSize(20, dimensionPixelSize2);
            this.LJLJL = obtainStyledAttributes2.getDimensionPixelSize(18, dimensionPixelSize2);
            this.LJLJLJ = obtainStyledAttributes2.getDimensionPixelSize(17, dimensionPixelSize2);
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(obtainStyledAttributes2.getResourceId(23, R.style.nv), new int[]{android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.ae9, R.attr.aei, R.attr.bhl, R.attr.bih});
            try {
                obtainStyledAttributes3.getDimensionPixelSize(0, 0);
                this.LJLJLLL = obtainStyledAttributes3.getColorStateList(3);
                obtainStyledAttributes3.recycle();
                if (obtainStyledAttributes2.hasValue(24)) {
                    this.LJLJLLL = obtainStyledAttributes2.getColorStateList(24);
                }
                if (obtainStyledAttributes2.hasValue(22)) {
                    this.LJLJLLL = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{obtainStyledAttributes2.getColor(22, 0), this.LJLJLLL.getDefaultColor()});
                }
                this.LJLLILLLL = obtainStyledAttributes2.getDimensionPixelSize(14, -1);
                this.LJLLJ = obtainStyledAttributes2.getDimensionPixelSize(13, -1);
                this.LJLL = obtainStyledAttributes2.getResourceId(0, 0);
                this.LJLLLL = obtainStyledAttributes2.getDimensionPixelSize(1, 0);
                this.LJLZ = obtainStyledAttributes2.getInt(15, 1);
                this.LJLLLLLL = obtainStyledAttributes2.getInt(2, 0);
                obtainStyledAttributes2.recycle();
                Resources resources = getResources();
                resources.getDimensionPixelSize(R.dimen.mz);
                this.LJLLL = resources.getDimensionPixelSize(R.dimen.mx);
                B9K.LIZ(getContext(), 1.5f);
                B9K.LIZ(getContext(), 1.5f);
                this.LLIIIJ = getResources().getConfiguration().orientation;
                LJFF();
                return;
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    public final int LJI(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.LJLZ != 0) {
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
        }
        int left = ((i2 / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i5 = (int) (((this.LJLJJI * 4) + i2 + i3) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        C80668VlI c80668VlI;
        PagerAdapter pagerAdapter2 = this.LLFF;
        if (pagerAdapter2 != null && (c80668VlI = this.LLFFF) != null) {
            pagerAdapter2.LJJII(c80668VlI);
        }
        this.LLFF = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLFFF == null) {
                this.LLFFF = new C80668VlI(this);
            }
            pagerAdapter.LJIJ(this.LLFFF);
        }
        LJIIJJI();
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZLLL(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + LJII(getDefaultHeight());
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(paddingBottom, View.MeasureSpec.getSize(i2)), 1073741824);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.LJLLJ;
            if (i3 <= 0) {
                i3 = size - LJII(56);
            }
            this.LJLLI = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.LJLZ;
            if (i4 != 0) {
                if (i4 != 1 || childAt.getMeasuredWidth() == getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LIZJ(C76956UIe c76956UIe, int i, boolean z) {
        if (c76956UIe.LJI == this) {
            c76956UIe.LIZLLL = i;
            ListProtector.add(this.LJLIL, i, c76956UIe);
            int size = this.LJLIL.size();
            while (true) {
                i++;
                if (i >= size) {
                    break;
                } else {
                    ((C76956UIe) ListProtector.get(this.LJLIL, i)).LIZLLL = i;
                }
            }
            C80663VlD c80663VlD = c76956UIe.LJII;
            C80665VlF c80665VlF = this.LJLJI;
            int i2 = c76956UIe.LIZLLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIIZILJ(layoutParams);
            c80665VlF.addView(c80663VlD, i2, layoutParams);
            if (z) {
                C80664VlE c80664VlE = c76956UIe.LJI;
                if (c80664VlE != null) {
                    c80664VlE.LJIILIIL(c76956UIe, true, false);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void LJIILIIL(C76956UIe c76956UIe, boolean z, boolean z2) {
        int i;
        C76956UIe c76956UIe2 = this.LJLILLLLZI;
        if (c76956UIe2 == c76956UIe) {
            if (c76956UIe2 != null) {
                for (int size = this.LJZL.size() - 1; size >= 0; size--) {
                    ((InterfaceC77393UYz) ListProtector.get(this.LJZL, size)).LIZ();
                }
                LJ(c76956UIe.LIZLLL);
                return;
            }
            return;
        }
        if (c76956UIe != null) {
            i = c76956UIe.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c76956UIe2 == null || c76956UIe2.LIZLLL == -1) && i != -1) {
                LJIILL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c76956UIe2 != null) {
            for (int size2 = this.LJZL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC77393UYz) ListProtector.get(this.LJZL, size2)).LIZIZ(c76956UIe2);
            }
        }
        this.LJLILLLLZI = c76956UIe;
        if (c76956UIe != null) {
            for (int size3 = this.LJZL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC77393UYz) ListProtector.get(this.LJZL, size3)).LIZJ(c76956UIe);
            }
        }
    }

    public final void LJIILLIIL(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.LLF;
        if (viewPager2 != null) {
            C80666VlG c80666VlG = this.LLFII;
            if (c80666VlG != null) {
                viewPager2.removeOnPageChangeListener(c80666VlG);
            }
            C80667VlH c80667VlH = this.LLFZ;
            if (c80667VlH != null) {
                this.LLF.removeOnAdapterChangeListener(c80667VlH);
            }
        }
        C76957UIf c76957UIf = this.LL;
        if (c76957UIf != null) {
            this.LJZL.remove(c76957UIf);
            this.LL = null;
        }
        if (viewPager != null) {
            this.LLF = viewPager;
            if (this.LLFII == null) {
                this.LLFII = new C80666VlG(this);
            }
            C80666VlG c80666VlG2 = this.LLFII;
            c80666VlG2.LJLJI = 0;
            c80666VlG2.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c80666VlG2);
            C76957UIf c76957UIf2 = new C76957UIf(viewPager);
            this.LL = c76957UIf2;
            LIZIZ(c76957UIf2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILJJIL(adapter, z);
            }
            if (this.LLFZ == null) {
                this.LLFZ = new C80667VlH(this);
            }
            C80667VlH c80667VlH2 = this.LLFZ;
            c80667VlH2.LJLIL = z;
            viewPager.addOnAdapterChangeListener(c80667VlH2);
            LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLF = null;
            LJIILJJIL(null, false);
        }
        this.LLI = z2;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LJIILL(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C80665VlF c80665VlF = this.LJLJI;
            ValueAnimator valueAnimator = c80665VlF.LJLLI;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c80665VlF.LJLLI.cancel();
            }
            c80665VlF.LJLJI = i;
            c80665VlF.LJLJJI = f;
            c80665VlF.LIZIZ();
        }
        ValueAnimator valueAnimator2 = this.LLD;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LLD.cancel();
        }
        scrollTo(LJI(i, f), 0);
        if (!z) {
            return;
        }
        setSelectedTabView(round);
    }

    @Override // android.view.View
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 80, i8, z);
    }
}
