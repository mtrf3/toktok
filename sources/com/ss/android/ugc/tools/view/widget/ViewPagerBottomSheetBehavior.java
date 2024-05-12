package com.ss.android.ugc.tools.view.widget;

import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.C62051OWx;
import X.C80581Vjt;
import X.C80584Vjw;
import X.KMP;
import X.RunnableC80582Vju;
import X.TMN;
import Y.ARunnableS17S0201000_14;
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
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import o3.h0;

/* loaded from: classes15.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends C06C<V> {
    public final float LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public final boolean LJIIIIZZ;
    public int LJIIIZ;
    public C270714l LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public WeakReference<V> LJIILL;
    public WeakReference<View> LJIILLIIL;
    public TMN LJIIZILJ;
    public VelocityTracker LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public final double LJIL;
    public final C80581Vjt LJJ;

    public ViewPagerBottomSheetBehavior() {
        this.LIZ = 0.5f;
        this.LJIIIZ = 4;
        this.LJIL = 1.0d;
        this.LJJ = new C80581Vjt(this);
    }

    public ViewPagerBottomSheetBehavior(Context context) {
        super(context, null);
        this.LIZ = 0.5f;
        this.LJIIIZ = 4;
        this.LJIL = 1.0d;
        this.LJJ = new C80581Vjt(this);
        setPeekHeight(-1);
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static <V extends View> ViewPagerBottomSheetBehavior<V> LIZ(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof C06F) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof ViewPagerBottomSheetBehavior) {
                return (ViewPagerBottomSheetBehavior) c06c;
            }
            throw new IllegalArgumentException("The view is not associated with ViewPagerBottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final void dispatchOnSlide(int i) {
        V v;
        TMN tmn;
        WeakReference<V> weakReference = this.LJIILL;
        if (weakReference == null || (v = weakReference.get()) == null || (tmn = this.LJIIZILJ) == null) {
            return;
        }
        tmn.LIZ(v);
    }

    public final View findScrollingChild(View view) {
        View view2;
        if (view == null) {
            return null;
        }
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        int i = 0;
        if (view instanceof ViewPager) {
            ViewPager viewPager = (ViewPager) view;
            int currentItem = viewPager.getCurrentItem();
            while (true) {
                if (i < viewPager.getChildCount()) {
                    view2 = viewPager.getChildAt(i);
                    ViewPager.LayoutParams layoutParams = (ViewPager.LayoutParams) view2.getLayoutParams();
                    try {
                        int intValue = ((Integer) C62051OWx.LIZ.get(layoutParams)).intValue();
                        if (!layoutParams.LIZ && currentItem == intValue) {
                            break;
                        }
                        i++;
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    view2 = null;
                    break;
                }
            }
            View findScrollingChild = findScrollingChild(view2);
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                while (i < childCount) {
                    View findScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                    if (findScrollingChild2 != null) {
                        return findScrollingChild2;
                    }
                    i++;
                }
            }
        }
        return null;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
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
            this.LJI = this.LJIILJJIL - i;
        }
        if (this.LJIIIZ == 4 && (weakReference = this.LJIILL) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setState(int i) {
        if (i == this.LJIIIZ) {
            return;
        }
        WeakReference<V> weakReference = this.LJIILL;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.LJII && i == 5)) {
                this.LJIIIZ = i;
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
            v.post(new ARunnableS17S0201000_14(i, v, this, 9));
        } else {
            LIZIZ(i, v);
        }
    }

    public final void setStateInternal(int i) {
        V v;
        TMN tmn;
        if (this.LJIIIZ == i) {
            return;
        }
        this.LJIIIZ = i;
        WeakReference<V> weakReference = this.LJIILL;
        if (weakReference == null || (v = weakReference.get()) == null || (tmn = this.LJIIZILJ) == null) {
            return;
        }
        tmn.LIZIZ(i, v);
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80584Vjw();
        public final int LJLIL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LJLIL = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.LJLIL = i;
        }
    }

    public ViewPagerBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LIZ = 0.5f;
        this.LJIIIZ = 4;
        this.LJIL = 1.0d;
        this.LJJ = new C80581Vjt(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.yc, com.zhiliaoapp.musically.R.attr.yd, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yf, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yk, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.af0, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8});
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        this.LJII = obtainStyledAttributes.getBoolean(6, false);
        this.LJIIIIZZ = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void LIZIZ(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.LJI;
        } else if (i == 3) {
            i2 = this.LJFF;
        } else if (this.LJII && i == 5) {
            i2 = this.LJIILJJIL;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        C270714l c270714l = this.LJIIJ;
        if (c270714l != null && c270714l.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80582Vju(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this.LJIIIZ);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIIIIZZ) {
            return true;
        }
        if (view.getTop() < this.LJI) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LJI) / this.LIZJ > this.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (!v.isShown()) {
            this.LJIIJJI = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.LJIJI = -1;
            VelocityTracker velocityTracker = this.LJIJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIJ = null;
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = VelocityTracker.obtain();
        }
        this.LJIJ.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJJLI = false;
                this.LJIJI = -1;
                if (this.LJIIJJI) {
                    this.LJIIJJI = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJIJJ = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.LJIILLIIL;
            if (weakReference != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.LJIJJ, view)) {
                this.LJIJI = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJIJJLI = true;
            }
            if (this.LJIJI == -1 && !c45621qg.LJII(x, this.LJIJJ, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJJI = z;
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = C270714l.LJIIIZ(c45621qg, this.LJJ);
        }
        if (!this.LJIIJJI && this.LJIIJ.LJIJJ(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.LJIILLIIL;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.LJIIJJI || this.LJIIIZ == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || C1I1.LIZIZ(motionEvent, this.LJIJJ) <= this.LJIIJ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        int i2;
        if (C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        this.LJIILJJIL = c45621qg.getHeight();
        if (this.LIZLLL) {
            if (this.LJ == 0) {
                this.LJ = c45621qg.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.m6);
            }
            i2 = Math.max(this.LJ, this.LJIILJJIL - ((c45621qg.getWidth() * 9) / 16));
        } else {
            i2 = this.LIZJ;
        }
        int max = Math.max(0, this.LJIILJJIL - v.getHeight());
        this.LJFF = max;
        int max2 = Math.max(this.LJIILJJIL - i2, max);
        this.LJI = max2;
        int i3 = this.LJIIIZ;
        if (i3 == 3) {
            int top2 = v.getTop();
            int i4 = this.LJFF;
            if (top2 != i4) {
                h0.LJIIL(i4, v);
            }
        } else if (this.LJII && i3 == 5) {
            h0.LJIIL(this.LJIILJJIL, v);
        } else if (i3 == 4) {
            h0.LJIIL(max2, v);
        } else if (i3 == 1 || i3 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = C270714l.LJIIIZ(c45621qg, this.LJJ);
        }
        this.LJIILL = new WeakReference<>(v);
        this.LJIILLIIL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.mSuperState);
        int i = savedState.LJLIL;
        if (i == 1 || i == 2) {
            this.LJIIIZ = 4;
        } else {
            this.LJIIIZ = i;
        }
    }

    @Override // X.C06C
    public final void onStopNestedScroll(C45621qg c45621qg, V v, View view) {
        int i;
        TMN tmn;
        int i2 = 3;
        if (v.getTop() == this.LJFF) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJIILLIIL;
        if (weakReference == null || view != weakReference.get() || !this.LJIILIIL) {
            return;
        }
        if (this.LJIIL > 0) {
            i = this.LJFF;
        } else {
            if (this.LJII) {
                this.LJIJ.computeCurrentVelocity(1000, this.LIZIZ);
                if (shouldHide(v, this.LJIJ.getYVelocity(this.LJIJI))) {
                    i = this.LJIILJJIL;
                    i2 = 5;
                    WeakReference<V> weakReference2 = this.LJIILL;
                    if (weakReference2 != null && weakReference2.get() != null && (tmn = this.LJIIZILJ) != null) {
                        tmn.getClass();
                    }
                }
            }
            if (this.LJIIL == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.LJFF) < Math.abs(top - this.LJI)) {
                    i = this.LJFF;
                } else {
                    i = this.LJI;
                }
            } else {
                i = this.LJI;
            }
            i2 = 4;
        }
        C270714l c270714l = this.LJIIJ;
        if (c270714l != null && c270714l.LJIJJLI(v.getLeft(), i, v)) {
            setStateInternal(2);
            C16300kU.LJIIL(v, new RunnableC80582Vju(this, v, i2));
        } else {
            setStateInternal(i2);
        }
        this.LJIILIIL = false;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        C270714l c270714l;
        boolean z = false;
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIIZ == 1 && actionMasked == 0) {
            return true;
        }
        if ((motionEvent.getAction() != 2 && motionEvent.getAction() != 6) || (c270714l = this.LJIIJ) == null || c270714l.LIZ != 1 || motionEvent.findPointerIndex(c270714l.LIZJ) >= 0) {
            z = true;
        }
        C270714l c270714l2 = this.LJIIJ;
        if (c270714l2 != null && z) {
            c270714l2.LJIILIIL(motionEvent);
        }
        if (actionMasked == 0) {
            this.LJIJI = -1;
            VelocityTracker velocityTracker = this.LJIJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIJ = null;
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = VelocityTracker.obtain();
        }
        this.LJIJ.addMovement(motionEvent);
        if (actionMasked == 2 && !this.LJIIJJI) {
            float LIZIZ = C1I1.LIZIZ(motionEvent, this.LJIJJ);
            C270714l c270714l3 = this.LJIIJ;
            if (LIZIZ > c270714l3.LIZIZ) {
                c270714l3.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIIJJI;
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        View view2;
        WeakReference<View> weakReference = this.LJIILLIIL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view == view2 && (this.LJIIIZ != 3 || super.onNestedPreFling(c45621qg, v, view, f, f2))) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i) {
        this.LJIIL = 0;
        this.LJIILIIL = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr) {
        View view2;
        WeakReference<View> weakReference = this.LJIILLIIL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.LJFF;
            if (i3 < i4) {
                int i5 = top - i4;
                iArr[1] = i5;
                h0.LJIIL(-i5, v);
                setStateInternal(3);
            } else {
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i6 = this.LJI;
            if (i3 <= i6 || this.LJII) {
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            } else {
                int i7 = top - i6;
                iArr[1] = i7;
                h0.LJIIL(-i7, v);
                setStateInternal(4);
            }
        }
        dispatchOnSlide(v.getTop());
        this.LJIIL = i2;
        this.LJIILIIL = true;
    }
}
