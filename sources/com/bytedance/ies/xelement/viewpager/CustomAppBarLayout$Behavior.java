package com.bytedance.ies.xelement.viewpager;

import X.C16880lQ;
import X.C45621qg;
import X.C80217Ve1;
import X.VTR;
import X.VTT;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class CustomAppBarLayout$Behavior extends AppBarLayout$Behavior {
    public boolean LIZ;
    public boolean LIZIZ;
    public Method LIZJ;
    public Method LIZLLL;
    public Method LJ;

    public CustomAppBarLayout$Behavior() {
        setDragCallback(new VTT(this));
    }

    public final Field LIZ() {
        Class<? super Object> superclass;
        Class<? super Object> superclass2 = getClass().getSuperclass();
        if (superclass2 != null) {
            try {
                superclass = superclass2.getSuperclass();
            } catch (NoSuchFieldException e) {
                C16880lQ.LLLLIIL(e);
                Class<? super Object> superclass3 = superclass2.getSuperclass().getSuperclass();
                if (superclass3 != null) {
                    return superclass3.getDeclaredField("flingRunnable");
                }
            }
        } else {
            superclass = null;
        }
        if (superclass != null) {
            return superclass.getDeclaredField("mFlingRunnable");
        }
        return null;
    }

    public final void LIZIZ(C80217Ve1 c80217Ve1) {
        try {
            Field LIZ = LIZ();
            if (LIZ != null) {
                LIZ.setAccessible(true);
                Runnable runnable = (Runnable) LIZ.get(this);
                if (runnable != null) {
                    c80217Ve1.removeCallbacks(runnable);
                    LIZ.set(this, null);
                }
            }
            Class<? super Object> superclass = getClass().getSuperclass();
            if (superclass != null) {
                superclass.getSuperclass();
            }
        } catch (IllegalAccessException e) {
            C16880lQ.LLLLIIL(e);
        } catch (NoSuchFieldException e2) {
            C16880lQ.LLLLIIL(e2);
        }
    }

    public CustomAppBarLayout$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setDragCallback(new VTT(this));
    }

    @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
    public final boolean onInterceptTouchEvent(C45621qg c45621qg, View view, MotionEvent motionEvent) {
        C80217Ve1 c80217Ve1 = (C80217Ve1) view;
        this.LIZIZ = this.LIZ;
        if (motionEvent.getActionMasked() == 0) {
            LIZIZ(c80217Ve1);
        }
        if (c80217Ve1 != null && (c80217Ve1 instanceof VTR) && !((VTR) c80217Ve1).LJZ) {
            return true;
        }
        return super.onInterceptTouchEvent(c45621qg, c80217Ve1, motionEvent);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onStopNestedScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, int i) {
        super.onStopNestedScroll(c45621qg, (C45621qg) c80217Ve1, view, i);
        this.LIZ = false;
        this.LIZIZ = false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ void onStopNestedScroll(C45621qg c45621qg, View view, View view2, int i) {
        onStopNestedScroll(c45621qg, (C45621qg) view, view2, i);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final boolean onStartNestedScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, View view2, int i, int i2) {
        LIZIZ(c80217Ve1);
        return super.onStartNestedScroll(c45621qg, (C45621qg) c80217Ve1, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ boolean onStartNestedScroll(C45621qg c45621qg, View view, View view2, View view3, int i, int i2) {
        return onStartNestedScroll(c45621qg, (C45621qg) view, view2, view3, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedPreScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 1) {
            this.LIZ = true;
        }
        if (!this.LIZIZ) {
            if (c80217Ve1 == null || !(c80217Ve1 instanceof VTR) || ((VTR) c80217Ve1).LJZ) {
                super.onNestedPreScroll(c45621qg, (C45621qg) c80217Ve1, view, i, i2, iArr, i3);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
    public final /* bridge */ /* synthetic */ void onNestedPreScroll(C45621qg c45621qg, View view, View view2, int i, int i2, int[] iArr, int i3) {
        onNestedPreScroll(c45621qg, (C45621qg) view, view2, i, i2, iArr, i3);
    }

    @Override // X.C06C
    public final void onNestedScroll(C45621qg c45621qg, View view, View view2, int i, int i2, int i3, int i4, int i5) {
        C80217Ve1 c80217Ve1 = (C80217Ve1) view;
        if (!this.LIZIZ) {
            if (c80217Ve1 != null) {
                try {
                    if ((c80217Ve1 instanceof VTR) && !((VTR) c80217Ve1).LJZ) {
                        return;
                    }
                } catch (Throwable unused) {
                    return;
                }
            }
            super.onNestedScroll(c45621qg, c80217Ve1, view2, i, i2, i3, i4, i5);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
    public final void onNestedScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.LIZIZ) {
            try {
                if (i4 < 0) {
                    if (this.LIZJ == null) {
                        Class<? super Object> superclass = getClass().getSuperclass().getSuperclass().getSuperclass();
                        Class<?> cls = Integer.TYPE;
                        Method declaredMethod = superclass.getDeclaredMethod("scroll", C45621qg.class, View.class, cls, cls, cls);
                        this.LIZJ = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    if (this.LIZLLL == null) {
                        Method declaredMethod2 = c80217Ve1.getClass().getSuperclass().getSuperclass().getDeclaredMethod("getDownNestedScrollRange", new Class[0]);
                        this.LIZLLL = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    }
                    iArr[1] = ((Integer) this.LIZJ.invoke(this, c45621qg, c80217Ve1, Integer.valueOf(i4), Integer.valueOf(-((Integer) this.LIZLLL.invoke(c80217Ve1, new Object[0])).intValue()), 0)).intValue();
                    return;
                }
                if (i4 == 0) {
                    if (this.LJ == null) {
                        Method declaredMethod3 = getClass().getSuperclass().getSuperclass().getDeclaredMethod("updateAccessibilityActions", C45621qg.class, C80217Ve1.class);
                        this.LJ = declaredMethod3;
                        declaredMethod3.setAccessible(true);
                    }
                    this.LJ.invoke(this, c45621qg, c80217Ve1);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
