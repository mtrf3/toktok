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
/* renamed from: X.Vl5, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80655Vl5 extends HorizontalScrollView {
    public static final C30901Je LLIIIZ = new C30901Je();
    public static final C43051mX LLIIJI = new C43051mX(16);
    public final ArrayList<C80654Vl4> LJLIL;
    public C80654Vl4 LJLILLLLZI;
    public final C80656Vl6 LJLJI;
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
    public InterfaceC80659Vl9 LLF;
    public final ArrayList<InterfaceC80659Vl9> LLFF;
    public C78043Uk3 LLFFF;
    public ValueAnimator LLFII;
    public ViewPager LLFZ;
    public PagerAdapter LLI;
    public C80660VlA LLIFFJFJJ;
    public C80657Vl7 LLII;
    public C80658Vl8 LLIIII;
    public boolean LLIIIILZ;
    public final C1UB LLIIIJ;
    public final int LLIIIL;

    public void setOnTabClickListener(InterfaceC80661VlB interfaceC80661VlB) {
    }

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C80654Vl4 c80654Vl4 = (C80654Vl4) ListProtector.get(this.LJLIL, i);
            if (c80654Vl4 != null && c80654Vl4.LIZ != null && !TextUtils.isEmpty(c80654Vl4.LIZIZ)) {
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
        LJIILLIIL(true);
    }

    public final void LJIIIIZZ() {
        if (this.LLFII == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLFII = valueAnimator;
            valueAnimator.setInterpolator(LLIIIZ);
            this.LLFII.setDuration(200L);
            this.LLFII.addUpdateListener(new AUListenerS101S0100000_14(this, 0));
        }
    }

    public final void LJIIJ() {
        C80654Vl4 c80654Vl4;
        int currentItem;
        int childCount = this.LJLJI.getChildCount() - 1;
        while (true) {
            c80654Vl4 = null;
            if (childCount < 0) {
                break;
            }
            C80653Vl3 c80653Vl3 = (C80653Vl3) this.LJLJI.getChildAt(childCount);
            C80656Vl6 c80656Vl6 = this.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c80656Vl6.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c80656Vl6.removeViewAt(childCount);
            if (c80653Vl3 != null) {
                c80653Vl3.setTab(null);
                c80653Vl3.setSelected(false);
                this.LLIIIJ.LIZ(c80653Vl3);
            }
            requestLayout();
            childCount--;
        }
        Iterator<C80654Vl4> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C80654Vl4 next = it.next();
            it.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            next.LJFF = -1;
            LLIIJI.LIZ(next);
        }
        this.LJLILLLLZI = null;
        PagerAdapter pagerAdapter = this.LLI;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C80654Vl4 LJIIIZ = LJIIIZ(this.LL);
                LJIIIZ.LIZIZ = this.LLI.LJIILIIL(i);
                C80653Vl3 c80653Vl32 = LJIIIZ.LJII;
                if (c80653Vl32 != null) {
                    c80653Vl32.LIZ();
                }
                LIZJ(LJIIIZ, false);
            }
            ViewPager viewPager = this.LLFZ;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                if (currentItem >= 0 && currentItem < getTabCount()) {
                    c80654Vl4 = (C80654Vl4) ListProtector.get(this.LJLIL, currentItem);
                }
                LJIIJJI(c80654Vl4, true);
            }
        }
    }

    public int getSelectedTabPosition() {
        C80654Vl4 c80654Vl4 = this.LJLILLLLZI;
        if (c80654Vl4 != null) {
            return c80654Vl4.LIZLLL;
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

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLFZ == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                LJIILJJIL((ViewPager) parent, true);
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

    public final void LIZIZ(InterfaceC80659Vl9 interfaceC80659Vl9) {
        if (!this.LLFF.contains(interfaceC80659Vl9)) {
            this.LLFF.add(interfaceC80659Vl9);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C80662VlC) {
            C80654Vl4 LJIIIZ = LJIIIZ(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                LJIIIZ.LIZJ = view.getContentDescription();
                C80653Vl3 c80653Vl3 = LJIIIZ.LJII;
                if (c80653Vl3 != null) {
                    c80653Vl3.LIZ();
                }
            }
            LIZJ(LJIIIZ, this.LJLIL.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    public final void LJ(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && C16330kX.LIZJ(this)) {
            C80656Vl6 c80656Vl6 = this.LJLJI;
            int childCount = c80656Vl6.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c80656Vl6.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int LJI = LJI(i, 0.0f);
            if (scrollX != LJI) {
                LJIIIIZZ();
                this.LLFII.setIntValues(scrollX, LJI);
                this.LLFII.start();
            }
            this.LJLJI.LIZ(i, 200);
            return;
        }
        LJIILIIL(i, 0.0f, true, true);
    }

    public final int LJII(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C80654Vl4 LJIIIZ(int i) {
        C80653Vl3 c80653Vl3;
        C80654Vl4 c80654Vl4 = (C80654Vl4) LLIIJI.LIZIZ();
        if (c80654Vl4 == null) {
            c80654Vl4 = new C80654Vl4();
        }
        c80654Vl4.LJI = this;
        if (c80654Vl4.LJII == null) {
            C1UB c1ub = this.LLIIIJ;
            if (c1ub == null || (c80653Vl3 = (C80653Vl3) c1ub.LIZIZ()) == null) {
                c80653Vl3 = new C80653Vl3(this, getContext());
            }
            c80653Vl3.setFocusable(true);
            c80653Vl3.setMinimumWidth(getTabMinWidth());
            c80654Vl4.LJII = c80653Vl3;
        }
        if (i > 0) {
            C80653Vl3 c80653Vl32 = c80654Vl4.LJII;
            if (c80654Vl4 != c80653Vl32.LJLIL) {
                c80653Vl32.LJLIL = c80654Vl4;
            }
            if (c80654Vl4.LJFF != i || c80654Vl4.LJ == null) {
                c80654Vl4.LJFF = i;
                c80654Vl4.LJ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c80653Vl32.getContext()), i, c80654Vl4.LJII, false);
                C80653Vl3 c80653Vl33 = c80654Vl4.LJII;
                if (c80653Vl33 != null) {
                    c80653Vl33.LIZ();
                }
            }
        } else {
            c80654Vl4.LJII.setTab(c80654Vl4);
        }
        return c80654Vl4;
    }

    public final void LJIILL(LinearLayout.LayoutParams layoutParams) {
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

    public final void LJIILLIIL(boolean z) {
        for (int i = 0; i < this.LJLJI.getChildCount(); i++) {
            View childAt = this.LJLJI.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LJIILL((LinearLayout.LayoutParams) childAt.getLayoutParams());
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

    public void setOnTabSelectedListener(InterfaceC80659Vl9 interfaceC80659Vl9) {
        InterfaceC80659Vl9 interfaceC80659Vl92 = this.LLF;
        if (interfaceC80659Vl92 != null) {
            this.LLFF.remove(interfaceC80659Vl92);
        }
        this.LLF = interfaceC80659Vl9;
        if (interfaceC80659Vl9 != null) {
            LIZIZ(interfaceC80659Vl9);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        LJIIIIZZ();
        this.LLFII.addListener(animatorListener);
    }

    public void setSelectedTabHorizontalPadding(int i) {
        this.LJLJI.LJLLJ = i;
    }

    public void setSelectedTabIndicatorColor(int i) {
        C80656Vl6 c80656Vl6 = this.LJLJI;
        if (c80656Vl6.LJLILLLLZI.getColor() != i) {
            c80656Vl6.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c80656Vl6);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C80656Vl6 c80656Vl6 = this.LJLJI;
        if (c80656Vl6.LJLIL != i) {
            c80656Vl6.LJLIL = i;
            C16300kU.LJIIJ(c80656Vl6);
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
        this.LJLJJI = LJII(i);
        for (int i2 = 0; i2 < getTabCount(); i2++) {
            View childAt = this.LJLJI.getChildAt(i2);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.leftMargin = LJII(i);
            marginLayoutParams.rightMargin = LJII(i);
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
                C80653Vl3 c80653Vl3 = ((C80654Vl4) ListProtector.get(this.LJLIL, i)).LJII;
                if (c80653Vl3 != null) {
                    c80653Vl3.LIZ();
                }
            }
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        LJIIL(pagerAdapter, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        LJIILJJIL(viewPager, false);
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

    public C80655Vl5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList<>();
        this.LJLLL = Integer.MAX_VALUE;
        this.LLFF = new ArrayList<>();
        this.LLIIIJ = new C1UB(12);
        setHorizontalScrollBarEnabled(false);
        C80656Vl6 c80656Vl6 = new C80656Vl6(this, context);
        this.LJLJI = c80656Vl6;
        super.addView(c80656Vl6, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, 0, R.style.y_);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (c80656Vl6.LJLIL != dimensionPixelSize) {
            c80656Vl6.LJLIL = dimensionPixelSize;
            C16300kU.LJIIJ(c80656Vl6);
        }
        int color = obtainStyledAttributes.getColor(8, 0);
        if (c80656Vl6.LJLILLLLZI.getColor() != color) {
            c80656Vl6.LJLILLLLZI.setColor(color);
            C16300kU.LJIIJ(c80656Vl6);
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
                this.LJLL = new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{obtainStyledAttributes.getColor(22, 0), this.LJLL.getDefaultColor()});
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
            this.LLIIIL = getResources().getConfiguration().orientation;
            LJFF();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public final void LIZJ(C80654Vl4 c80654Vl4, boolean z) {
        int size = this.LJLIL.size();
        if (c80654Vl4.LJI == this) {
            c80654Vl4.LIZLLL = size;
            ListProtector.add(this.LJLIL, size, c80654Vl4);
            int size2 = this.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C80654Vl4) ListProtector.get(this.LJLIL, size)).LIZLLL = size;
                }
            }
            C80653Vl3 c80653Vl3 = c80654Vl4.LJII;
            C80656Vl6 c80656Vl6 = this.LJLJI;
            int i = c80654Vl4.LIZLLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIILL(layoutParams);
            c80656Vl6.addView(c80653Vl3, i, layoutParams);
            if (z) {
                C80655Vl5 c80655Vl5 = c80654Vl4.LJI;
                if (c80655Vl5 != null) {
                    c80655Vl5.LJIIJJI(c80654Vl4, true);
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

    public final void LJIIJJI(C80654Vl4 c80654Vl4, boolean z) {
        int i;
        C80654Vl4 c80654Vl42 = this.LJLILLLLZI;
        if (c80654Vl42 == c80654Vl4) {
            if (c80654Vl42 != null) {
                for (int size = this.LLFF.size() - 1; size >= 0; size--) {
                    ((InterfaceC80659Vl9) ListProtector.get(this.LLFF, size)).LIZ();
                }
                LJ(c80654Vl4.LIZLLL);
                return;
            }
            return;
        }
        if (c80654Vl4 != null) {
            i = c80654Vl4.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c80654Vl42 == null || c80654Vl42.LIZLLL == -1) && i != -1) {
                LJIILIIL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c80654Vl42 != null) {
            for (int size2 = this.LLFF.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC80659Vl9) ListProtector.get(this.LLFF, size2)).LIZJ(c80654Vl42);
            }
        }
        this.LJLILLLLZI = c80654Vl4;
        if (c80654Vl4 != null) {
            for (int size3 = this.LLFF.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC80659Vl9) ListProtector.get(this.LLFF, size3)).LIZIZ(c80654Vl4);
            }
        }
    }

    public final void LJIIL(PagerAdapter pagerAdapter, boolean z) {
        C80660VlA c80660VlA;
        PagerAdapter pagerAdapter2 = this.LLI;
        if (pagerAdapter2 != null && (c80660VlA = this.LLIFFJFJJ) != null) {
            pagerAdapter2.LJJII(c80660VlA);
        }
        this.LLI = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = new C80660VlA(this);
            }
            pagerAdapter.LJIJ(this.LLIFFJFJJ);
        }
        LJIIJ();
    }

    public final void LJIILJJIL(ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLFZ;
        if (viewPager2 != null) {
            C80657Vl7 c80657Vl7 = this.LLII;
            if (c80657Vl7 != null) {
                viewPager2.removeOnPageChangeListener(c80657Vl7);
            }
            C80658Vl8 c80658Vl8 = this.LLIIII;
            if (c80658Vl8 != null) {
                this.LLFZ.removeOnAdapterChangeListener(c80658Vl8);
            }
        }
        C78043Uk3 c78043Uk3 = this.LLFFF;
        if (c78043Uk3 != null) {
            this.LLFF.remove(c78043Uk3);
            this.LLFFF = null;
        }
        if (viewPager != null) {
            this.LLFZ = viewPager;
            if (this.LLII == null) {
                this.LLII = new C80657Vl7(this);
            }
            C80657Vl7 c80657Vl72 = this.LLII;
            c80657Vl72.LJLILLLLZI = 0;
            c80657Vl72.LJLJI = 0;
            viewPager.addOnPageChangeListener(c80657Vl72);
            C78043Uk3 c78043Uk32 = new C78043Uk3(viewPager);
            this.LLFFF = c78043Uk32;
            LIZIZ(c78043Uk32);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIIL(adapter, true);
            }
            if (this.LLIIII == null) {
                this.LLIIII = new C80658Vl8(this);
            }
            C80658Vl8 c80658Vl82 = this.LLIIII;
            c80658Vl82.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c80658Vl82);
            LJIILIIL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLFZ = null;
            LJIIL(null, false);
        }
        this.LLIIIILZ = z;
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
            int i3 = this.LJLLLLLL;
            if (i3 <= 0) {
                i3 = size - LJII(56);
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

    public final void LJIILIIL(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C80656Vl6 c80656Vl6 = this.LJLJI;
            ValueAnimator valueAnimator = c80656Vl6.LJLJLJ;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c80656Vl6.LJLJLJ.cancel();
            }
            c80656Vl6.LJLJI = i;
            c80656Vl6.LJLJJI = f;
            c80656Vl6.LIZIZ();
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
