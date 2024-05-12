package com.ss.android.ugc.aweme.ecommerce.anchor.baseview;

import X.C16880lQ;
import X.C45621qg;
import X.C63492eP;
import X.C63542eU;
import X.C80217Ve1;
import X.InterfaceC65784Pro;
import X.VWR;
import X.VWS;
import X.VWT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS74S0400000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class ECommerceAnchorAppbarLayout$Behavior extends AppBarLayout$Behavior {
    public final int LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public boolean LJFF;
    public float LJI;
    public float LJII;
    public AqS162S0100000_12 LJIIIIZZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final Field LIZIZ() {
        Class superclass;
        Class cls;
        Class superclass2;
        Class superclass3 = ECommerceAnchorAppbarLayout$Behavior.class.getSuperclass();
        Field field = null;
        if (superclass3 != null) {
            try {
                superclass = superclass3.getSuperclass();
            } catch (NoSuchFieldException e) {
                C16880lQ.LLLLIIL(e);
                if (superclass3 != null && (superclass2 = superclass3.getSuperclass()) != null) {
                    cls = superclass2.getSuperclass();
                } else {
                    cls = field;
                }
                if (cls != 0) {
                    return cls.getDeclaredField("flingRunnable");
                }
                return field;
            }
        } else {
            superclass = null;
        }
        if (superclass == null) {
            return null;
        }
        field = superclass.getDeclaredField("mFlingRunnable");
        return field;
    }

    public ECommerceAnchorAppbarLayout$Behavior() {
        this.LIZ = 1;
        this.LJ = -1;
        setDragCallback(new VWT());
    }

    public final void LIZJ(C80217Ve1 c80217Ve1) {
        Runnable runnable;
        try {
            Field LIZIZ = LIZIZ();
            if (LIZIZ != null) {
                LIZIZ.setAccessible(true);
                Object obj = LIZIZ.get(this);
                if ((obj instanceof Runnable) && (runnable = (Runnable) obj) != null) {
                    c80217Ve1.removeCallbacks(runnable);
                    LIZIZ.set(this, null);
                }
            }
            Class superclass = ECommerceAnchorAppbarLayout$Behavior.class.getSuperclass();
            if (superclass != null) {
                superclass.getSuperclass();
            }
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECommerceAnchorAppbarLayout$Behavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(attrs, "attrs");
        this.LIZ = 1;
        this.LJ = -1;
        setDragCallback(new VWT());
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg parent, View view, MotionEvent ev) {
        C80217Ve1 child = (C80217Ve1) view;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(ev, "ev");
        boolean z = false;
        this.LIZJ = false;
        if (this.LIZIZ) {
            this.LIZJ = true;
        }
        if (ev.getActionMasked() == 0) {
            LIZJ(child);
        }
        if (ev.getActionMasked() == 0 && (child instanceof VWR)) {
            this.LJFF = false;
            this.LJI = ev.getRawX();
            this.LJII = ev.getRawY();
            VWR vwr = (VWR) child;
            InterfaceC65784Pro<Boolean> interfaceC65784Pro = vwr.LJZI;
            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke().booleanValue()) {
                z = true;
            }
            this.LIZLLL = z;
            this.LJ = -1;
            if (z) {
                VWS vws = vwr.LJZ;
                vws.getClass();
                vws.LIZLLL = ev.getRawX();
                vws.LJ = ev.getRawY();
                vws.LJI = -1;
            }
        }
        return super.onInterceptTouchEvent(parent, child, ev);
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
    public final boolean onTouchEvent(C45621qg parent, View view, MotionEvent ev) {
        boolean onTouchEvent;
        AqS162S0100000_12 aqS162S0100000_12;
        int i;
        C80217Ve1 child = (C80217Ve1) view;
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(ev, "ev");
        if (child instanceof VWR) {
            AqS74S0400000_14 aqS74S0400000_14 = new AqS74S0400000_14(ev, parent, child, this, 0);
            if (this.LJ == -1) {
                float abs = Math.abs(ev.getRawX() - this.LJI);
                float abs2 = Math.abs(ev.getRawY() - this.LJII);
                float f = (abs2 * abs2) + (abs * abs);
                VWR vwr = (VWR) child;
                int scaledTouchSlop = ViewConfiguration.get(vwr.getContext()).getScaledTouchSlop();
                if (f > scaledTouchSlop * scaledTouchSlop) {
                    if (abs2 > abs) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    this.LJ = i;
                }
                if (this.LJ == 0 && this.LIZLLL) {
                    vwr.LJZ.LJII.LJIIIIZZ(0);
                }
            }
            if (!this.LIZLLL && this.LJ != 0) {
                VWR vwr2 = (VWR) child;
                boolean LJII = vwr2.LJII();
                boolean z = this.LJFF;
                this.LJFF = LJII;
                if (z != LJII && LJII) {
                    VWS vws = vwr2.LJZ;
                    vws.getClass();
                    vws.LIZLLL = ev.getRawX();
                    vws.LJ = ev.getRawY();
                    vws.LJI = -1;
                }
                if (this.LJFF) {
                    this.LIZLLL = vwr2.LJIIIZ(ev, C63492eP.LJLIL);
                }
            }
            if (this.LIZLLL && this.LJ == 1) {
                onTouchEvent = ((VWR) child).LJIIIZ(ev, C63542eU.LJLIL);
            } else {
                onTouchEvent = ((Boolean) aqS74S0400000_14.invoke()).booleanValue();
            }
        } else {
            onTouchEvent = super.onTouchEvent(parent, child, ev);
        }
        if (onTouchEvent && ev.getAction() == 1 && (aqS162S0100000_12 = this.LJIIIIZZ) != null) {
            aqS162S0100000_12.invoke();
        }
        return onTouchEvent;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C45621qg coordinatorLayout, C80217Ve1 abl, View target, int i) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(abl, "abl");
        o.LJIIIZ(target, "target");
        super.onStopNestedScroll(coordinatorLayout, (C45621qg) abl, target, i);
        this.LIZIZ = false;
        this.LIZJ = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C45621qg c45621qg, View view, View view2, int i) {
        onStopNestedScroll(c45621qg, (C45621qg) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C45621qg parent, C80217Ve1 child, View directTargetChild, View target, int i, int i2) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(directTargetChild, "directTargetChild");
        o.LJIIIZ(target, "target");
        LIZJ(child);
        return super.onStartNestedScroll(parent, (C45621qg) child, directTargetChild, target, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C45621qg c45621qg, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c45621qg, (C45621qg) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C45621qg coordinatorLayout, C80217Ve1 child, View target, int i, int i2, int[] consumed, int i3) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (i3 == this.LIZ) {
            this.LIZIZ = true;
        }
        if (!this.LIZJ) {
            super.onNestedPreScroll(coordinatorLayout, (C45621qg) child, target, i, i2, consumed, i3);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C45621qg c45621qg, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c45621qg, (C45621qg) view, view2, i, i2, iArr, i3);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C45621qg coordinatorLayout, C80217Ve1 child, View target, int i, int i2, int i3, int i4, int i5, int[] consumed) {
        o.LJIIIZ(coordinatorLayout, "coordinatorLayout");
        o.LJIIIZ(child, "child");
        o.LJIIIZ(target, "target");
        o.LJIIIZ(consumed, "consumed");
        if (!this.LIZJ) {
            super.onNestedScroll(coordinatorLayout, (C45621qg) child, target, i, i2, i3, i4, i5, consumed);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ void onNestedScroll(C45621qg c45621qg, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        onNestedScroll(c45621qg, (C45621qg) view, view2, i, i2, i3, i4, i5, iArr);
    }
}
