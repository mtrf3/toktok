package X;

import android.view.View;
import java.util.Collection;

/* renamed from: X.0kd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16390kd {
    public static int LIZIZ(View view) {
        return view.getImportantForAutofill();
    }

    public static int LIZJ(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean LIZLLL(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean LJ(View view) {
        return view.isFocusedByDefault();
    }

    public static boolean LJFF(View view) {
        return view.isImportantForAutofill();
    }

    public static boolean LJI(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static boolean LJIIIIZZ(View view) {
        return view.restoreDefaultFocus();
    }

    public static void LJIIIZ(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    public static void LJIIJ(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static void LJIIJJI(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static void LJIIL(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void LJIILIIL(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static void LJIILJJIL(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static void LIZ(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static View LJII(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }
}
