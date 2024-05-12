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
/* renamed from: X.VlP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80675VlP extends HorizontalScrollView {
    public static final C30901Je LLIIIZ = new C30901Je();
    public static final C43051mX LLIIJI = new C43051mX(16);
    public final ArrayList<C80674VlO> LJLIL;
    public C80674VlO LJLILLLLZI;
    public final C80676VlQ LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public ColorStateList LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public int LJLLLLLL;
    public final int LJLZ;
    public int LJZ;
    public int LJZI;
    public int LJZL;
    public int LL;
    public boolean LLD;
    public InterfaceC80680VlU LLF;
    public final ArrayList<InterfaceC80680VlU> LLFF;
    public C80679VlT LLFFF;
    public ValueAnimator LLFII;
    public ViewPager LLFZ;
    public PagerAdapter LLI;
    public C80681VlV LLIFFJFJJ;
    public C80677VlR LLII;
    public C80678VlS LLIIII;
    public boolean LLIIIILZ;
    public TAY LLIIIJ;
    public final C1UB LLIIIL;

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C80674VlO c80674VlO = (C80674VlO) ListProtector.get(this.LJLIL, i);
            if (c80674VlO != null && c80674VlO.LIZIZ != null && !TextUtils.isEmpty(c80674VlO.LIZJ)) {
                return 72;
            }
        }
        return 48;
    }

    private float getScrollPosition() {
        return r2.LJLJI + this.LJLJI.LJLJJI;
    }

    private int getTabMinWidth() {
        int i = this.LJLLLL;
        if (i != -1) {
            return i;
        }
        if (this.LJZL == 0) {
            return this.LJLZ;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.LJLJI.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public final void LJFF() {
        int i;
        if (this.LJZL == 0) {
            i = Math.max(0, this.LJZ - this.LJLJJL);
        } else {
            i = 0;
        }
        C16310kV.LJIIJ(this.LJLJI, i, 0, 0, 0);
        int i2 = this.LJZL;
        if (i2 != 0) {
            if (i2 == 1) {
                this.LJLJI.setGravity(1);
            }
        } else {
            this.LJLJI.setGravity(8388611);
        }
        LJIJJ(true);
    }

    public final void LJIIIZ() {
        if (this.LLFII == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLFII = valueAnimator;
            valueAnimator.setInterpolator(LLIIIZ);
            this.LLFII.setDuration(200L);
            this.LLFII.addUpdateListener(new AUListenerS101S0100000_14(this, 2));
        }
    }

    public final void LJIILIIL() {
        for (int childCount = this.LJLJI.getChildCount() - 1; childCount >= 0; childCount--) {
            C80672VlM c80672VlM = (C80672VlM) this.LJLJI.getChildAt(childCount);
            C80676VlQ c80676VlQ = this.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c80676VlQ.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c80676VlQ.removeViewAt(childCount);
            if (c80672VlM != null) {
                c80672VlM.setTab(null);
                c80672VlM.setSelected(false);
                this.LLIIIL.LIZ(c80672VlM);
            }
            requestLayout();
        }
        Iterator<C80674VlO> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C80674VlO next = it.next();
            it.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LJ = -1;
            next.LJFF = null;
            next.LJI = -1;
            LLIIJI.LIZ(next);
        }
        this.LJLILLLLZI = null;
    }

    public int getSelectedTabPosition() {
        C80674VlO c80674VlO = this.LJLILLLLZI;
        if (c80674VlO != null) {
            return c80674VlO.LJ;
        }
        return -1;
    }

    public int getTabCount() {
        return this.LJLIL.size();
    }

    public int getTabStripLeftPadding() {
        return this.LJLJI.getPaddingLeft();
    }

    public int getTabStripRightPadding() {
        return this.LJLJI.getPaddingRight();
    }

    public final void LJIIL() {
        int currentItem;
        LJIILIIL();
        PagerAdapter pagerAdapter = this.LLI;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C80674VlO LJIIJJI = LJIIJJI(this.LL);
                LJIIJJI.LIZJ = this.LLI.LJIILIIL(i);
                LJIIJJI.LIZIZ();
                LIZJ(LJIIJJI, false);
            }
            ViewPager viewPager = this.LLFZ;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILJJIL(LJIIJ(currentItem), true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLFZ == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIJ((ViewPager) parent, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.LLIIIILZ) {
            setupWithViewPager(null);
            this.LLIIIILZ = false;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public int getTabGravity() {
        return this.LJZI;
    }

    public int getTabMaxWidth() {
        return this.LJLLL;
    }

    public int getTabMode() {
        return this.LJZL;
    }

    public ColorStateList getTabTextColors() {
        return this.LJLL;
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

    public final void LIZIZ(InterfaceC80680VlU interfaceC80680VlU) {
        if (!this.LLFF.contains(interfaceC80680VlU)) {
            this.LLFF.add(interfaceC80680VlU);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C80682VlW) {
            C80674VlO LJIIJJI = LJIIJJI(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                LJIIJJI.LIZLLL = view.getContentDescription();
                LJIIJJI.LIZIZ();
            }
            LIZJ(LJIIJJI, this.LJLIL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C80676VlQ c80676VlQ = this.LJLJI;
            int childCount = c80676VlQ.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c80676VlQ.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LJI = LJI(i, 0.0f);
            if (scrollX != LJI) {
                LJIIIZ();
                this.LLFII.setIntValues(scrollX, LJI);
                this.LLFII.start();
            }
            this.LJLJI.LIZ(i, 200);
            return;
        }
        LJIILLIIL(i, 0.0f, true, true);
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C80674VlO LJIIJ(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C80674VlO) ListProtector.get(this.LJLIL, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C80674VlO LJIIJJI(int i) {
        C80672VlM c80672VlM;
        C80674VlO c80674VlO = (C80674VlO) LLIIJI.LIZIZ();
        if (c80674VlO == null) {
            c80674VlO = new C80674VlO();
        }
        c80674VlO.LJII = this;
        if (c80674VlO.LJIIIIZZ == null) {
            C1UB c1ub = this.LLIIIL;
            if (c1ub == null || (c80672VlM = (C80672VlM) c1ub.LIZIZ()) == null) {
                c80672VlM = new C80672VlM(this, getContext());
            }
            c80672VlM.setFocusable(true);
            c80672VlM.setMinimumWidth(getTabMinWidth());
            c80674VlO.LJIIIIZZ = c80672VlM;
        }
        if (i > 0) {
            C80672VlM c80672VlM2 = c80674VlO.LJIIIIZZ;
            if (c80674VlO != c80672VlM2.LJLIL) {
                c80672VlM2.LJLIL = c80674VlO;
            }
            if (c80674VlO.LJI != i || c80674VlO.LJFF == null) {
                c80674VlO.LJI = i;
                c80674VlO.LJFF = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c80672VlM2.getContext()), i, c80674VlO.LJIIIIZZ, false);
                c80674VlO.LIZIZ();
            }
        } else {
            c80674VlO.LJIIIIZZ.setTab(c80674VlO);
        }
        return c80674VlO;
    }

    public final void LJIJI(LinearLayout.LayoutParams layoutParams) {
        if (this.LJZL == 1 && this.LJZI == 0) {
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

    public final void LJIJJ(boolean z) {
        for (int i = 0; i < this.LJLJI.getChildCount(); i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIJI((LinearLayout.LayoutParams) childAt.getLayoutParams());
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
        this.LLD = z;
    }

    public void setContentInsetStart(int i) {
        this.LJZ = i;
    }

    public void setCustomTabViewResId(int i) {
        this.LL = i;
    }

    public void setOnTabClickListener(TAY tay) {
        this.LLIIIJ = tay;
    }

    public void setOnTabSelectedListener(InterfaceC80680VlU interfaceC80680VlU) {
        InterfaceC80680VlU interfaceC80680VlU2 = this.LLF;
        if (interfaceC80680VlU2 != null) {
            this.LLFF.remove(interfaceC80680VlU2);
        }
        this.LLF = interfaceC80680VlU;
        if (interfaceC80680VlU != null) {
            LIZIZ(interfaceC80680VlU);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIZ();
        this.LLFII.addListener(animatorListener);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.LJLJI.LJLLJ = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        C80676VlQ c80676VlQ = this.LJLJI;
        if (c80676VlQ.LJLILLLLZI.getColor() != i) {
            c80676VlQ.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c80676VlQ);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C80676VlQ c80676VlQ = this.LJLJI;
        if (c80676VlQ.LJLIL != i) {
            c80676VlQ.LJLIL = i;
            C16300kU.LJIIJ(c80676VlQ);
        }
    }

    public void setTabBackgroundResId(int i) {
        this.LJLLJ = i;
    }

    public void setTabGravity(int i) {
        if (this.LJZI != i) {
            this.LJZI = i;
            LJFF();
        }
    }

    public void setTabMargin(int i) {
        this.LJLJJI = LJIIIIZZ(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJIIIIZZ(i);
            marginLayoutParams.rightMargin = LJIIIIZZ(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public void setTabMaxWidth(int i) {
        this.LJLLLLLL = i;
    }

    public void setTabMinWidth(int i) {
        this.LJLLLL = i;
    }

    public void setTabMode(String str) {
        str.getClass();
        if (!str.equals("scrollable")) {
            if (!str.equals("fixed") || this.LJZL == 1) {
                return;
            }
            this.LJZL = 1;
            LJFF();
            return;
        }
        if (this.LJZL == 0) {
            return;
        }
        this.LJZL = 0;
        LJFF();
    }

    public void setTabPaddingBottom(int i) {
        this.LJLJLJ = i;
    }

    public void setTabPaddingEnd(int i) {
        this.LJLJL = i;
    }

    public void setTabPaddingStart(int i) {
        this.LJLJJL = i;
    }

    public void setTabPaddingTop(int i) {
        this.LJLJJLL = i;
    }

    public void setTabTextAppearance(int i) {
        this.LJLJLLL = i;
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LJLL != colorStateList) {
            this.LJLL = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                ((C80674VlO) ListProtector.get(this.LJLIL, i)).LIZIZ();
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIILL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIJ(viewPager, false);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void setTabMode(int i) {
        if (i != this.LJZL) {
            this.LJZL = i;
            LJFF();
        }
    }

    public C80675VlP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList<>();
        this.LJLLL = Integer.MAX_VALUE;
        this.LLFF = new ArrayList<>();
        this.LLIIIL = new C1UB(12);
        setHorizontalScrollBarEnabled(false);
        C80676VlQ c80676VlQ = new C80676VlQ(this, context);
        this.LJLJI = c80676VlQ;
        super.addView(c80676VlQ, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, 0, R.style.y_);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (c80676VlQ.LJLIL != dimensionPixelSize) {
            c80676VlQ.LJLIL = dimensionPixelSize;
            C16300kU.LJIIJ(c80676VlQ);
        }
        int color = obtainStyledAttributes.getColor(8, 0);
        if (c80676VlQ.LJLILLLLZI.getColor() != color) {
            c80676VlQ.LJLILLLLZI.setColor(color);
            C16300kU.LJIIJ(c80676VlQ);
        }
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(16, 0);
        this.LJLJJL = dimensionPixelSize2;
        this.LJLJJLL = dimensionPixelSize2;
        this.LJLJL = dimensionPixelSize2;
        this.LJLJLJ = dimensionPixelSize2;
        this.LJLJJL = obtainStyledAttributes.getDimensionPixelSize(19, dimensionPixelSize2);
        this.LJLJJLL = obtainStyledAttributes.getDimensionPixelSize(20, this.LJLJJLL);
        this.LJLJL = obtainStyledAttributes.getDimensionPixelSize(18, this.LJLJL);
        this.LJLJLJ = obtainStyledAttributes.getDimensionPixelSize(17, this.LJLJLJ);
        int resourceId = obtainStyledAttributes.getResourceId(23, R.style.nv);
        this.LJLJLLL = resourceId;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, new int[]{android.R.attr.textSize, android.R.attr.typeface, android.R.attr.textStyle, android.R.attr.textColor, android.R.attr.textColorHint, android.R.attr.textColorLink, android.R.attr.shadowColor, android.R.attr.shadowDx, android.R.attr.shadowDy, android.R.attr.shadowRadius, android.R.attr.fontFamily, android.R.attr.textFontWeight, R.attr.ae9, R.attr.aei, R.attr.bhl, R.attr.bih});
        try {
            this.LJLLI = obtainStyledAttributes2.getDimensionPixelSize(0, 0);
            this.LJLL = obtainStyledAttributes2.getColorStateList(3);
            obtainStyledAttributes2.recycle();
            if (obtainStyledAttributes.hasValue(24)) {
                this.LJLL = obtainStyledAttributes.getColorStateList(24);
            }
            if (obtainStyledAttributes.hasValue(22)) {
                this.LJLL = LJII(this.LJLL.getDefaultColor(), obtainStyledAttributes.getColor(22, 0));
            }
            this.LJLLLL = obtainStyledAttributes.getDimensionPixelSize(14, -1);
            this.LJLLLLLL = obtainStyledAttributes.getDimensionPixelSize(13, -1);
            this.LJLLJ = obtainStyledAttributes.getResourceId(0, 0);
            this.LJZ = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.LJZL = obtainStyledAttributes.getInt(15, 1);
            this.LJZI = obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.recycle();
            Resources resources = getResources();
            this.LJLLILLLL = resources.getDimensionPixelSize(R.dimen.mz);
            this.LJLZ = resources.getDimensionPixelSize(R.dimen.mx);
            KL2.LIZJ(getContext(), 1.5f);
            KL2.LIZJ(getContext(), 1.5f);
            getResources().getConfiguration();
            LJFF();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static ColorStateList LJII(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final void LIZJ(C80674VlO c80674VlO, boolean z) {
        int size = this.LJLIL.size();
        if (c80674VlO.LJII == this) {
            c80674VlO.LJ = size;
            ListProtector.add(this.LJLIL, size, c80674VlO);
            int size2 = this.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C80674VlO) ListProtector.get(this.LJLIL, size)).LJ = size;
                }
            }
            C80672VlM c80672VlM = c80674VlO.LJIIIIZZ;
            C80676VlQ c80676VlQ = this.LJLJI;
            int i = c80674VlO.LJ;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIJI(layoutParams);
            c80676VlQ.addView(c80672VlM, i, layoutParams);
            if (z) {
                c80674VlO.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJI(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.LJZL != 0) {
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

    public final void LJIILJJIL(C80674VlO c80674VlO, boolean z) {
        int i;
        C80674VlO c80674VlO2 = this.LJLILLLLZI;
        if (c80674VlO2 == c80674VlO) {
            if (c80674VlO2 != null) {
                for (int size = this.LLFF.size() - 1; size >= 0; size--) {
                    ((InterfaceC80680VlU) ListProtector.get(this.LLFF, size)).LIZIZ(c80674VlO);
                }
                LJ(c80674VlO.LJ);
                return;
            }
            return;
        }
        if (c80674VlO != null) {
            i = c80674VlO.LJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c80674VlO2 == null || c80674VlO2.LJ == -1) && i != -1) {
                LJIILLIIL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c80674VlO2 != null) {
            for (int size2 = this.LLFF.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC80680VlU) ListProtector.get(this.LLFF, size2)).LIZ(c80674VlO2);
            }
        }
        this.LJLILLLLZI = c80674VlO;
        if (c80674VlO != null) {
            for (int size3 = this.LLFF.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC80680VlU) ListProtector.get(this.LLFF, size3)).LIZJ(c80674VlO);
            }
        }
    }

    public final void LJIILL(PagerAdapter pagerAdapter, boolean z) {
        C80681VlV c80681VlV;
        PagerAdapter pagerAdapter2 = this.LLI;
        if (pagerAdapter2 != null && (c80681VlV = this.LLIFFJFJJ) != null) {
            pagerAdapter2.LJJII(c80681VlV);
        }
        this.LLI = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = new C80681VlV(this);
            }
            pagerAdapter.LJIJ(this.LLIFFJFJJ);
        }
        LJIIL();
    }

    public final void LJIIZILJ(int i, int i2) {
        this.LJLJI.setPadding(i, 0, i2, 0);
    }

    public final void LJIJ(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLFZ;
        if (viewPager2 != null) {
            C80677VlR c80677VlR = this.LLII;
            if (c80677VlR != null) {
                viewPager2.removeOnPageChangeListener(c80677VlR);
            }
            C80678VlS c80678VlS = this.LLIIII;
            if (c80678VlS != null) {
                this.LLFZ.removeOnAdapterChangeListener(c80678VlS);
            }
        }
        C80679VlT c80679VlT = this.LLFFF;
        if (c80679VlT != null) {
            this.LLFF.remove(c80679VlT);
            this.LLFFF = null;
        }
        if (viewPager != null) {
            this.LLFZ = viewPager;
            if (this.LLII == null) {
                this.LLII = new C80677VlR(this);
            }
            C80677VlR c80677VlR2 = this.LLII;
            c80677VlR2.LJLILLLLZI = 0;
            c80677VlR2.LJLJI = 0;
            viewPager.addOnPageChangeListener(c80677VlR2);
            C80679VlT c80679VlT2 = new C80679VlT(viewPager);
            this.LLFFF = c80679VlT2;
            LIZIZ(c80679VlT2);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILL(adapter, true);
            }
            if (this.LLIIII == null) {
                this.LLIIII = new C80678VlS(this);
            }
            C80678VlS c80678VlS2 = this.LLIIII;
            c80678VlS2.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c80678VlS2);
            LJIILLIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLFZ = null;
            LJIILL(null, false);
        }
        this.LLIIIILZ = z;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZLLL(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int paddingBottom = getPaddingBottom() + getPaddingTop() + LJIIIIZZ(getDefaultHeight());
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
            int i3 = this.LJLLLLLL;
            if (i3 <= 0) {
                i3 = size - LJIIIIZZ(56);
            }
            this.LJLLL = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.LJZL;
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

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZLLL(view);
    }

    public final void LJIILLIIL(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C80676VlQ c80676VlQ = this.LJLJI;
            ValueAnimator valueAnimator = c80676VlQ.LJLJLJ;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c80676VlQ.LJLJLJ.cancel();
            }
            c80676VlQ.LJLJI = i;
            c80676VlQ.LJLJJI = f;
            c80676VlQ.LIZIZ();
        }
        ValueAnimator valueAnimator2 = this.LLFII;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.LLFII.cancel();
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
