package com.bytedance.hybrid.spark.anim;

import X.AbstractC60969NwL;
import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C45621qg;
import X.C60965NwH;
import X.C80761Vmn;
import X.C80762Vmo;
import X.C80764Vmq;
import Y.ARunnableS3S0211000_14;
import Y.AUListenerS98S0100000_10;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.AbsSavedState;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o3.h0;

/* loaded from: classes15.dex */
public class BottomSheetBehavior<V extends View> extends C06C<V> {
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public BottomSheetBehavior<V>.c LJI;
    public ValueAnimator LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public float LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public WeakReference<View> LJIJ;
    public WeakReference<View> LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public int LJJII;
    public boolean LJJIII;
    public int LJJIIJ;
    public C80761Vmn LJJIIJZLJL;
    public boolean LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public WeakReference<V> LJJIJIL;
    public WeakReference<View> LJJIJL;
    public final ArrayList<AbstractC60969NwL> LJJIJLIJ;
    public VelocityTracker LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public int LJJJI;
    public boolean LJJJIL;
    public Map<View, Integer> LJJJJ;
    public final C80764Vmq LJJJJI;
    public C60965NwH LJJJJIZL;

    /* loaded from: classes15.dex */
    public class c implements Runnable {
        public final View LJLIL;
        public boolean LJLILLLLZI;
        public int LJLJI;

