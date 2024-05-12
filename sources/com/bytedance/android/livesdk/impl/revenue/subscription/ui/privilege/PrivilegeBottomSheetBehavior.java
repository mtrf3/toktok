package com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege;

import X.AbstractC30971CDn;
import X.C06C;
import X.C06F;
import X.C0A2;
import X.C0CM;
import X.C0K2;
import X.C0KD;
import X.C16300kU;
import X.C16330kX;
import X.C16360ka;
import X.C16800lI;
import X.C1I1;
import X.C270714l;
import X.C45621qg;
import X.C80458Vhu;
import X.C80459Vhv;
import X.KMP;
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
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import o3.h0;

/* loaded from: classes15.dex */
public class PrivilegeBottomSheetBehavior<V extends View> extends C06C<V> {
    public boolean LIZ;
    public final float LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public float LJ;
    public int LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public PrivilegeBottomSheetBehavior<V>.c LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public final float LJIIL;
    public int LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public int LJIIZILJ;
    public C270714l LJIJ;
    public boolean LJIJI;
    public int LJIJJ;
    public boolean LJIJJLI;
    public int LJIL;
    public int LJJ;
    public int LJJI;
    public int LJJIFFI;
    public WeakReference<V> LJJII;
    public WeakReference<View> LJJIII;
    public final ArrayList<AbstractC30971CDn> LJJIIJ;
    public VelocityTracker LJJIIJZLJL;
    public int LJJIIZ;
    public int LJJIIZI;
    public boolean LJJIJ;
    public Map<View, Integer> LJJIJIIJI;
    public int LJJIJIIJIL;
    public float LJJIJIL;
    public int LJJIJL;
    public float LJJIJLIJ;
    public C0KD LJJIL;
    public final C80458Vhu LJJIZ;

    /* loaded from: classes15.dex */
    public class c implements Runnable {
        public final View LJLIL;
        public boolean LJLILLLLZI;
        public int LJLJI;

        @Override // java.lang.Runnable
        public final void run() {
            boolean LIZ;
            try {
                C270714l c270714l = PrivilegeBottomSheetBehavior.this.LJIJ;
                if (c270714l != null && c270714l.LJIIIIZZ()) {
                    C16300kU.LJIIL(this.LJLIL, this);
                } else {
                    PrivilegeBottomSheetBehavior.this.setStateInternal(this.LJLJI);
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

    public final void LIZ() {
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null) {
            return;
        }
        weakReference.get();
    }

    public final void LIZIZ() {
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference != null) {
            weakReference.get();
        }
        WeakReference<V> weakReference2 = this.LJJII;
        if (weakReference2 != null) {
            weakReference2.get();
        }
        C0KD c0kd = this.LJJIL;
        if (c0kd != null) {
            c0kd.setShadowed(false);
        }
    }

    public final int calculatePeekHeight() {
        int i = this.LIZJ;
        if (i == -1) {
            int i2 = this.LJFF;
            if (i2 == -1) {
                float f = this.LJI;
                if (f > 0.0f) {
                    i2 = (int) (this.LJJI * f);
                } else {
                    i2 = Integer.MAX_VALUE;
                }
            }
            float f2 = this.LJ;
            if (f2 > 0.0f) {
                i2 = (int) (this.LJJI * f2);
            }
            return Math.min(i2, this.LJIL);
        }
        return i;
    }

    public final int getExpandedOffset() {
        if (this.LIZ) {
            return this.LJIIJ;
        }
        return 0;
    }

    public PrivilegeBottomSheetBehavior() {
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIIL = 0.5f;
        this.LJIILLIIL = true;
        this.LJIIZILJ = 4;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIJIIJIL = -1;
        this.LJJIJL = -1;
        this.LJJIZ = new C80458Vhu(this);
    }

    public final void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.LIZ) {
            this.LJIILIIL = Math.max(this.LJJ - calculatePeekHeight, this.LJIIJ);
        } else {
            this.LJIILIIL = this.LJJ - calculatePeekHeight;
        }
    }

