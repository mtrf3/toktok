package X;

import android.app.Activity;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.O9t, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC61449O9t implements Runnable {
    public final /* synthetic */ Activity LJLIL;
    public final /* synthetic */ ViewGroup LJLILLLLZI;
    public final /* synthetic */ View LJLJI;
    public final /* synthetic */ View LJLJJI;
    public final /* synthetic */ DisplayMetrics LJLJJL;
    public final /* synthetic */ int LJLJJLL;
    public final /* synthetic */ int LJLJL;
    public final /* synthetic */ int LJLJLJ;
    public final /* synthetic */ InterfaceC61454O9y LJLJLLL;

    public RunnableC61449O9t(Activity activity, ViewGroup viewGroup, View view, View view2, DisplayMetrics displayMetrics, boolean z, int i, int i2, int i3, int i4, InterfaceC61454O9y interfaceC61454O9y) {
        this.LJLIL = activity;
        this.LJLILLLLZI = viewGroup;
        this.LJLJI = view;
        this.LJLJJI = view2;
        this.LJLJJL = displayMetrics;
        this.LJLJJLL = i;
        this.LJLJL = i2;
        this.LJLJLJ = i3;
        this.LJLJLLL = interfaceC61454O9y;
    }

    public final void LIZ() {
        ViewGroup viewGroup;
        WindowInsets windowInsets;
        int i;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        if (this.LJLIL.isFinishing() || (viewGroup = this.LJLILLLLZI) == null || this.LJLJI == null || this.LJLJJI == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            windowInsets = viewGroup.getRootWindowInsets();
        } else {
            windowInsets = null;
        }
        boolean z3 = true;
        if (windowInsets != null) {
            Object LJIJI = C79081V1x.LJIJI(WindowInsets.class, "getDisplayCutout", null, null, windowInsets);
            C61450O9u LIZ = C61451O9v.LIZ();
            if (LJIJI != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            LIZ.LIZJ = z2;
        }
        DisplayMetrics displayMetrics = this.LJLJJL;
        int i4 = displayMetrics.heightPixels;
        int i5 = displayMetrics.widthPixels;
        if (C61451O9v.LIZ().LIZJ && !FCD.LJII() && !FCD.LIZLLL()) {
            i = C63081OpJ.LJJJJLI(this.LJLIL);
        } else {
            i = 0;
        }
        C61451O9v.LIZ().LIZ = this.LJLILLLLZI.getHeight();
        C61451O9v.LIZ().getClass();
        C61451O9v.LIZ().getClass();
        double d = (i4 + i) - this.LJLJJLL;
        double d2 = d - this.LJLJL;
        double d3 = this.LJLJLJ;
        double d4 = i5;
        double d5 = (d2 - d3) / d4;
        double d6 = d2 / d4;
        double d7 = (d - d3) / d4;
        C61451O9v.LIZ().getClass();
        if (this.LJLJJLL > 0) {
            if (d / d4 >= 1.7777777777777777d) {
                if (d5 > 1.7777777777777777d) {
                    i2 = this.LJLJL;
                    i3 = this.LJLJLJ;
                } else if (d6 >= 1.7777777777777777d || d7 >= 1.7777777777777777d) {
                    double d8 = d7 - 1.7777777777777777d;
                    if (d8 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        double d9 = d6 - 1.7777777777777777d;
                        if (d9 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d8 < d9) {
                            i3 = this.LJLJLJ;
                            i2 = 0;
                        }
                    }
                    i2 = this.LJLJL;
                    i3 = 0;
                }
            }
            i2 = 0;
            i3 = 0;
        } else if (d5 >= 1.7777777777777777d) {
            i2 = this.LJLJL;
            i3 = this.LJLJLJ;
        } else {
            if (d6 >= 1.7777777777777777d || d7 >= 1.7777777777777777d) {
                double d10 = d7 - 1.7777777777777777d;
                if (d10 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                    double d11 = d6 - 1.7777777777777777d;
                    if (d11 < LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX || d10 < d11) {
                        i3 = this.LJLJLJ;
                        i2 = 0;
                    }
                }
                i2 = this.LJLJL;
                i3 = 0;
            }
            i2 = 0;
            i3 = 0;
        }
        if (this.LJLJJI.getVisibility() == 8) {
            i2 = 0;
        }
        if (this.LJLJI.getVisibility() == 8) {
            i3 = 0;
        }
        C61450O9u LIZ2 = C61451O9v.LIZ();
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        LIZ2.LIZLLL = z;
        C61450O9u LIZ3 = C61451O9v.LIZ();
        if (i3 == 0) {
            z3 = false;
        }
        LIZ3.LJ = z3;
        C61451O9v.LIZ().getClass();
        C61451O9v.LIZ().LIZ = (((int) d) - i2) - i3;
        C61451O9v.LIZ().LIZIZ.getClass();
        C61451O9v.LIZ().LIZIZ.getClass();
        C61451O9v.LIZ().LIZIZ.getClass();
        ViewGroup.LayoutParams layoutParams = this.LJLJJI.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        if (layoutParams2.height != i2) {
            layoutParams2.height = i2;
            this.LJLJJI.setLayoutParams(layoutParams2);
        }
        ViewGroup.LayoutParams layoutParams3 = this.LJLJI.getLayoutParams();
        o.LJII(layoutParams3, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
        if (layoutParams4.height != i3) {
            layoutParams4.height = i3;
            this.LJLJI.setLayoutParams(layoutParams4);
        }
        C61451O9v.LIZ();
        C61451O9v.LIZ();
        C61451O9v.LIZ();
        C61451O9v.LIZ();
        int childCount = this.LJLILLLLZI.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            Object tag = this.LJLILLLLZI.getChildAt(i6).getTag(R.id.fdh);
            if (tag instanceof InterfaceC61453O9x) {
                ((InterfaceC61453O9x) tag).LJJJJLL();
            }
        }
        InterfaceC61454O9y interfaceC61454O9y = this.LJLJLLL;
        if (interfaceC61454O9y == null) {
            return;
        }
        interfaceC61454O9y.onAdapterFinish();
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
}
