package com.ss.android.ugc.aweme.vision.behavior;

import X.AbstractC51451KHf;
import X.C06C;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.C80591Vk3;
import X.C80593Vk5;
import X.KMP;
import X.RunnableC80592Vk4;
import X.VWM;
import Y.ARunnableS11S0201000_8;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import o3.h0;

/* loaded from: classes15.dex */
public class SearchBottomSheetBehavior<V extends View> extends C06C<V> {
    public final float LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public C270714l LJIIJ;
    public boolean LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public WeakReference<V> LJIILL;
    public WeakReference<View> LJIILLIIL;
    public final List<AbstractC51451KHf> LJIIZILJ;
    public VelocityTracker LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public boolean LJJI;
    public final C80591Vk3 LJJIFFI;

    public boolean LIZIZ(View view) {
        return true;
    }

    public SearchBottomSheetBehavior() {
        this.LJIIIZ = 4;
        this.LJIIZILJ = new ArrayList();
        this.LJIL = -1;
        this.LJJ = -1;
        this.LJJI = false;
        this.LJJIFFI = new C80591Vk3(this);
    }

    public final void dispatchOnSlide(int i) {
        V v = this.LJIILL.get();
        if (v != null && !((ArrayList) this.LJIIZILJ).isEmpty()) {
            int i2 = 0;
            if (i > this.LJI) {
                while (i2 < ((ArrayList) this.LJIIZILJ).size()) {
                    ((AbstractC51451KHf) ListProtector.get(this.LJIIZILJ, i2)).LIZ(v);
                    i2++;
                }
            } else {
                while (i2 < ((ArrayList) this.LJIIZILJ).size()) {
                    ((AbstractC51451KHf) ListProtector.get(this.LJIIZILJ, i2)).LIZ(v);
                    i2++;
                }
            }
        }
    }

    public final View findScrollingChild(View view) {
        if (view == null) {
            return null;
        }
        if (C16360ka.LJIILL(view)) {
            return view;
        }
        if (view instanceof ViewPager) {
            View findScrollingChild = findScrollingChild(VWM.LIZ((ViewPager) view));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View findScrollingChild2 = findScrollingChild(viewGroup.getChildAt(i));
                    if (findScrollingChild2 != null) {
                        return findScrollingChild2;
                    }
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
            if (!this.LIZLLL && this.LIZIZ == i) {
                return;
            }
            this.LIZLLL = false;
            this.LIZIZ = Math.max(0, i);
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
            v.post(new ARunnableS11S0201000_8(v, (PhotoSearchBottomSheetBehavior) this, i, 2));
        } else {
            LIZJ(i, v);
        }
    }

    public final void setStateInternal(int i) {
        if (this.LJIIIZ == i) {
            return;
        }
        this.LJIIIZ = i;
        V v = this.LJIILL.get();
        if (v != null && !((ArrayList) this.LJIIZILJ).isEmpty()) {
            for (int i2 = 0; i2 < ((ArrayList) this.LJIIZILJ).size(); i2++) {
                ((AbstractC51451KHf) ListProtector.get(this.LJIIZILJ, i2)).LIZIZ(i, v);
            }
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80593Vk5();
        public final int LJLIL;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LJLIL = parcel.readInt();
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.LJLIL = i;
        }
    }

