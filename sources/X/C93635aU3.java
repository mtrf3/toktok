package X;

import Y.IDUListenerS265S0100000_42;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
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
/* renamed from: X.aU3, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93635aU3 extends HorizontalScrollView {
    public static final C43051mX LLIIIZ = new C43051mX(16);
    public final ArrayList<C93633aU1> LJLIL;
    public C93633aU1 LJLILLLLZI;
    public final C93632aU0 LJLJI;
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
    public InterfaceC93628aTw LJZI;
    public final ArrayList<InterfaceC93628aTw> LJZL;
    public C94168ace LL;
    public ValueAnimator LLD;
    public ViewPager LLF;
    public PagerAdapter LLFF;
    public DataSetObserver LLFFF;
    public C94167acd LLFII;
    public C94166acc LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public final C1UB LLIIIJ;
    public final int LLIIIL;

    public void setIndicatorDrawProxy(InterfaceC93626aTu interfaceC93626aTu) {
    }

    public void setOnTabClickListener(InterfaceC93627aTv interfaceC93627aTv) {
    }

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C93633aU1 c93633aU1 = (C93633aU1) ListProtector.get(this.LJLIL, i);
            if (c93633aU1 != null && c93633aU1.LIZ != null && !TextUtils.isEmpty(c93633aU1.LIZIZ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LJLJI + this.LJLJI.LJLJJI;
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
            valueAnimator.setInterpolator(C93830aXC.LIZ);
            this.LLD.setDuration(300L);
            this.LLD.addUpdateListener(new IDUListenerS265S0100000_42(this, 4));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C93633aU1 LJIIJ() {
        C93634aU2 c93634aU2;
        C93633aU1 c93633aU1 = (C93633aU1) LLIIIZ.LIZIZ();
        if (c93633aU1 == null) {
            c93633aU1 = new C93633aU1();
        }
        c93633aU1.LJFF = this;
        C1UB c1ub = this.LLIIIJ;
        if (c1ub == null || (c93634aU2 = (C93634aU2) c1ub.LIZIZ()) == null) {
            c93634aU2 = new C93634aU2(this, getContext());
        }
        c93634aU2.setTab(c93633aU1);
        c93634aU2.setFocusable(true);
        c93634aU2.setMinimumWidth(getTabMinWidth());
        c93633aU1.LJI = c93634aU2;
        return c93633aU1;
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
                C93633aU1 LJIIJ = LJIIJ();
                LJIIJ.LIZIZ = this.LLFF.LJIILIIL(i);
                C93634aU2 c93634aU2 = LJIIJ.LJI;
                if (c93634aU2 != null) {
                    c93634aU2.LIZ();
                }
                LIZJ(LJIIJ, false);
            }
            ViewPager viewPager = this.LLF;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILIIL(LJIIIZ(currentItem), true, false);
            }
        }
    }

    public final void LJIIL() {
        for (int childCount = this.LJLJI.getChildCount() - 1; childCount >= 0; childCount--) {
            C93634aU2 c93634aU2 = (C93634aU2) this.LJLJI.getChildAt(childCount);
            C93632aU0 c93632aU0 = this.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c93632aU0.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c93632aU0.removeViewAt(childCount);
            if (c93634aU2 != null) {
                c93634aU2.setTab(null);
                c93634aU2.setSelected(false);
                this.LLIIIJ.LIZ(c93634aU2);
            }
            requestLayout();
        }
        Iterator<C93633aU1> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C93633aU1 next = it.next();
            it.remove();
            next.LJFF = null;
            next.LJI = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = -1;
            next.LIZLLL = null;
            LLIIIZ.LIZ(next);
        }
        this.LJLILLLLZI = null;
    }

    public int getSelectedTabPosition() {
        C93633aU1 c93633aU1 = this.LJLILLLLZI;
        if (c93633aU1 != null) {
            return c93633aU1.LIZJ;
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
                LJIILLIIL((ViewPager) parent, true);
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

    public C93633aU1 getCurSelectedTab() {
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

    public void LIZIZ(InterfaceC93628aTw interfaceC93628aTw) {
        if (!this.LJZL.contains(interfaceC93628aTw)) {
            this.LJZL.add(interfaceC93628aTw);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C93831aXD) {
            C93633aU1 LJIIJ = LJIIJ();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                view.getContentDescription();
                C93634aU2 c93634aU2 = LJIIJ.LJI;
                if (c93634aU2 != null) {
                    c93634aU2.LIZ();
                }
            }
            LIZJ(LJIIJ, this.LJLIL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C93632aU0 c93632aU0 = this.LJLJI;
            int childCount = c93632aU0.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c93632aU0.getChildAt(i2).getWidth() > 0) {
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

    public final C93633aU1 LJIIIZ(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C93633aU1) ListProtector.get(this.LJLIL, i);
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

    public void setForceHideIndicatorView(boolean z) {
        this.LLIIII = z;
    }

    public void setHideIndicatorView(boolean z) {
        this.LLII = z;
    }

    public void setOnTabSelectedListener(InterfaceC93628aTw interfaceC93628aTw) {
        InterfaceC93628aTw interfaceC93628aTw2 = this.LJZI;
        if (interfaceC93628aTw2 != null) {
            this.LJZL.remove(interfaceC93628aTw2);
        }
        this.LJZI = interfaceC93628aTw;
        if (interfaceC93628aTw != null) {
            LIZIZ(interfaceC93628aTw);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIIZZ();
        this.LLD.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C93632aU0 c93632aU0 = this.LJLJI;
        if (c93632aU0.LJLILLLLZI.getColor() != i) {
            c93632aU0.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c93632aU0);
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C93632aU0 c93632aU0 = this.LJLJI;
        c93632aU0.getClass();
        if (f >= 0.0f) {
            if (c93632aU0.LJLJLLL != f || c93632aU0.LJLL != f) {
                c93632aU0.LJLJLLL = f;
                c93632aU0.LJLL = f;
                C16300kU.LJIIJ(c93632aU0);
            }
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C93632aU0 c93632aU0 = this.LJLJI;
        if (c93632aU0.LJLIL != i) {
            c93632aU0.LJLIL = i;
            C16300kU.LJIIJ(c93632aU0);
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.LLIIIILZ = z;
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

    public void setTabStripLeftMargin(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.LJLJI.getLayoutParams();
        layoutParams.leftMargin = i;
        this.LJLJI.setLayoutParams(layoutParams);
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LJLJLLL != colorStateList) {
            this.LJLJLLL = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                C93634aU2 c93634aU2 = ((C93633aU1) ListProtector.get(this.LJLIL, i)).LJI;
                if (c93634aU2 != null) {
                    c93634aU2.LIZ();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILJJIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILLIIL(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C93635aU3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList<>();
        this.LJLLI = Integer.MAX_VALUE;
        this.LJZL = new ArrayList<>();
        this.LLIFFJFJJ = true;
        this.LLIIIILZ = true;
        this.LLIIIJ = new C1UB(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C93832aXE.LIZ);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C93632aU0 c93632aU0 = new C93632aU0(this, context);
            this.LJLJI = c93632aU0;
            super.addView(c93632aU0, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, 0, R.style.y_);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(11, 0);
            if (c93632aU0.LJLIL != dimensionPixelSize) {
                c93632aU0.LJLIL = dimensionPixelSize;
                C16300kU.LJIIJ(c93632aU0);
            }
            int color = obtainStyledAttributes2.getColor(8, 0);
            if (c93632aU0.LJLILLLLZI.getColor() != color) {
                c93632aU0.LJLILLLLZI.setColor(color);
                C16300kU.LJIIJ(c93632aU0);
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
                KL2.LIZJ(getContext(), 1.5f);
                KL2.LIZJ(getContext(), 1.5f);
                this.LLIIIL = getResources().getConfiguration().orientation;
                LJFF();
                return;
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    public final void LIZJ(C93633aU1 c93633aU1, boolean z) {
        int size = this.LJLIL.size();
        if (c93633aU1.LJFF == this) {
            c93633aU1.LIZJ = size;
            ListProtector.add(this.LJLIL, size, c93633aU1);
            int size2 = this.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C93633aU1) ListProtector.get(this.LJLIL, size)).LIZJ = size;
                }
            }
            C93634aU2 c93634aU2 = c93633aU1.LJI;
            C93632aU0 c93632aU0 = this.LJLJI;
            int i = c93633aU1.LIZJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIIZILJ(layoutParams);
            c93632aU0.addView(c93634aU2, i, layoutParams);
            if (z) {
                C93635aU3 c93635aU3 = c93633aU1.LJFF;
                if (c93635aU3 != null) {
                    c93635aU3.LJIILIIL(c93633aU1, true, false);
                    return;
                }
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
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
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) ((i2 + i3 + (this.LJLJJI * 4)) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.LLFF;
        if (pagerAdapter2 != null && (dataSetObserver = this.LLFFF) != null) {
            pagerAdapter2.LJJII(dataSetObserver);
        }
        this.LLFF = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLFFF == null) {
                this.LLFFF = new C93629aTx(this);
            }
            pagerAdapter.LJIJ(this.LLFFF);
        }
        LJIIJJI();
    }

    public final void LJIILLIIL(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLF;
        if (viewPager2 != null) {
            C94167acd c94167acd = this.LLFII;
            if (c94167acd != null) {
                viewPager2.removeOnPageChangeListener(c94167acd);
            }
            C94166acc c94166acc = this.LLFZ;
            if (c94166acc != null) {
                this.LLF.removeOnAdapterChangeListener(c94166acc);
            }
        }
        C94168ace c94168ace = this.LL;
        if (c94168ace != null) {
            this.LJZL.remove(c94168ace);
            this.LL = null;
        }
        if (viewPager != null) {
            this.LLF = viewPager;
            if (this.LLFII == null) {
                this.LLFII = new C94167acd(this);
            }
            C94167acd c94167acd2 = this.LLFII;
            c94167acd2.LJLJI = 0;
            c94167acd2.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c94167acd2);
            C94168ace c94168ace2 = new C94168ace(viewPager);
            this.LL = c94168ace2;
            LIZIZ(c94168ace2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILJJIL(adapter, true);
            }
            if (this.LLFZ == null) {
                this.LLFZ = new C94166acc(this);
            }
            C94166acc c94166acc2 = this.LLFZ;
            c94166acc2.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c94166acc2);
            LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLF = null;
            LJIILJJIL(null, false);
        }
        this.LLI = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZLLL(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int LJII = LJII(getDefaultHeight()) + getPaddingTop() + getPaddingBottom();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(LJII, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(LJII, View.MeasureSpec.getSize(i2)), 1073741824);
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
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LJIILIIL(C93633aU1 c93633aU1, boolean z, boolean z2) {
        int i;
        C93633aU1 c93633aU12 = this.LJLILLLLZI;
        if (c93633aU12 == c93633aU1) {
            if (c93633aU12 != null) {
                for (int size = this.LJZL.size() - 1; size >= 0; size--) {
                    ((InterfaceC93628aTw) ListProtector.get(this.LJZL, size)).LIZ(c93633aU1);
                }
                LJ(c93633aU1.LIZJ);
                return;
            }
            return;
        }
        if (c93633aU1 != null) {
            i = c93633aU1.LIZJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c93633aU12 == null || c93633aU12.LIZJ == -1) && i != -1) {
                LJIILL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c93633aU12 != null) {
            for (int size2 = this.LJZL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC93628aTw) ListProtector.get(this.LJZL, size2)).LIZJ(c93633aU12);
            }
        }
        this.LJLILLLLZI = c93633aU1;
        if (c93633aU1 != null) {
            for (int size3 = this.LJZL.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC93628aTw) ListProtector.get(this.LJZL, size3)).LIZIZ(c93633aU1, z2);
            }
        }
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
            C93632aU0 c93632aU0 = this.LJLJI;
            ValueAnimator valueAnimator = c93632aU0.LJLLI;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c93632aU0.LJLLI.cancel();
            }
            c93632aU0.LJLJI = i;
            c93632aU0.LJLJJI = f;
            c93632aU0.LIZIZ();
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
