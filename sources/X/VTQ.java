package X;

import X.C16880lQ;
import X.C45621qg;
import X.C80217Ve1;
import X.VTQ;
import X.VTR;
import X.VTU;
import X.VTV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.ies.xelement.viewpager.CustomAppBarLayoutNG$Behavior;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@C06D(CustomAppBarLayoutNG$Behavior.class)
/* loaded from: classes15.dex */
public class VTQ extends VTR {
    public VTU LJZI;
    public boolean LJZL;

    @Override // X.C80217Ve1, X.C06B
    public C06C getBehavior() {
        return new AppBarLayout$Behavior() { // from class: com.bytedance.ies.xelement.viewpager.CustomAppBarLayoutNG$Behavior
            public boolean LIZ;
            public boolean LIZIZ;
            public Method LIZJ;
            public Method LIZLLL;
            public Method LJ;

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

            {
                setDragCallback(new VTV());
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

            @Override // com.google.android.material.appbar.HeaderBehavior, X.C06C
            public final boolean onInterceptTouchEvent(C45621qg c45621qg, View view, MotionEvent motionEvent) {
                C80217Ve1 c80217Ve1 = (C80217Ve1) view;
                this.LIZIZ = this.LIZ;
                if (motionEvent.getAction() == 0 && (c80217Ve1 == null || !(c80217Ve1 instanceof VTQ) || ((VTQ) c80217Ve1).LJZL)) {
                    LIZIZ(c80217Ve1);
                }
                return super.onInterceptTouchEvent(c45621qg, c80217Ve1, motionEvent);
            }

            @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
            public final void onStopNestedScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, int i) {
                super.onStopNestedScroll(c45621qg, (C45621qg) c80217Ve1, view, i);
                this.LIZ = false;
                this.LIZIZ = false;
                VTU vtu = VTQ.this.LJZI;
                if (vtu != null) {
                    vtu.LIZJ();
                }
            }

            @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior, X.C06C
            public final /* bridge */ /* synthetic */ void onStopNestedScroll(C45621qg c45621qg, View view, View view2, int i) {
                onStopNestedScroll(c45621qg, (C45621qg) view, view2, i);
            }

            @Override // X.C06C
            public final boolean onNestedFling(C45621qg c45621qg, View view, View view2, float f, float f2, boolean z) {
                VTU vtu = VTQ.this.LJZI;
                if (vtu != null) {
                    vtu.LIZLLL();
                }
                return super.onNestedFling(c45621qg, view, view2, f, f2, z);
            }

            @Override // com.google.android.material.appbar.AppBarLayout$BaseBehavior
            public final boolean onStartNestedScroll(C45621qg c45621qg, C80217Ve1 c80217Ve1, View view, View view2, int i, int i2) {
                if (c80217Ve1 == null || !(c80217Ve1 instanceof VTQ) || ((VTQ) c80217Ve1).LJZL) {
                    LIZIZ(c80217Ve1);
                }
                VTU vtu = VTQ.this.LJZI;
                if (vtu != null) {
                    vtu.LIZIZ();
                }
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
        };
    }

    public void setEnableTouchStopFling(boolean z) {
        this.LJZL = z;
    }

    public void setScrollListener(VTU vtu) {
        this.LJZI = vtu;
    }

    public VTQ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
