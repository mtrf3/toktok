package X;

import Y.AUListenerS101S0100000_14;
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
/* renamed from: X.Vlj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80695Vlj extends HorizontalScrollView {
    public static final C43051mX LLIIJI = new C43051mX(16);
    public final ArrayList<C164456cr> LJLIL;
    public C164456cr LJLILLLLZI;
    public final C80696Vlk LJLJI;
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
    public InterfaceC80707Vlv LJZI;
    public final ArrayList<InterfaceC80707Vlv> LJZL;
    public C80706Vlu LL;
    public ValueAnimator LLD;
    public ViewPager LLF;
    public PagerAdapter LLFF;
    public C80708Vlw LLFFF;
    public C80697Vll LLFII;
    public C80704Vls LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public boolean LLII;
    public boolean LLIIII;
    public boolean LLIIIILZ;
    public InterfaceC80692Vlg LLIIIJ;
    public final C1UB LLIIIL;
    public final int LLIIIZ;

    public void setIndicatorDrawProxy(InterfaceC80710Vly interfaceC80710Vly) {
    }

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C164456cr c164456cr = (C164456cr) ListProtector.get(this.LJLIL, i);
            if (c164456cr != null && c164456cr.LIZ != null && !TextUtils.isEmpty(c164456cr.LIZIZ)) {
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

    public final void LJI() {
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
        LJJ(true);
    }

    public final void LJIIJ() {
        if (this.LLD == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLD = valueAnimator;
            valueAnimator.setInterpolator(C80238VeM.LIZ);
            this.LLD.setDuration(300L);
            this.LLD.addUpdateListener(new AUListenerS101S0100000_14(this, 22));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C164456cr LJIIL() {
        C80686Vla c80686Vla;
        C164456cr c164456cr = (C164456cr) LLIIJI.LIZIZ();
        if (c164456cr == null) {
            c164456cr = new C164456cr();
        }
        c164456cr.LJFF = this;
        C1UB c1ub = this.LLIIIL;
        if (c1ub == null || (c80686Vla = (C80686Vla) c1ub.LIZIZ()) == null) {
            c80686Vla = new C80686Vla(this, getContext());
        }
        c80686Vla.setTab(c164456cr);
        c80686Vla.setFocusable(true);
        c80686Vla.setMinimumWidth(getTabMinWidth());
        c164456cr.LJI = c80686Vla;
        return c164456cr;
    }

    public final void LJIILIIL() {
        int currentItem;
        if (!this.LLIFFJFJJ) {
            return;
        }
        LJIILJJIL();
        PagerAdapter pagerAdapter = this.LLFF;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C164456cr LJIIL = LJIIL();
                LJIIL.LIZIZ = this.LLFF.LJIILIIL(i);
                LJIIL.LIZIZ();
                LIZLLL(LJIIL, false);
            }
            ViewPager viewPager = this.LLF;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILLIIL(LJIIJJI(currentItem));
            }
        }
    }

    public final void LJIILJJIL() {
        for (int childCount = this.LJLJI.getChildCount() - 1; childCount >= 0; childCount--) {
            LJIILL(childCount);
        }
        Iterator<C164456cr> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C164456cr next = it.next();
            it.remove();
            next.LJFF = null;
            next.LJI = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = -1;
            next.LIZLLL = null;
            LLIIJI.LIZ(next);
        }
        this.LJLILLLLZI = null;
    }

    public int getSelectedTabPosition() {
        C164456cr c164456cr = this.LJLILLLLZI;
        if (c164456cr != null) {
            return c164456cr.LIZJ;
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
                LJIJJ((ViewPager) parent, true);
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

    public C164456cr getCurSelectedTab() {
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

    public void LIZIZ(InterfaceC80707Vlv interfaceC80707Vlv) {
        if (!this.LJZL.contains(interfaceC80707Vlv)) {
            this.LJZL.add(interfaceC80707Vlv);
        }
    }

    public final void LIZJ(C164456cr c164456cr) {
        LIZLLL(c164456cr, this.LJLIL.isEmpty());
    }

    public final void LJ(View view) {
        if (view instanceof C80712Vm0) {
            C164456cr LJIIL = LJIIL();
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                view.getContentDescription();
                LJIIL.LIZIZ();
            }
            LIZJ(LJIIL);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJFF(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C80696Vlk c80696Vlk = this.LJLJI;
            int childCount = c80696Vlk.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c80696Vlk.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LJII = LJII(i, 0.0f);
            if (scrollX != LJII) {
                LJIIJ();
                this.LLD.setIntValues(scrollX, LJII);
                this.LLD.start();
            }
            this.LJLJI.LIZ(i, 300);
            return;
        }
        LJIJI(i, 0.0f, true, true);
    }

    public final void LJIIIIZZ(C164456cr c164456cr) {
        for (int size = this.LJZL.size() - 1; size >= 0; size--) {
            ((InterfaceC80707Vlv) ListProtector.get(this.LJZL, size)).LIZ(c164456cr);
        }
    }

    public final int LJIIIZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C164456cr LJIIJJI(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C164456cr) ListProtector.get(this.LJLIL, i);
    }

    public final void LJIILL(int i) {
        C80686Vla c80686Vla = (C80686Vla) this.LJLJI.getChildAt(i);
        C80696Vlk c80696Vlk = this.LJLJI;
        try {
            if (C78996UzQ.LJJIIJZLJL(c80696Vlk.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        c80696Vlk.removeViewAt(i);
        if (c80686Vla != null) {
            c80686Vla.setTab(null);
            c80686Vla.setSelected(false);
            this.LLIIIL.LIZ(c80686Vla);
        }
        requestLayout();
    }

    public final void LJIILLIIL(C164456cr c164456cr) {
        LJIIZILJ(c164456cr, true, false);
    }

    public final void LJIJJLI(C164456cr c164456cr) {
        int i;
        C164456cr c164456cr2 = this.LJLILLLLZI;
        if (c164456cr2 == c164456cr) {
            if (c164456cr2 != null) {
                for (int size = this.LJZL.size() - 1; size >= 0; size--) {
                    ((InterfaceC80707Vlv) ListProtector.get(this.LJZL, size)).LIZIZ(c164456cr);
                }
                smoothScrollTo(LJII(c164456cr.LIZJ, 0.0f), 0);
                return;
            }
            return;
        }
        if (c164456cr != null) {
            i = c164456cr.LIZJ;
        } else {
            i = -1;
        }
        if ((c164456cr2 == null || c164456cr2.LIZJ == -1) && i != -1) {
            LJIJI(i, 0.0f, true, true);
        } else {
            LJFF(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        if (c164456cr2 != null) {
            LJIIIIZZ(c164456cr2);
        }
        this.LJLILLLLZI = c164456cr;
        if (c164456cr != null) {
            for (int size2 = this.LJZL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC80707Vlv) ListProtector.get(this.LJZL, size2)).LIZJ(c164456cr, false);
            }
        }
    }

    public final void LJIL(LinearLayout.LayoutParams layoutParams) {
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

    public final void LJJ(boolean z) {
        for (int i = 0; i < this.LJLJI.getChildCount(); i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIL((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        LJ(view);
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

    public void setOnTabClickListener(InterfaceC80692Vlg interfaceC80692Vlg) {
        this.LLIIIJ = interfaceC80692Vlg;
    }

    public void setOnTabSelectedListener(InterfaceC80707Vlv interfaceC80707Vlv) {
        InterfaceC80707Vlv interfaceC80707Vlv2 = this.LJZI;
        if (interfaceC80707Vlv2 != null) {
            this.LJZL.remove(interfaceC80707Vlv2);
        }
        this.LJZI = interfaceC80707Vlv;
        if (interfaceC80707Vlv != null) {
            LIZIZ(interfaceC80707Vlv);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIJ();
        this.LLD.addListener(animatorListener);
    }

    public void setSelectedTabIndicatorColor(int i) {
        C80696Vlk c80696Vlk = this.LJLJI;
        if (c80696Vlk.LJLILLLLZI.getColor() != i) {
            c80696Vlk.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c80696Vlk);
        }
    }

    public void setSelectedTabIndicatorCornerRadius(float f) {
        C80696Vlk c80696Vlk = this.LJLJI;
        c80696Vlk.getClass();
        if (f >= 0.0f) {
            if (c80696Vlk.LJLJLLL != f || c80696Vlk.LJLL != f) {
                c80696Vlk.LJLJLLL = f;
                c80696Vlk.LJLL = f;
                C16300kU.LJIIJ(c80696Vlk);
            }
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C80696Vlk c80696Vlk = this.LJLJI;
        if (c80696Vlk.LJLIL != i) {
            c80696Vlk.LJLIL = i;
            C16300kU.LJIIJ(c80696Vlk);
        }
    }

    public void setSupportCustomIndicator(boolean z) {
        this.LLIIIILZ = z;
    }

    public void setTabGravity(int i) {
        if (this.LJLLLLLL != i) {
            this.LJLLLLLL = i;
            LJI();
        }
    }

    public void setTabMargin(int i) {
        setTabMarginByPixel(LJIIIZ(i));
    }

    public void setTabMarginByPixel(int i) {
        this.LJLJJI = i;
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int i3 = this.LJLJJI;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i3;
            childAt.setLayoutParams(marginLayoutParams);
            childAt.invalidate();
        }
    }

    public void setTabMode(int i) {
        if (i != this.LJLZ) {
            this.LJLZ = i;
            LJI();
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
                ((C164456cr) ListProtector.get(this.LJLIL, i)).LIZIZ();
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIJ(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIJJ(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public C80695Vlj(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZLLL(C164456cr c164456cr, boolean z) {
        int size = this.LJLIL.size();
        if (c164456cr.LJFF == this) {
            c164456cr.LIZJ = size;
            ListProtector.add(this.LJLIL, size, c164456cr);
            int size2 = this.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C164456cr) ListProtector.get(this.LJLIL, size)).LIZJ = size;
                }
            }
            C80686Vla c80686Vla = c164456cr.LJI;
            C80696Vlk c80696Vlk = this.LJLJI;
            int i = c164456cr.LIZJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIL(layoutParams);
            c80696Vlk.addView(c80686Vla, i, layoutParams);
            if (z) {
                c164456cr.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJII(int i, float f) {
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

    public final void LJIJ(PagerAdapter pagerAdapter, boolean z) {
        C80708Vlw c80708Vlw;
        PagerAdapter pagerAdapter2 = this.LLFF;
        if (pagerAdapter2 != null && (c80708Vlw = this.LLFFF) != null) {
            pagerAdapter2.LJJII(c80708Vlw);
        }
        this.LLFF = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLFFF == null) {
                this.LLFFF = new C80708Vlw(this);
            }
            pagerAdapter.LJIJ(this.LLFFF);
        }
        LJIILIIL();
    }

    public final void LJIJJ(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLF;
        if (viewPager2 != null) {
            C80697Vll c80697Vll = this.LLFII;
            if (c80697Vll != null) {
                viewPager2.removeOnPageChangeListener(c80697Vll);
            }
            C80704Vls c80704Vls = this.LLFZ;
            if (c80704Vls != null) {
                this.LLF.removeOnAdapterChangeListener(c80704Vls);
            }
        }
        C80706Vlu c80706Vlu = this.LL;
        if (c80706Vlu != null) {
            this.LJZL.remove(c80706Vlu);
            this.LL = null;
        }
        if (viewPager != null) {
            this.LLF = viewPager;
            if (this.LLFII == null) {
                this.LLFII = new C80697Vll(this);
            }
            C80697Vll c80697Vll2 = this.LLFII;
            c80697Vll2.LJLJI = 0;
            c80697Vll2.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c80697Vll2);
            C80706Vlu c80706Vlu2 = new C80706Vlu(viewPager);
            this.LL = c80706Vlu2;
            LIZIZ(c80706Vlu2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIJ(adapter, true);
            }
            if (this.LLFZ == null) {
                this.LLFZ = new C80704Vls(this);
            }
            C80704Vls c80704Vls2 = this.LLFZ;
            c80704Vls2.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c80704Vls2);
            LJIJI(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLF = null;
            LJIJ(null, false);
        }
        this.LLI = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LJ(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + LJIIIZ(getDefaultHeight());
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
                i3 = size - LJIIIZ(56);
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
        LJ(view);
    }

    public C80695Vlj(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = new ArrayList<>();
        this.LJLLI = Integer.MAX_VALUE;
        this.LJZL = new ArrayList<>();
        this.LLIFFJFJJ = true;
        this.LLIIIILZ = true;
        this.LLIIIL = new C1UB(12);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C78855Ux9.LJLJJI);
        boolean z = !obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        if (!z) {
            setHorizontalScrollBarEnabled(false);
            C80696Vlk c80696Vlk = new C80696Vlk(this, context);
            this.LJLJI = c80696Vlk;
            super.addView(c80696Vlk, 0, new FrameLayout.LayoutParams(-2, -1));
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, i, R.style.y_);
            int dimensionPixelSize = obtainStyledAttributes2.getDimensionPixelSize(11, 0);
            if (c80696Vlk.LJLIL != dimensionPixelSize) {
                c80696Vlk.LJLIL = dimensionPixelSize;
                C16300kU.LJIIJ(c80696Vlk);
            }
            int color = obtainStyledAttributes2.getColor(8, 0);
            if (c80696Vlk.LJLILLLLZI.getColor() != color) {
                c80696Vlk.LJLILLLLZI.setColor(color);
                C16300kU.LJIIJ(c80696Vlk);
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
                C74275TDb.LIZIZ(getContext(), 1.5f);
                C74275TDb.LIZIZ(getContext(), 1.5f);
                this.LLIIIZ = getResources().getConfiguration().orientation;
                LJI();
                return;
            } catch (Throwable th) {
                obtainStyledAttributes3.recycle();
                throw th;
            }
        }
        throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
    }

    public final void LJIIZILJ(C164456cr c164456cr, boolean z, boolean z2) {
        int i;
        C164456cr c164456cr2 = this.LJLILLLLZI;
        if (c164456cr2 == c164456cr) {
            if (c164456cr2 != null) {
                for (int size = this.LJZL.size() - 1; size >= 0; size--) {
                    ((InterfaceC80707Vlv) ListProtector.get(this.LJZL, size)).LIZIZ(c164456cr);
                }
                LJFF(c164456cr.LIZJ);
                return;
            }
            return;
        }
        if (c164456cr != null) {
            i = c164456cr.LIZJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c164456cr2 == null || c164456cr2.LIZJ == -1) && i != -1) {
                LJIJI(i, 0.0f, true, true);
            } else {
                LJFF(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c164456cr2 != null) {
            LJIIIIZZ(c164456cr2);
        }
        this.LJLILLLLZI = c164456cr;
        if (c164456cr != null) {
            for (int size2 = this.LJZL.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC80707Vlv) ListProtector.get(this.LJZL, size2)).LIZJ(c164456cr, z2);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LJ(view);
    }

    public final void LJIJI(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C80696Vlk c80696Vlk = this.LJLJI;
            ValueAnimator valueAnimator = c80696Vlk.LJLLI;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c80696Vlk.LJLLI.cancel();
            }
            c80696Vlk.LJLJI = i;
            c80696Vlk.LJLJJI = f;
            c80696Vlk.LIZIZ();
        }
        ValueAnimator valueAnimator2 = this.LLD;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LLD.cancel();
        }
        scrollTo(LJII(i, f), 0);
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
