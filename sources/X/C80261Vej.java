package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
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

@C0C0
/* renamed from: X.Vej, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80261Vej extends HorizontalScrollView {
    public static final int DEF_STYLE_RES = 2131886971;
    public static final InterfaceC15090iX<C78856UxA> tabPool = new C43051mX(16);
    public C80262Vek adapterChangeListener;
    public int contentInsetStart;
    public InterfaceC54357LUz currentVpSelectedListener;
    public boolean inlineLabel;
    public int mode;
    public C111134Xt pageChangeListener;
    public PagerAdapter pagerAdapter;
    public DataSetObserver pagerAdapterObserver;
    public final int requestedTabMaxWidth;
    public final int requestedTabMinWidth;
    public ValueAnimator scrollAnimator;
    public final int scrollableTabMinWidth;
    public InterfaceC54357LUz selectedListener;
    public final ArrayList<InterfaceC54357LUz> selectedListeners;
    public C78856UxA selectedTab;
    public boolean setupViewPagerImplicitly;
    public final C80258Veg slidingTabIndicator;
    public final int tabBackgroundResId;
    public int tabGravity;
    public ColorStateList tabIconTint;
    public PorterDuff.Mode tabIconTintMode;
    public int tabIndicatorAnimationDuration;
    public int tabIndicatorAnimationMode;
    public boolean tabIndicatorFullWidth;
    public int tabIndicatorGravity;
    public C80256Vee tabIndicatorInterpolator;
    public int tabMaxWidth;
    public int tabPaddingBottom;
    public int tabPaddingEnd;
    public int tabPaddingStart;
    public int tabPaddingTop;
    public ColorStateList tabRippleColorStateList;
    public Drawable tabSelectedIndicator;
    public int tabSelectedIndicatorColor;
    public int tabTextAppearance;
    public ColorStateList tabTextColors;
    public float tabTextMultiLineSize;
    public float tabTextSize;
    public final InterfaceC15090iX<C80267Vep> tabViewPool;
    public final ArrayList<C78856UxA> tabs;
    public boolean unboundedRipple;
    public ViewPager viewPager;

    private void applyModeAndGravity() {
        int max;
        int i = this.mode;
        if (i == 0 || i == 2) {
            max = Math.max(0, this.contentInsetStart - this.tabPaddingStart);
        } else {
            max = 0;
        }
        C16310kV.LJIIJ(this.slidingTabIndicator, max, 0, 0, 0);
        int i2 = this.mode;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                this.slidingTabIndicator.setGravity(1);
            }
        } else {
            applyGravityForModeScrollable(this.tabGravity);
        }
        updateTabViews(true);
    }

    private LinearLayout.LayoutParams createLayoutParamsForTabs() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        updateTabViewLayoutParams(layoutParams);
        return layoutParams;
    }

    private void ensureScrollAnimator() {
        if (this.scrollAnimator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.scrollAnimator = valueAnimator;
            valueAnimator.setInterpolator(C80237VeL.LIZIZ);
            this.scrollAnimator.setDuration(this.tabIndicatorAnimationDuration);
            this.scrollAnimator.addUpdateListener(new UYM(this));
        }
    }

    private int getDefaultHeight() {
        int size = this.tabs.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            C78856UxA c78856UxA = (C78856UxA) ListProtector.get(this.tabs, i);
            if (c78856UxA != null && c78856UxA.LIZIZ != null && !TextUtils.isEmpty(c78856UxA.LIZJ)) {
                if (!this.inlineLabel) {
                    return 72;
                }
            } else {
                i++;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.requestedTabMinWidth;
        if (i != -1) {
            return i;
        }
        int i2 = this.mode;
        if (i2 == 0 || i2 == 2) {
            return this.scrollableTabMinWidth;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.slidingTabIndicator.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void updateAllTabs() {
        int size = this.tabs.size();
        for (int i = 0; i < size; i++) {
            ((C78856UxA) ListProtector.get(this.tabs, i)).LJFF();
        }
    }

    public void clearOnTabSelectedListeners() {
        this.selectedListeners.clear();
    }

    public C78856UxA createTabFromPool() {
        C78856UxA LIZIZ = tabPool.LIZIZ();
        if (LIZIZ == null) {
            return new C78856UxA();
        }
        return LIZIZ;
    }

    public int getSelectedTabPosition() {
        C78856UxA c78856UxA = this.selectedTab;
        if (c78856UxA != null) {
            return c78856UxA.LJ;
        }
        return -1;
    }

    public int getTabCount() {
        return this.tabs.size();
    }

    public void removeAllTabs() {
        for (int childCount = this.slidingTabIndicator.getChildCount() - 1; childCount >= 0; childCount--) {
            removeTabViewAt(childCount);
        }
        Iterator<C78856UxA> it = this.tabs.iterator();
        while (it.hasNext()) {
            C78856UxA next = it.next();
            it.remove();
            next.LJII = null;
            next.LJIIIIZZ = null;
            next.LIZ = null;
            next.LIZIZ = null;
            next.LJIIIZ = -1;
            next.LIZJ = null;
            next.LIZLLL = null;
            next.LJ = -1;
            next.LJFF = null;
            releaseFromTabPool(next);
        }
        this.selectedTab = null;
    }

    public C78856UxA newTab() {
        C78856UxA createTabFromPool = createTabFromPool();
        createTabFromPool.LJII = this;
        C80267Vep createTabView = createTabView(createTabFromPool);
        createTabFromPool.LJIIIIZZ = createTabView;
        int i = createTabFromPool.LJIIIZ;
        if (i != -1) {
            createTabView.setId(i);
        }
        return createTabFromPool;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V1B.LJLLILLLL(this);
        if (this.viewPager == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                setupWithViewPager((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.setupViewPagerImplicitly) {
            setupWithViewPager(null);
            this.setupViewPagerImplicitly = false;
        }
    }

    public void populateFromPagerAdapter() {
        int currentItem;
        removeAllTabs();
        PagerAdapter pagerAdapter = this.pagerAdapter;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i = 0; i < count; i++) {
                C78856UxA newTab = newTab();
                CharSequence LJIILIIL = this.pagerAdapter.LJIILIIL(i);
                if (TextUtils.isEmpty(newTab.LIZLLL) && !TextUtils.isEmpty(LJIILIIL)) {
                    newTab.LJIIIIZZ.setContentDescription(LJIILIIL);
                }
                newTab.LIZJ = LJIILIIL;
                newTab.LJFF();
                addTab(newTab, false);
            }
            ViewPager viewPager = this.viewPager;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < getTabCount()) {
                selectTab(getTabAt(currentItem));
            }
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    public int getTabGravity() {
        return this.tabGravity;
    }

    public ColorStateList getTabIconTint() {
        return this.tabIconTint;
    }

    public int getTabIndicatorAnimationMode() {
        return this.tabIndicatorAnimationMode;
    }

    public int getTabIndicatorGravity() {
        return this.tabIndicatorGravity;
    }

    public int getTabMaxWidth() {
        return this.tabMaxWidth;
    }

    public int getTabMode() {
        return this.mode;
    }

    public ColorStateList getTabRippleColor() {
        return this.tabRippleColorStateList;
    }

    public Drawable getTabSelectedIndicator() {
        return this.tabSelectedIndicator;
    }

    public ColorStateList getTabTextColors() {
        return this.tabTextColors;
    }

    public boolean hasUnboundedRipple() {
        return this.unboundedRipple;
    }

    public boolean isInlineLabel() {
        return this.inlineLabel;
    }

    public boolean isTabIndicatorFullWidth() {
        return this.tabIndicatorFullWidth;
    }

    public C80261Vej(Context context) {
        this(context, null);
    }

    public static void INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_aweme_profile_tab_profiletab_base_view_ProfileTabProxy_proxy(C80261Vej c80261Vej) {
        if (c80261Vej instanceof C86894Y8k) {
            return;
        }
        c80261Vej.populateFromPagerAdapter();
    }

    private void addTabFromItemView(C80264Vem c80264Vem) {
        C78856UxA newTab = newTab();
        c80264Vem.getClass();
        if (!TextUtils.isEmpty(c80264Vem.getContentDescription())) {
            newTab.LIZLLL = c80264Vem.getContentDescription();
            newTab.LJFF();
        }
        addTab(newTab);
    }

    private void addTabView(C78856UxA c78856UxA) {
        C80267Vep c80267Vep = c78856UxA.LJIIIIZZ;
        c80267Vep.setSelected(false);
        c80267Vep.setActivated(false);
        this.slidingTabIndicator.addView(c80267Vep, c78856UxA.LJ, createLayoutParamsForTabs());
    }

    private void addViewInternal(View view) {
        if (view instanceof C80264Vem) {
            addTabFromItemView((C80264Vem) view);
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void animateToTab(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() == null || !C16330kX.LIZJ(this) || this.slidingTabIndicator.childrenNeedLayout()) {
            setScrollPosition(i, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int calculateScrollXForTab = calculateScrollXForTab(i, 0.0f);
        if (scrollX != calculateScrollXForTab) {
            ensureScrollAnimator();
            this.scrollAnimator.setIntValues(scrollX, calculateScrollXForTab);
            this.scrollAnimator.start();
        }
        this.slidingTabIndicator.animateIndicatorToPosition(i, this.tabIndicatorAnimationDuration);
    }

    private void applyGravityForModeScrollable(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return;
                }
            } else {
                this.slidingTabIndicator.setGravity(1);
                return;
            }
        }
        this.slidingTabIndicator.setGravity(8388611);
    }

    private C80267Vep createTabView(C78856UxA c78856UxA) {
        C80267Vep c80267Vep;
        InterfaceC15090iX<C80267Vep> interfaceC15090iX = this.tabViewPool;
        if (interfaceC15090iX == null || (c80267Vep = interfaceC15090iX.LIZIZ()) == null) {
            c80267Vep = new C80267Vep(this, getContext());
        }
        c80267Vep.setTab(c78856UxA);
        c80267Vep.setFocusable(true);
        c80267Vep.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c78856UxA.LIZLLL)) {
            c80267Vep.setContentDescription(c78856UxA.LIZJ);
        } else {
            c80267Vep.setContentDescription(c78856UxA.LIZLLL);
        }
        return c80267Vep;
    }

    private void dispatchTabReselected(C78856UxA c78856UxA) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC54357LUz) ListProtector.get(this.selectedListeners, size)).LIZJ(c78856UxA);
        }
    }

    private void dispatchTabSelected(C78856UxA c78856UxA) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC54357LUz) ListProtector.get(this.selectedListeners, size)).LIZIZ(c78856UxA);
        }
    }

    private void dispatchTabUnselected(C78856UxA c78856UxA) {
        for (int size = this.selectedListeners.size() - 1; size >= 0; size--) {
            ((InterfaceC54357LUz) ListProtector.get(this.selectedListeners, size)).LIZ(c78856UxA);
        }
    }

    private void removeTabViewAt(int i) {
        C80267Vep c80267Vep = (C80267Vep) this.slidingTabIndicator.getChildAt(i);
        INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_aweme_lancet_AsyncOperatorViewLancet_removeViewAt(this.slidingTabIndicator, i);
        if (c80267Vep != null) {
            c80267Vep.reset();
            this.tabViewPool.LIZ(c80267Vep);
        }
        requestLayout();
    }

    private void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.slidingTabIndicator.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.slidingTabIndicator.getChildAt(i2);
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

    private void updateTabViewLayoutParams(LinearLayout.LayoutParams layoutParams) {
        if (this.mode == 1 && this.tabGravity == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    public void addOnTabSelectedListener(InterfaceC54357LUz interfaceC54357LUz) {
        if (!this.selectedListeners.contains(interfaceC54357LUz)) {
            this.selectedListeners.add(interfaceC54357LUz);
        }
    }

    public void addTab(C78856UxA c78856UxA) {
        addTab(c78856UxA, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        addViewInternal(view);
    }

    public C78856UxA getTabAt(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (C78856UxA) ListProtector.get(this.tabs, i);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            if (childAt instanceof C80267Vep) {
                ((C80267Vep) childAt).drawBackground(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C17760mq(accessibilityNodeInfo).LJIILLIIL(C17730mn.LIZ(1, getTabCount(), 1));
    }

    public boolean releaseFromTabPool(C78856UxA c78856UxA) {
        return tabPool.LIZ(c78856UxA);
    }

    public void removeOnTabSelectedListener(InterfaceC54357LUz interfaceC54357LUz) {
        this.selectedListeners.remove(interfaceC54357LUz);
    }

    public void removeTab(C78856UxA c78856UxA) {
        if (c78856UxA.LJII == this) {
            removeTabAt(c78856UxA.LJ);
            return;
        }
        throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
    }

    public void removeTabAt(int i) {
        int i2;
        C78856UxA c78856UxA = this.selectedTab;
        if (c78856UxA != null) {
            i2 = c78856UxA.LJ;
        } else {
            i2 = 0;
        }
        removeTabViewAt(i);
        C78856UxA c78856UxA2 = (C78856UxA) ListProtector.remove(this.tabs, i);
        C78856UxA c78856UxA3 = null;
        if (c78856UxA2 != null) {
            c78856UxA2.LJII = null;
            c78856UxA2.LJIIIIZZ = null;
            c78856UxA2.LIZ = null;
            c78856UxA2.LIZIZ = null;
            c78856UxA2.LJIIIZ = -1;
            c78856UxA2.LIZJ = null;
            c78856UxA2.LIZLLL = null;
            c78856UxA2.LJ = -1;
            c78856UxA2.LJFF = null;
            releaseFromTabPool(c78856UxA2);
        }
        int size = this.tabs.size();
        for (int i3 = i; i3 < size; i3++) {
            ((C78856UxA) ListProtector.get(this.tabs, i3)).LJ = i3;
        }
        if (i2 == i) {
            if (!this.tabs.isEmpty()) {
                c78856UxA3 = (C78856UxA) ListProtector.get(this.tabs, Math.max(0, i - 1));
            }
            selectTab(c78856UxA3);
        }
    }

    public void selectTab(C78856UxA c78856UxA) {
        selectTab(c78856UxA, true);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        V1B.LJLJL(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.inlineLabel != z) {
            this.inlineLabel = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C80267Vep) {
                    ((C80267Vep) childAt).updateOrientation();
                }
            }
            applyModeAndGravity();
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setOnTabSelectedListener(InterfaceC54357LUz interfaceC54357LUz) {
        InterfaceC54357LUz interfaceC54357LUz2 = this.selectedListener;
        if (interfaceC54357LUz2 != null) {
            removeOnTabSelectedListener(interfaceC54357LUz2);
        }
        this.selectedListener = interfaceC54357LUz;
        if (interfaceC54357LUz != null) {
            addOnTabSelectedListener(interfaceC54357LUz);
        }
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        ensureScrollAnimator();
        this.scrollAnimator.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(C20110qd.LIZ(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.tabSelectedIndicatorColor = i;
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.tabIndicatorGravity != i) {
            this.tabIndicatorGravity = i;
            C16300kU.LJIIJ(this.slidingTabIndicator);
        }
    }

    public void setSelectedTabIndicatorHeight(int i) {
        this.slidingTabIndicator.setSelectedIndicatorHeight(i);
    }

    public void setTabGravity(int i) {
        if (this.tabGravity != i) {
            this.tabGravity = i;
            applyModeAndGravity();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.tabIconTint != colorStateList) {
            this.tabIconTint = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C04330Ez.LIZJ(i, getContext()));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.tabIndicatorAnimationMode = i;
        if (i != 0) {
            if (i == 1) {
                this.tabIndicatorInterpolator = new C80257Vef();
                return;
            }
            throw new IllegalArgumentException(C72972SkS.LIZLLL(i, " is not a valid TabIndicatorAnimationMode"));
        }
        this.tabIndicatorInterpolator = new C80256Vee();
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.tabIndicatorFullWidth = z;
        C16300kU.LJIIJ(this.slidingTabIndicator);
    }

    public void setTabMode(int i) {
        if (i != this.mode) {
            this.mode = i;
            applyModeAndGravity();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.tabRippleColorStateList != colorStateList) {
            this.tabRippleColorStateList = colorStateList;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C80267Vep) {
                    ((C80267Vep) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C04330Ez.LIZJ(i, getContext()));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.tabTextColors != colorStateList) {
            this.tabTextColors = colorStateList;
            updateAllTabs();
        }
    }

    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        setPagerAdapter(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.unboundedRipple != z) {
            this.unboundedRipple = z;
            for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
                View childAt = this.slidingTabIndicator.getChildAt(i);
                if (childAt instanceof C80267Vep) {
                    ((C80267Vep) childAt).updateBackgroundDrawable(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    public void updateTabViews(boolean z) {
        for (int i = 0; i < this.slidingTabIndicator.getChildCount(); i++) {
            View childAt = this.slidingTabIndicator.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            updateTabViewLayoutParams((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    public void addOnTabSelectedListener(LHW lhw) {
        addOnTabSelectedListener((InterfaceC54357LUz) lhw);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public void removeOnTabSelectedListener(LHW lhw) {
        removeOnTabSelectedListener((InterfaceC54357LUz) lhw);
    }

    public void setOnTabSelectedListener(LHW lhw) {
        setOnTabSelectedListener((InterfaceC54357LUz) lhw);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.tabSelectedIndicator != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.tabSelectedIndicator = drawable;
        }
    }

    public C80261Vej(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.bgp);
    }

    public static void INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_aweme_lancet_AsyncOperatorViewLancet_removeViewAt(C80258Veg c80258Veg, int i) {
        try {
            if (C78996UzQ.LJJIIJZLJL(c80258Veg.getChildAt(i))) {
                C78996UzQ.LJI();
            }
        } catch (Throwable unused) {
        }
        c80258Veg.removeViewAt(i);
    }

    private int calculateScrollXForTab(int i, float f) {
        View view;
        int i2;
        int i3 = this.mode;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        View childAt = this.slidingTabIndicator.getChildAt(i);
        int i5 = i + 1;
        if (i5 < this.slidingTabIndicator.getChildCount()) {
            view = this.slidingTabIndicator.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = ((i2 / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i6 = (int) ((i2 + i4) * 0.5f * f);
        if (C16310kV.LIZLLL(this) == 0) {
            return left + i6;
        }
        return left - i6;
    }

    private void configureTab(C78856UxA c78856UxA, int i) {
        c78856UxA.LJ = i;
        ListProtector.add(this.tabs, i, c78856UxA);
        int size = this.tabs.size();
        while (true) {
            i++;
            if (i < size) {
                ((C78856UxA) ListProtector.get(this.tabs, i)).LJ = i;
            } else {
                return;
            }
        }
    }

    public static ColorStateList createColorStateList(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    public void addTab(C78856UxA c78856UxA, int i) {
        addTab(c78856UxA, i, this.tabs.isEmpty());
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i) {
        addViewInternal(view);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int round = Math.round(C80250VeY.LIZIZ(getDefaultHeight(), getContext()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + round, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.requestedTabMaxWidth;
            if (i3 <= 0) {
                i3 = (int) (size - C80250VeY.LIZIZ(56, getContext()));
            }
            this.tabMaxWidth = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.mode;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), HorizontalScrollView.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    public void selectTab(C78856UxA c78856UxA, boolean z) {
        int i;
        C78856UxA c78856UxA2 = this.selectedTab;
        if (c78856UxA2 == c78856UxA) {
            if (c78856UxA2 != null) {
                dispatchTabReselected(c78856UxA);
                animateToTab(c78856UxA.LJ);
                return;
            }
            return;
        }
        if (c78856UxA != null) {
            i = c78856UxA.LJ;
        } else {
            i = -1;
        }
        if (z) {
            if ((c78856UxA2 == null || c78856UxA2.LJ == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                animateToTab(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.selectedTab = c78856UxA;
        if (c78856UxA2 != null) {
            dispatchTabUnselected(c78856UxA2);
        }
        if (c78856UxA == null) {
            return;
        }
        dispatchTabSelected(c78856UxA);
    }

    public void setPagerAdapter(PagerAdapter pagerAdapter, boolean z) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.pagerAdapter;
        if (pagerAdapter2 != null && (dataSetObserver = this.pagerAdapterObserver) != null) {
            pagerAdapter2.LJJII(dataSetObserver);
        }
        this.pagerAdapter = pagerAdapter;
        if (z && pagerAdapter != null) {
            if (this.pagerAdapterObserver == null) {
                this.pagerAdapterObserver = new C80263Vel(this);
            }
            pagerAdapter.LJIJ(this.pagerAdapterObserver);
        }
        INVOKEVIRTUAL_com_google_android_material_tabs_TabLayout_com_ss_android_ugc_aweme_profile_tab_profiletab_base_view_ProfileTabProxy_proxy(this);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(createColorStateList(i, i2));
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        setupWithViewPager(viewPager, z, false);
    }

    public void addTab(C78856UxA c78856UxA, boolean z) {
        addTab(c78856UxA, this.tabs.size(), z);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C80261Vej(android.content.Context r16, android.util.AttributeSet r17, int r18) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80261Vej.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private void setupWithViewPager(ViewPager viewPager, boolean z, boolean z2) {
        ViewPager viewPager2 = this.viewPager;
        if (viewPager2 != null) {
            C111134Xt c111134Xt = this.pageChangeListener;
            if (c111134Xt != null) {
                viewPager2.removeOnPageChangeListener(c111134Xt);
            }
            C80262Vek c80262Vek = this.adapterChangeListener;
            if (c80262Vek != null) {
                this.viewPager.removeOnAdapterChangeListener(c80262Vek);
            }
        }
        InterfaceC54357LUz interfaceC54357LUz = this.currentVpSelectedListener;
        if (interfaceC54357LUz != null) {
            removeOnTabSelectedListener(interfaceC54357LUz);
            this.currentVpSelectedListener = null;
        }
        if (viewPager != null) {
            this.viewPager = viewPager;
            if (this.pageChangeListener == null) {
                this.pageChangeListener = new C111134Xt(this);
            }
            C111134Xt c111134Xt2 = this.pageChangeListener;
            c111134Xt2.LJLJI = 0;
            c111134Xt2.LJLILLLLZI = 0;
            viewPager.addOnPageChangeListener(c111134Xt2);
            C4VB c4vb = new C4VB(viewPager);
            this.currentVpSelectedListener = c4vb;
            addOnTabSelectedListener((InterfaceC54357LUz) c4vb);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                setPagerAdapter(adapter, z);
            }
            if (this.adapterChangeListener == null) {
                this.adapterChangeListener = new C80262Vek(this);
            }
            C80262Vek c80262Vek2 = this.adapterChangeListener;
            c80262Vek2.LJLIL = z;
            viewPager.addOnAdapterChangeListener(c80262Vek2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.viewPager = null;
            setPagerAdapter(null, false);
        }
        this.setupViewPagerImplicitly = z2;
    }

    public void addTab(C78856UxA c78856UxA, int i, boolean z) {
        if (c78856UxA.LJII == this) {
            configureTab(c78856UxA, i);
            addTabView(c78856UxA);
            if (z) {
                c78856UxA.LIZIZ();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        addViewInternal(view);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round < 0 || round >= this.slidingTabIndicator.getChildCount()) {
            return;
        }
        if (z2) {
            this.slidingTabIndicator.setIndicatorPositionFromTabPosition(i, f);
        }
        ValueAnimator valueAnimator = this.scrollAnimator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.scrollAnimator.cancel();
        }
        scrollTo(calculateScrollXForTab(i, f), 0);
        if (!z) {
            return;
        }
        setSelectedTabView(round);
    }
}
