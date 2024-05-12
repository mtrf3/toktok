package com.ss.android.ugc.aweme.commercialize.feed.popupwebview;

import X.C06C;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C45621qg;
import X.C80755Vmh;
import X.C80756Vmi;
import X.C80758Vmk;
import X.KMP;
import X.NYN;
import X.RunnableC80757Vmj;
import X.VWM;
import Y.ARunnableS13S0201000_10;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
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
public class AdPopUpWebBottomSheetBehavior<V extends View> extends C06C<V> {
    public final float LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public C80756Vmi LJIIIZ;
    public boolean LJIIJ;
    public int LJIIJJI;
    public boolean LJIIL;
    public int LJIILIIL;
    public WeakReference<V> LJIILJJIL;
    public WeakReference<View> LJIILL;
    public NYN LJIILLIIL;
    public VelocityTracker LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public final boolean LJIL;
    public int LJJ;
    public int LJJI;
    public final float LJJIFFI;
    public boolean LJJII;
    public final C80758Vmk LJJIII;

    public AdPopUpWebBottomSheetBehavior() {
        this.LJIIIIZZ = 4;
        this.LJIL = true;
        this.LJJIFFI = 0.2683658f;
        this.LJJIII = new C80758Vmk(this);
    }

    public final void dispatchOnSlide(int i) {
        V v;
        NYN nyn;
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference != null && (v = weakReference.get()) != null && (nyn = this.LJIILLIIL) != null) {
            if (i > this.LJFF) {
                nyn.LIZ(v, (r2 - i) / (this.LJIILIIL - r2));
            } else {
                nyn.LIZ(v, (r2 - i) / (r2 - this.LJ));
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
            return findScrollingChild(VWM.LIZ((ViewPager) view));
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getVisibility() == 0) {
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
                    if (findScrollingChild != null) {
                        return findScrollingChild;
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

    public final void setState(int i) {
        if (i == this.LJIIIIZZ) {
            return;
        }
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJI && i == 5)) {
                this.LJIIIIZZ = i;
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
            v.post(new ARunnableS13S0201000_10(i, v, this, 1));
        } else {
            LIZIZ(i, v);
        }
    }

    public final void setStateInternal(int i) {
        V v;
        NYN nyn;
        if (this.LJIIIIZZ == i) {
            return;
        }
        this.LJIIIIZZ = i;
        WeakReference<V> weakReference = this.LJIILJJIL;
        if (weakReference != null && (v = weakReference.get()) != null && (nyn = this.LJIILLIIL) != null) {
            nyn.LIZIZ(i, v);
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80755Vmh();
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

    public AdPopUpWebBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LJIIIIZZ = 4;
        this.LJIL = true;
        this.LJJIFFI = 0.2683658f;
        this.LJJIII = new C80758Vmk(this);
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

    /* JADX WARN: Removed duplicated region for block: B:5:0x0018 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(float r5, android.view.View r6) {
        /*
            r4 = this;
            boolean r0 = r4.LJII
            r3 = 1056964608(0x3f000000, float:0.5)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            if (r0 == 0) goto L1a
            int r0 = r6.getTop()
            float r0 = (float) r0
            float r5 = r5 * r2
            float r5 = r5 + r0
            int r0 = r4.LJIILIIL
            float r0 = (float) r0
            float r5 = r5 / r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L22
        L18:
            r0 = 1
        L19:
            return r0
        L1a:
            int r1 = r6.getTop()
            int r0 = r4.LJFF
            if (r1 >= r0) goto L24
        L22:
            r0 = 0
            goto L19
        L24:
            int r0 = r6.getTop()
            float r0 = (float) r0
            float r5 = r5 * r2
            float r5 = r5 + r0
            int r0 = r4.LJFF
            float r0 = (float) r0
            float r5 = r5 - r0
            float r1 = java.lang.Math.abs(r5)
            int r0 = r4.LIZIZ
            float r0 = (float) r0
            float r1 = r1 / r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L22
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.LIZ(float, android.view.View):boolean");
    }

    public final void LIZIZ(int i, View view) {
        int i2;
        float f;
        boolean z = this.LJIJJLI;
        if (i == 4) {
            i2 = this.LJFF;
            z = false;
        } else if (i == 3) {
            i2 = this.LJ;
        } else if (this.LJI && i == 5) {
            i2 = this.LJIILIIL;
        } else if (i == 6) {
            i2 = this.LJJI;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        C80756Vmi c80756Vmi = this.LJIIIZ;
        if (c80756Vmi != null) {
            int left = view.getLeft();
            if (z) {
                f = 0.8f;
            } else {
                f = 1.0f;
            }
            C80756Vmi.LJIJJLI = f;
            c80756Vmi.LJIIZILJ = view;
            c80756Vmi.LIZJ = -1;
            if (!c80756Vmi.LJIIIIZZ(left, i2, 0, 0)) {
                if (c80756Vmi.LIZ == 0 && c80756Vmi.LJIIZILJ != null) {
                    c80756Vmi.LJIIZILJ = null;
                }
            } else {
                setStateInternal(2);
                C16300kU.LJIIL(view, new RunnableC80757Vmj(this, view, i));
                return;
            }
        }
        setStateInternal(i);
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this.LJIIIIZZ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        if (r12 != r16) goto L87;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C45621qg r22, V r23, android.view.MotionEvent r24) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onInterceptTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
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
        int i3 = this.LJ;
        this.LJJ = i3;
        int i4 = this.LJIILIIL;
        int i5 = (int) (i4 * this.LJJIFFI);
        this.LJJI = i5;
        int i6 = this.LJIIIIZZ;
        if (i6 == 3) {
            h0.LJIIL(i3, v);
        } else if (this.LJI && i6 == 5) {
            h0.LJIIL(i4, v);
        } else if (i6 == 4) {
            h0.LJIIL(max2, v);
        } else if (i6 == 1 || i6 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        } else if (i6 == 6) {
            h0.LJIIL(i5, v);
        }
        if (this.LJIIIZ == null) {
            this.LJIIIZ = new C80756Vmi(c45621qg.getContext(), c45621qg, this.LJJIII);
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
            this.LJIIIIZZ = 4;
        } else {
            this.LJIIIIZZ = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x00c7, code lost:
    
        if (r6.LJI != false) goto L41;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C45621qg r7, V r8, android.view.View r9) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onStopNestedScroll(X.1qg, android.view.View, android.view.View):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e6, code lost:
    
        if (r10.LIZJ == (-1)) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C45621qg r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior.onTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJIILL;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.LJIIIIZZ == 3 && !super.onNestedPreFling(c45621qg, v, view, f, f2)) {
            return false;
        }
        return true;
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
        View view2;
        WeakReference<View> weakReference = this.LJIILL;
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
        dispatchOnSlide(v.getTop());
        this.LJIIJJI = i2;
        this.LJIIL = true;
    }
}