        public final void LIZ() {
            C80761Vmn c80761Vmn = BottomSheetBehavior.this.LJJIIJZLJL;
            if (c80761Vmn != null) {
                if (c80761Vmn.LIZ == 2) {
                    boolean computeScrollOffset = c80761Vmn.LJIILL.computeScrollOffset();
                    int currX = c80761Vmn.LJIILL.getCurrX();
                    int currY = c80761Vmn.LJIILL.getCurrY();
                    int left = currX - c80761Vmn.LJIIZILJ.getLeft();
                    int top = currY - c80761Vmn.LJIIZILJ.getTop();
                    if (left != 0) {
                        h0.LJIIJJI(left, c80761Vmn.LJIIZILJ);
                    }
                    if (top != 0) {
                        h0.LJIIL(top, c80761Vmn.LJIIZILJ);
                    }
                    if (left != 0 || top != 0) {
                        ((C80764Vmq) c80761Vmn.LJIILLIIL).LIZ.dispatchOnSlide(currY);
                    }
                    if (computeScrollOffset) {
                        if (currX == c80761Vmn.LJIILL.getFinalX() && currY == c80761Vmn.LJIILL.getFinalY()) {
                            c80761Vmn.LJIILL.abortAnimation();
                        }
                    }
                    c80761Vmn.LJIJI.post(c80761Vmn.LJIJJ);
                }
                if (c80761Vmn.LIZ == 2) {
                    C16300kU.LJIIL(this.LJLIL, this);
                    this.LJLILLLLZI = false;
                }
            }
            BottomSheetBehavior.this.setStateInternal(this.LJLJI);
            this.LJLILLLLZI = false;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                LIZ();
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

    public final int LIZ() {
        int i = this.LJIJJLI;
        if (i == -1) {
            return this.LIZJ;
        }
        return i;
    }

    public final void calculateCollapsedOffset() {
        int i;
        if (this.LIZLLL) {
            i = Math.max(this.LJ, this.LJJIJIIJIL - ((this.LJJIJIIJI * 9) / 16));
        } else {
            i = this.LIZJ;
        }
        if (this.LIZ) {
            this.LJIILJJIL = Math.max(this.LJJIJIIJIL - i, this.LJIIJJI);
        } else {
            this.LJIILJJIL = this.LJJIJIIJIL - i;
        }
    }

    public final int getExpandedOffset() {
        if (this.LIZ) {
            return this.LJIIJJI;
        }
        return this.LJIIIIZZ;
    }

    public final int getPeekHeight() {
        if (this.LIZLLL) {
            return -1;
        }
        return this.LIZJ;
    }

    public BottomSheetBehavior() {
        this.LIZ = true;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJJII = 5;
        this.LJJIIJ = 4;
        this.LJJIJLIJ = new ArrayList<>();
        this.LJJJJI = new C80764Vmq(this);
    }

    @Override // X.C06C
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJIJIL = null;
        this.LJJIIJZLJL = null;
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80762Vmo();
        public final int LJLIL;
        public final int LJLILLLLZI;
        public final int LJLJI;
        public final boolean LJLJJI;
        public final boolean LJLJJL;
        public final boolean LJLJJLL;

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z;
            boolean z2;
            this.LJLIL = parcel.readInt();
            this.LJLILLLLZI = parcel.readInt();
            this.LJLJI = parcel.readInt();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            this.LJLJJI = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJLJJL = z2;
            this.LJLJJLL = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.LJLIL = bottomSheetBehavior.LJJIIJ;
            this.LJLILLLLZI = bottomSheetBehavior.LIZJ;
            this.LJLJI = bottomSheetBehavior.LJIJJLI;
            this.LJLJJI = bottomSheetBehavior.LIZ;
            this.LJLJJL = bottomSheetBehavior.LJIILL;
            this.LJLJJLL = bottomSheetBehavior.LJIILLIIL;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.LJLIL);
            parcel.writeInt(this.LJLILLLLZI);
            parcel.writeInt(this.LJLJI);
            parcel.writeInt(this.LJLJJI ? 1 : 0);
            parcel.writeInt(this.LJLJJL ? 1 : 0);
            parcel.writeInt(this.LJLJJLL ? 1 : 0);
        }
    }

    public final void LIZIZ(int i) {
        if (i == this.LJJIIJ) {
            return;
        }
        if (this.LJJIJIL == null) {
            if (i == 4 || i == 3 || i == 6 || (this.LJIILL && i == 5)) {
                this.LJJIIJ = i;
                return;
            }
            return;
        }
        LIZLLL(i);
    }

    public final void LIZLLL(int i) {
        V v = this.LJJIJIL.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(v)) {
            v.post(new ARunnableS3S0211000_14(this, v, i, 1));
        } else {
            LIZJ(i, v, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchOnSlide(int r7) {
        /*
            r6 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.LJJIJIL
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            r3 = 0
            java.lang.ref.WeakReference<android.view.View> r0 = r6.LJIJ     // Catch: java.lang.Exception -> L60
            r5 = 0
            if (r0 != 0) goto L10
            r2 = r5
            goto L16
        L10:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Exception -> L60
            android.view.View r2 = (android.view.View) r2     // Catch: java.lang.Exception -> L60
        L16:
            java.lang.ref.WeakReference<android.view.View> r0 = r6.LJIJI     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L32
        L1a:
            X.NwH r0 = r6.LJJJJIZL     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L64
            X.Nvz r1 = r0.LIZ     // Catch: java.lang.Exception -> L60
            X.Nvz r0 = X.EnumC60947Nvz.DONE     // Catch: java.lang.Exception -> L60
            if (r1 != r0) goto L64
            int r0 = r6.LJIILJJIL     // Catch: java.lang.Exception -> L60
            if (r7 > r0) goto L64
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()     // Catch: java.lang.Exception -> L60
            int r0 = r6.LJJIJIIJIL     // Catch: java.lang.Exception -> L60
            int r0 = r0 - r7
            r1.height = r0     // Catch: java.lang.Exception -> L60
            goto L39
        L32:
            java.lang.Object r5 = r0.get()     // Catch: java.lang.Exception -> L60
            android.view.View r5 = (android.view.View) r5     // Catch: java.lang.Exception -> L60
            goto L1a
        L39:
            if (r2 == 0) goto L5a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()     // Catch: java.lang.Exception -> L60
            int r1 = r6.LJJIJIIJIL     // Catch: java.lang.Exception -> L60
            int r1 = r1 - r7
            X.Nvr r0 = com.bytedance.hybrid.spark.page.SparkPopup.LLIIZ     // Catch: java.lang.Exception -> L60
            r0.getClass()     // Catch: java.lang.Exception -> L60
            if (r5 == 0) goto L5e
            int r0 = r5.getVisibility()     // Catch: java.lang.Exception -> L60
            if (r0 != 0) goto L5e
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()     // Catch: java.lang.Exception -> L60
            if (r0 == 0) goto L5e
            int r0 = r0.height     // Catch: java.lang.Exception -> L60
        L57:
            int r1 = r1 - r0
            r2.height = r1     // Catch: java.lang.Exception -> L60
        L5a:
            r4.requestLayout()     // Catch: java.lang.Exception -> L60
            goto L66
        L5e:
            r0 = 0
            goto L57
        L60:
            r0 = move-exception
            r0.toString()
        L64:
            if (r4 == 0) goto La4
        L66:
            java.util.ArrayList<X.NwL> r0 = r6.LJJIJLIJ
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La4
            int r1 = r6.LJIILJJIL
            if (r7 > r1) goto L78
            int r0 = r6.getExpandedOffset()
            if (r1 != r0) goto L98
        L78:
            int r1 = r6.LJIILJJIL
            int r0 = r1 - r7
            float r2 = (float) r0
            int r0 = r6.LJJIJIIJIL
            int r0 = r0 - r1
            float r0 = (float) r0
        L81:
            float r2 = r2 / r0
        L82:
            java.util.ArrayList<X.NwL> r0 = r6.LJJIJLIJ
            int r0 = r0.size()
            if (r3 >= r0) goto La4
            java.util.ArrayList<X.NwL> r0 = r6.LJJIJLIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.NwL r0 = (X.AbstractC60969NwL) r0
            r0.LIZ(r4, r2)
            int r3 = r3 + 1
            goto L82
        L98:
            int r1 = r6.LJIILJJIL
            int r0 = r1 - r7
            float r2 = (float) r0
            int r0 = r6.getExpandedOffset()
            int r1 = r1 - r0
            float r0 = (float) r1
            goto L81
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.dispatchOnSlide(int):void");
    }

    public final View findScrollingChild(View view) {
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
            return null;
        }
        return null;
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F c06f) {
        super.onAttachedToLayoutParams(c06f);
        this.LJJIJIL = null;
        this.LJJIIJZLJL = null;
    }

    public final void setFitToContents(boolean z) {
        int i;
        if (this.LIZ == z) {
            return;
        }
        this.LIZ = z;
        if (this.LJJIJIL != null) {
            calculateCollapsedOffset();
        }
        if (this.LIZ && this.LJJIIJ == 6) {
            i = 3;
        } else {
            i = this.LJJIIJ;
        }
        setStateInternal(i);
    }

    public final void setHideable(boolean z) {
        if (this.LJIILL != z) {
            this.LJIILL = z;
            if (!z && this.LJJIIJ == 5) {
                LIZIZ(4);
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
        if (this.LJJIJIL != null) {
            calculateCollapsedOffset();
            if (this.LJJIIJ == 4 && (v = this.LJJIJIL.get()) != null) {
                v.requestLayout();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004d, code lost:
    
        if (r6 == 3) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002d A[LOOP:0: B:18:0x0025->B:20:0x002d, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setStateInternal(int r6) {
        /*
            r5 = this;
            int r0 = r5.LJJIIJ
            if (r0 != r6) goto L5
            return
        L5:
            r5.LJJII = r0
            r5.LJJIIJ = r6
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.LJJIJIL
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.Object r4 = r0.get()
            android.view.View r4 = (android.view.View) r4
            if (r4 != 0) goto L17
            return
        L17:
            r3 = 0
            r2 = 3
            r1 = 1
            if (r6 != r2) goto L3b
            r5.updateImportantForAccessibility(r1)
        L1f:
            boolean r0 = r5.LJFF
            if (r0 == r1) goto L25
            r5.LJFF = r1
        L25:
            java.util.ArrayList<X.NwL> r0 = r5.LJJIJLIJ
            int r0 = r0.size()
            if (r3 >= r0) goto L50
            java.util.ArrayList<X.NwL> r0 = r5.LJJIJLIJ
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r3)
            X.NwL r0 = (X.AbstractC60969NwL) r0
            r0.LIZIZ(r6, r4)
            int r3 = r3 + 1
            goto L25
        L3b:
            r0 = 6
            if (r6 == r0) goto L44
            r0 = 5
            if (r6 == r0) goto L44
            r0 = 4
            if (r6 != r0) goto L49
        L44:
            r5.updateImportantForAccessibility(r3)
        L47:
            r1 = 0
            goto L1f
        L49:
            r0 = 2
            if (r6 != r0) goto L4d
            goto L25
        L4d:
            if (r6 != r2) goto L47
            goto L1f
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.setStateInternal(int):void");
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJIJIL;
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
            if (this.LJJJJ == null) {
                this.LJJJJ = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJIJIL.get() && z) {
                this.LJJJJ.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJJJ = null;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LIZ = true;
        this.LJIILIIL = 0.5f;
        this.LJIIZILJ = true;
        this.LJJII = 5;
        this.LJJIIJ = 4;
        this.LJJIJLIJ = new ArrayList<>();
        this.LJJJJI = new C80764Vmq(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.elevation, com.zhiliaoapp.musically.R.attr.xk, com.zhiliaoapp.musically.R.attr.yc, com.zhiliaoapp.musically.R.attr.yd, com.zhiliaoapp.musically.R.attr.ye, com.zhiliaoapp.musically.R.attr.yf, com.zhiliaoapp.musically.R.attr.yg, com.zhiliaoapp.musically.R.attr.yj, com.zhiliaoapp.musically.R.attr.yk, com.zhiliaoapp.musically.R.attr.yl, com.zhiliaoapp.musically.R.attr.af0, com.zhiliaoapp.musically.R.attr.ba5, com.zhiliaoapp.musically.R.attr.ba8});
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.LJII = ofFloat;
        ofFloat.setDuration(500L);
        this.LJII.addUpdateListener(new AUListenerS98S0100000_10(this, 15));
        TypedValue peekValue = obtainStyledAttributes.peekValue(7);
        if (peekValue != null && (i = peekValue.data) == -1) {
            setPeekHeight(i);
        } else {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(7, -1));
        }
        setHideable(obtainStyledAttributes.getBoolean(6, false));
        setFitToContents(true);
        this.LJIILLIIL = false;
        this.LJIIZILJ = true;
        this.LJIILIIL = 0.5f;
        if (this.LJJIJIL != null) {
            this.LJIIL = (int) ((1.0f - 0.5f) * this.LJJIJIIJIL);
        }
        this.LJIIIIZZ = 0;
        obtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), this);
    }

    public final boolean shouldHide(View view, float f) {
        int i;
        if (this.LJIILLIIL && view.getTop() - this.LJIIIIZZ >= this.LJJIFFI) {
            return true;
        }
        if ((this.LJJII == 3 && this.LJJIFFI != 0 && view.getTop() - this.LJIIIIZZ >= this.LJJIFFI) || (this.LJJII == 4 && this.LJJI != 0 && view.getTop() - this.LJIILJJIL >= this.LJJI)) {
            return true;
        }
        if (view.getTop() < this.LJIILJJIL) {
            return false;
        }
        if (this.LIZLLL) {
            i = Math.max(this.LJ, this.LJJIJIIJIL - ((this.LJJIJIIJI * 9) / 16));
        } else {
            i = this.LIZJ;
        }
        if (Math.abs(((f * 0.1f) + view.getTop()) - this.LJIILJJIL) / i > 0.5f) {
            return true;
        }
        return false;
    }

    public final void LIZJ(int i, View view, boolean z) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.LJIILJJIL;
        } else if (i == 6) {
            i2 = this.LJIIL;
            if (this.LIZ && i2 <= (i3 = this.LJIIJJI)) {
                i2 = i3;
                i = 3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (!this.LJIILL || i != 5) {
            return;
        } else {
            i2 = this.LJJIJIIJIL;
        }
        startSettlingAnimation(view, i, i2, !z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r6 != 3) goto L21;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(X.C45621qg r21, V r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.onInterceptTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        if (C16300kU.LIZIZ(c45621qg) && !C16300kU.LIZIZ(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.LJJIJIL == null) {
            this.LJ = c45621qg.getResources().getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.m6);
            this.LJJIJIL = new WeakReference<>(v);
            if (C16300kU.LIZJ(v) == 0) {
                C16300kU.LJIJ(v, 1);
            }
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = new C80761Vmn(c45621qg.getContext(), c45621qg, this.LJJJJI);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        this.LJJIJIIJI = c45621qg.getWidth();
        this.LJJIJIIJIL = c45621qg.getHeight();
        if (LIZ() > 0) {
            int LIZ = this.LJJIJIIJIL - LIZ();
            this.LJIIIIZZ = LIZ;
            int i2 = this.LJIIJ;
            if (i2 == 0) {
                i2 = this.LJIIIZ;
            }
            this.LJIIIIZZ = Math.max(i2, LIZ);
        } else {
            this.LJIIIIZZ = this.LJJIJIIJIL;
        }
        this.LJIIJJI = Math.max(0, this.LJJIJIIJIL - v.getHeight());
        this.LJIIL = (int) ((1.0f - this.LJIILIIL) * this.LJJIJIIJIL);
        calculateCollapsedOffset();
        if (!this.LJJIII) {
            int i3 = this.LJJIIJ;
            if (i3 == 3) {
                h0.LJIIL(getExpandedOffset() - v.getTop(), v);
            } else if (i3 == 6) {
                h0.LJIIL(this.LJIIL, v);
            } else if (this.LJIILL && i3 == 5) {
                h0.LJIIL(this.LJJIJIIJIL, v);
            } else if (i3 == 4) {
                h0.LJIIL(this.LJIILJJIL - v.getTop(), v);
            } else if (i3 == 1 || i3 == 2) {
                h0.LJIIL(top - v.getTop(), v);
            }
        } else {
            this.LJJIII = false;
        }
        this.LJJIJL = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg c45621qg, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(c45621qg, v, savedState.getSuperState());
        int i = savedState.LJLIL;
        if (i == 1 || i == 2) {
            this.LJJIIJ = 4;
        } else {
            this.LJJIIJ = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004b, code lost:
    
        r15.LJJIZ = -1;
        r0 = r15.LJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r0 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        r0.recycle();
        r15.LJJIL = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c5, code lost:
    
        if (r10.LIZJ == (-1)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c7, code lost:
    
        r10.LJIIJJI();
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(X.C45621qg r16, V r17, android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.onTouchEvent(X.1qg, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // X.C06C
    public final void onStopNestedScroll(C45621qg c45621qg, V v, View view, int i) {
        int i2;
        float yVelocity;
        int i3 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.LJJIJL;
        if (weakReference == null || view != weakReference.get() || !this.LJJIJ) {
            return;
        }
        if (this.LJJIIJ == 1 && this.LJIIZILJ && this.LJJII == 4) {
            return;
        }
        if (this.LJJIIZI > 0) {
            if (this.LIZ) {
                i2 = this.LJIIJJI;
            } else {
                i2 = this.LJIIIIZZ;
            }
        } else {
            if (this.LJIILL) {
                VelocityTracker velocityTracker = this.LJJIL;
                if (velocityTracker == null) {
                    yVelocity = 0.0f;
                } else {
                    velocityTracker.computeCurrentVelocity(1000, this.LIZIZ);
                    yVelocity = this.LJJIL.getYVelocity(this.LJJIZ);
                }
                if (shouldHide(v, yVelocity)) {
                    i2 = this.LJJIJIIJIL;
                    i3 = 5;
                }
            }
            if (this.LJJIIZI == 0) {
                int top = v.getTop();
                if (this.LIZ) {
                    if (Math.abs(top - this.LJIIJJI) < Math.abs(top - this.LJIILJJIL)) {
                        i2 = this.LJIIJJI;
                    } else {
                        i2 = this.LJIILJJIL;
                    }
                } else if (Math.abs(top - this.LJIIIIZZ) < Math.abs(top - this.LJIILJJIL)) {
                    i2 = this.LJIIIIZZ;
                } else {
                    i2 = this.LJIILJJIL;
                }
            } else if (this.LIZ) {
                i2 = this.LJIILJJIL;
            } else {
                i2 = this.LJIILJJIL;
            }
            i3 = 4;
        }
        startSettlingAnimation(v, i3, i2, false);
        this.LJJIJ = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r5.LJIIJ(r4, r9, (int) r5.LJIIJJI.getXVelocity(r5.LIZJ), (int) r5.LJIIJJI.getYVelocity(r5.LIZJ)) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startSettlingAnimation(android.view.View r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            r3 = 0
            if (r10 == 0) goto L55
            X.Vmn r5 = r6.LJJIIJZLJL
            int r4 = r7.getLeft()
            boolean r0 = r5.LJIJ
            if (r0 == 0) goto L75
            android.view.VelocityTracker r1 = r5.LJIIJJI
            int r0 = r5.LIZJ
            float r0 = r1.getXVelocity(r0)
            int r2 = (int) r0
            android.view.VelocityTracker r1 = r5.LJIIJJI
            int r0 = r5.LIZJ
            float r0 = r1.getYVelocity(r0)
            int r0 = (int) r0
            boolean r0 = r5.LJIIJ(r4, r9, r2, r0)
            if (r0 == 0) goto L71
        L25:
            r0 = 2
            r6.setStateInternal(r0)
            r2 = 1
            if (r8 != r0) goto L4a
        L2c:
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$c r0 = r6.LJI
            if (r0 != 0) goto L37
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior$c r0 = new com.bytedance.hybrid.spark.anim.BottomSheetBehavior$c
            r0.<init>(r7, r8)
            r6.LJI = r0
        L37:
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$c r1 = r6.LJI
            boolean r0 = r1.LJLILLLLZI
            if (r0 != 0) goto L47
            r1.LJLJI = r8
            X.C16300kU.LJIIL(r7, r1)
            com.bytedance.hybrid.spark.anim.BottomSheetBehavior<V>$c r0 = r6.LJI
            r0.LJLILLLLZI = r2
        L46:
            return
        L47:
            r1.LJLJI = r8
            goto L46
        L4a:
            r0 = 3
            if (r8 != r0) goto L4e
            r3 = 1
        L4e:
            boolean r0 = r6.LJFF
            if (r0 == r3) goto L2c
            r6.LJFF = r3
            goto L2c
        L55:
            X.Vmn r2 = r6.LJJIIJZLJL
            int r1 = r7.getLeft()
            r2.LJIIZILJ = r7
            r0 = -1
            r2.LIZJ = r0
            boolean r0 = r2.LJIIJ(r1, r9, r3, r3)
            if (r0 != 0) goto L25
            int r0 = r2.LIZ
            if (r0 != 0) goto L71
            android.view.View r0 = r2.LJIIZILJ
            if (r0 == 0) goto L71
            r0 = 0
            r2.LJIIZILJ = r0
        L71:
            r6.setStateInternal(r8)
            goto L46
        L75:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.hybrid.spark.anim.BottomSheetBehavior.startSettlingAnimation(android.view.View, int, int, boolean):void");
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIJL;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        if (this.LJJIIJ == 3 && !super.onNestedPreFling(c45621qg, v, view, f, f2)) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        this.LJJIIZI = 0;
        this.LJJIJ = false;
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
        WeakReference<View> weakReference = this.LJJIJL;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2) {
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
                if (!this.LJIIZILJ) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILJJIL;
            if (i4 <= i5 || this.LJIILL) {
                if (!this.LJIIZILJ) {
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
        this.LJJIIZI = i2;
        this.LJJIJ = true;
    }
}
