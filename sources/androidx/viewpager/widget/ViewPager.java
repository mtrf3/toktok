package androidx.viewpager.widget;

import X.AnonymousClass028;
import X.C04270Et;
import X.C08380Uo;
import X.C0C0;
import X.C0C1;
import X.C0C2;
import X.C0C3;
import X.C0C4;
import X.C0C5;
import X.C0C6;
import X.C16120kC;
import X.C16300kU;
import X.C16360ka;
import X.C38413F5t;
import X.C38414F5u;
import X.C78996UzQ;
import X.InterfaceC16710l9;
import X.X1D;
import Y.IDComparatorS28S0000000;
import Y.IDRunnableS85S0100000;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AqS73S0000000_6;
import o3.h0;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public int mActivePointerId;
    public PagerAdapter mAdapter;
    public List<C0C2> mAdapterChangeListeners;
    public int mBottomPageBounds;
    public boolean mCalledSuper;
    public int mChildHeightMeasureSpec;
    public int mChildWidthMeasureSpec;
    public int mCloseEnough;
    public int mCurItem;
    public int mDecorChildCount;
    public int mDefaultGutterSize;
    public int mDrawingOrder;
    public ArrayList<View> mDrawingOrderedChildren;
    public final Runnable mEndScrollRunnable;
    public int mExpectedAdapterCount;
    public long mFakeDragBeginTime;
    public boolean mFakeDragging;
    public boolean mFirstLayout;
    public float mFirstOffset;
    public int mFlingDistance;
    public int mGutterSize;
    public boolean mInLayout;
    public float mInitialMotionX;
    public float mInitialMotionY;
    public C0C3 mInternalPageChangeListener;
    public boolean mIsBeingDragged;
    public boolean mIsScrollStarted;
    public boolean mIsUnableToDrag;
    public final ArrayList<C0C1> mItems;
    public float mLastMotionX;
    public float mLastMotionY;
    public float mLastOffset;
    public EdgeEffect mLeftEdge;
    public Drawable mMarginDrawable;
    public int mMaximumVelocity;
    public int mMinimumVelocity;
    public boolean mNeedCalculatePageOffsets;
    public C0C5 mObserver;
    public int mOffscreenPageLimit;
    public C0C3 mOnPageChangeListener;
    public List<C0C3> mOnPageChangeListeners;
    public int mPageMargin;
    public C0C4 mPageTransformer;
    public int mPageTransformerLayerType;
    public boolean mPopulatePending;
    public Parcelable mRestoredAdapterState;
    public ClassLoader mRestoredClassLoader;
    public int mRestoredCurItem;
    public EdgeEffect mRightEdge;
    public int mScrollState;
    public Scroller mScroller;
    public boolean mScrollingCacheEnabled;
    public final C0C1 mTempItem;
    public final Rect mTempRect;
    public int mTopPageBounds;
    public int mTouchSlop;
    public VelocityTracker mVelocityTracker;
    public static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    public static final Comparator<C0C1> COMPARATOR = new IDComparatorS28S0000000(4);
    public static final Interpolator sInterpolator = new Interpolator() { // from class: X.0Bz
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return C06490Nh.LIZ(f2, f2, f2, f2, f2, 1.0f);
        }
    };
    public static final C0C6 sPositionComparator = new Comparator<View>() { // from class: X.0C6
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view.getLayoutParams();
            ViewPager.LayoutParams layoutParams2 = (ViewPager.LayoutParams) view2.getLayoutParams();
            boolean z = layoutParams.LIZ;
            if (z != layoutParams2.LIZ) {
                if (z) {
                    return 1;
                }
                return -1;
            }
            return layoutParams.position - layoutParams2.position;
        }
    };

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).LIZ) {
                try {
                    if (C78996UzQ.LJJIIJZLJL(getChildAt(i))) {
                        C78996UzQ.LJI();
                    }
                } catch (Throwable unused) {
                }
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (this.mLeftEdge.isFinished() || this.mRightEdge.isFinished()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            C16300kU.LJIIJ(this);
            return;
        }
        completeScroll(true);
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        h0.LJIJI(this, new C16120kC() { // from class: X.1CY
            /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
            
                if (r1 > 1) goto L6;
             */
            @Override // X.C16120kC
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onInitializeAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                /*
                    r2 = this;
                    super.onInitializeAccessibilityEvent(r3, r4)
                    java.lang.Class<androidx.viewpager.widget.ViewPager> r0 = androidx.viewpager.widget.ViewPager.class
                    java.lang.String r0 = r0.getName()
                    r4.setClassName(r0)
                    androidx.viewpager.widget.ViewPager r0 = androidx.viewpager.widget.ViewPager.this
                    androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                    if (r0 == 0) goto L40
                    int r1 = r0.getCount()
                    r0 = 1
                    if (r1 <= r0) goto L40
                L19:
                    r4.setScrollable(r0)
                    int r1 = r4.getEventType()
                    r0 = 4096(0x1000, float:5.74E-42)
                    if (r1 != r0) goto L3f
                    androidx.viewpager.widget.ViewPager r0 = androidx.viewpager.widget.ViewPager.this
                    androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                    if (r0 == 0) goto L3f
                    int r0 = r0.getCount()
                    r4.setItemCount(r0)
                    androidx.viewpager.widget.ViewPager r0 = androidx.viewpager.widget.ViewPager.this
                    int r0 = r0.mCurItem
                    r4.setFromIndex(r0)
                    androidx.viewpager.widget.ViewPager r0 = androidx.viewpager.widget.ViewPager.this
                    int r0 = r0.mCurItem
                    r4.setToIndex(r0)
                L3f:
                    return
                L40:
                    r0 = 0
                    goto L19
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1CY.onInitializeAccessibilityEvent(android.view.View, android.view.accessibility.AccessibilityEvent):void");
            }

            @Override // X.C16120kC
            public final void onInitializeAccessibilityNodeInfo(View view, C17760mq c17760mq) {
                boolean z;
                super.onInitializeAccessibilityNodeInfo(view, c17760mq);
                c17760mq.LJIILJJIL(ViewPager.class.getName());
                PagerAdapter pagerAdapter = ViewPager.this.mAdapter;
                if (pagerAdapter != null && pagerAdapter.getCount() > 1) {
                    z = true;
                } else {
                    z = false;
                }
                c17760mq.LJJII(z);
                if (ViewPager.this.canScrollHorizontally(1)) {
                    c17760mq.LIZ(4096);
                }
                if (ViewPager.this.canScrollHorizontally(-1)) {
                    c17760mq.LIZ(FileUtils.BUFFER_SIZE);
                }
            }

            @Override // X.C16120kC
            public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096) {
                    if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                        return false;
                    }
                    ViewPager viewPager = ViewPager.this;
                    viewPager.setCurrentItem(viewPager.mCurItem - 1);
                    return true;
                }
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        });
        if (C16300kU.LIZJ(this) == 0) {
            C16300kU.LJIJ(this, 1);
        }
        C16360ka.LJIJJ(this, new InterfaceC16710l9() { // from class: X.1CX
            public final Rect LIZ = new Rect();

            @Override // X.InterfaceC16710l9
            public final C16800lI LIZ(View view, C16800lI c16800lI) {
                C16800lI LJIILIIL = h0.LJIILIIL(view, c16800lI);
                if (LJIILIIL.LJI()) {
                    return LJIILIIL;
                }
                Rect rect = this.LIZ;
                rect.left = LJIILIIL.LIZJ();
                rect.top = LJIILIIL.LJ();
                rect.right = LJIILIIL.LIZLLL();
                rect.bottom = LJIILIIL.LIZIZ();
                int childCount = ViewPager.this.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C16800lI LIZIZ = h0.LIZIZ(ViewPager.this.getChildAt(i), LJIILIIL);
                    rect.left = Math.min(LIZIZ.LIZJ(), rect.left);
                    rect.top = Math.min(LIZIZ.LJ(), rect.top);
                    rect.right = Math.min(LIZIZ.LIZLLL(), rect.right);
                    rect.bottom = Math.min(LIZIZ.LIZIZ(), rect.bottom);
                }
                return LJIILIIL.LJIIIIZZ(rect.left, rect.top, rect.right, rect.bottom);
            }
        });
    }

    public void setAdapter(PagerAdapter pagerAdapter) {
        androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setViewPagerAdapter(this, pagerAdapter);
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.0By
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new ViewPager.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPager.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final ViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new ViewPager.SavedState(parcel, classLoader);
            }
        };
        public int LJLIL;
        public Parcelable LJLILLLLZI;
        public final ClassLoader LJLJI;

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("FragmentPager.SavedState{");
            LIZ.append(Integer.toHexString(System.identityHashCode(this)));
            LIZ.append(" position=");
            return C08380Uo.LIZ(LIZ, this.LJLIL, "}", LIZ);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readParcelable(classLoader);
            this.LJLJI = classLoader;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
            parcel.writeParcelable(this.LJLILLLLZI, i);
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public void clearOnPageChangeListeners() {
        List<C0C3> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void dataSetChanged() {
        boolean z;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z = true;
        } else {
            z = false;
        }
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, i2);
            int LJIIL = this.mAdapter.LJIIL(c0c1.LIZ);
            if (LJIIL != -1) {
                if (LJIIL == -2) {
                    ListProtector.remove(this.mItems, i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.LJJIFFI(this);
                        z2 = true;
                    }
                    this.mAdapter.LJIIIZ(c0c1.LIZIZ, this, c0c1.LIZ);
                    int i3 = this.mCurItem;
                    if (i3 == c0c1.LIZIZ) {
                        i = Math.max(0, Math.min(i3, count - 1));
                    }
                } else {
                    int i4 = c0c1.LIZIZ;
                    if (i4 != LJIIL) {
                        if (i4 == this.mCurItem) {
                            i = LJIIL;
                        }
                        c0c1.LIZIZ = LJIIL;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.LJIIJJI(this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.LIZ) {
                    layoutParams.LIZJ = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C0C1 infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.LIZIZ, ((scrollX / clientWidth) - infoForCurrentScrollPosition.LJ) / infoForCurrentScrollPosition.LIZLLL, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i > 0) {
            setCurrentItem(i - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && this.mCurItem < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C0C1 infoForCurrentScrollPosition() {
        float f;
        float f2;
        int i;
        int clientWidth = getClientWidth();
        float f3 = 0.0f;
        if (clientWidth > 0) {
            f = getScrollX() / clientWidth;
            f2 = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C0C1 c0c1 = null;
        float f4 = 0.0f;
        int i2 = -1;
        int i3 = 0;
        boolean z = true;
        while (i3 < this.mItems.size()) {
            C0C1 c0c12 = (C0C1) ListProtector.get(this.mItems, i3);
            if (!z && c0c12.LIZIZ != (i = i2 + 1)) {
                c0c12 = this.mTempItem;
                c0c12.LJ = f3 + f4 + f2;
                c0c12.LIZIZ = i;
                c0c12.LIZLLL = this.mAdapter.LJIILJJIL(i);
                i3--;
            }
            f3 = c0c12.LJ;
            float f5 = c0c12.LIZLLL + f3 + f2;
            if (z || f >= f3) {
                if (f < f5 || i3 == this.mItems.size() - 1) {
                    return c0c12;
                }
                i2 = c0c12.LIZIZ;
                f4 = c0c12.LIZLLL;
                i3++;
                z = false;
                c0c1 = c0c12;
            } else {
                return c0c1;
            }
        }
        return c0c1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LJLIL = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            savedState.LJLILLLLZI = pagerAdapter.LJIJJ();
        }
        return savedState;
    }

    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public ViewPager(Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0C1();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new IDRunnableS85S0100000(this, 32);
        this.mScrollState = 0;
        initViewPager();
    }

    private void completeScroll(boolean z) {
        boolean z2;
        if (this.mScrollState == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        } else {
            z2 = false;
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, i);
            if (c0c1.LIZJ) {
                c0c1.LIZJ = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                C16300kU.LJIIL(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private void dispatchOnPageSelected(int i) {
        C0C3 c0c3 = this.mOnPageChangeListener;
        if (c0c3 != null) {
            c0c3.onPageSelected(i);
        }
        List<C0C3> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0C3 c0c32 = (C0C3) ListProtector.get(this.mOnPageChangeListeners, i2);
                if (c0c32 != null) {
                    c0c32.onPageSelected(i);
                }
            }
        }
        C0C3 c0c33 = this.mInternalPageChangeListener;
        if (c0c33 != null) {
            c0c33.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        C0C3 c0c3 = this.mOnPageChangeListener;
        if (c0c3 != null) {
            c0c3.onPageScrollStateChanged(i);
        }
        List<C0C3> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0C3 c0c32 = (C0C3) ListProtector.get(this.mOnPageChangeListeners, i2);
                if (c0c32 != null) {
                    c0c32.onPageScrollStateChanged(i);
                }
            }
        }
        C0C3 c0c33 = this.mInternalPageChangeListener;
        if (c0c33 != null) {
            c0c33.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int i;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (z) {
                i = this.mPageTransformerLayerType;
            } else {
                i = 0;
            }
            getChildAt(i2).setLayerType(i, null);
        }
    }

    public static boolean isDecorView(View view) {
        if (view.getClass().getAnnotation(C0C0.class) != null) {
            return true;
        }
        return false;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        C0C1 infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i2 = this.mPageMargin;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = infoForCurrentScrollPosition.LIZIZ;
        float f3 = ((i / f2) - infoForCurrentScrollPosition.LJ) / (infoForCurrentScrollPosition.LIZLLL + (f / f2));
        this.mCalledSuper = false;
        onPageScrolled(i4, f3, (int) (i3 * f3));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, 0);
        ArrayList<C0C1> arrayList = this.mItems;
        C0C1 c0c12 = (C0C1) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        if (c0c1.LIZIZ != 0) {
            f3 = c0c1.LJ * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c0c12.LIZIZ != this.mAdapter.getCount() - 1) {
            f4 = c0c12.LJ * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    public void addOnAdapterChangeListener(C0C2 c0c2) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(c0c2);
    }

    public void addOnPageChangeListener(C0C3 c0c3) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(c0c3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        C0C1 infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.0C5] */
    public void androidx_viewpager_widget_ViewPager__setAdapter$___twin___(PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.LJJ(null);
            this.mAdapter.LJJIFFI(this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, i);
                this.mAdapter.LJIIIZ(c0c1.LIZIZ, this, c0c1.LIZ);
            }
            this.mAdapter.LJIIJJI(this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        PagerAdapter pagerAdapter3 = this.mAdapter;
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new DataSetObserver() { // from class: X.0C5
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        ViewPager.this.dataSetChanged();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        ViewPager.this.dataSetChanged();
                    }
                };
            }
            this.mAdapter.LJJ(this.mObserver);
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.LJIJI(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<C0C2> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C0C2) ListProtector.get(this.mAdapterChangeListeners, i2)).LIZIZ(this, pagerAdapter3, pagerAdapter);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r3 = r6.findFocus()
            r5 = 1
            r2 = 0
            r4 = 0
            if (r3 != r6) goto L76
        L9:
            r3 = r4
        La:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r4 = r0.findNextFocus(r6, r3, r7)
            r1 = 66
            r0 = 17
            if (r4 == 0) goto L63
            if (r4 == r3) goto L63
            if (r7 != r0) goto L43
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L3e
            if (r1 < r0) goto L3e
            boolean r2 = r6.pageLeft()
        L34:
            if (r2 == 0) goto L3d
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r0)
        L3d:
            return r2
        L3e:
            boolean r2 = r4.requestFocus()
            goto L34
        L43:
            if (r7 != r1) goto L3d
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r4)
            int r1 = r0.left
            android.graphics.Rect r0 = r6.mTempRect
            android.graphics.Rect r0 = r6.getChildRectInPagerCoordinates(r0, r3)
            int r0 = r0.left
            if (r3 == 0) goto L5e
            if (r1 > r0) goto L5e
            boolean r2 = r6.pageRight()
            goto L34
        L5e:
            boolean r2 = r4.requestFocus()
            goto L34
        L63:
            if (r7 == r0) goto L67
            if (r7 != r5) goto L6c
        L67:
            boolean r2 = r6.pageLeft()
            goto L34
        L6c:
            if (r7 == r1) goto L71
            r0 = 2
            if (r7 != r0) goto L3d
        L71:
            boolean r2 = r6.pageRight()
            goto L34
        L76:
            if (r3 == 0) goto La
            android.view.ViewParent r1 = r3.getParent()
        L7c:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L88
            if (r1 != r6) goto L83
            goto La
        L83:
            android.view.ViewParent r1 = r1.getParent()
            goto L7c
        L88:
            java.lang.Class r0 = r3.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r3.getParent()
        L93:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L9
            java.lang.Class r0 = r1.getClass()
            X.C16880lQ.LJLLJ(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L93
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C0C1 infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((f - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (pagerAdapter = this.mAdapter) != null && pagerAdapter.getCount() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                C16300kU.LJIIJ(this);
                return;
            }
            return;
        }
        this.mLeftEdge.finish();
        this.mRightEdge.finish();
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return pageRight();
                    }
                    return arrowScroll(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f;
            float scrollX = getScrollX() - f;
            float clientWidth = getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, 0);
            C0C1 c0c12 = (C0C1) ListProtector.get(this.mItems, r1.size() - 1);
            if (c0c1.LIZIZ != 0) {
                f2 = c0c1.LJ * clientWidth;
            }
            if (c0c12.LIZIZ != this.mAdapter.getCount() - 1) {
                f3 = c0c12.LJ * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX = (scrollX - i) + this.mLastMotionX;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public C0C1 infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent == null || !(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } else {
                return infoForChild(view);
            }
        }
    }

    public C0C1 infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, i);
            if (this.mAdapter.LJIIZILJ(view, c0c1.LIZ)) {
                return c0c1;
            }
        }
        return null;
    }

    public C0C1 infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, i2);
            if (c0c1.LIZIZ == i) {
                return c0c1;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        float f;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f2 = this.mPageMargin / width;
            int i2 = 0;
            C0C1 c0c1 = (C0C1) ListProtector.get(this.mItems, 0);
            float f3 = c0c1.LJ;
            int size = this.mItems.size();
            int i3 = ((C0C1) ListProtector.get(this.mItems, size - 1)).LIZIZ;
            for (int i4 = c0c1.LIZIZ; i4 < i3; i4++) {
                while (true) {
                    i = c0c1.LIZIZ;
                    if (i4 <= i || i2 >= size) {
                        break;
                    }
                    i2++;
                    c0c1 = (C0C1) ListProtector.get(this.mItems, i2);
                }
                if (i4 == i) {
                    float f4 = c0c1.LJ;
                    float f5 = c0c1.LIZLLL;
                    f = (f4 + f5) * width;
                    f3 = f4 + f5 + f2;
                } else {
                    float LJIILJJIL = this.mAdapter.LJIILJJIL(i4);
                    f = (f3 + LJIILJJIL) * width;
                    f3 = LJIILJJIL + f2 + f3;
                }
                if (this.mPageMargin + f > scrollX) {
                    this.mMarginDrawable.setBounds(Math.round(f), this.mTopPageBounds, Math.round(this.mPageMargin + f), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                }
                if (f > scrollX + r9) {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action != 0) {
            if (action != 2) {
                if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                }
            } else {
                int i = this.mActivePointerId;
                if (i != -1) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float f2 = x - this.mLastMotionX;
                    float abs = Math.abs(f2);
                    float y = motionEvent.getY(findPointerIndex);
                    float abs2 = Math.abs(y - this.mInitialMotionY);
                    if (f2 != 0.0f && !isGutterDrag(this.mLastMotionX, f2) && canScroll(this, false, (int) f2, (int) x, (int) y)) {
                        this.mLastMotionX = x;
                        this.mLastMotionY = y;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                    int i2 = this.mTouchSlop;
                    if (abs > i2 && abs * 0.5f > abs2) {
                        this.mIsBeingDragged = true;
                        requestParentDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        float f3 = this.mInitialMotionX;
                        float f4 = this.mTouchSlop;
                        if (f2 > 0.0f) {
                            f = f3 + f4;
                        } else {
                            f = f3 - f4;
                        }
                        this.mLastMotionX = f;
                        this.mLastMotionY = y;
                        setScrollingCacheEnabled(true);
                    } else if (abs2 > i2) {
                        this.mIsUnableToDrag = true;
                    }
                    if (this.mIsBeingDragged && performDrag(x)) {
                        C16300kU.LJIIJ(this);
                    }
                }
            }
        } else {
            float x2 = motionEvent.getX();
            this.mInitialMotionX = x2;
            this.mLastMotionX = x2;
            float y2 = motionEvent.getY();
            this.mInitialMotionY = y2;
            this.mLastMotionY = y2;
            this.mActivePointerId = motionEvent.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            } else {
                completeScroll(false);
                this.mIsBeingDragged = false;
            }
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        return this.mIsBeingDragged;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            pagerAdapter.LJIJI(savedState.LJLILLLLZI, savedState.LJLJI);
            setCurrentItemInternal(savedState.LJLIL, false, true);
        } else {
            this.mRestoredCurItem = savedState.LJLIL;
            this.mRestoredAdapterState = savedState.LJLILLLLZI;
            this.mRestoredClassLoader = savedState.LJLJI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r1 == r0) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void removeOnAdapterChangeListener(C0C2 c0c2) {
        List<C0C2> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(c0c2);
        }
    }

    public void removeOnPageChangeListener(C0C3 c0c3) {
        List<C0C3> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(c0c3);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            if (C78996UzQ.LJJIIJZLJL(view)) {
                C78996UzQ.LJI();
            }
            removeViewInLayout(view);
            return;
        }
        super.removeView(view);
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public C0C3 setInternalPageChangeListener(C0C3 c0c3) {
        C0C3 c0c32 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = c0c3;
        return c0c32;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    public void setOnPageChangeListener(C0C3 c0c3) {
        this.mOnPageChangeListener = c0c3;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        boolean z;
        if (this.mScrollState == i) {
            return;
        }
        this.mScrollState = i;
        if (this.mPageTransformer != null) {
            if (i != 0) {
                z = true;
            } else {
                z = false;
            }
            enableLayers(z);
        }
        dispatchOnScrollStateChanged(i);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.mMarginDrawable) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(C04270Et.LIZIZ(getContext(), i));
    }

    /* loaded from: classes.dex */
    public static class LayoutParams extends ViewGroup.LayoutParams {
        public boolean LIZ;
        public final int LIZIZ;
        public float LIZJ;
        public boolean LIZLLL;
        public int LJ;
        public int position;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.LIZIZ = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new C0C1();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new IDRunnableS85S0100000(this, 32);
        this.mScrollState = 0;
        initViewPager();
    }

    public static void androidx_viewpager_widget_ViewPager_com_ss_android_ugc_aweme_feed_lancet_JatoBoostLancet_setViewPagerAdapter(ViewPager viewPager, PagerAdapter pagerAdapter) {
        if (viewPager != null) {
            C38414F5u c38414F5u = C38413F5t.LIZIZ;
            viewPager.removeOnPageChangeListener(c38414F5u);
            viewPager.addOnPageChangeListener(c38414F5u);
        }
        if (C38413F5t.LIZ("setViewPagerAdapter")) {
            try {
                new AqS73S0000000_6(2).invoke();
            } catch (Throwable unused) {
            }
        }
        viewPager.androidx_viewpager_widget_ViewPager__setAdapter$___twin___(pagerAdapter);
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        Object parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            View view2 = (View) parent;
            rect.left = view2.getLeft() + rect.left;
            rect.right = view2.getRight() + rect.right;
            rect.top = view2.getTop() + rect.top;
            rect.bottom = view2.getBottom() + rect.bottom;
            parent = view2.getParent();
        }
        return rect;
    }

    private boolean isGutterDrag(float f, float f2) {
        if ((f < this.mGutterSize && f2 > 0.0f) || (f > getWidth() - this.mGutterSize && f2 < 0.0f)) {
            return true;
        }
        return false;
    }

    public C0C1 addNewItem(int i, int i2) {
        C0C1 c0c1 = new C0C1();
        c0c1.LIZIZ = i;
        c0c1.LIZ = this.mAdapter.LJIILLIIL(i, this);
        c0c1.LIZLLL = this.mAdapter.LJIILJJIL(i);
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(c0c1);
        } else {
            ListProtector.add(this.mItems, i2, c0c1);
        }
        return c0c1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) ((View) ListProtector.get(this.mDrawingOrderedChildren, i2)).getLayoutParams()).LJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C0C1 infoForChild;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i2 = 0;
            i3 = 1;
        } else {
            i2 = childCount - 1;
            childCount = -1;
            i3 = -1;
        }
        while (i2 != childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i3;
        }
        return false;
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageTransformer(boolean z, C0C4 c0c4) {
        setPageTransformer(z, c0c4, 2);
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    private void calculatePageOffsets(C0C1 c0c1, int i, C0C1 c0c12) {
        float f;
        float f2;
        float f3;
        int i2;
        int i3;
        C0C1 c0c13;
        C0C1 c0c14;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f = this.mPageMargin / clientWidth;
        } else {
            f = 0.0f;
        }
        if (c0c12 != null) {
            int i4 = c0c12.LIZIZ;
            int i5 = c0c1.LIZIZ;
            if (i4 < i5) {
                float f4 = c0c12.LJ + c0c12.LIZLLL + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= c0c1.LIZIZ && i7 < this.mItems.size()) {
                    Object obj = ListProtector.get(this.mItems, i7);
                    while (true) {
                        c0c14 = (C0C1) obj;
                        if (i6 <= c0c14.LIZIZ || i7 >= this.mItems.size() - 1) {
                            break;
                        }
                        i7++;
                        obj = ListProtector.get(this.mItems, i7);
                    }
                    while (i6 < c0c14.LIZIZ) {
                        f4 += this.mAdapter.LJIILJJIL(i6) + f;
                        i6++;
                    }
                    c0c14.LJ = f4;
                    f4 += c0c14.LIZLLL + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f5 = c0c12.LJ;
                int i8 = i4 - 1;
                while (i8 >= c0c1.LIZIZ && size >= 0) {
                    Object obj2 = ListProtector.get(this.mItems, size);
                    while (true) {
                        c0c13 = (C0C1) obj2;
                        if (i8 >= c0c13.LIZIZ || size <= 0) {
                            break;
                        }
                        size--;
                        obj2 = ListProtector.get(this.mItems, size);
                    }
                    while (i8 > c0c13.LIZIZ) {
                        f5 -= this.mAdapter.LJIILJJIL(i8) + f;
                        i8--;
                    }
                    f5 -= c0c13.LIZLLL + f;
                    c0c13.LJ = f5;
                    i8--;
                }
            }
        }
        int size2 = this.mItems.size();
        float f6 = c0c1.LJ;
        int i9 = c0c1.LIZIZ;
        int i10 = i9 - 1;
        if (i9 == 0) {
            f2 = f6;
        } else {
            f2 = -3.4028235E38f;
        }
        this.mFirstOffset = f2;
        int i11 = count - 1;
        if (i9 == i11) {
            f3 = (c0c1.LIZLLL + f6) - 1.0f;
        } else {
            f3 = Float.MAX_VALUE;
        }
        this.mLastOffset = f3;
        int i12 = i - 1;
        while (i12 >= 0) {
            C0C1 c0c15 = (C0C1) ListProtector.get(this.mItems, i12);
            while (true) {
                i3 = c0c15.LIZIZ;
                if (i10 <= i3) {
                    break;
                }
                f6 -= this.mAdapter.LJIILJJIL(i10) + f;
                i10--;
            }
            f6 -= c0c15.LIZLLL + f;
            c0c15.LJ = f6;
            if (i3 == 0) {
                this.mFirstOffset = f6;
            }
            i12--;
            i10--;
        }
        float f7 = c0c1.LJ + c0c1.LIZLLL + f;
        int i13 = c0c1.LIZIZ + 1;
        int i14 = i + 1;
        while (i14 < size2) {
            C0C1 c0c16 = (C0C1) ListProtector.get(this.mItems, i14);
            while (true) {
                i2 = c0c16.LIZIZ;
                if (i13 >= i2) {
                    break;
                }
                f7 += this.mAdapter.LJIILJJIL(i13) + f;
                i13++;
            }
            if (i2 == i11) {
                this.mLastOffset = (c0c16.LIZLLL + f7) - 1.0f;
            }
            c0c16.LJ = f7;
            f7 += c0c16.LIZLLL + f;
            i14++;
            i13++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        C0C3 c0c3 = this.mOnPageChangeListener;
        if (c0c3 != null) {
            c0c3.onPageScrolled(i, f, i2);
        }
        List<C0C3> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C0C3 c0c32 = (C0C3) ListProtector.get(this.mOnPageChangeListeners, i3);
                if (c0c32 != null) {
                    c0c32.onPageScrolled(i, f, i2);
                }
            }
        }
        C0C3 c0c33 = this.mInternalPageChangeListener;
        if (c0c33 != null) {
            c0c33.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C0C1 infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.LIZIZ == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (!isFocusable()) {
            return;
        }
        if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.LIZ | isDecorView(view);
        layoutParams2.LIZ = isDecorView;
        if (this.mInLayout) {
            if (!isDecorView) {
                layoutParams2.LIZLLL = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.mDecorChildCount
            r6 = 0
            r5 = 1
            if (r0 <= 0) goto L6a
            int r10 = r11.getScrollX()
            int r7 = r11.getPaddingLeft()
            int r9 = r11.getPaddingRight()
            int r8 = r11.getWidth()
            int r4 = r11.getChildCount()
            r3 = 0
        L1b:
            if (r3 >= r4) goto L6a
            android.view.View r2 = r11.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r1 = (androidx.viewpager.widget.ViewPager.LayoutParams) r1
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L2e
        L2b:
            int r3 = r3 + 1
            goto L1b
        L2e:
            int r0 = r1.LIZIZ
            r1 = r0 & 7
            if (r1 == r5) goto L4e
            r0 = 3
            if (r1 == r0) goto L48
            r0 = 5
            if (r1 == r0) goto L5b
            r0 = r7
        L3b:
            int r7 = r7 + r10
            int r1 = r2.getLeft()
            int r7 = r7 - r1
            if (r7 == 0) goto L46
            r2.offsetLeftAndRight(r7)
        L46:
            r7 = r0
            goto L2b
        L48:
            int r0 = r2.getWidth()
            int r0 = r0 + r7
            goto L3b
        L4e:
            int r0 = r2.getMeasuredWidth()
            int r0 = r8 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r7)
            goto L67
        L5b:
            int r1 = r8 - r9
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredWidth()
            int r9 = r9 + r0
        L67:
            r0 = r7
            r7 = r1
            goto L3b
        L6a:
            r11.dispatchOnPageScrolled(r12, r13, r14)
            X.0C4 r0 = r11.mPageTransformer
            if (r0 == 0) goto L9e
            int r4 = r11.getScrollX()
            int r3 = r11.getChildCount()
        L79:
            if (r6 >= r3) goto L9e
            android.view.View r2 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r2.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.LIZ
            if (r0 == 0) goto L8c
        L89:
            int r6 = r6 + 1
            goto L79
        L8c:
            int r0 = r2.getLeft()
            int r0 = r0 - r4
            float r1 = (float) r0
            int r0 = r11.getClientWidth()
            float r0 = (float) r0
            float r1 = r1 / r0
            X.0C4 r0 = r11.mPageTransformer
            r0.LIZ(r2, r1)
            goto L89
        L9e:
            r11.mCalledSuper = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public void setPageTransformer(boolean z, C0C4 c0c4, int i) {
        boolean z2;
        boolean z3;
        boolean z4;
        int i2 = 1;
        if (c0c4 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.mPageTransformer != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.mPageTransformer = c0c4;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z4) {
            populate();
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            if (this.mIsScrollStarted) {
                scrollX = this.mScroller.getCurrX();
            } else {
                scrollX = this.mScroller.getStartX();
            }
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int scrollY = getScrollY();
        int i4 = i - scrollX;
        int i5 = i2 - scrollY;
        if (i4 == 0 && i5 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        float f = clientWidth;
        float f2 = clientWidth / 2;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i4) * 1.0f) / f)) * f2) + f2;
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i4) / ((this.mAdapter.LJIILJJIL(this.mCurItem) * f) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(scrollX, scrollY, i4, i5, min);
        C16300kU.LJIIJ(this);
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        float f2;
        if (Math.abs(i3) > this.mFlingDistance && Math.abs(i2) > this.mMinimumVelocity) {
            if (i2 <= 0) {
                i++;
            }
        } else {
            if (i >= this.mCurItem) {
                f2 = 0.4f;
            } else {
                f2 = 0.6f;
            }
            i += (int) (f + f2);
        }
        if (this.mItems.size() > 0) {
            return Math.max(((C0C1) ListProtector.get(this.mItems, 0)).LIZIZ, Math.min(i, ((C0C1) ListProtector.get(this.mItems, r1.size() - 1)).LIZIZ));
        }
        return i;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        float f;
        if (i2 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
            return;
        }
        C0C1 infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f = Math.min(infoForPosition.LJ, this.mLastOffset);
        } else {
            f = 0.0f;
        }
        int paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft == getScrollX()) {
            return;
        }
        completeScroll(false);
        scrollTo(paddingLeft, getScrollY());
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C0C1 infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.LJ, this.mLastOffset)) * getClientWidth());
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        PagerAdapter pagerAdapter = this.mAdapter;
        boolean z3 = false;
        if (pagerAdapter == null || pagerAdapter.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.mCurItem == i && this.mItems.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.mAdapter.getCount()) {
            i = this.mAdapter.getCount() - 1;
        }
        int i3 = this.mOffscreenPageLimit;
        int i4 = this.mCurItem;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                ((C0C1) ListProtector.get(this.mItems, i5)).LIZJ = true;
            }
        }
        if (this.mCurItem != i) {
            z3 = true;
        }
        if (this.mFirstLayout) {
            this.mCurItem = i;
            if (z3) {
                dispatchOnPageSelected(i);
            }
            requestLayout();
            return;
        }
        populate(i);
        scrollToItem(i, z, i2, z3);
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }
}
