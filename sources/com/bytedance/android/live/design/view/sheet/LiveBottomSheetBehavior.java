package com.bytedance.android.live.design.view.sheet;

import X.AbstractC270614k;
import X.C06C;
import X.C06F;
import X.C0A2;
import X.C0CM;
import X.C0KA;
import X.C0KD;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C16800lI;
import X.C1GV;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.InterfaceC12860ew;
import X.KMP;
import Y.IDRunnableS0S0201000;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o3.h0;

/* loaded from: classes.dex */
public class LiveBottomSheetBehavior<V extends View> extends C06C<V> {
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public LiveBottomSheetBehavior<V>.c LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final float LJIILJJIL;
    public int LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public C270714l LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public int LJJIII;
    public WeakReference<V> LJJIIJ;
    public WeakReference<View> LJJIIJZLJL;
    public final ArrayList<C0KA> LJJIIZ;
    public VelocityTracker LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public boolean LJJIJIIJIL;
    public Map<View, Integer> LJJIJIL;
    public int LJJIJL;
    public float LJJIJLIJ;
    public int LJJIL;
    public float LJJIZ;
    public View LJJJ;
    public C0KD LJJJI;
    public int LJJJIL;
    public final C1GV LJJJJ;

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public final View LJLIL;
        public boolean LJLILLLLZI;
        public int LJLJI;

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C270714l c270714l = LiveBottomSheetBehavior.this.LJIJJ;
                if (c270714l != null && c270714l.LJIIIIZZ()) {
                    C16300kU.LJIIL(this.LJLIL, this);
                } else {
                    LiveBottomSheetBehavior.this.setStateInternal(this.LJLJI);
                }
                this.LJLILLLLZI = false;
            } finally {
                if (LIZ) {
                }
            }
        }

        public c(View view, int i) {
            this.LJLIL = view;
            this.LJLJI = i;
        }
    }

    @Override // X.C06C
    public final void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4) {
    }

    public final void LIZJ() {
        V v;
        WeakReference<V> weakReference = this.LJJIIJ;
        if (weakReference == null) {
            v = null;
        } else {
            v = weakReference.get();
        }
        if (this.LJJJ != null && v != null) {
            int height = ((v.getHeight() - this.LJJJ.getHeight()) - ((Math.min(v.getTop(), this.LJIILL) - getExpandedOffset()) + this.LJII)) + this.LJJJIL;
            View view = this.LJJJ;
            h0.LJIIL(height - view.getTop(), view);
        }
    }

    public final void LJ() {
        View view;
        View view2;
        WeakReference<View> weakReference = this.LJJIIJZLJL;
        V v = null;
        if (weakReference == null) {
            view = null;
        } else {
            view = weakReference.get();
        }
        WeakReference<V> weakReference2 = this.LJJIIJ;
        if (weakReference2 != null) {
            v = weakReference2.get();
        }
        if (this.LJJJI != null) {
            if (view != null && (view2 = this.LJJJ) != null && view2.getVisibility() == 0 && v != null && ((v.getTop() <= this.LJIILL && v.getTop() > getExpandedOffset()) || view.canScrollVertically(1))) {
                int height = (((v.getHeight() - this.LJJJI.getHeight()) - this.LJJJ.getHeight()) - ((Math.min(v.getTop(), this.LJIILL) - getExpandedOffset()) + this.LJII)) + this.LJJJIL;
                C0KD c0kd = this.LJJJI;
                h0.LJIIL(height - c0kd.getTop(), c0kd);
                this.LJJJI.setShadowed(true);
                return;
            }
            this.LJJJI.setShadowed(false);
        }
    }

    public final int calculatePeekHeight() {
        int i = this.LIZJ;
        if (i == -1) {
            int i2 = this.LJFF;
            if (i2 == -1) {
                float f = this.LJI;
                if (f > 0.0f) {
                    i2 = (int) (this.LJJII * f);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
            }
            float f2 = this.LJ;
            if (f2 > 0.0f) {
                i2 = (int) (this.LJJII * f2);
            }
            return Math.min(i2, this.LJJI);
        }
        return i;
    }

    public final int getExpandedOffset() {
        if (this.LIZ) {
            return this.LJIIL;
        }
        return this.LJIIJJI;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.1GV] */
    public LiveBottomSheetBehavior() {
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIILJJIL = 0.5f;
        this.LJIJ = true;
        this.LJIJI = 4;
        this.LJJIIZ = new ArrayList<>();
        this.LJJIJL = -1;
        this.LJJIL = -1;
        this.LJJJJ = new AbstractC270614k() { // from class: X.1GV
            @Override // X.AbstractC270614k
            public final int getViewVerticalDragRange(View view) {
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                if (liveBottomSheetBehavior.LJIILLIIL) {
                    return liveBottomSheetBehavior.LJJIFFI;
                }
                return liveBottomSheetBehavior.LJIILL;
            }

            @Override // X.AbstractC270614k
            public final void onViewDragStateChanged(int i) {
                if (i == 1) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior.LJIJ) {
                        liveBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC270614k
            public final boolean tryCaptureView(View view, int i) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                int i2 = liveBottomSheetBehavior.LJIJI;
                if (i2 == 1 || liveBottomSheetBehavior.LJJIJIIJIL) {
                    return false;
                }
                if ((i2 == 3 && liveBottomSheetBehavior.LJJIJ == i && (weakReference = liveBottomSheetBehavior.LJJIIJZLJL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = LiveBottomSheetBehavior.this.LJJIIJ) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC270614k
            public final int clampViewPositionHorizontal(View view, int i, int i2) {
                return view.getLeft();
            }

            @Override // X.AbstractC270614k
            public final int clampViewPositionVertical(View view, int i, int i2) {
                int i3;
                int expandedOffset = LiveBottomSheetBehavior.this.getExpandedOffset();
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                if (liveBottomSheetBehavior.LJIILLIIL) {
                    i3 = liveBottomSheetBehavior.LJJIFFI;
                } else {
                    i3 = liveBottomSheetBehavior.LJIILL;
                }
                return C78609UtB.LJJIIZ(i, expandedOffset, i3);
            }

            @Override // X.AbstractC270614k
            public final void onViewReleased(View view, float f, float f2) {
                int i;
                int i2 = 6;
                if (f2 < 0.0f || LiveBottomSheetBehavior.this.LJFF(view, f2)) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior.LIZ) {
                        i = liveBottomSheetBehavior.LJIIL;
                    } else {
                        int top = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior2 = LiveBottomSheetBehavior.this;
                        i = liveBottomSheetBehavior2.LJIILIIL;
                        if (top <= i) {
                            i = liveBottomSheetBehavior2.LJIIJJI;
                        }
                    }
                    i2 = 3;
                } else {
                    LiveBottomSheetBehavior liveBottomSheetBehavior3 = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior3.LJIILLIIL && liveBottomSheetBehavior3.shouldHide(view, f2)) {
                        i = LiveBottomSheetBehavior.this.LJJIFFI;
                        i2 = 5;
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior4 = LiveBottomSheetBehavior.this;
                        if (liveBottomSheetBehavior4.LIZ) {
                            if (Math.abs(top2 - liveBottomSheetBehavior4.LJIIL) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i = LiveBottomSheetBehavior.this.LJIIL;
                                i2 = 3;
                            } else {
                                i = LiveBottomSheetBehavior.this.LJIILL;
                                i2 = 4;
                            }
                        } else {
                            int i3 = liveBottomSheetBehavior4.LJIILIIL;
                            if (top2 < i3) {
                                if (top2 < Math.abs(top2 - liveBottomSheetBehavior4.LJIILL)) {
                                    i = LiveBottomSheetBehavior.this.LJIIJJI;
                                    i2 = 3;
                                } else {
                                    i = LiveBottomSheetBehavior.this.LJIILIIL;
                                }
                            } else if (Math.abs(top2 - i3) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i = LiveBottomSheetBehavior.this.LJIILIIL;
                            } else {
                                i = LiveBottomSheetBehavior.this.LJIILL;
                                i2 = 4;
                            }
                        }
                    } else {
                        LiveBottomSheetBehavior liveBottomSheetBehavior5 = LiveBottomSheetBehavior.this;
                        if (liveBottomSheetBehavior5.LIZ) {
                            i = liveBottomSheetBehavior5.LJIILL;
                        } else {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - LiveBottomSheetBehavior.this.LJIILIIL) < Math.abs(top3 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i = LiveBottomSheetBehavior.this.LJIILIIL;
                            } else {
                                i = LiveBottomSheetBehavior.this.LJIILL;
                            }
                        }
                        i2 = 4;
                    }
                }
                LiveBottomSheetBehavior.this.startSettlingAnimation(view, i2, i, true);
            }

            @Override // X.AbstractC270614k
            public final void onViewPositionChanged(View view, int i, int i2, int i3, int i4) {
                LiveBottomSheetBehavior.this.dispatchOnSlide(i2);
            }
        };
    }

    public final void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.LIZ) {
            this.LJIILL = Math.max(this.LJJIFFI - calculatePeekHeight, this.LJIIL);
        } else {
            this.LJIILL = this.LJJIFFI - calculatePeekHeight;
        }
    }

    @Override // X.C06C
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJIIJ = null;
        this.LJIJJ = null;
    }

    public static <V extends View> LiveBottomSheetBehavior<V> LIZLLL(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C06F) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof LiveBottomSheetBehavior) {
                return (LiveBottomSheetBehavior) c06c;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void LIZ(C0KA c0ka) {
        if (!this.LJJIIZ.contains(c0ka)) {
            this.LJJIIZ.add(c0ka);
        }
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float f2;
        V v = this.LJJIIJ.get();
        if (v != null && !this.LJJIIZ.isEmpty()) {
            int i2 = this.LJIILL;
            if (i > i2 || i2 == getExpandedOffset()) {
                int i3 = this.LJIILL;
                f = i3 - i;
                f2 = this.LJJIFFI - i3;
            } else {
                int i4 = this.LJIILL;
                f = i4 - i;
                f2 = i4 - getExpandedOffset();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.LJJIIZ.size(); i5++) {
                ((C0KA) ListProtector.get(this.LJJIIZ, i5)).LIZ(v, f3);
            }
        }
        LIZJ();
        LJ();
    }

    public final View findScrollingChild(View view) {
        if (view == null) {
            return null;
        }
        if (view instanceof C0CM) {
            C0CM c0cm = (C0CM) view;
            int currentItem = c0cm.getCurrentItem();
            C0A2 layoutManager = ((RecyclerView) c0cm.getChildAt(0)).getLayoutManager();
            if (layoutManager == null) {
                return null;
            }
            return findScrollingChild(layoutManager.LJJIJIL(currentItem));
        }
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild != null) {
                    return findScrollingChild;
                }
            }
        }
        return null;
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F c06f) {
        super.onAttachedToLayoutParams(c06f);
        this.LJJIIJ = null;
        this.LJIJJ = null;
    }

    public final void setFitToContents(boolean z) {
        int i;
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        if (this.LJJIIJ != null) {
            calculateCollapsedOffset();
        }
        if (this.LIZ && this.LJIJI == 6) {
            i = 3;
        } else {
            i = this.LJIJI;
        }
        setStateInternal(i);
    }

    public final void setHideable(boolean z) {
        if (this.LJIILLIIL != z) {
            this.LJIILLIIL = z;
            if (!z && this.LJIJI == 5) {
                setState(4);
            }
        }
    }

    public final void setPeekHeight(int i) {
        V v;
        if (i == -1) {
            if (!this.LIZLLL) {
                this.LIZLLL = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZLLL && this.LIZJ == i) {
                return;
            }
            this.LIZLLL = false;
            this.LIZJ = Math.max(0, i);
        }
        if (this.LJJIIJ != null) {
            calculateCollapsedOffset();
            if (this.LJIJI == 4 && (v = this.LJJIIJ.get()) != null) {
                v.requestLayout();
            }
        }
    }

    public final void setState(int i) {
        if (i == this.LJIJI) {
            return;
        }
        WeakReference<V> weakReference = this.LJJIIJ;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIILLIIL && i == 5)) {
                this.LJIJI = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(v)) {
            v.post(new IDRunnableS0S0201000(i, v, this, 10));
        } else {
            settleToState(v, i);
        }
    }

    public final void setStateInternal(int i) {
        V v;
        if (this.LJIJI == i) {
            return;
        }
        this.LJIJI = i;
        WeakReference<V> weakReference = this.LJJIIJ;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        for (int i2 = 0; i2 < this.LJJIIZ.size(); i2++) {
            ((C0KA) ListProtector.get(this.LJJIIZ, i2)).LIZIZ(i, v);
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJIIJ;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (!(parent instanceof C45621qg)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        if (z) {
            if (this.LJJIJIL == null) {
                this.LJJIJIL = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJIIJ.get() && z) {
                this.LJJIJIL.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJIJIL = null;
        }
    }

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: X.0K9
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new LiveBottomSheetBehavior.SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new LiveBottomSheetBehavior.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final LiveBottomSheetBehavior.SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new LiveBottomSheetBehavior.SavedState(parcel, classLoader);
            }
        };
        public final int LJLIL;
        public final int LJLILLLLZI;
        public final boolean LJLJI;
        public final boolean LJLJJI;
        public final boolean LJLJJL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            boolean z2;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJI = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJJI = z2;
            this.LJLJJL = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
            parcel.writeInt(this.LJLILLLLZI);
            parcel.writeInt(this.LJLJI ? 1 : 0);
            parcel.writeInt(this.LJLJJI ? 1 : 0);
            parcel.writeInt(this.LJLJJL ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, LiveBottomSheetBehavior<?> liveBottomSheetBehavior) {
            super(parcelable);
            this.LJLIL = liveBottomSheetBehavior.LJIJI;
            this.LJLILLLLZI = liveBottomSheetBehavior.LIZJ;
            this.LJLJI = liveBottomSheetBehavior.LIZ;
            this.LJLJJI = liveBottomSheetBehavior.LJIILLIIL;
            this.LJLJJL = liveBottomSheetBehavior.LJIIZILJ;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1GV] */
    public LiveBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIILJJIL = 0.5f;
        this.LJIJ = true;
        this.LJIJI = 4;
        this.LJJIIZ = new ArrayList<>();
        this.LJJIJL = -1;
        this.LJJIL = -1;
        this.LJJJJ = new AbstractC270614k() { // from class: X.1GV
            @Override // X.AbstractC270614k
            public final int getViewVerticalDragRange(View view) {
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                if (liveBottomSheetBehavior.LJIILLIIL) {
                    return liveBottomSheetBehavior.LJJIFFI;
                }
                return liveBottomSheetBehavior.LJIILL;
            }

            @Override // X.AbstractC270614k
            public final void onViewDragStateChanged(int i2) {
                if (i2 == 1) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior.LJIJ) {
                        liveBottomSheetBehavior.setStateInternal(1);
                    }
                }
            }

            @Override // X.AbstractC270614k
            public final boolean tryCaptureView(View view, int i2) {
                Reference reference;
                WeakReference<View> weakReference;
                View view2;
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                int i22 = liveBottomSheetBehavior.LJIJI;
                if (i22 == 1 || liveBottomSheetBehavior.LJJIJIIJIL) {
                    return false;
                }
                if ((i22 == 3 && liveBottomSheetBehavior.LJJIJ == i2 && (weakReference = liveBottomSheetBehavior.LJJIIJZLJL) != null && (view2 = weakReference.get()) != null && view2.canScrollVertically(-1)) || (reference = LiveBottomSheetBehavior.this.LJJIIJ) == null || reference.get() != view) {
                    return false;
                }
                return true;
            }

            @Override // X.AbstractC270614k
            public final int clampViewPositionHorizontal(View view, int i2, int i22) {
                return view.getLeft();
            }

            @Override // X.AbstractC270614k
            public final int clampViewPositionVertical(View view, int i2, int i22) {
                int i3;
                int expandedOffset = LiveBottomSheetBehavior.this.getExpandedOffset();
                LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                if (liveBottomSheetBehavior.LJIILLIIL) {
                    i3 = liveBottomSheetBehavior.LJJIFFI;
                } else {
                    i3 = liveBottomSheetBehavior.LJIILL;
                }
                return C78609UtB.LJJIIZ(i2, expandedOffset, i3);
            }

            @Override // X.AbstractC270614k
            public final void onViewReleased(View view, float f, float f2) {
                int i2;
                int i22 = 6;
                if (f2 < 0.0f || LiveBottomSheetBehavior.this.LJFF(view, f2)) {
                    LiveBottomSheetBehavior liveBottomSheetBehavior = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior.LIZ) {
                        i2 = liveBottomSheetBehavior.LJIIL;
                    } else {
                        int top = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior2 = LiveBottomSheetBehavior.this;
                        i2 = liveBottomSheetBehavior2.LJIILIIL;
                        if (top <= i2) {
                            i2 = liveBottomSheetBehavior2.LJIIJJI;
                        }
                    }
                    i22 = 3;
                } else {
                    LiveBottomSheetBehavior liveBottomSheetBehavior3 = LiveBottomSheetBehavior.this;
                    if (liveBottomSheetBehavior3.LJIILLIIL && liveBottomSheetBehavior3.shouldHide(view, f2)) {
                        i2 = LiveBottomSheetBehavior.this.LJJIFFI;
                        i22 = 5;
                    } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                        int top2 = view.getTop();
                        LiveBottomSheetBehavior liveBottomSheetBehavior4 = LiveBottomSheetBehavior.this;
                        if (liveBottomSheetBehavior4.LIZ) {
                            if (Math.abs(top2 - liveBottomSheetBehavior4.LJIIL) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i2 = LiveBottomSheetBehavior.this.LJIIL;
                                i22 = 3;
                            } else {
                                i2 = LiveBottomSheetBehavior.this.LJIILL;
                                i22 = 4;
                            }
                        } else {
                            int i3 = liveBottomSheetBehavior4.LJIILIIL;
                            if (top2 < i3) {
                                if (top2 < Math.abs(top2 - liveBottomSheetBehavior4.LJIILL)) {
                                    i2 = LiveBottomSheetBehavior.this.LJIIJJI;
                                    i22 = 3;
                                } else {
                                    i2 = LiveBottomSheetBehavior.this.LJIILIIL;
                                }
                            } else if (Math.abs(top2 - i3) < Math.abs(top2 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i2 = LiveBottomSheetBehavior.this.LJIILIIL;
                            } else {
                                i2 = LiveBottomSheetBehavior.this.LJIILL;
                                i22 = 4;
                            }
                        }
                    } else {
                        LiveBottomSheetBehavior liveBottomSheetBehavior5 = LiveBottomSheetBehavior.this;
                        if (liveBottomSheetBehavior5.LIZ) {
                            i2 = liveBottomSheetBehavior5.LJIILL;
                        } else {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - LiveBottomSheetBehavior.this.LJIILIIL) < Math.abs(top3 - LiveBottomSheetBehavior.this.LJIILL)) {
                                i2 = LiveBottomSheetBehavior.this.LJIILIIL;
                            } else {
                                i2 = LiveBottomSheetBehavior.this.LJIILL;
                            }
                        }
                        i22 = 4;
                    }
                }
                LiveBottomSheetBehavior.this.startSettlingAnimation(view, i22, i2, true);
            }

            @Override // X.AbstractC270614k
            public final void onViewPositionChanged(View view, int i2, int i22, int i3, int i4) {
                LiveBottomSheetBehavior.this.dispatchOnSlide(i22);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.aq6, com.zhiliaoapp.musically.R.attr.aq7, com.zhiliaoapp.musically.R.attr.aq8, com.zhiliaoapp.musically.R.attr.aq9, com.zhiliaoapp.musically.R.attr.aq_, com.zhiliaoapp.musically.R.attr.aqa, com.zhiliaoapp.musically.R.attr.aqb, com.zhiliaoapp.musically.R.attr.aqc, com.zhiliaoapp.musically.R.attr.aqd, com.zhiliaoapp.musically.R.attr.aqe, com.zhiliaoapp.musically.R.attr.aqf, com.zhiliaoapp.musically.R.attr.aqg});
        obtainStyledAttributes.getDimension(0, -1.0f);
        TypedValue peekValue = obtainStyledAttributes.peekValue(4);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(4, -1));
        }
        if (obtainStyledAttributes.hasValue(17)) {
            TypedValue typedValue = new TypedValue();
            obtainStyledAttributes.getValue(17, typedValue);
            this.LJ = typedValue.getFloat();
        }
        this.LJFF = obtainStyledAttributes.getDimensionPixelSize(11, -1);
        if (obtainStyledAttributes.hasValue(12)) {
            TypedValue typedValue2 = new TypedValue();
            obtainStyledAttributes.getValue(12, typedValue2);
            this.LJI = typedValue2.getFloat();
        }
        setHideable(obtainStyledAttributes.getBoolean(3, false));
        setFitToContents(obtainStyledAttributes.getBoolean(2, true));
        this.LJIIZILJ = obtainStyledAttributes.getBoolean(5, false);
        this.LJIJ = obtainStyledAttributes.getBoolean(6, true);
        this.LJJIJL = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        if (obtainStyledAttributes.hasValue(8)) {
            TypedValue typedValue3 = new TypedValue();
            obtainStyledAttributes.getValue(8, typedValue3);
            this.LJJIJLIJ = typedValue3.getFloat();
        }
        this.LJJIL = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        if (obtainStyledAttributes.hasValue(10)) {
            TypedValue typedValue4 = new TypedValue();
            obtainStyledAttributes.getValue(10, typedValue4);
            this.LJJIZ = typedValue4.getFloat();
        }
        obtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void LIZIZ(SheetOptions sheetOptions, boolean z) {
        this.LJJIJL = -1;
        this.LJJIJLIJ = 0.0f;
        this.LJJIL = -1;
        this.LJJIZ = 0.0f;
        this.LIZJ = -1;
        this.LJ = 0.0f;
        this.LJFF = -1;
        this.LJI = 0.0f;
        if (sheetOptions.fullscreenEnabled) {
            this.LJJIJLIJ = 1.0f;
            this.LIZJ = sheetOptions.height;
            this.LJ = sheetOptions.heightRatio;
            this.LJFF = sheetOptions.maxHeight;
            this.LJI = sheetOptions.maxHeightRatio;
            this.LJIIZILJ = false;
        } else {
            this.LJJIJL = sheetOptions.height;
            this.LJJIJLIJ = sheetOptions.heightRatio;
            this.LJJIL = sheetOptions.maxHeight;
            this.LJJIZ = sheetOptions.maxHeightRatio;
            this.LJIIZILJ = true;
        }
        this.LJIJ = sheetOptions.draggable;
        WeakReference<V> weakReference = this.LJJIIJ;
        if (weakReference != null && weakReference.get() != null) {
            this.LJJIIJ.get().requestLayout();
        }
        if (z) {
            if (this.LJIIZILJ) {
                setState(3);
            } else {
                setState(4);
            }
        }
    }

    public final boolean LJFF(View view, float f) {
        int expandedOffset;
        int expandedOffset2 = this.LJJIFFI - getExpandedOffset();
        float abs = Math.abs(((f * 0.01f) + view.getTop()) - getExpandedOffset());
        int i = expandedOffset2 >> 2;
        int i2 = this.LJJIII;
        if (this.LJIIZILJ) {
            expandedOffset = i2;
        } else {
            expandedOffset = (this.LJIILL - getExpandedOffset()) >> 1;
        }
        if (abs < Math.min(i, Math.min(i2, expandedOffset)) && abs / this.LJJIFFI < 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), (LiveBottomSheetBehavior<?>) this);
    }

    public final void settleToState(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.LJIILL;
        } else if (i == 6) {
            i2 = this.LJIILIIL;
            if (this.LIZ && i2 <= (i3 = this.LJIIL)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (this.LJIILLIIL && i == 5) {
            i2 = this.LJJIFFI;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIIZILJ) {
            return true;
        }
        if (view.getTop() < this.LJIILL) {
            return false;
        }
        int calculatePeekHeight = calculatePeekHeight();
        float abs = Math.abs(((f * 0.01f) + view.getTop()) - this.LJIILL);
        if (abs > Math.min(this.LJJIII, calculatePeekHeight >> 1) || abs / this.LJJIFFI > 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final C16800lI onApplyWindowInsets(C45621qg c45621qg, V v, C16800lI c16800lI) {
        this.LJIIIIZZ = c16800lI.LJ();
        this.LJIIIZ = c16800lI.LIZ(2).LIZLLL;
        return c16800lI;
    }

    @Override // X.C06C
    public boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C270714l c270714l;
        if (!v.isShown() || !this.LJIJ) {
            this.LJIJJLI = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.LJJIJ = -1;
            VelocityTracker velocityTracker = this.LJJIIZI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIIZI = null;
            }
        }
        if (this.LJJIIZI == null) {
            this.LJJIIZI = VelocityTracker.obtain();
        }
        this.LJJIIZI.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJJIJIIJIL = false;
                this.LJJIJ = -1;
                if (this.LJIJJLI) {
                    this.LJIJJLI = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJJIJIIJI = (int) motionEvent.getY();
            if (this.LJIJI != 2 && (weakReference = this.LJJIIJZLJL) != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.LJJIJIIJI, view)) {
                this.LJJIJ = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJJIJIIJIL = true;
            }
            if (this.LJJIJ == -1 && !c45621qg.LJII(x, this.LJJIJIIJI, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIJJLI = z;
        }
        if (!this.LJIJJLI && (c270714l = this.LJIJJ) != null && c270714l.LJIJJ(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.LJJIIJZLJL;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.LJIJJLI || this.LJIJI == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.LJIJJ == null || C1I1.LIZIZ(motionEvent, this.LJJIJIIJI) <= this.LJIJJ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        View view;
        if (this.LJJIIJ == null) {
            this.LJJIIJ = new WeakReference<>(v);
            if (C16300kU.LIZJ(v) == 0) {
                C16300kU.LJIJ(v, 1);
            }
        }
        if (this.LJIJJ == null) {
            this.LJIJJ = C270714l.LJIIIZ(c45621qg, this.LJJJJ);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        c45621qg.getWidth();
        this.LJJIFFI = c45621qg.getHeight();
        int height = v.getHeight();
        this.LJJI = height;
        int i2 = this.LJJIFFI;
        this.LJJIII = (int) (i2 * 0.25f);
        if (i2 - height < this.LJIIIIZZ) {
            this.LJJI = i2;
        }
        int i3 = 0;
        this.LJIIL = Math.max(0, i2 - this.LJJI);
        this.LJIILIIL = (int) ((1.0f - this.LJIILJJIL) * this.LJJIFFI);
        calculateCollapsedOffset();
        int i4 = this.LJIJI;
        if (i4 == 3) {
            h0.LJIIL(getExpandedOffset(), v);
        } else if (i4 == 6) {
            h0.LJIIL(this.LJIILIIL, v);
        } else if (this.LJIILLIIL && i4 == 5) {
            h0.LJIIL(this.LJJIFFI, v);
        } else if (i4 == 4) {
            h0.LJIIL(this.LJIILL, v);
        } else if (i4 == 1 || i4 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        this.LJJIIJZLJL = new WeakReference<>(findScrollingChild(v));
        C0KD c0kd = null;
        if (this.LJJJ == null) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v;
                for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                    if (viewGroup.getChildAt(i5) instanceof InterfaceC12860ew) {
                        view = viewGroup.getChildAt(i5);
                        break;
                    }
                }
            }
            view = null;
            this.LJJJ = view;
        }
        LIZJ();
        if (this.LJJJI == null) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) v;
                while (true) {
                    if (i3 >= viewGroup2.getChildCount()) {
                        break;
                    }
                    if (viewGroup2.getChildAt(i3) instanceof C0KD) {
                        c0kd = (C0KD) viewGroup2.getChildAt(i3);
                        break;
                    }
                    i3++;
                }
            }
            this.LJJJI = c0kd;
        }
        LJ();
        return true;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIJI == 1 && actionMasked == 0) {
            return true;
        }
        C270714l c270714l = this.LJIJJ;
        if (c270714l != null) {
            c270714l.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJJIJ = -1;
            VelocityTracker velocityTracker = this.LJJIIZI;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIIZI = null;
            }
        }
        if (this.LJJIIZI == null) {
            this.LJJIIZI = VelocityTracker.obtain();
        }
        this.LJJIIZI.addMovement(motionEvent);
        if (this.LJIJJ != null && actionMasked == 2 && !this.LJIJJLI) {
            float LIZIZ = C1I1.LIZIZ(motionEvent, this.LJJIJIIJI);
            C270714l c270714l2 = this.LJIJJ;
            if (LIZIZ > c270714l2.LIZIZ) {
                c270714l2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIJJLI;
    }

    @Override // X.C06C
    public final void onStopNestedScroll(C45621qg c45621qg, V v, View view, int i) {
        int i2;
        float yVelocity;
        if (!this.LJIJ) {
            return;
        }
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJJIIJZLJL;
        if (weakReference == null || view != weakReference.get() || !this.LJJ) {
            return;
        }
        if (this.LJIL <= 0) {
            VelocityTracker velocityTracker = this.LJJIIZI;
            float f = 0.0f;
            if (velocityTracker == null) {
                yVelocity = 0.0f;
            } else {
                velocityTracker.computeCurrentVelocity(1000, this.LIZIZ);
                yVelocity = this.LJJIIZI.getYVelocity(this.LJJIJ);
            }
            if (!LJFF(v, yVelocity)) {
                if (this.LJIILLIIL) {
                    VelocityTracker velocityTracker2 = this.LJJIIZI;
                    if (velocityTracker2 != null) {
                        velocityTracker2.computeCurrentVelocity(1000, this.LIZIZ);
                        f = this.LJJIIZI.getYVelocity(this.LJJIJ);
                    }
                    if (shouldHide(v, f)) {
                        i2 = this.LJJIFFI;
                        i3 = 5;
                        startSettlingAnimation(v, i3, i2, false);
                        this.LJJ = false;
                    }
                }
                if (this.LJIL == 0) {
                    int top = v.getTop();
                    if (this.LIZ) {
                        if (Math.abs(top - this.LJIIL) < Math.abs(top - this.LJIILL)) {
                            i2 = this.LJIIL;
                        } else {
                            i2 = this.LJIILL;
                            i3 = 4;
                        }
                    } else {
                        int i4 = this.LJIILIIL;
                        if (top < i4) {
                            if (top < Math.abs(top - this.LJIILL)) {
                                i2 = this.LJIIJJI;
                            } else {
                                i2 = this.LJIILIIL;
                            }
                        } else if (Math.abs(top - i4) < Math.abs(top - this.LJIILL)) {
                            i2 = this.LJIILIIL;
                        } else {
                            i2 = this.LJIILL;
                            i3 = 4;
                        }
                        i3 = 6;
                    }
                } else {
                    if (this.LIZ) {
                        i2 = this.LJIILL;
                    } else {
                        int top2 = v.getTop();
                        if (Math.abs(top2 - this.LJIILIIL) < Math.abs(top2 - this.LJIILL)) {
                            i2 = this.LJIILIIL;
                            i3 = 6;
                        } else {
                            i2 = this.LJIILL;
                        }
                    }
                    i3 = 4;
                }
                startSettlingAnimation(v, i3, i2, false);
                this.LJJ = false;
            }
        }
        if (this.LIZ) {
            i2 = this.LJIIL;
        } else {
            int top3 = v.getTop();
            i2 = this.LJIILIIL;
            if (top3 <= i2) {
                i2 = this.LJIIJJI;
            }
            i3 = 6;
        }
        startSettlingAnimation(v, i3, i2, false);
        this.LJJ = false;
    }

    public final void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C270714l c270714l = this.LJIJJ;
        if (c270714l != null && (!z ? c270714l.LJIJJLI(view.getLeft(), i2, view) : c270714l.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            if (this.LJIIJ == null) {
                this.LJIIJ = new c(view, i);
            }
            LiveBottomSheetBehavior<V>.c cVar = this.LJIIJ;
            if (!cVar.LJLILLLLZI) {
                cVar.LJLJI = i;
                C16300kU.LJIIL(view, cVar);
                this.LJIIJ.LJLILLLLZI = true;
                return;
            }
            cVar.LJLJI = i;
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIIJZLJL;
        if (weakReference == null || !this.LJIJ || view != weakReference.get()) {
            return false;
        }
        if (this.LJIJI == 3 && !super.onNestedPreFling(c45621qg, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onMeasureChild(X.C45621qg r10, V r11, int r12, int r13, int r14, int r15) {
        /*
            r9 = this;
            android.content.Context r0 = r11.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r7 = r0.orientation
            int r5 = android.view.View.MeasureSpec.getSize(r14)
            r4 = 1
            if (r7 != r4) goto L50
            int r0 = r9.LJIIIZ
            int r0 = r0 + r5
            r9.LJJII = r0
        L1a:
            int r0 = r9.LJJIJL
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = -1
            if (r0 == r2) goto L2e
        L21:
            r6 = 1073741824(0x40000000, float:2.0)
        L23:
            int r5 = java.lang.Math.min(r0, r5)
            if (r5 != r2) goto L53
            boolean r0 = super.onMeasureChild(r10, r11, r12, r13, r14, r15)
            return r0
        L2e:
            float r1 = r9.LJJIJLIJ
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L3b
            int r0 = r9.LJJII
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L21
        L3b:
            int r0 = r9.LJJIL
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L42
            goto L23
        L42:
            float r1 = r9.LJJIZ
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L4e
            int r0 = r9.LJJII
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L23
        L4e:
            r0 = -1
            goto L21
        L50:
            r9.LJJII = r5
            goto L1a
        L53:
            if (r7 != r4) goto L8f
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r10.getPaddingLeft()
            int r1 = r10.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r2.leftMargin
            int r1 = r1 + r0
            int r0 = r2.rightMargin
            int r1 = r1 + r0
            int r1 = r1 + r13
            int r0 = r2.width
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r0)
            float r3 = (float) r5
            int r2 = r9.LJJII
            float r0 = (float) r2
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L87
            int r0 = r9.LJII
            int r5 = r5 + r0
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (int) r0
            int r5 = java.lang.Math.min(r5, r0)
        L87:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r11.measure(r7, r0)
        L8e:
            return r4
        L8f:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r6)
            r11.measure(r1, r0)
            goto L8e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.design.view.sheet.LiveBottomSheetBehavior.onMeasureChild(X.1qg, android.view.View, int, int, int, int):boolean");
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        this.LJIL = 0;
        this.LJJ = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr, int i3) {
        View view2;
        if (i3 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.LJJIIJZLJL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2 || !this.LJIJ) {
            return;
        }
        int top = v.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < getExpandedOffset()) {
                int expandedOffset = top - getExpandedOffset();
                iArr[1] = expandedOffset;
                h0.LJIIL(-expandedOffset, v);
                setStateInternal(3);
            } else {
                if (!this.LJIJ) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILL;
            if (i4 <= i5 || this.LJIILLIIL) {
                if (!this.LJIJ) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            } else {
                int i6 = top - i5;
                iArr[1] = i6;
                h0.LJIIL(-i6, v);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJIL = i2;
        this.LJJ = true;
    }

    @Override // X.C06C
    public final void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5) {
        LJ();
    }
}
