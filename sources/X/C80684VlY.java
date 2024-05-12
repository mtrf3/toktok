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
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;

@C0C0
/* renamed from: X.VlY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80684VlY extends HorizontalScrollView {
    public static final C30901Je LLIIJI = new C30901Je();
    public static final C43051mX LLIIJLIL = new C43051mX(16);
    public final ArrayList<C80688Vlc> LJLIL;
    public C80688Vlc LJLILLLLZI;
    public final C80685VlZ LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public int LJLJLJ;
    public ColorStateList LJLJLLL;
    public int LJLL;
    public float LJLLI;
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
    public InterfaceC80690Vle LLF;
    public final ArrayList<InterfaceC80690Vle> LLFF;
    public C7C8 LLFFF;
    public ValueAnimator LLFII;
    public ViewPager LLFZ;
    public PagerAdapter LLI;
    public C80691Vlf LLIFFJFJJ;
    public C80687Vlb LLII;
    public C80689Vld LLIIII;
    public boolean LLIIIILZ;
    public C75Z LLIIIJ;
    public final C1UB LLIIIL;
    public final int LLIIIZ;

    private int getDefaultHeight() {
        int size = this.LJLIL.size();
        for (int i = 0; i < size; i++) {
            C80688Vlc c80688Vlc = (C80688Vlc) ListProtector.get(this.LJLIL, i);
            if (c80688Vlc != null && c80688Vlc.LIZ != null && !TextUtils.isEmpty(c80688Vlc.LIZIZ)) {
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
        LJIJ(true);
    }

    public final void LJIIIZ() {
        if (this.LLFII == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.LLFII = valueAnimator;
            valueAnimator.setInterpolator(LLIIJI);
            this.LLFII.setDuration(200L);
            this.LLFII.addUpdateListener(new AUListenerS101S0100000_14(this, 3));
        }
    }

    public final void LJIIL() {
        int currentItem;
        SY9 LLLI;
        SY9 LLLI2;
        for (int childCount = this.LJLJI.getChildCount() - 1; childCount >= 0; childCount--) {
            C80683VlX c80683VlX = (C80683VlX) this.LJLJI.getChildAt(childCount);
            C80685VlZ c80685VlZ = this.LJLJI;
            try {
                if (C78996UzQ.LJJIIJZLJL(c80685VlZ.getChildAt(childCount))) {
                    C78996UzQ.LJI();
                }
            } catch (Throwable unused) {
            }
            c80685VlZ.removeViewAt(childCount);
            if (c80683VlX != null) {
                c80683VlX.setTab(null);
                c80683VlX.setSelected(false);
                this.LLIIIL.LIZ(c80683VlX);
            }
            requestLayout();
        }
        Iterator<C80688Vlc> it = this.LJLIL.iterator();
        while (it.hasNext()) {
            C80688Vlc next = it.next();
            it.remove();
            next.LJI = null;
            next.LJII = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LIZJ = null;
            next.LIZLLL = -1;
            next.LJ = null;
            next.LJFF = -1;
            LLIIJLIL.LIZ(next);
        }
        this.LJLILLLLZI = null;
        PagerAdapter pagerAdapter = this.LLI;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C80688Vlc LJIIJJI = LJIIJJI(this.LL);
                LJIIJJI.LIZIZ = this.LLI.LJIILIIL(i);
                LJIIJJI.LIZIZ();
                PagerAdapter pagerAdapter2 = this.LLI;
                if (pagerAdapter2 instanceof AnonymousClass765) {
                    AnonymousClass765 anonymousClass765 = (AnonymousClass765) pagerAdapter2;
                    anonymousClass765.getClass();
                    if (C178406zM.LJIIJJI()) {
                        InterfaceC36571c5 interfaceC36571c5 = (Fragment) ListProtector.get(anonymousClass765.LJLJJLL, i);
                        if (interfaceC36571c5 instanceof AnonymousClass759) {
                            LLLI2 = ((AnonymousClass759) interfaceC36571c5).LLLI();
                            LJIIJJI.LIZ = LLLI2;
                            LJIIJJI.LIZIZ();
                        }
                    }
                    LLLI2 = null;
                    LJIIJJI.LIZ = LLLI2;
                    LJIIJJI.LIZIZ();
                }
                PagerAdapter pagerAdapter3 = this.LLI;
                if (pagerAdapter3 instanceof AnonymousClass764) {
                    AnonymousClass764 anonymousClass764 = (AnonymousClass764) pagerAdapter3;
                    anonymousClass764.getClass();
                    if (C7GI.LIZJ(anonymousClass764.getCount())) {
                        InterfaceC36571c5 interfaceC36571c52 = (Fragment) ListProtector.get(anonymousClass764.LJLJJLL, i);
                        if (interfaceC36571c52 instanceof InterfaceC1802075k) {
                            LLLI = ((InterfaceC1802075k) interfaceC36571c52).LLLI();
                            LJIIJJI.LIZ = LLLI;
                            LJIIJJI.LIZIZ();
                        }
                    }
                    LLLI = null;
                    LJIIJJI.LIZ = LLLI;
                    LJIIJJI.LIZIZ();
                }
                LIZJ(LJIIJJI, false);
            }
            ViewPager viewPager = this.LLFZ;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                LJIILIIL(LJIIJ(currentItem), true);
            }
        }
    }

    public int getSelectedTabPosition() {
        C80688Vlc c80688Vlc = this.LJLILLLLZI;
        if (c80688Vlc != null) {
            return c80688Vlc.LIZLLL;
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
                LJIILLIIL((ViewPager) parent, true);
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

    public final void LIZIZ(InterfaceC80690Vle interfaceC80690Vle) {
        if (!this.LLFF.contains(interfaceC80690Vle)) {
            this.LLFF.add(interfaceC80690Vle);
        }
    }

    public final void LIZLLL(View view) {
        if (view instanceof C80694Vli) {
            C80688Vlc LJIIJJI = LJIIJJI(0);
            view.getClass();
            if (!TextUtils.isEmpty(view.getContentDescription())) {
                LJIIJJI.LIZJ = view.getContentDescription();
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
            C80685VlZ c80685VlZ = this.LJLJI;
            int childCount = c80685VlZ.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (c80685VlZ.getChildAt(i2).getWidth() > 0) {
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
        LJIILL(i, 0.0f, true, true);
    }

    public final int LJIIIIZZ(int i) {
        return Math.round(getResources().getDisplayMetrics().density * i);
    }

    public final C80688Vlc LJIIJ(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C80688Vlc) ListProtector.get(this.LJLIL, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C80688Vlc LJIIJJI(int i) {
        C80683VlX c80683VlX;
        C80688Vlc c80688Vlc = (C80688Vlc) LLIIJLIL.LIZIZ();
        if (c80688Vlc == null) {
            c80688Vlc = new C80688Vlc();
        }
        c80688Vlc.LJI = this;
        if (c80688Vlc.LJII == null) {
            C1UB c1ub = this.LLIIIL;
            if (c1ub == null || (c80683VlX = (C80683VlX) c1ub.LIZIZ()) == null) {
                c80683VlX = new C80683VlX(this, getContext());
            }
            c80683VlX.setFocusable(true);
            c80683VlX.setMinimumWidth(getTabMinWidth());
            c80688Vlc.LJII = c80683VlX;
        }
        if (i > 0) {
            C80683VlX c80683VlX2 = c80688Vlc.LJII;
            if (c80688Vlc != c80683VlX2.LJLIL) {
                c80683VlX2.LJLIL = c80688Vlc;
            }
            if (c80688Vlc.LJFF != i || c80688Vlc.LJ == null) {
                c80688Vlc.LJFF = i;
                c80688Vlc.LJ = C16880lQ.LLLLIILL(C16880lQ.LLZIL(c80683VlX2.getContext()), i, c80688Vlc.LJII, false);
                c80688Vlc.LIZIZ();
            }
        } else {
            c80688Vlc.LJII.setTab(c80688Vlc);
        }
        return c80688Vlc;
    }

    public final void LJIIZILJ(LinearLayout.LayoutParams layoutParams) {
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
        this.LLD = z;
    }

    public void setContentInsetStart(int i) {
        this.LJZ = i;
    }

    public void setCustomTabViewResId(int i) {
        this.LL = i;
    }

    public void setOnTabClickListener(C75Z c75z) {
        this.LLIIIJ = c75z;
    }

    public void setOnTabSelectedListener(InterfaceC80690Vle interfaceC80690Vle) {
        InterfaceC80690Vle interfaceC80690Vle2 = this.LLF;
        if (interfaceC80690Vle2 != null) {
            this.LLFF.remove(interfaceC80690Vle2);
        }
        this.LLF = interfaceC80690Vle;
        if (interfaceC80690Vle != null) {
            LIZIZ(interfaceC80690Vle);
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
        C80685VlZ c80685VlZ = this.LJLJI;
        if (c80685VlZ.LJLILLLLZI.getColor() != i) {
            c80685VlZ.LJLILLLLZI.setColor(i);
            C16300kU.LJIIJ(c80685VlZ);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        C80685VlZ c80685VlZ = this.LJLJI;
        if (c80685VlZ.LJLIL != i) {
            c80685VlZ.LJLIL = i;
            C16300kU.LJIIJ(c80685VlZ);
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

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.LJLJLLL != colorStateList) {
            this.LJLJLLL = colorStateList;
            int size = this.LJLIL.size();
            for (int i = 0; i < size; i++) {
                ((C80688Vlc) ListProtector.get(this.LJLIL, i)).LIZIZ();
            }
        }
    }

    public void setTabTuxFont(int i) {
        this.LJLL = i;
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

    public void setTabMode(int i) {
        if (i != this.LJZL) {
            this.LJZL = i;
            LJFF();
        }
    }

    public C80684VlY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = new ArrayList<>();
        this.LJLLL = Integer.MAX_VALUE;
        this.LLFF = new ArrayList<>();
        this.LLIIIL = new C1UB(12);
        setHorizontalScrollBarEnabled(false);
        C80685VlZ c80685VlZ = new C80685VlZ(this, context);
        this.LJLJI = c80685VlZ;
        super.addView(c80685VlZ, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bfz, R.attr.bg0, R.attr.bg1, R.attr.bg2, R.attr.bg3, R.attr.bg4, R.attr.bg5, R.attr.bg6, R.attr.bg7, R.attr.bg_, R.attr.bga, R.attr.bgb, R.attr.bgc, R.attr.bgd, R.attr.bge, R.attr.bgf, R.attr.bgg, R.attr.bgh, R.attr.bgi, R.attr.bgj, R.attr.bgk, R.attr.bgl, R.attr.bgm, R.attr.bgq, R.attr.bgr, R.attr.bgu}, 0, R.style.y_);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        if (c80685VlZ.LJLIL != dimensionPixelSize) {
            c80685VlZ.LJLIL = dimensionPixelSize;
            C16300kU.LJIIJ(c80685VlZ);
        }
        int color = obtainStyledAttributes.getColor(8, 0);
        if (c80685VlZ.LJLILLLLZI.getColor() != color) {
            c80685VlZ.LJLILLLLZI.setColor(color);
            C16300kU.LJIIJ(c80685VlZ);
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
        if (obtainStyledAttributes.hasValue(24)) {
            this.LJLJLLL = obtainStyledAttributes.getColorStateList(24);
        }
        if (obtainStyledAttributes.hasValue(22)) {
            this.LJLJLLL = LJII(this.LJLJLLL.getDefaultColor(), obtainStyledAttributes.getColor(22, 0));
        }
        this.LJLLLL = obtainStyledAttributes.getDimensionPixelSize(14, -1);
        this.LJLLLLLL = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        this.LJLLJ = obtainStyledAttributes.getResourceId(0, 0);
        this.LJZ = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.LJZL = obtainStyledAttributes.getInt(15, 1);
        this.LJZI = obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bqy}, 0, 0);
        this.LJLL = obtainStyledAttributes2.getInt(0, 0);
        obtainStyledAttributes2.recycle();
        Resources resources = getResources();
        this.LJLLILLLL = resources.getDimensionPixelSize(R.dimen.mz);
        this.LJLZ = resources.getDimensionPixelSize(R.dimen.mx);
        KL2.LIZJ(getContext(), 1.5f);
        KL2.LIZJ(getContext(), 1.5f);
        this.LLIIIZ = getResources().getConfiguration().orientation;
        LJFF();
    }

    public static ColorStateList LJII(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public final void LIZJ(C80688Vlc c80688Vlc, boolean z) {
        int size = this.LJLIL.size();
        if (c80688Vlc.LJI == this) {
            c80688Vlc.LIZLLL = size;
            ListProtector.add(this.LJLIL, size, c80688Vlc);
            int size2 = this.LJLIL.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C80688Vlc) ListProtector.get(this.LJLIL, size)).LIZLLL = size;
                }
            }
            C80683VlX c80683VlX = c80688Vlc.LJII;
            C80685VlZ c80685VlZ = this.LJLJI;
            int i = c80688Vlc.LIZLLL;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            LJIIZILJ(layoutParams);
            c80685VlZ.addView(c80683VlX, i, layoutParams);
            if (z) {
                c80688Vlc.LIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final int LJI(int i, float f) {
        View view;
        int i2;
        int i3;
        int i4 = 0;
        if (this.LJZL != 0) {
            return 0;
        }
        View childAt = this.LJLJI.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.LJLJI.getChildCount()) {
            view = this.LJLJI.getChildAt(i5);
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
        if (childAt != null) {
            i4 = childAt.getLeft();
        }
        int width = ((i2 / 2) + i4) - (getWidth() / 2);
        int i6 = (int) (((this.LJLJJI * 4) + i2 + i3) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return width + i6;
        }
        return width - i6;
    }

    public final void LJIILIIL(C80688Vlc c80688Vlc, boolean z) {
        int i;
        C80688Vlc c80688Vlc2 = this.LJLILLLLZI;
        if (c80688Vlc2 == c80688Vlc) {
            if (c80688Vlc2 != null) {
                for (int size = this.LLFF.size() - 1; size >= 0; size--) {
                    ((InterfaceC80690Vle) ListProtector.get(this.LLFF, size)).LIZIZ(c80688Vlc);
                }
                LJ(c80688Vlc.LIZLLL);
                return;
            }
            return;
        }
        if (c80688Vlc != null) {
            i = c80688Vlc.LIZLLL;
        } else {
            i = -1;
        }
        if (z) {
            if ((c80688Vlc2 == null || c80688Vlc2.LIZLLL == -1) && i != -1) {
                LJIILL(i, 0.0f, true, true);
            } else {
                LJ(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        if (c80688Vlc2 != null) {
            for (int size2 = this.LLFF.size() - 1; size2 >= 0; size2--) {
                ((InterfaceC80690Vle) ListProtector.get(this.LLFF, size2)).LIZ(c80688Vlc2);
            }
        }
        this.LJLILLLLZI = c80688Vlc;
        if (c80688Vlc != null) {
            for (int size3 = this.LLFF.size() - 1; size3 >= 0; size3--) {
                ((InterfaceC80690Vle) ListProtector.get(this.LLFF, size3)).LIZJ(c80688Vlc);
            }
        }
    }

    public final void LJIILJJIL(PagerAdapter pagerAdapter, boolean z) {
        C80691Vlf c80691Vlf;
        PagerAdapter pagerAdapter2 = this.LLI;
        if (pagerAdapter2 != null && (c80691Vlf = this.LLIFFJFJJ) != null) {
            pagerAdapter2.LJJII(c80691Vlf);
        }
        this.LLI = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.LLIFFJFJJ == null) {
                this.LLIFFJFJJ = new C80691Vlf(this);
            }
            pagerAdapter.LJIJ(this.LLIFFJFJJ);
        }
        LJIIL();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.Vle, X.7C8] */
    public final void LJIILLIIL(final ViewPager viewPager, boolean z) {
        ViewPager viewPager2 = this.LLFZ;
        if (viewPager2 != null) {
            C80687Vlb c80687Vlb = this.LLII;
            if (c80687Vlb != null) {
                viewPager2.removeOnPageChangeListener(c80687Vlb);
            }
            C80689Vld c80689Vld = this.LLIIII;
            if (c80689Vld != null) {
                this.LLFZ.removeOnAdapterChangeListener(c80689Vld);
            }
        }
        C7C8 c7c8 = this.LLFFF;
        if (c7c8 != null) {
            this.LLFF.remove(c7c8);
            this.LLFFF = null;
        }
        if (viewPager != null) {
            this.LLFZ = viewPager;
            if (this.LLII == null) {
                this.LLII = new C80687Vlb(this);
            }
            C80687Vlb c80687Vlb2 = this.LLII;
            c80687Vlb2.LJLILLLLZI = 0;
            c80687Vlb2.LJLJI = 0;
            viewPager.addOnPageChangeListener(c80687Vlb2);
            ?? r0 = new InterfaceC80690Vle(viewPager) { // from class: X.7C8
                public final ViewPager LIZ;

                @Override // X.InterfaceC80690Vle
                public final void LIZ(C80688Vlc c80688Vlc) {
                }

                @Override // X.InterfaceC80690Vle
                public final void LIZIZ(C80688Vlc c80688Vlc) {
                }

                {
                    this.LIZ = viewPager;
                }

                @Override // X.InterfaceC80690Vle
                public final void LIZJ(C80688Vlc c80688Vlc) {
                    this.LIZ.setCurrentItem(c80688Vlc.LIZLLL);
                }
            };
            this.LLFFF = r0;
            LIZIZ(r0);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                LJIILJJIL(adapter, true);
            }
            if (this.LLIIII == null) {
                this.LLIIII = new C80689Vld(this);
            }
            C80689Vld c80689Vld2 = this.LLIIII;
            c80689Vld2.LJLIL = true;
            viewPager.addOnAdapterChangeListener(c80689Vld2);
            LJIILL(viewPager.getCurrentItem(), 0.0f, true, true);
        } else {
            this.LLFZ = null;
            LJIILJJIL(null, false);
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

    public final void LJIILL(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.LJLJI.getChildCount()) {
            return;
        }
        if (z2) {
            C80685VlZ c80685VlZ = this.LJLJI;
            ValueAnimator valueAnimator = c80685VlZ.LJLJLJ;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                c80685VlZ.LJLJLJ.cancel();
            }
            c80685VlZ.LJLJI = i;
            c80685VlZ.LJLJJI = f;
            c80685VlZ.LIZIZ();
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
