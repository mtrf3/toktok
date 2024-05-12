package com.bytedance.ies.bullet.service.popup.anim;

import X.C06C;
import X.C16300kU;
import X.C45621qg;
import X.C60576Nq0;
import X.C61009Nwz;
import X.C80856VoK;
import X.C80858VoM;
import X.InterfaceC16600ky;
import X.InterpolatorC61444O9o;
import X.KMP;
import X.RunnableC80857VoL;
import Y.AUListenerS90S0100000_1;
import Y.IDCreatorS56S0000000_14;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import o3.h0;

/* loaded from: classes15.dex */
public class BottomSheetBehavior<V extends View> extends C06C<V> {
    public final float LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public boolean LJ;
    public int LJFF;
    public C80856VoK LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public WeakReference<V> LJIIJJI;
    public WeakReference<View> LJIIL;
    public C60576Nq0 LJIILIIL;
    public VelocityTracker LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public boolean LJJ;
    public boolean LJJI;
    public boolean LJJIFFI;
    public ValueAnimator LJJII;
    public boolean LJJIII;
    public final C80858VoM LJJIIJ;

    public BottomSheetBehavior() {
        this.LJFF = 4;
        this.LJJIIJ = new C80858VoM(this);
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new IDCreatorS56S0000000_14(2);
        public final int LJLIL;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LJLIL = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.LJLIL = i;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
        }
    }

    public final void dispatchOnSlide(int i) {
        C60576Nq0 c60576Nq0;
        V v = this.LJIIJJI.get();
        if (v != null && (c60576Nq0 = this.LJIILIIL) != null) {
            if (i > this.LIZLLL) {
                c60576Nq0.LIZ(v, (r2 - i) / this.LIZIZ);
            } else {
                c60576Nq0.LIZ(v, (r2 - i) / (r2 - this.LIZJ));
            }
        }
    }

    public final View findScrollingChild(View view) {
        if (view instanceof InterfaceC16600ky) {
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
            return null;
        }
        return null;
    }

    public final void setPeekHeight(int i) {
        this.LIZIZ = Math.max(0, i);
        this.LIZLLL = this.LJIIJ - i;
    }

    public final void setState(int i) {
        int i2;
        WeakReference<V> weakReference = this.LJIIJJI;
        if (weakReference == null) {
            if (i == 4 || i == 3 || (this.LJ && i == 5)) {
                this.LJFF = i;
                return;
            }
            return;
        }
        V v = weakReference.get();
        if (v == null) {
            return;
        }
        if (i == 4) {
            i2 = this.LIZLLL;
        } else if (i == 3) {
            i2 = this.LIZJ;
        } else if (this.LJ && i == 5) {
            i2 = this.LJIIJ;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        setStateInternal(2);
        C80856VoK c80856VoK = this.LJI;
        int left = v.getLeft();
        c80856VoK.LJIIZILJ = v;
        c80856VoK.LIZJ = -1;
        if (!c80856VoK.LJIIIZ(left, i2, 0, 0)) {
            if (c80856VoK.LIZ == 0 && c80856VoK.LJIIZILJ != null) {
                c80856VoK.LJIIZILJ = null;
                return;
            }
            return;
        }
        C16300kU.LJIIL(v, new RunnableC80857VoL(this, v, i));
    }

    public final void setStateInternal(int i) {
        C60576Nq0 c60576Nq0;
        if (this.LJFF == i) {
            return;
        }
        this.LJFF = i;
        V v = this.LJIIJJI.get();
        if (v != null && (c60576Nq0 = this.LJIILIIL) != null) {
            c60576Nq0.LIZIZ(i, v);
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LJFF = 4;
        this.LJJIIJ = new C80858VoM(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.yc, com.zhiliaoapp.musically.R.attr.yd, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yf, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yk, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.af0, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8});
        setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, 0));
        this.LJ = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
        this.LIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this.LJFF);
    }

    public final boolean shouldHide(View view, float f) {
        if (view.getTop() < this.LIZLLL) {
            return false;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LIZLLL) / this.LIZIZ <= 0.5f) {
            return false;
        }
        return true;
    }

    public final void LIZ(C45621qg c45621qg, int i, long j) {
        if (this.LJJII != null) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(c45621qg.getHeight(), i);
        this.LJJII = ofInt;
        ofInt.setInterpolator(new InterpolatorC61444O9o());
        this.LJJII.addUpdateListener(new AUListenerS90S0100000_1(c45621qg, 3));
        this.LJJII.addListener(new C61009Nwz(this, i));
        this.LJJII.setDuration(j);
        this.LJJII.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0193, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r6 != 3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0073, code lost:
    
        if (r10.LIZ == 1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0075, code lost:
    
        return r1;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C45621qg r19, V r20, android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.onInterceptTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        if (C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(v)) {
            v.setFitsSystemWindows(true);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        int height = c45621qg.getHeight();
        this.LJIIJ = height;
        int max = Math.max(0, height - v.getHeight());
        this.LIZJ = max;
        int max2 = Math.max(this.LJIIJ - this.LIZIZ, max);
        this.LIZLLL = max2;
        int i2 = this.LJFF;
        if (i2 == 3) {
            h0.LJIIL(this.LIZJ, v);
        } else if (this.LJ && i2 == 5) {
            h0.LJIIL(this.LJIIJ, v);
        } else if (i2 == 4) {
            h0.LJIIL(max2, v);
        } else if (i2 == 1 || i2 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        if (this.LJI == null) {
            this.LJI = new C80856VoK(c45621qg.getContext(), c45621qg, this.LJJIIJ);
        }
        this.LJIIJJI = new WeakReference<>(v);
        this.LJIIL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.getSuperState());
        int i = savedState.LJLIL;
        if (i == 1 || i == 2) {
            this.LJFF = 4;
        } else {
            this.LJFF = i;
        }
    }

    @Override // X.C06C
    public final void onStopNestedScroll(C45621qg c45621qg, V v, View view) {
        int i;
        int i2 = 3;
        if (v.getTop() == this.LIZJ) {
            setStateInternal(3);
            return;
        }
        if (view != this.LJIIL.get() || !this.LJIIIZ) {
            return;
        }
        if (this.LJIIIIZZ > 0) {
            i = this.LIZJ;
        } else {
            if (this.LJ) {
                this.LJIILJJIL.computeCurrentVelocity(1000, this.LIZ);
                if (shouldHide(v, this.LJIILJJIL.getYVelocity(this.LJIILL))) {
                    i = this.LJIIJ;
                    i2 = 5;
                }
            }
            if (this.LJIIIIZZ == 0) {
                int top = v.getTop();
                if (Math.abs(top - this.LIZJ) < Math.abs(top - this.LIZLLL)) {
                    i = this.LIZJ;
                } else {
                    i = this.LIZLLL;
                }
            } else {
                i = this.LIZLLL;
            }
            i2 = 4;
        }
        C80856VoK c80856VoK = this.LJI;
        int left = v.getLeft();
        c80856VoK.LJIIZILJ = v;
        c80856VoK.LIZJ = -1;
        if (!c80856VoK.LJIIIZ(left, i, 0, 0)) {
            if (c80856VoK.LIZ == 0 && c80856VoK.LJIIZILJ != null) {
                c80856VoK.LJIIZILJ = null;
            }
            setStateInternal(i2);
        } else {
            setStateInternal(2);
            C16300kU.LJIIL(v, new RunnableC80857VoL(this, v, i2));
        }
        this.LJIIIZ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c7, code lost:
    
        if (r10.LIZJ == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        r10.LJIIJ();
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C45621qg r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.service.popup.anim.BottomSheetBehavior.onTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        if (view == this.LJIIL.get() && (this.LJFF != 3 || super.onNestedPreFling(c45621qg, v, view, f, f2))) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i) {
        this.LJIIIIZZ = 0;
        this.LJIIIZ = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final void onNestedPreScroll(C45621qg c45621qg, V v, View view, int i, int i2, int[] iArr) {
        if (view != this.LJIIL.get()) {
            return;
        }
        int top = v.getTop();
        int i3 = top - i2;
        if (i2 > 0) {
            int i4 = this.LIZJ;
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
            int i6 = this.LIZLLL;
            if (i3 <= i6 || this.LJ) {
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
        this.LJIIIIZZ = i2;
        this.LJIIIZ = true;
    }
}
