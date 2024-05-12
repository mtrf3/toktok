package com.bytedance.ies.xelement.viewpager.foldview;

import X.AnonymousClass199;
import X.C03880Dg;
import X.C06C;
import X.C06F;
import X.C221108m2;
import X.C37692Eqm;
import X.C62822Ol8;
import X.C65300Pk0;
import X.C79856VVs;
import X.C80217Ve1;
import X.VNA;
import X.VNU;
import X.VPD;
import X.VTI;
import X.VTJ;
import X.VTK;
import X.VTL;
import X.VTR;
import X.X1D;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.ui.view.UISimpleView;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public abstract class BaseLynxFoldView<K extends VTR, T extends VTL<K>> extends UISimpleView<T> {
    public T LJLIL;
    public boolean LJLILLLLZI;
    public float LJLJI;
    public float LJLJJI;
    public int LJLJJL;
    public final C62822Ol8 LJLJJLL;
    public final C62822Ol8 LJLJL;

    public static void LJIJJLI(C06C c06c, Method method, Object[] objArr) {
        if (new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{c06c, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "3338675991383973285")).LIZ) {
            return;
        }
        method.invoke(c06c, objArr);
    }

    public abstract void LJJII(C80217Ve1 c80217Ve1, int i);

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final boolean needCustomLayout() {
        return true;
    }

    public final T LJJI() {
        T t = this.LJLIL;
        if (t != null) {
            return t;
        }
        o.LJIJI("mFoldViewLayout");
        throw null;
    }

    public BaseLynxFoldView(VNU vnu) {
        super(vnu);
        this.LJLJJI = 0.01f;
        this.LJLJJLL = C221108m2.LIZIZ(VTK.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(VTJ.LJLIL);
    }

    public final void LJJIFFI(Context context) {
        o.LJIIJ(context, "context");
        LJJI().setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        LJJI().getAppBarLayout().LIZ(new VTI(this));
    }

    @Override // com.lynx.tasm.behavior.ui.UIGroup, com.lynx.tasm.behavior.ui.LynxBaseUI
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            if (layoutParams.width == -1 && layoutParams.height == -2) {
                return layoutParams;
            }
            layoutParams.width = -1;
            layoutParams.height = -2;
            if (layoutParams instanceof C79856VVs) {
                return new C79856VVs((FrameLayout.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof C06F) {
                C06F c06f = new C06F((C06F) layoutParams);
                c06f.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
                return c06f;
            }
            if (layoutParams instanceof AnonymousClass199) {
                return new AnonymousClass199((AnonymousClass199) layoutParams);
            }
        }
        C06F c06f2 = new C06F(-1, -2);
        c06f2.LIZIZ(new AppBarLayout$ScrollingViewBehavior());
        return c06f2;
    }

    @VPD(defaultBoolean = false, name = "compat-container-popup")
    public final void setCompatContainerPopup(boolean z) {
        LJJI().setCompatContainerPopup(z);
    }

    @Override // com.lynx.tasm.behavior.ui.LynxBaseUI
    public final void setEvents(Map<String, VNA> map) {
        super.setEvents(map);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("events: ");
        LIZ.append(map);
        LLog.LIZLLL(1, "LynxFoldView", X1D.LIZIZ(LIZ));
        if (map != null) {
            this.LJLILLLLZI = map.containsKey("offset");
        }
    }

    @VPD(defaultFloat = 0.01f, name = "granularity")
    public final void setGranularity(float f) {
        this.LJLJJI = f;
    }

    @VPD(defaultBoolean = true, name = "scroll-enable")
    public final void setScrollEnable(boolean z) {
        LJJI().setScrollEnable(z);
        ((VTR) LJJI().findViewById(R.id.a6n)).setScrollEnable(z);
    }

    public static void LJIL(BaseLynxFoldView baseLynxFoldView, double d, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            d = -1.0d;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        C80217Ve1 appBarLayout = baseLynxFoldView.LJJI().getAppBarLayout();
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof AppBarLayout$Behavior) {
                if (i >= 0) {
                    i3 = -i;
                } else {
                    try {
                        i3 = -((int) ((1 - d) * appBarLayout.getTotalScrollRange()));
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("invoke animateOffsetToMethod error ");
                        LIZ.append(e.getMessage());
                        LLog.LIZLLL(4, "LynxFoldView", X1D.LIZIZ(LIZ));
                        return;
                    }
                }
                int i4 = -appBarLayout.getTotalScrollRange();
                if (i3 < i4) {
                    i3 = i4;
                }
                Method method = (Method) baseLynxFoldView.LJLJL.getValue();
                if (method != null) {
                    LJIJJLI(c06c, method, new Object[]{baseLynxFoldView.LJJI(), appBarLayout, Integer.valueOf(i3), 0});
                    return;
                }
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }

    public static void LJJ(BaseLynxFoldView baseLynxFoldView, double d, int i, int i2) {
        int i3;
        if ((i2 & 1) != 0) {
            d = -1.0d;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        C80217Ve1 appBarLayout = baseLynxFoldView.LJJI().getAppBarLayout();
        ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
        if (layoutParams != null) {
            C06C c06c = ((C06F) layoutParams).LIZ;
            if (c06c instanceof AppBarLayout$Behavior) {
                if (i >= 0) {
                    i3 = -i;
                } else {
                    try {
                        i3 = -((int) ((1 - d) * appBarLayout.getTotalScrollRange()));
                    } catch (Exception e) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("invoke doOffsetToMethodWithoutAnim error ");
                        LIZ.append(e.getMessage());
                        LLog.LIZLLL(4, "LynxFoldView", X1D.LIZIZ(LIZ));
                        return;
                    }
                }
                int i4 = -appBarLayout.getTotalScrollRange();
                if (i3 < i4) {
                    i3 = i4;
                }
                Method method = (Method) baseLynxFoldView.LJLJJLL.getValue();
                if (method != null) {
                    LJIJJLI(c06c, method, new Object[]{baseLynxFoldView.LJJI(), appBarLayout, Integer.valueOf(i3), Integer.valueOf(LiveLayoutPreloadThreadPriority.DEFAULT), Integer.MAX_VALUE});
                    return;
                }
                return;
            }
            return;
        }
        throw new C37692Eqm("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
    }
}
