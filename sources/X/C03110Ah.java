package X;

import android.view.View;

/* renamed from: X.0Ah, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03110Ah {
    public static int LIZ(C0AC c0ac, AbstractC03050Ab abstractC03050Ab, View view, View view2, C0A2 c0a2, boolean z) {
        if (c0a2.LJJJI() == 0 || c0ac.LIZIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(C0A2.LJJJLL(view) - C0A2.LJJJLL(view2)) + 1;
        }
        return Math.min(abstractC03050Ab.LJIIJJI(), abstractC03050Ab.LIZIZ(view2) - abstractC03050Ab.LJ(view));
    }

    public static int LIZJ(C0AC c0ac, AbstractC03050Ab abstractC03050Ab, View view, View view2, C0A2 c0a2, boolean z) {
        if (c0a2.LJJJI() == 0 || c0ac.LIZIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c0ac.LIZIZ();
        }
        return (int) (((abstractC03050Ab.LIZIZ(view2) - abstractC03050Ab.LJ(view)) / (Math.abs(C0A2.LJJJLL(view) - C0A2.LJJJLL(view2)) + 1)) * c0ac.LIZIZ());
    }

    public static int LIZIZ(C0AC c0ac, AbstractC03050Ab abstractC03050Ab, View view, View view2, C0A2 c0a2, boolean z, boolean z2) {
        int max;
        if (c0a2.LJJJI() == 0 || c0ac.LIZIZ() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(C0A2.LJJJLL(view), C0A2.LJJJLL(view2));
        int max2 = Math.max(C0A2.LJJJLL(view), C0A2.LJJJLL(view2));
        if (z2) {
            max = Math.max(0, (c0ac.LIZIZ() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC03050Ab.LIZIZ(view2) - abstractC03050Ab.LJ(view)) / (Math.abs(C0A2.LJJJLL(view) - C0A2.LJJJLL(view2)) + 1))) + (abstractC03050Ab.LJIIJ() - abstractC03050Ab.LJ(view)));
    }
}