    @Override // X.C06C
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LJJII = null;
        this.LJIJ = null;
    }

    public final void dispatchOnSlide(int i) {
        float f;
        float f2;
        V v = this.LJJII.get();
        if (v != null && !this.LJJIIJ.isEmpty()) {
            int i2 = this.LJIILIIL;
            if (i > i2 || i2 == getExpandedOffset()) {
                int i3 = this.LJIILIIL;
                f = i3 - i;
                f2 = this.LJJ - i3;
            } else {
                int i4 = this.LJIILIIL;
                f = i4 - i;
                f2 = i4 - getExpandedOffset();
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.LJJIIJ.size(); i5++) {
                ((AbstractC30971CDn) ListProtector.get(this.LJJIIJ, i5)).LIZ(v, f3);
            }
        }
        LIZ();
        LIZIZ();
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
        this.LJJII = null;
        this.LJIJ = null;
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
        if (this.LJJII != null) {
            calculateCollapsedOffset();
            if (this.LJIIZILJ == 4 && (v = this.LJJII.get()) != null) {
                v.requestLayout();
            }
        }
    }

    public final void setStateInternal(int i) {
        V v;
        if (this.LJIIZILJ == i) {
            return;
        }
        this.LJIIZILJ = i;
        WeakReference<V> weakReference = this.LJJII;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            updateImportantForAccessibility(true);
        } else if (i == 6 || i == 5 || i == 4) {
            updateImportantForAccessibility(false);
        }
        for (int i2 = 0; i2 < this.LJJIIJ.size(); i2++) {
            ((AbstractC30971CDn) ListProtector.get(this.LJJIIJ, i2)).LIZIZ(i, v);
        }
    }

    public final void updateImportantForAccessibility(boolean z) {
        WeakReference<V> weakReference = this.LJJII;
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
            if (this.LJJIJIIJI == null) {
                this.LJJIJIIJI = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != this.LJJII.get() && z) {
                this.LJJIJIIJI.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.LJJIJIIJI = null;
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C80459Vhv();
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

        public SavedState(Parcelable parcelable, PrivilegeBottomSheetBehavior<?> privilegeBottomSheetBehavior) {
            super(parcelable);
            this.LJLIL = privilegeBottomSheetBehavior.LJIIZILJ;
            this.LJLILLLLZI = privilegeBottomSheetBehavior.LIZJ;
            this.LJLJI = privilegeBottomSheetBehavior.LIZ;
            this.LJLJJI = privilegeBottomSheetBehavior.LJIILJJIL;
            this.LJLJJL = privilegeBottomSheetBehavior.LJIILL;
        }
    }

    public PrivilegeBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.LIZ = true;
        this.LIZJ = -1;
        this.LJFF = -1;
        this.LJIIL = 0.5f;
        this.LJIILLIIL = true;
        this.LJIIZILJ = 4;
        this.LJJIIJ = new ArrayList<>();
        this.LJJIJIIJIL = -1;
        this.LJJIJL = -1;
        this.LJJIZ = new C80458Vhu(this);
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
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        if (this.LJIILJJIL != z) {
            this.LJIILJJIL = z;
            if (!z && this.LJIIZILJ == 5) {
                WeakReference<V> weakReference = this.LJJII;
                if (weakReference == null) {
                    this.LJIIZILJ = 4;
                } else {
                    V v = weakReference.get();
                    if (v != null) {
                        ViewParent parent = v.getParent();
                        if (parent != null && parent.isLayoutRequested() && C16330kX.LIZIZ(v)) {
                            v.post(new ARunnableS17S0201000_14(4, v, this, 14));
                        } else {
                            settleToState(v, 4);
                        }
                    }
                }
            }
        }
        boolean z2 = obtainStyledAttributes.getBoolean(2, true);
        if (this.LIZ != z2) {
            this.LIZ = z2;
            if (this.LJJII != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((this.LIZ && this.LJIIZILJ == 6) ? 3 : this.LJIIZILJ);
        }
        this.LJIILL = obtainStyledAttributes.getBoolean(5, false);
        this.LJIILLIIL = obtainStyledAttributes.getBoolean(6, true);
        this.LJJIJIIJIL = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        if (obtainStyledAttributes.hasValue(8)) {
            TypedValue typedValue3 = new TypedValue();
            obtainStyledAttributes.getValue(8, typedValue3);
            this.LJJIJIL = typedValue3.getFloat();
        }
        this.LJJIJL = obtainStyledAttributes.getDimensionPixelSize(9, -1);
        if (obtainStyledAttributes.hasValue(10)) {
            TypedValue typedValue4 = new TypedValue();
            obtainStyledAttributes.getValue(10, typedValue4);
            this.LJJIJLIJ = typedValue4.getFloat();
        }
        obtainStyledAttributes.recycle();
        this.LIZIZ = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public final boolean LIZJ(View view, float f) {
        int expandedOffset;
        int expandedOffset2 = this.LJJ - getExpandedOffset();
        float abs = Math.abs(((f * 0.01f) + view.getTop()) - getExpandedOffset());
        int i = expandedOffset2 >> 2;
        int i2 = this.LJJIFFI;
        if (this.LJIILL) {
            expandedOffset = i2;
        } else {
            expandedOffset = (this.LJIILIIL - getExpandedOffset()) >> 1;
        }
        if (abs < Math.min(i, Math.min(i2, expandedOffset)) && abs / this.LJJ < 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg c45621qg, V v) {
        return new SavedState(super.onSaveInstanceState(c45621qg, v), (PrivilegeBottomSheetBehavior<?>) this);
    }

    public final void settleToState(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.LJIILIIL;
        } else if (i == 6) {
            i2 = this.LJIIJJI;
            if (this.LIZ && i2 <= (i3 = this.LJIIJ)) {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (this.LJIILJJIL && i == 5) {
            i2 = this.LJJ;
        } else {
            throw new IllegalArgumentException(KMP.LJ("Illegal state argument: ", i));
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public final boolean shouldHide(View view, float f) {
        if (this.LJIILL) {
            return true;
        }
        if (view.getTop() < this.LJIILIIL) {
            return false;
        }
        int calculatePeekHeight = calculatePeekHeight();
        float abs = Math.abs(((f * 0.01f) + view.getTop()) - this.LJIILIIL);
        if (abs > Math.min(this.LJJIFFI, calculatePeekHeight >> 1) || abs / this.LJJ > 0.16f) {
            return true;
        }
        return false;
    }

    @Override // X.C06C
    public final C16800lI onApplyWindowInsets(C45621qg c45621qg, V v, C16800lI c16800lI) {
        this.LJII = c16800lI.LJ();
        this.LJIIIIZZ = c16800lI.LIZ(2).LIZLLL;
        return c16800lI;
    }

    @Override // X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        boolean z;
        WeakReference<View> weakReference;
        View view;
        C270714l c270714l;
        if (!v.isShown() || !this.LJIILLIIL) {
            this.LJIJI = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view2 = null;
        if (actionMasked == 0) {
            this.LJJIIZ = -1;
            VelocityTracker velocityTracker = this.LJJIIJZLJL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIIJZLJL = null;
            }
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = VelocityTracker.obtain();
        }
        this.LJJIIJZLJL.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.LJJIJ = false;
                this.LJJIIZ = -1;
                if (this.LJIJI) {
                    this.LJIJI = false;
                    return false;
                }
            }
        } else {
            int x = (int) motionEvent.getX();
            this.LJJIIZI = (int) motionEvent.getY();
            if (this.LJIIZILJ != 2 && (weakReference = this.LJJIII) != null && (view = weakReference.get()) != null && c45621qg.LJII(x, this.LJJIIZI, view)) {
                this.LJJIIZ = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.LJJIJ = true;
            }
            if (this.LJJIIZ == -1 && !c45621qg.LJII(x, this.LJJIIZI, v)) {
                z = true;
            } else {
                z = false;
            }
            this.LJIJI = z;
        }
        if (!this.LJIJI && (c270714l = this.LJIJ) != null && c270714l.LJIJJ(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.LJJIII;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        if (actionMasked != 2 || view2 == null || this.LJIJI || this.LJIIZILJ == 1 || c45621qg.LJII((int) motionEvent.getX(), (int) motionEvent.getY(), view2) || this.LJIJ == null || C1I1.LIZIZ(motionEvent, this.LJJIIZI) <= this.LJIJ.LIZIZ) {
            return false;
        }
        return true;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg c45621qg, V v, int i) {
        C0KD c0kd;
        if (this.LJJII == null) {
            this.LJJII = new WeakReference<>(v);
            if (C16300kU.LIZJ(v) == 0) {
                C16300kU.LJIJ(v, 1);
            }
        }
        if (this.LJIJ == null) {
            this.LJIJ = C270714l.LJIIIZ(c45621qg, this.LJJIZ);
        }
        int top = v.getTop();
        c45621qg.LJIIJ(i, v);
        c45621qg.getWidth();
        this.LJJ = c45621qg.getHeight();
        int height = v.getHeight();
        this.LJIL = height;
        int i2 = this.LJJ;
        this.LJJIFFI = (int) (i2 * 0.25f);
        if (i2 - height < this.LJII) {
            this.LJIL = i2;
        }
        this.LJIIJ = Math.max(0, i2 - this.LJIL);
        this.LJIIJJI = (int) ((1.0f - this.LJIIL) * this.LJJ);
        calculateCollapsedOffset();
        int i3 = this.LJIIZILJ;
        if (i3 == 3) {
            h0.LJIIL(getExpandedOffset(), v);
        } else if (i3 == 6) {
            h0.LJIIL(this.LJIIJJI, v);
        } else if (this.LJIILJJIL && i3 == 5) {
            h0.LJIIL(this.LJJ, v);
        } else if (i3 == 4) {
            h0.LJIIL(this.LJIILIIL, v);
        } else if (i3 == 1 || i3 == 2) {
            h0.LJIIL(top - v.getTop(), v);
        }
        this.LJJIII = new WeakReference<>(findScrollingChild(v));
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i4 = 0; i4 < viewGroup.getChildCount(); i4++) {
                viewGroup.getChildAt(i4);
            }
        }
        LIZ();
        if (this.LJJIL == null) {
            if (v instanceof ViewGroup) {
                ViewGroup viewGroup2 = (ViewGroup) v;
                for (int i5 = 0; i5 < viewGroup2.getChildCount(); i5++) {
                    if (viewGroup2.getChildAt(i5) instanceof C0KD) {
                        c0kd = (C0KD) viewGroup2.getChildAt(i5);
                        break;
                    }
                }
            }
            c0kd = null;
            this.LJJIL = c0kd;
        }
        LIZIZ();
        return true;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg c45621qg, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.LJIIZILJ == 1 && actionMasked == 0) {
            return true;
        }
        C270714l c270714l = this.LJIJ;
        if (c270714l != null) {
            try {
                c270714l.LJIILIIL(motionEvent);
            } catch (Exception e) {
                C0K2.LIZ("PrivilegeBottomSheetBehavior onTouchEvent", e);
            }
        }
        if (actionMasked == 0) {
            this.LJJIIZ = -1;
            VelocityTracker velocityTracker = this.LJJIIJZLJL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJJIIJZLJL = null;
            }
        }
        if (this.LJJIIJZLJL == null) {
            this.LJJIIJZLJL = VelocityTracker.obtain();
        }
        this.LJJIIJZLJL.addMovement(motionEvent);
        if (this.LJIJ != null && actionMasked == 2 && !this.LJIJI) {
            float LIZIZ = C1I1.LIZIZ(motionEvent, this.LJJIIZI);
            C270714l c270714l2 = this.LJIJ;
            if (LIZIZ > c270714l2.LIZIZ) {
                c270714l2.LIZJ(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.LJIJI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0048, code lost:
    
        if (r1 > r0) goto L61;
     */
    @Override // X.C06C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStopNestedScroll(X.C45621qg r7, V r8, android.view.View r9, int r10) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeBottomSheetBehavior.onStopNestedScroll(X.1qg, android.view.View, android.view.View, int):void");
    }

    public final void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C270714l c270714l = this.LJIJ;
        if (c270714l != null && (!z ? c270714l.LJIJJLI(view.getLeft(), i2, view) : c270714l.LJIJI(view.getLeft(), i2))) {
            setStateInternal(2);
            if (this.LJIIIZ == null) {
                this.LJIIIZ = new c(view, i);
            }
            PrivilegeBottomSheetBehavior<V>.c cVar = this.LJIIIZ;
            if (!cVar.LJLILLLLZI) {
                cVar.LJLJI = i;
                C16300kU.LJIIL(view, cVar);
                this.LJIIIZ.LJLILLLLZI = true;
                return;
            }
            cVar.LJLJI = i;
            return;
        }
        setStateInternal(i);
    }

    @Override // X.C06C
    public final boolean onNestedPreFling(C45621qg c45621qg, V v, View view, float f, float f2) {
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference == null || !this.LJIILLIIL || view != weakReference.get()) {
            return false;
        }
        if (this.LJIIZILJ == 3 && !super.onNestedPreFling(c45621qg, v, view, f, f2)) {
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
            int r4 = r0.orientation
            int r6 = android.view.View.MeasureSpec.getSize(r14)
            r5 = 1
            if (r4 != r5) goto L50
            int r0 = r9.LJIIIIZZ
            int r0 = r0 + r6
            r9.LJJI = r0
        L1a:
            int r0 = r9.LJJIJIIJIL
            r3 = 1073741824(0x40000000, float:2.0)
            r2 = -1
            if (r0 == r2) goto L2e
        L21:
            r7 = 1073741824(0x40000000, float:2.0)
        L23:
            int r6 = java.lang.Math.min(r0, r6)
            if (r6 != r2) goto L53
            boolean r0 = super.onMeasureChild(r10, r11, r12, r13, r14, r15)
            return r0
        L2e:
            float r1 = r9.LJJIJIL
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L3b
            int r0 = r9.LJJI
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = (int) r1
            goto L21
        L3b:
            int r0 = r9.LJJIJL
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L42
            goto L23
        L42:
            float r1 = r9.LJJIJLIJ
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L4e
            int r0 = r9.LJJI
            float r0 = (float) r0
            float r0 = r0 * r1
            int r0 = (int) r0
            goto L23
        L4e:
            r0 = -1
            goto L21
        L50:
            r9.LJJI = r6
            goto L1a
        L53:
            if (r4 != r5) goto L8c
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
            int r4 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r0)
            float r3 = (float) r6
            int r2 = r9.LJJI
            float r0 = (float) r2
            r1 = 1063675494(0x3f666666, float:0.9)
            float r0 = r0 * r1
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L84
            float r0 = (float) r2
            float r0 = r0 * r1
            int r0 = (int) r0
            int r6 = java.lang.Math.min(r6, r0)
        L84:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r11.measure(r4, r0)
        L8b:
            return r5
        L8c:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r3)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r11.measure(r1, r0)
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.impl.revenue.subscription.ui.privilege.PrivilegeBottomSheetBehavior.onMeasureChild(X.1qg, android.view.View, int, int, int, int):boolean");
    }

    @Override // X.C06C
    public final boolean onStartNestedScroll(C45621qg c45621qg, V v, View view, View view2, int i, int i2) {
        this.LJIJJ = 0;
        this.LJIJJLI = false;
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
        WeakReference<View> weakReference = this.LJJIII;
        if (weakReference != null) {
            view2 = weakReference.get();
        } else {
            view2 = null;
        }
        if (view != view2 || !this.LJIILLIIL) {
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
                if (!this.LJIILLIIL) {
                    return;
                }
                iArr[1] = i2;
                h0.LJIIL(-i2, v);
                setStateInternal(1);
            }
        } else if (i2 < 0 && !view.canScrollVertically(-1)) {
            int i5 = this.LJIILIIL;
            if (i4 <= i5 || this.LJIILJJIL) {
                if (!this.LJIILLIIL) {
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
        this.LJIJJ = i2;
        this.LJIJJLI = true;
    }

    @Override // X.C06C
    public final void onNestedScroll(C45621qg c45621qg, V v, View view, int i, int i2, int i3, int i4, int i5) {
        LIZIZ();
    }
}
