package X;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2$SavedState;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.util.ArrayList;
import o3.h0;

/* renamed from: X.0CM, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0CM extends ViewGroup {
    public final Rect LJLIL;
    public final Rect LJLILLLLZI;
    public final C29171Cn LJLJI;
    public int LJLJJI;
    public boolean LJLJJL;
    public final C40321i8 LJLJJLL;
    public C40331i9 LJLJL;
    public int LJLJLJ;
    public Parcelable LJLJLLL;
    public C45681qm LJLL;
    public C45671ql LJLLI;
    public C29191Cp LJLLILLLL;
    public C29171Cn LJLLJ;
    public C0CO LJLLL;
    public C29181Co LJLLLL;
    public AbstractC030109x LJLLLLLL;
    public boolean LJLZ;
    public boolean LJZ;
    public int LJZI;
    public C29161Cm LJZL;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ() {
        AbstractC029409q adapter;
        if (this.LJLJLJ == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.LJLJLLL;
        if (parcelable != null) {
            if (adapter instanceof C0CG) {
                ((C0CG) adapter).LJJJJI(parcelable);
            }
            this.LJLJLLL = null;
        }
        int max = Math.max(0, Math.min(this.LJLJLJ, adapter.getItemCount() - 1));
        this.LJLJJI = max;
        this.LJLJLJ = -1;
        LJLI(max);
        this.LJZL.LIZIZ();
    }

    public final void LJFF() {
        C45671ql c45671ql = this.LJLLI;
        if (c45671ql != null) {
            View LJFF = c45671ql.LJFF(this.LJLJL);
            if (LJFF == null) {
                return;
            }
            getClass();
            int LJJJLL = C0A2.LJJJLL(LJFF);
            if (LJJJLL != this.LJLJJI && getScrollState() == 0) {
                this.LJLLJ.LIZJ(LJJJLL);
            }
            this.LJLJJL = false;
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        this.LJZL.getClass();
        this.LJZL.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public AbstractC029409q getAdapter() {
        return getAdapter();
    }

    public int getItemDecorationCount() {
        return getItemDecorationCount();
    }

    public int getOrientation() {
        return this.LJLJL.LJLZ;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        C45681qm c45681qm = this.LJLL;
        if (getOrientation() == 0) {
            height = c45681qm.getWidth() - c45681qm.getPaddingLeft();
            paddingBottom = c45681qm.getPaddingRight();
        } else {
            height = c45681qm.getHeight() - c45681qm.getPaddingTop();
            paddingBottom = c45681qm.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.LJLLILLLL.LJLJJLL;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ViewPager2$SavedState viewPager2$SavedState = new ViewPager2$SavedState(super.onSaveInstanceState());
        viewPager2$SavedState.LJLIL = getId();
        int i = this.LJLJLJ;
        if (i == -1) {
            i = this.LJLJJI;
        }
        viewPager2$SavedState.LJLILLLLZI = i;
        Parcelable parcelable = this.LJLJLLL;
        if (parcelable != null) {
            viewPager2$SavedState.LJLJI = parcelable;
        } else {
            Object adapter = getAdapter();
            if (adapter instanceof C0CG) {
                viewPager2$SavedState.LJLJI = ((C0CG) adapter).saveState();
            }
        }
        return viewPager2$SavedState;
    }

    public int getCurrentItem() {
        return this.LJLJJI;
    }

    public int getOffscreenPageLimit() {
        return this.LJZI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1i8] */
    public C0CM(Context context) {
        super(context);
        this.LJLIL = new Rect();
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new C29171Cn();
        this.LJLJJL = false;
        this.LJLJJLL = new AbstractC29131Cj() { // from class: X.1i8
            @Override // X.AbstractC29131Cj, X.AbstractC029609s
            public final void LIZJ() {
                C0CM c0cm = C0CM.this;
                c0cm.LJLJJL = true;
                c0cm.LJLLILLLL.LJLLILLLL = true;
            }

            {
                super(0);
            }
        };
        this.LJLJLJ = -1;
        this.LJLLLLLL = null;
        this.LJLZ = false;
        this.LJZ = true;
        this.LJZI = -1;
        LIZ(context, null);
    }

    public final void LIZIZ(C0CJ c0cj) {
        ((ArrayList) this.LJLJI.LJLIL).add(c0cj);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof ViewPager2$SavedState) {
            int i = ((ViewPager2$SavedState) parcelable).LJLIL;
            sparseArray.put(getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        LIZJ();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C29161Cm c29161Cm = this.LJZL;
        c29161Cm.getClass();
        C17760mq c17760mq = new C17760mq(accessibilityNodeInfo);
        if (c29161Cm.LIZLLL.getAdapter() != null) {
            if (c29161Cm.LIZLLL.getOrientation() == 1) {
                i = c29161Cm.LIZLLL.getAdapter().getItemCount();
                i2 = 1;
            } else {
                i2 = c29161Cm.LIZLLL.getAdapter().getItemCount();
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        c17760mq.LJIILLIIL(C17730mn.LIZ(i, i2, 0));
        AbstractC029409q adapter = c29161Cm.LIZLLL.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0) {
            return;
        }
        C0CM c0cm = c29161Cm.LIZLLL;
        if (!c0cm.LJZ) {
            return;
        }
        if (c0cm.LJLJJI > 0) {
            c17760mq.LIZ(FileUtils.BUFFER_SIZE);
        }
        if (c29161Cm.LIZLLL.LJLJJI < itemCount - 1) {
            c17760mq.LIZ(4096);
        }
        c17760mq.LJJII(true);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ViewPager2$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ViewPager2$SavedState viewPager2$SavedState = (ViewPager2$SavedState) parcelable;
        super.onRestoreInstanceState(viewPager2$SavedState.getSuperState());
        this.LJLJLJ = viewPager2$SavedState.LJLILLLLZI;
        this.LJLJLLL = viewPager2$SavedState.LJLJI;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(C0CM.class));
        LIZ.append(" does not support direct child views");
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    public void setAdapter(AbstractC029409q abstractC029409q) {
        AbstractC029409q adapter = getAdapter();
        C29161Cm c29161Cm = this.LJZL;
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(c29161Cm.LIZJ);
            adapter.unregisterAdapterDataObserver(this.LJLJJLL);
        } else {
            c29161Cm.getClass();
        }
        setAdapter(abstractC029409q);
        this.LJLJJI = 0;
        LIZJ();
        C29161Cm c29161Cm2 = this.LJZL;
        c29161Cm2.LIZIZ();
        if (abstractC029409q != null) {
            abstractC029409q.registerAdapterDataObserver(c29161Cm2.LIZJ);
            abstractC029409q.registerAdapterDataObserver(this.LJLJJLL);
        }
    }

    public void setCurrentItem(int i) {
        LIZLLL(i, true);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.LJZL.LIZIZ();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.LJZI = i;
            requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        LLJJIII(i);
        this.LJZL.LIZIZ();
    }

    public void setPageTransformer(C0CK c0ck) {
        if (c0ck != null) {
            if (!this.LJLZ) {
                this.LJLLLLLL = getItemAnimator();
                this.LJLZ = true;
            }
            setItemAnimator(null);
        } else if (this.LJLZ) {
            setItemAnimator(this.LJLLLLLL);
            this.LJLLLLLL = null;
            this.LJLZ = false;
        }
        C29181Co c29181Co = this.LJLLLL;
        if (c0ck == c29181Co.LJLILLLLZI) {
            return;
        }
        c29181Co.LJLILLLLZI = c0ck;
        if (c0ck == null) {
            return;
        }
        C29191Cp c29191Cp = this.LJLLILLLL;
        c29191Cp.LJIJJ();
        C0CP c0cp = c29191Cp.LJLJL;
        double d = c0cp.LIZ + c0cp.LIZIZ;
        int i = (int) d;
        float f = (float) (d - i);
        this.LJLLLL.LIZIZ(i, f, Math.round(getPageSize() * f));
    }

    public void setUserInputEnabled(boolean z) {
        this.LJZ = z;
        this.LJZL.LIZIZ();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1i8] */
    public C0CM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJLIL = new Rect();
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new C29171Cn();
        this.LJLJJL = false;
        this.LJLJJLL = new AbstractC29131Cj() { // from class: X.1i8
            @Override // X.AbstractC29131Cj, X.AbstractC029609s
            public final void LIZJ() {
                C0CM c0cm = C0CM.this;
                c0cm.LJLJJL = true;
                c0cm.LJLLILLLL.LJLLILLLL = true;
            }

            {
                super(0);
            }
        };
        this.LJLJLJ = -1;
        this.LJLLLLLL = null;
        this.LJLZ = false;
        this.LJZ = true;
        this.LJZI = -1;
        LIZ(context, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, X.1qm] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1i9, X.0A2] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.1Br, X.1ql] */
    public final void LIZ(final Context context, AttributeSet attributeSet) {
        this.LJZL = new C29161Cm(this);
        ?? r1 = new RecyclerView(context) { // from class: X.1qm
            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
            public final CharSequence getAccessibilityClassName() {
                C0CM.this.LJZL.getClass();
                return super.getAccessibilityClassName();
            }

            @Override // android.view.View
            public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
                super.onInitializeAccessibilityEvent(accessibilityEvent);
                accessibilityEvent.setFromIndex(C0CM.this.LJLJJI);
                accessibilityEvent.setToIndex(C0CM.this.LJLJJI);
                accessibilityEvent.setSource(C0CM.this.LJZL.LIZLLL);
                accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (C0CM.this.LJZ && super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }

            @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                if (C0CM.this.LJZ && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            }
        };
        this.LJLL = r1;
        r1.setId(View.generateViewId());
        setDescendantFocusability(131072);
        ?? r12 = new LinearLayoutManager() { // from class: X.1i9
            @Override // X.C0A2
            public final boolean LJLLLLLL(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void LLIIIL(C0AC c0ac, int[] iArr) {
                int offscreenPageLimit = C0CM.this.getOffscreenPageLimit();
                if (offscreenPageLimit == -1) {
                    super.LLIIIL(c0ac, iArr);
                    return;
                }
                int pageSize = C0CM.this.getPageSize() * offscreenPageLimit;
                iArr[0] = pageSize;
                iArr[1] = pageSize;
            }

            @Override // X.C0A2
            public final void LJJZ(C0A7 c0a7, C0AC c0ac, C17760mq c17760mq) {
                super.LJJZ(c0a7, c0ac, c17760mq);
                C0CM.this.LJZL.getClass();
            }

            @Override // X.C0A2
            public final void LJJZZIII(C0A7 c0a7, C0AC c0ac, View view, C17760mq c17760mq) {
                int i;
                int i2;
                C29161Cm c29161Cm = C0CM.this.LJZL;
                if (c29161Cm.LIZLLL.getOrientation() == 1) {
                    c29161Cm.LIZLLL.LJLJL.getClass();
                    i = C0A2.LJJJLL(view);
                } else {
                    i = 0;
                }
                if (c29161Cm.LIZLLL.getOrientation() == 0) {
                    c29161Cm.LIZLLL.LJLJL.getClass();
                    i2 = C0A2.LJJJLL(view);
                } else {
                    i2 = 0;
                }
                c17760mq.LJIIZILJ(C17740mo.LIZ(i, 1, i2, 1, false));
            }

            @Override // X.C0A2
            public final boolean LJLL(C0A7 c0a7, C0AC c0ac, int i, Bundle bundle) {
                C0CM.this.LJZL.getClass();
                return super.LJLL(c0a7, c0ac, i, bundle);
            }
        };
        this.LJLJL = r12;
        setLayoutManager(r12);
        setScrollingTouchSlop(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.orientation});
        h0.LJIJ(this, context, new int[]{R.attr.orientation}, attributeSet, obtainStyledAttributes, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
            setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            LJIIIZ(new C0A3() { // from class: X.1Cq
                @Override // X.C0A3
                public final void LJIILIIL(View view) {
                }

                @Override // X.C0A3
                public final void LJJIFFI(View view) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams.width == -1 && marginLayoutParams.height == -1) {
                    } else {
                        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                    }
                }
            });
            C29191Cp c29191Cp = new C29191Cp(this);
            this.LJLLILLLL = c29191Cp;
            this.LJLLL = new C0CO(this, c29191Cp, this.LJLL);
            ?? r13 = new C40161hs() { // from class: X.1ql
                @Override // X.C40161hs, X.AbstractC28951Br
                public final View LJFF(C0A2 c0a2) {
                    if (C0CM.this.LJLLL.LIZIZ.LJLLJ) {
                        return null;
                    }
                    return super.LJFF(c0a2);
                }
            };
            this.LJLLI = r13;
            r13.LIZIZ(this.LJLL);
            LJIIJJI(this.LJLLILLLL);
            C29171Cn c29171Cn = new C29171Cn();
            this.LJLLJ = c29171Cn;
            this.LJLLILLLL.LJLIL = c29171Cn;
            C0CJ c0cj = new C0CJ() { // from class: X.1Ch
                @Override // X.C0CJ
                public final void LIZ(int i) {
                    if (i == 0) {
                        C0CM.this.LJFF();
                    }
                }

                @Override // X.C0CJ
                public final void LIZJ(int i) {
                    C0CM c0cm = C0CM.this;
                    if (c0cm.LJLJJI != i) {
                        c0cm.LJLJJI = i;
                        c0cm.LJZL.LIZIZ();
                    }
                }
            };
            C0CJ c0cj2 = new C0CJ() { // from class: X.1Ci
                @Override // X.C0CJ
                public final void LIZJ(int i) {
                    C0CM.this.clearFocus();
                    if (C0CM.this.hasFocus()) {
                        requestFocus(2);
                    }
                }
            };
            ((ArrayList) this.LJLLJ.LJLIL).add(c0cj);
            ((ArrayList) this.LJLLJ.LJLIL).add(c0cj2);
            this.LJZL.LIZ(this.LJLL);
            ((ArrayList) this.LJLLJ.LJLIL).add(this.LJLJI);
            C29181Co c29181Co = new C29181Co(this.LJLJL);
            this.LJLLLL = c29181Co;
            ((ArrayList) this.LJLLJ.LJLIL).add(c29181Co);
            C45681qm c45681qm = this.LJLL;
            attachViewToParent(c45681qm, 0, c45681qm.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void LIZLLL(int i, boolean z) {
        if (!this.LJLLL.LIZIZ.LJLLJ) {
            LJ(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void LJ(int i, boolean z) {
        int i2;
        int i3;
        AbstractC029409q adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.LJLJLJ != -1) {
                this.LJLJLJ = Math.max(i, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        final int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
        int i4 = this.LJLJJI;
        if (min == i4 && this.LJLLILLLL.LJLJJLL == 0) {
            return;
        }
        if (min == i4 && z) {
            return;
        }
        double d = i4;
        this.LJLJJI = min;
        this.LJZL.LIZIZ();
        C29191Cp c29191Cp = this.LJLLILLLL;
        if (c29191Cp.LJLJJLL != 0) {
            c29191Cp.LJIJJ();
            C0CP c0cp = c29191Cp.LJLJL;
            d = c0cp.LIZ + c0cp.LIZIZ;
        }
        C29191Cp c29191Cp2 = this.LJLLILLLL;
        c29191Cp2.getClass();
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        c29191Cp2.LJLJJL = i2;
        c29191Cp2.LJLLJ = false;
        if (c29191Cp2.LJLJLLL != min) {
            z2 = true;
        }
        c29191Cp2.LJLJLLL = min;
        c29191Cp2.LJIIZILJ(2);
        if (z2) {
            c29191Cp2.LJIILLIIL(min);
        }
        if (!z) {
            LJLI(min);
            return;
        }
        double d2 = min;
        if (Math.abs(d2 - d) > 3.0d) {
            C45681qm c45681qm = this.LJLL;
            if (d2 > d) {
                i3 = min - 3;
            } else {
                i3 = min + 3;
            }
            c45681qm.LJLI(i3);
            final C45681qm c45681qm2 = this.LJLL;
            c45681qm2.post(new Runnable(min, c45681qm2) { // from class: X.0CL
                public final int LJLIL;
                public final RecyclerView LJLILLLLZI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        this.LJLILLLLZI.LJLIL(this.LJLIL);
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    this.LJLIL = min;
                    this.LJLILLLLZI = c45681qm2;
                }
            });
            return;
        }
        LJLIL(min);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.LJLL, i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int measuredState = getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + measuredHeight;
        setMeasuredDimension(ViewGroup.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), ViewGroup.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        int currentItem;
        this.LJZL.getClass();
        if (i == 8192 || i == 4096) {
            C29161Cm c29161Cm = this.LJZL;
            c29161Cm.getClass();
            if (i != 8192) {
                if (i == 4096) {
                    currentItem = c29161Cm.LIZLLL.getCurrentItem() + 1;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                currentItem = c29161Cm.LIZLLL.getCurrentItem() - 1;
            }
            C0CM c0cm = c29161Cm.LIZLLL;
            if (c0cm.LJZ) {
                c0cm.LJ(currentItem, true);
            }
            return true;
        }
        return super.performAccessibilityAction(i, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1i8] */
    public C0CM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJLIL = new Rect();
        this.LJLILLLLZI = new Rect();
        this.LJLJI = new C29171Cn();
        this.LJLJJL = false;
        this.LJLJJLL = new AbstractC29131Cj() { // from class: X.1i8
            @Override // X.AbstractC29131Cj, X.AbstractC029609s
            public final void LIZJ() {
                C0CM c0cm = C0CM.this;
                c0cm.LJLJJL = true;
                c0cm.LJLLILLLL.LJLLILLLL = true;
            }

            {
                super(0);
            }
        };
        this.LJLJLJ = -1;
        this.LJLLLLLL = null;
        this.LJLZ = false;
        this.LJZ = true;
        this.LJZI = -1;
        LIZ(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.LJLIL.left = getPaddingLeft();
        this.LJLIL.right = (i3 - i) - getPaddingRight();
        this.LJLIL.top = getPaddingTop();
        this.LJLIL.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.LJLIL, this.LJLILLLLZI);
        C45681qm c45681qm = this.LJLL;
        Rect rect = this.LJLILLLLZI;
        c45681qm.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.LJLJJL) {
            LJFF();
        }
    }
}
