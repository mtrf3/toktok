package com.ss.android.ugc.aweme.account.login;

import X.AbstractC80579Vjr;
import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.C80576Vjo;
import X.C80578Vjq;
import X.InterfaceC80580Vjs;
import X.KMP;
import X.RunnableC80577Vjp;
import X.VWM;
import Y.ARunnableS17S0201000_14;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
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
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public AbstractC80579Vjr LJIILLIIL;
    public VelocityTracker LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public InterfaceC80580Vjs LJIJJLI;
    public final C80576Vjo LJIL;

    public ViewPagerBottomSheetBehavior() {
        this.LJIIIZ = 4;
        this.LJIL = new C80576Vjo(this);
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
        AbstractC80579Vjr abstractC80579Vjr;
        V v = this.LJIILJJIL.get();
        if (v != null && (abstractC80579Vjr = this.LJIILLIIL) != null) {
            if (i > this.LJI) {
                abstractC80579Vjr.LIZ(v);
            } else {
                abstractC80579Vjr.LIZ(v);
            }
        }
    }

    public final View findScrollingChild(View view) {
        View findScrollingChild;
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View LIZ = VWM.LIZ((ViewPager) view);
            if (LIZ != null && (findScrollingChild = findScrollingChild(LIZ)) != null) {
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
            this.LJI = this.LJIILIIL - i;
        }
        if (this.LJIIIZ == 4 && (weakReference = this.LJIILJJIL) != null && (v = weakReference.get()) != null) {
            v.requestLayout();
        }
    }

    public final void setState(int i) {
        if (i == this.LJIIIZ) {
            return;
        }
        WeakReference<V> weakReference = this.LJIILJJIL;
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
            v.post(new ARunnableS17S0201000_14(i, v, this, 7));
        } else {
            LIZIZ(i, v);
        }
    }

    public final void setStateInternal(int i) {
        AbstractC80579Vjr abstractC80579Vjr;
        if (this.LJIIIZ == i) {
            return;
        }
        this.LJIIIZ = i;
        V v = this.LJIILJJIL.get();
        if (v != null && (abstractC80579Vjr = this.LJIILLIIL) != null) {
            abstractC80579Vjr.LIZIZ(i, v);
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80578Vjq();
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
        this.LJIIIZ = 4;
        this.LJIL = new C80576Vjo(this);
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
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.LIZIZ = viewConfiguration.getScaledMaximumFlingVelocity();
        this.LIZ = viewConfiguration.getScaledMinimumFlingVelocity();
    }

    public final void LIZIZ(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.LJI;
        } else if (i == 3) {
            i2 = this.LJFF;
        } else if (this.LJII && i == 5) {
            i2 = this.LJIILIIL;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        if (this.LJIIJ.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80577Vjp(this, view, i));
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
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LJI) / this.LIZJ > 0.5f) {
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
        if (actionMasked == 0) {
            this.LJIJ = -1;
            VelocityTracker velocityTracker = this.LJIIZILJ;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJIIZILJ = null;
            }
        }
        if (this.LJIIZILJ == null) {
            this.LJIIZILJ = VelocityTracker.obtain();
        }
        this.LJIIZILJ.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJIJJ = false;
                this.LJIJ = -1;
                if (this.LJIIJJI) {
                    this.LJIIJJI = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJIJI = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.LJIILL;
            if (weakReference != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.LJIJI, view)) {
                this.LJIJ = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJIJJ = true;
            }
            if (this.LJIJ == -1 && !c45621qg.LJII(x, this.LJIJI, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIIJJI = z;
        }
        if (!this.LJIIJJI && this.LJIIJ.LJIJJ(motionEvent)) {
            return true;
        }
        View view2 = this.LJIILL.get();
        if (actionMasked != 2 || view2 == null || this.LJIIJJI || this.LJIIIZ == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || C1I1.LIZIZ(motionEvent, this.LJIJI) <= this.LJIIJ.LIZIZ) {
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
        this.LJIILIIL = c45621qg.getHeight();
        if (this.LIZLLL) {
            if (this.LJ == 0) {
                this.LJ = c45621qg.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.m6);
            }
            i2 = Math.max(this.LJ, this.LJIILIIL - ((c45621qg.getWidth() * 9) / 16));
        } else {
            i2 = this.LIZJ;
        }
        int max = Math.max(0, this.LJIILIIL - v.getHeight());
        this.LJFF = max;
        int max2 = Math.max(this.LJIILIIL - i2, max);
        this.LJI = max2;
        int i3 = this.LJIIIZ;
        if (i3 == 3) {
            h0.LJIIL(this.LJFF, v);
        } else if (this.LJII && i3 == 5) {
            h0.LJIIL(this.LJIILIIL, v);
        } else if (i3 == 4) {
            h0.LJIIL(max2, v);
        } else if (i3 == 1 || i3 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = C270714l.LJIIIZ(c45621qg, this.LJIL);
        }
        this.LJIILJJIL = new WeakReference<>(v);
        this.LJIILL = new WeakReference<>(findScrollingChild(v));
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
        int i2 = 3;
        if (v.getTop() == this.LJFF) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference == null || view != weakReference.get() || !this.LJIIL) {
            return;
        }
        this.LJIIZILJ.computeCurrentVelocity(1000, this.LIZIZ);
        float xVelocity = this.LJIIZILJ.getXVelocity(this.LJIJ);
        float yVelocity = this.LJIIZILJ.getYVelocity(this.LJIJ);
        if (yVelocity < 0.0f && Math.abs(yVelocity) > this.LIZ && Math.abs(yVelocity) > Math.abs(xVelocity)) {
            i = this.LJFF;
        } else if (this.LJII && shouldHide(v, yVelocity)) {
            i = this.LJIILIIL;
            i2 = 5;
        } else {
            if (yVelocity > 0.0f && Math.abs(yVelocity) > this.LIZ && Math.abs(yVelocity) > Math.abs(xVelocity)) {
                i = this.LJI;
            } else {
                int top = v.getTop();
                if (Math.abs(top - this.LJFF) < Math.abs(top - this.LJI)) {
                    i = this.LJFF;
                } else {
                    i = this.LJI;
                }
            }
            i2 = 4;
        }
        if (this.LJIIJ.LJIJJLI(v.getLeft(), i, v)) {
            setStateInternal(2);
            C16300kU.LJIIL(v, new RunnableC80577Vjp(this, v, i2));
        } else {
            setStateInternal(i2);
        }
        this.LJIIL = false;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        int i;
        InterfaceC80580Vjs interfaceC80580Vjs;
        try {
            if (!v.isShown()) {
                return false;
            }
            if (motionEvent.getAction() == 0 && ((i = this.LJIIIZ) == 3 || i == 4)) {
                Rect rect = new Rect();
                v.getGlobalVisibleRect(rect);
                if (!rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY()) && (interfaceC80580Vjs = this.LJIJJLI) != null) {
                    interfaceC80580Vjs.LIZIZ();
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (this.LJIIIZ == 1 && actionMasked == 0) {
                return true;
            }
            C270714l c270714l = this.LJIIJ;
            if (c270714l != null) {
                c270714l.LJIILIIL(motionEvent);
            }
            if (actionMasked == 0) {
                this.LJIJ = -1;
                VelocityTracker velocityTracker = this.LJIIZILJ;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.LJIIZILJ = null;
                }
            }
            if (this.LJIIZILJ == null) {
                this.LJIIZILJ = VelocityTracker.obtain();
            }
            this.LJIIZILJ.addMovement(motionEvent);
            if (actionMasked == 2 && !this.LJIIJJI) {
                float abs = Math.abs(this.LJIJI - motionEvent.getY());
                C270714l c270714l2 = this.LJIIJ;
                if (abs > c270714l2.LIZIZ) {
                    c270714l2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
                }
            }
            return !this.LJIIJJI;
        } catch (IllegalArgumentException e) {
            if (!TextUtils.isEmpty(e.getMessage()) && e.getMessage().contains("pointerIndex out of range")) {
                return false;
            }
            throw e;
        }
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        if (view == this.LJIILL.get() && (this.LJIIIZ != 3 || super.onNestedPreFling(c45621qg, v, view, f, f2))) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i) {
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
        this.LJIIL = true;
    }
}
