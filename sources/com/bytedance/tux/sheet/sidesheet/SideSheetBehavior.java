package com.bytedance.tux.sheet.sidesheet;

import X.AbstractC80736VmO;
import X.AbstractC80739VmR;
import X.C06C;
import X.C06F;
import X.C16300kU;
import X.C270714l;
import X.C45621qg;
import X.C47959Irz;
import X.C80733VmL;
import X.C80734VmM;
import X.C80735VmN;
import X.KMP;
import X.X1D;
import Y.ARunnableS33S0200000_14;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.o;
import o3.h0;

/* loaded from: classes15.dex */
public final class SideSheetBehavior<V extends View> extends C06C<V> {
    public WeakReference<V> LIZLLL;
    public C270714l LJFF;
    public VelocityTracker LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public final AbstractC80736VmO LJIILJJIL;
    public final C80733VmL LJIILL;
    public final boolean LIZ = true;
    public final float LIZIZ = 0.1f;
    public int LIZJ = 5;
    public final Set<AbstractC80739VmR> LJ = new LinkedHashSet();
    public final SideSheetBehavior<V>.b LJI = new b();

    @Override // X.C06C
    public final void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.LIZLLL = null;
        this.LJFF = null;
    }

    /* loaded from: classes15.dex */
    public final class b {
        public int LIZ;
        public boolean LIZIZ;
        public final ARunnableS33S0200000_14 LIZJ;

        public b() {
            this.LIZJ = new ARunnableS33S0200000_14(SideSheetBehavior.this, this, 17);
        }

        public final void LIZ(int i) {
            V v;
            WeakReference<V> weakReference = SideSheetBehavior.this.LIZLLL;
            if (weakReference == null || (v = weakReference.get()) == null) {
                return;
            }
            this.LIZ = i;
            if (this.LIZIZ) {
                return;
            }
            C16300kU.LJIIL(v, this.LIZJ);
            this.LIZIZ = true;
        }
    }

    public SideSheetBehavior(boolean z) {
        AbstractC80736VmO c80735VmN;
        if (z) {
            c80735VmN = new C80734VmM(this);
        } else {
            c80735VmN = new C80735VmN(this);
        }
        this.LJIILJJIL = c80735VmN;
        this.LJIILL = new C80733VmL(this);
    }

    @Override // X.C06C
    public final void onAttachedToLayoutParams(C06F layoutParams) {
        o.LJIIIZ(layoutParams, "layoutParams");
        super.onAttachedToLayoutParams(layoutParams);
        this.LIZLLL = null;
        this.LJFF = null;
    }

    public final void setStateInternal(int i) {
        V v;
        int i2;
        if (this.LIZJ == i) {
            return;
        }
        this.LIZJ = i;
        WeakReference<V> weakReference = this.LIZLLL;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (this.LIZJ == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (v.getVisibility() != i2) {
            v.setVisibility(i2);
        }
        Iterator<AbstractC80739VmR> it = this.LJ.iterator();
        while (it.hasNext()) {
            it.next().LIZIZ(i, v);
        }
    }

    @Override // X.C06C
    public final Parcelable onSaveInstanceState(C45621qg parent, V child) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        Parcelable onSaveInstanceState = super.onSaveInstanceState(parent, child);
        if (onSaveInstanceState == null) {
            return null;
        }
        return new SavedState(onSaveInstanceState, (SideSheetBehavior<?>) this);
    }

    public final void LIZ(int i, View view, boolean z) {
        int LIZJ;
        boolean LJIJJLI;
        if (i != 3) {
            if (i == 5) {
                LIZJ = this.LJIILJJIL.LIZLLL();
            } else {
                throw new IllegalArgumentException(KMP.LJ("Invalid state to get outer edge offset: ", i));
            }
        } else {
            LIZJ = this.LJIILJJIL.LIZJ();
        }
        C270714l c270714l = this.LJFF;
        if (c270714l != null) {
            if (z) {
                LJIJJLI = c270714l.LJIJI(LIZJ, view.getTop());
            } else {
                LJIJJLI = c270714l.LJIJJLI(LIZJ, view.getTop(), view);
            }
            if (LJIJJLI) {
                setStateInternal(2);
                this.LJI.LIZ(i);
                return;
            }
        }
        setStateInternal(i);
    }

    @Override // X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, V child, MotionEvent event) {
        C270714l c270714l;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        if ((child.isShown() || h0.LJFF(child) != null) && this.LIZ) {
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                VelocityTracker velocityTracker = this.LJII;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                this.LJII = null;
            }
            if (this.LJII == null) {
                this.LJII = VelocityTracker.obtain();
            }
            VelocityTracker velocityTracker2 = this.LJII;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(event);
            }
            if (actionMasked != 0) {
                if ((actionMasked == 1 || actionMasked == 3) && this.LJIIIIZZ) {
                    this.LJIIIIZZ = false;
                    return false;
                }
            } else {
                this.LJIILIIL = (int) event.getX();
            }
            if (!this.LJIIIIZZ && (c270714l = this.LJFF) != null && c270714l.LJIJJ(event)) {
                return true;
            }
            return false;
        }
        this.LJIIIIZZ = true;
        return false;
    }

    @Override // X.C06C
    public final boolean onLayoutChild(C45621qg parent, V child, int i) {
        int i2;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        if (C16300kU.LIZIZ(parent) && !C16300kU.LIZIZ(child)) {
            child.setFitsSystemWindows(true);
        }
        int i3 = 0;
        if (this.LIZLLL == null) {
            this.LIZLLL = new WeakReference<>(child);
            if (this.LIZJ == 5) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            if (child.getVisibility() != i2) {
                child.setVisibility(i2);
            }
        }
        if (this.LJFF == null) {
            this.LJFF = C270714l.LJIIIZ(parent, this.LJIILL);
        }
        int LJI = this.LJIILJJIL.LJI(child);
        parent.LJIIJ(i, child);
        this.LJIIJ = parent.getWidth();
        this.LJIIJJI = this.LJIILJJIL.LJII(parent);
        this.LJIIIZ = child.getWidth();
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        this.LJIIL = this.LJIILJJIL.LIZ((ViewGroup.MarginLayoutParams) layoutParams);
        int i4 = this.LIZJ;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 == 5) {
                    i3 = this.LJIILJJIL.LIZLLL();
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Unexpected value: ");
                    LIZ.append(this.LIZJ);
                    throw new IllegalStateException(X1D.LIZIZ(LIZ));
                }
            }
        } else {
            i3 = LJI - this.LJIILJJIL.LJI(child);
        }
        h0.LJIIJJI(i3, child);
        Iterator<AbstractC80739VmR> it = this.LJ.iterator();
        while (it.hasNext()) {
            it.next().getClass();
        }
        return true;
    }

    @Override // X.C06C
    public final void onRestoreInstanceState(C45621qg parent, V child, Parcelable state) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(state, "state");
        SavedState savedState = (SavedState) state;
        Parcelable parcelable = savedState.mSuperState;
        if (parcelable != null) {
            super.onRestoreInstanceState(parent, child, parcelable);
        }
        int i = savedState.state;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.LIZJ = i;
    }

    @Override // X.C06C
    public final boolean onTouchEvent(C45621qg parent, V child, MotionEvent event) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(event, "event");
        if (!child.isShown()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        int i = this.LIZJ;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        C270714l c270714l = this.LJFF;
        if (c270714l != null && (this.LIZ || i == 1)) {
            o.LJI(c270714l);
            c270714l.LJIILIIL(event);
        }
        if (actionMasked == 0) {
            VelocityTracker velocityTracker = this.LJII;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.LJII = null;
        }
        if (this.LJII == null) {
            this.LJII = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.LJII;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(event);
        }
        C270714l c270714l2 = this.LJFF;
        if (c270714l2 != null && ((this.LIZ || this.LIZJ == 1) && actionMasked == 2 && !this.LJIIIIZZ && c270714l2 != null && (this.LIZ || this.LIZJ == 1))) {
            float LIZ = C47959Irz.LIZ(event, this.LJIILIIL);
            o.LJI(this.LJFF);
            if (LIZ > r0.LIZIZ) {
                C270714l c270714l3 = this.LJFF;
                o.LJI(c270714l3);
                c270714l3.LIZJ(event.getPointerId(event.getActionIndex()), child);
            }
        }
        return !this.LJIIIIZZ;
    }

    @Override // X.C06C
    public final boolean onMeasureChild(C45621qg parent, V child, int i, int i2, int i3, int i4) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        child.measure(ViewGroup.getChildMeasureSpec(i, parent.getPaddingRight() + parent.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, parent.getPaddingBottom() + parent.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return true;
    }
}
