package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAI {
    public static final int LIZ(int i) {
        return (int) ((EF7.LIZIZ().getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    public static final void LIZIZ(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LIZLLL(int i, View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i;
            }
            view.requestLayout();
        }
    }

    public static final void LIZJ(View view, String id, InterfaceC88472Yns<? super String, C76800UCe> func) {
        o.LJIIIZ(id, "id");
        o.LJIIIZ(func, "func");
        if (!view.getViewTreeObserver().isAlive()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AAJ(view, new Rect(), func, id));
    }
}