    public SearchBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LJIIIZ = 4;
        this.LJIIZILJ = new ArrayList();
        this.LJIL = -1;
        this.LJJ = -1;
        this.LJJI = false;
        this.LJJIFFI = new C80591Vk3(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.yc, com.zhiliaoapp.musically.R.attr.yd, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yf, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yk, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.af0, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8});
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        obtainStyledAttributes.recycle();
        this.LIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public C270714l LIZ(C45621qg c45621qg, C80591Vk3 c80591Vk3) {
        return C270714l.LJIIIZ(c45621qg, c80591Vk3);
    }

    public final void LIZJ(int i, View view) {
        int i2;
        if (i == 4) {
            i2 = this.LJI;
        } else if (i == 3) {
            i2 = this.LJFF;
        } else if (this.LJII && i == 5) {
            i2 = this.LJIL;
            if (i2 <= 0) {
                i2 = this.LJIILJJIL;
            }
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        C270714l c270714l = this.LJIIJ;
        if (c270714l != null && c270714l.LJIJJLI(view.getLeft(), i2, view)) {
            setStateInternal(2);
            C16300kU.LJIIL(view, new RunnableC80592Vk4(this, view, i));
        } else {
            setStateInternal(i);
        }
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this.LJIIIZ);
    }

    public boolean shouldHide(View view, float f) {
        if (view.getTop() < this.LJI) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LJI) / this.LIZIZ <= 0.5f) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        View view;
        C270714l c270714l;
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
        if (!this.LJIIJJI && (c270714l = this.LJIIJ) != null && c270714l.LJIJJ(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.LJIILLIIL;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.LJIIJJI || this.LJIIIZ == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.LJIIJ == null || C1I1.LIZIZ(motionEvent, this.LJIJJ) <= this.LJIIJ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        int i2;
        int i3;
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
            this.LIZJ = i2;
        } else {
            i2 = this.LIZIZ;
        }
        int i4 = this.LJJ;
        if (i4 <= 0) {
            i4 = Math.max(0, this.LJIILJJIL - v.getHeight());
        }
        this.LJFF = i4;
        int i5 = this.LJJ;
        if (i5 <= 0) {
            i5 = Math.max(this.LJIILJJIL - i2, i4);
        }
        this.LJI = i5;
        int i6 = this.LJIIIZ;
        if (i6 == 3) {
            h0.LJIIL(this.LJFF, v);
        } else if (this.LJII && i6 == 5) {
            if (this.LJJI) {
                i3 = this.LJIL;
                if (i3 <= 0) {
                    i3 = this.LJIILJJIL;
                }
            } else {
                i3 = this.LJIILJJIL;
            }
            h0.LJIIL(i3, v);
        } else if (i6 == 4) {
            h0.LJIIL(i5, v);
        } else if (i6 == 1 || i6 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        if (this.LJIIJ == null) {
            this.LJIIJ = LIZ(c45621qg, this.LJJIFFI);
        }
        this.LJIILL = new WeakReference<>(v);
        this.LJIILLIIL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.getSuperState());
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
        WeakReference<View> weakReference = this.LJIILLIIL;
        if (weakReference == null || view != weakReference.get() || !this.LJIILIIL) {
            return;
        }
        if (this.LJIIL > 0 && LIZIZ(v)) {
            i = this.LJFF;
        } else {
            if (this.LJII) {
                this.LJIJ.computeCurrentVelocity(1000, this.LIZ);
                if (shouldHide(v, this.LJIJ.getYVelocity(this.LJIJI))) {
                    i = this.LJIL;
                    if (i <= 0) {
                        i = this.LJIILJJIL;
                    }
                    i2 = 5;
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
            C16300kU.LJIIL(v, new RunnableC80592Vk4(this, v, i2));
        } else {
            setStateInternal(i2);
        }
        this.LJIILIIL = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0032, code lost:
    
        if (r1 < 0) goto L18;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C45621qg r7, V r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            boolean r0 = r8.isShown()
            r5 = 0
            if (r0 != 0) goto L8
            return r5
        L8:
            int r3 = r9.getActionMasked()
            int r0 = r6.LJIIIZ
            r4 = 1
            if (r0 != r4) goto L14
            if (r3 != 0) goto L14
            return r4
        L14:
            int r0 = r9.getAction()
            r2 = 2
            if (r0 == r2) goto L22
            int r1 = r9.getAction()
            r0 = 6
            if (r1 != r0) goto L81
        L22:
            X.14l r0 = r6.LJIIJ
            int r0 = r0.LIZJ
            int r1 = r9.findPointerIndex(r0)
            X.14l r0 = r6.LJIIJ
            if (r0 == 0) goto L81
            int r0 = r0.LIZ
            if (r0 != r4) goto L81
            if (r1 >= 0) goto L81
        L34:
            X.14l r0 = r6.LJIIJ
            if (r0 == 0) goto L3d
            if (r5 == 0) goto L3d
            r0.LJIILIIL(r9)
        L3d:
            if (r3 != 0) goto L4c
            r0 = -1
            r6.LJIJI = r0
            android.view.VelocityTracker r0 = r6.LJIJ
            if (r0 == 0) goto L4c
            r0.recycle()
            r0 = 0
            r6.LJIJ = r0
        L4c:
            android.view.VelocityTracker r0 = r6.LJIJ
            if (r0 != 0) goto L56
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.LJIJ = r0
        L56:
            android.view.VelocityTracker r0 = r6.LJIJ
            r0.addMovement(r9)
            if (r3 != r2) goto L7c
            boolean r0 = r6.LJIIJJI
            if (r0 != 0) goto L7c
            int r0 = r6.LJIJJ
            float r0 = (float) r0
            float r2 = X.C1I1.LIZIZ(r9, r0)
            X.14l r1 = r6.LJIIJ
            int r0 = r1.LIZIZ
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L7c
            int r0 = r9.getActionIndex()
            int r0 = r9.getPointerId(r0)
            r1.LIZJ(r0, r8)
        L7c:
            boolean r0 = r6.LJIIJJI
            r0 = r0 ^ 1
            return r0
        L81:
            r5 = 1
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.vision.behavior.SearchBottomSheetBehavior.onTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        if (view == this.LJIILLIIL.get() && (this.LJIIIZ != 3 || super.onNestedPreFling(c45621qg, v, view, f, f2))) {
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
    public final void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.LJIILLIIL.get()) {
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
