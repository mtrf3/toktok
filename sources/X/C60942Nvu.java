package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lynx.spark.schema.model.SparkPopupSchemaParam;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60942Nvu {
    public static int LIZ(View view) {
        o.LJIIJ(view, "view");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                return ((FrameLayout.LayoutParams) layoutParams2).gravity;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        if (layoutParams instanceof C06F) {
            ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
            if (layoutParams3 != null) {
                return ((C06F) layoutParams3).LIZJ;
            }
            throw new C37692Eqm("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        }
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
            if (layoutParams4 != null) {
                return ((LinearLayout.LayoutParams) layoutParams4).gravity;
            }
            throw new C37692Eqm("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        }
        return 0;
    }

    public static void LIZJ(int i, View view) {
        o.LJIIJ(view, "view");
        ViewGroup.LayoutParams layoutParams = null;
        if ((view instanceof ViewGroup) && view != null) {
            layoutParams = view.getLayoutParams();
        }
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i;
        } else if (layoutParams instanceof C06F) {
            ((C06F) layoutParams).LIZJ = i;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i;
        }
        view.requestLayout();
    }

    public static int LIZIZ(SparkPopupSchemaParam params, View view, Integer[] margin) {
        Object LIZ;
        Object LIZ2;
        Object LIZ3;
        Object LIZ4;
        Object LIZ5;
        Object LIZ6;
        int i;
        o.LJIIJ(params, "params");
        o.LJIIJ(view, "view");
        o.LJIIJ(margin, "margin");
        String realGravityWithoutDefault = params.getRealGravityWithoutDefault(view.getContext());
        switch (realGravityWithoutDefault.hashCode()) {
            case -1383228885:
                if (realGravityWithoutDefault.equals("bottom")) {
                    return 81;
                }
                break;
            case -1364013995:
                if (realGravityWithoutDefault.equals("center")) {
                    return 17;
                }
                break;
            case 100571:
                if (realGravityWithoutDefault.equals("end")) {
                    return 8388613;
                }
                break;
            case 3317767:
                if (realGravityWithoutDefault.equals("left")) {
                    return 3;
                }
                break;
            case 108511772:
                if (realGravityWithoutDefault.equals("right")) {
                    return 5;
                }
                break;
            case 109757538:
                if (realGravityWithoutDefault.equals("start")) {
                    return 8388611;
                }
                break;
        }
        try {
            LIZ = Integer.valueOf(margin[0].intValue());
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = 0;
        }
        int intValue = ((Number) LIZ).intValue();
        try {
            LIZ2 = Integer.valueOf(margin[1].intValue());
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th2) {
            LIZ2 = C141335gf.LIZ(th2);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = 0;
        }
        int intValue2 = ((Number) LIZ2).intValue();
        try {
            LIZ3 = Integer.valueOf(margin[2].intValue());
            C3C5.m7constructorimpl(LIZ3);
        } catch (Throwable th3) {
            LIZ3 = C141335gf.LIZ(th3);
            C3C5.m7constructorimpl(LIZ3);
        }
        if (C3C5.m12isFailureimpl(LIZ3)) {
            LIZ3 = 0;
        }
        int intValue3 = ((Number) LIZ3).intValue();
        try {
            LIZ4 = Integer.valueOf(margin[3].intValue());
            C3C5.m7constructorimpl(LIZ4);
        } catch (Throwable th4) {
            LIZ4 = C141335gf.LIZ(th4);
            C3C5.m7constructorimpl(LIZ4);
        }
        if (C3C5.m12isFailureimpl(LIZ4)) {
            LIZ4 = 0;
        }
        ((Number) LIZ4).intValue();
        try {
            LIZ5 = Integer.valueOf(margin[4].intValue());
            C3C5.m7constructorimpl(LIZ5);
        } catch (Throwable th5) {
            LIZ5 = C141335gf.LIZ(th5);
            C3C5.m7constructorimpl(LIZ5);
        }
        if (C3C5.m12isFailureimpl(LIZ5)) {
            LIZ5 = 0;
        }
        int intValue4 = ((Number) LIZ5).intValue();
        try {
            LIZ6 = Integer.valueOf(margin[5].intValue());
            C3C5.m7constructorimpl(LIZ6);
        } catch (Throwable th6) {
            LIZ6 = C141335gf.LIZ(th6);
            C3C5.m7constructorimpl(LIZ6);
        }
        if (C3C5.m12isFailureimpl(LIZ6)) {
            LIZ6 = 0;
        }
        int intValue5 = ((Number) LIZ6).intValue();
        if (intValue2 > 0) {
            i = 48;
        } else {
            i = 80;
        }
        Context context = view.getContext();
        o.LJFF(context, "view.context");
        C60963NwF.LIZ(context);
        if (intValue4 > 0) {
            return i | 8388611;
        }
        if (intValue5 > 0) {
            return i | 8388613;
        }
        if (intValue > 0) {
            return i | 3;
        }
        if (intValue3 > 0) {
            return i | 5;
        }
        return i | 17;
    }
}
