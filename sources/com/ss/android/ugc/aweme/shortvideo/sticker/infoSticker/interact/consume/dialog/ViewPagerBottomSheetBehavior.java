package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog;

import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C16360ka;
import X.C1I1;
import X.C270714l;
import X.C36922EeM;
import X.C45621qg;
import X.C80570Vji;
import X.C80572Vjk;
import X.C80573Vjl;
import X.KMP;
import X.RunnableC80571Vjj;
import android.R;
import android.app.Dialog;
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
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import java.lang.ref.WeakReference;
import o3.h0;

/* loaded from: classes15.dex */
public class ViewPagerBottomSheetBehavior<V extends View> extends C06C<V> {
    public final float LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public final boolean LJII;
    public int LJIIIIZZ;
    public C270714l LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public WeakReference<Dialog> LJIILLIIL;
    public C80573Vjl LJIIZILJ;
    public VelocityTracker LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public final C80570Vji LJIL;

    public ViewPagerBottomSheetBehavior() {
        this.LJIIIIZZ = 4;
        this.LJIL = new C80570Vji(this);
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

    public final View findScrollingChild(View view) {
        View findScrollingChild;
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View focusedChild = ((ViewGroup) view).getFocusedChild();
            if (focusedChild != null && (findScrollingChild = findScrollingChild(focusedChild)) != null) {
                return findScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View findScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                if (findScrollingChild2 != null) {
                    return findScrollingChild2;
                }
            }
        }
        return null;
    }

