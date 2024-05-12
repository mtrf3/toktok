package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: X.O7g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61384O7g {
    public static int LIZ = -1;

    public static void LIZJ(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        C16880lQ.LJLLL(view, (ViewGroup) parent);
    }

    public static void LIZ(View view, ViewGroup viewGroup) {
        ViewParent parent;
        if (view == null || viewGroup == null || (parent = view.getParent()) == viewGroup) {
            return;
        }
        if (parent != null) {
            C16880lQ.LJLLL(view, (ViewGroup) parent);
        }
        viewGroup.addView(view);
    }

    public static float LIZIZ(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public static void LIZLLL(boolean z, View... viewArr) {
        int i;
        for (View view : viewArr) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            if (view != null && view.getVisibility() != i && (i == 0 || i == 8 || i == 4)) {
                view.setVisibility(i);
            }
        }
    }
}