    public final void setPeekHeight(int i) {
        WeakReference<V> weakReference;
        V v;
        if (i == -1) {
            if (!this.LIZJ) {
                this.LIZJ = true;
            } else {
                return;
            }
        } else {
            if (!this.LIZJ && this.LIZIZ == i) {
                return;
            }
            this.LIZJ = false;
            this.LIZIZ = Math.max(0, i);
            this.LJFF = this.LJIILIIL - i;
        }
        if (this.LJIIIIZZ == 4 && (weakReference = this.LJIILJJIL) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setStateInternal(int i) {
        C80573Vjl c80573Vjl;
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        if (this.LJIILJJIL.get() != null && (c80573Vjl = this.LJIIZILJ) != null && i == 5) {
            c80573Vjl.LIZ.cancel();
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80572Vjk();
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
        this.LJIIIIZZ = 4;
        this.LJIL = new C80570Vji(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.yc, com.zhiliaoapp.musically.R.attr.yd, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yf, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yk, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.af0, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8});
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        this.LJI = obtainStyledAttributes.getBoolean(6, false);
        this.LJII = obtainStyledAttributes.getBoolean(9, false);
        obtainStyledAttributes.recycle();
        this.LIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final void LIZIZ(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.LJFF;
        } else if (i == 3) {
            i2 = this.LJ;
        } else if (this.LJI && i == 5) {
            i2 = this.LJIILIIL;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        if (this.LJIIIZ.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80571Vjj(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this.LJIIIIZZ);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJII) {
            return true;
        }
        if (view.getTop() < this.LJFF) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LJFF) / this.LIZIZ > 0.5f) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        if (!v.isShown()) {
            this.LJIIJ = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
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
                if (this.LJIIJ) {
                    this.LJIIJ = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJIJJ = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.LJIILL;
            if (weakReference != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.LJIJJ, view)) {
                this.LJIJI = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJIJJLI = true;
            }
            if (this.LJIJI == -1 && !c45621qg.LJII(x, this.LJIJJ, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJ = z;
        }
        if (!this.LJIIJ && this.LJIIIZ.LJIJJ(motionEvent)) {
            return true;
        }
        View view2 = this.LJIILL.get();
        if (actionMasked != 2 || view2 == null || this.LJIIJ || this.LJIIIIZZ == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || C1I1.LIZIZ(motionEvent, this.LJIJJ) <= this.LJIIIZ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        Dialog dialog;
        int i2;
        if (C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        try {
            c45621qg.LJIIJ(i, v);
            this.LJIILIIL = c45621qg.getHeight();
            if (this.LIZJ) {
                if (this.LIZLLL == 0) {
                    this.LIZLLL = c45621qg.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.m6);
                }
                i2 = Math.max(this.LIZLLL, this.LJIILIIL - ((c45621qg.getWidth() * 9) / 16));
            } else {
                i2 = this.LIZIZ;
            }
            int max = Math.max(0, this.LJIILIIL - v.getHeight());
            this.LJ = max;
            int max2 = Math.max(this.LJIILIIL - i2, max);
            this.LJFF = max2;
            int i3 = this.LJIIIIZZ;
            if (i3 == 3) {
                h0.LJIIL(this.LJ, v);
            } else if (this.LJI && i3 == 5) {
                h0.LJIIL(this.LJIILIIL, v);
            } else if (i3 == 4) {
                h0.LJIIL(max2, v);
            } else if (i3 == 1 || i3 == 2) {
                h0.LJIIL(top - v.getTop(), v);
            }
            if (this.LJIIIZ == null) {
                this.LJIIIZ = C270714l.LJIIIZ(c45621qg, this.LJIL);
            }
            this.LJIILJJIL = new WeakReference<>(v);
            this.LJIILL = new WeakReference<>(findScrollingChild(v));
            return true;
        } catch (Exception e) {
            if (this.LJIILLIIL != null && (dialog = this.LJIILLIIL.get()) != null && dialog.isShowing()) {
                dialog.dismiss();
            }
            C36922EeM.LIZ(e);
            return true;
        }
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.mSuperState);
        int i = savedState.LJLIL;
        if (i == 1 || i == 2) {
            this.LJIIIIZZ = 4;
        } else {
            this.LJIIIIZZ = i;
        }
    }

    @Override // X.C06C
    public final void onStopNestedScroll(C45621qg c45621qg, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.LJ) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference == null || view != weakReference.get() || !this.LJIIL) {
            return;
        }
        if (this.LJIIJJI > 0) {
            i = this.LJ;
        } else {
            if (this.LJI) {
                this.LJIJ.computeCurrentVelocity(1000, this.LIZ);
                if (shouldHide(v, this.LJIJ.getYVelocity(this.LJIJI))) {
                    i = this.LJIILIIL;
                    i2 = 5;
                }
            }
            if (this.LJIIJJI == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.LJ) < Math.abs(top - this.LJFF)) {
                    i = this.LJ;
                } else {
                    i = this.LJFF;
                }
            } else {
                i = this.LJFF;
            }
            i2 = 4;
        }
        if (this.LJIIIZ.LJIJJLI(v.getLeft(), i, v)) {
            setStateInternal(2);
            C16300kU.LJIIL(v, new RunnableC80571Vjj(this, v, i2));
        } else {
            setStateInternal(i2);
        }
        this.LJIIL = false;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIIIZZ == 1 && actionMasked == 0) {
            return true;
        }
        C270714l c270714l = this.LJIIIZ;
        if (c270714l != null) {
            c270714l.LJIILIIL(motionEvent);
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
        if (actionMasked == 2 && !this.LJIIJ) {
            float LIZIZ = C1I1.LIZIZ(motionEvent, this.LJIJJ);
            C270714l c270714l2 = this.LJIIIZ;
            if (LIZIZ > c270714l2.LIZIZ) {
                c270714l2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIIJ;
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        if (view == this.LJIILL.get() && (this.LJIIIIZZ != 3 || super.onNestedPreFling(c45621qg, v, view, f, f2))) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i) {
        this.LJIIJJI = 0;
        this.LJIIL = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.LJIILL.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.LJ;
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
            int i6 = this.LJFF;
            if (i3 <= i6 || this.LJI) {
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
        v.getTop();
        this.LJIILJJIL.get();
        this.LJIIJJI = i2;
        this.LJIIL = true;
    }
}
