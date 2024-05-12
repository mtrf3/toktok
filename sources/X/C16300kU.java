package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* renamed from: X.0kU, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16300kU {
    public static AccessibilityNodeProvider LIZ(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static boolean LIZIZ(View view) {
        return view.getFitsSystemWindows();
    }

    public static int LIZJ(View view) {
        return view.getImportantForAccessibility();
    }

    public static int LIZLLL(View view) {
        return view.getMinimumHeight();
    }

    public static int LJ(View view) {
        return view.getMinimumWidth();
    }

    public static ViewParent LJFF(View view) {
        return view.getParentForAccessibility();
    }

    public static int LJI(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean LJII(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean LJIIIIZZ(View view) {
        return view.hasTransientState();
    }

    public static void LJIIJ(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void LJIILL(View view) {
        view.requestFitSystemWindows();
    }

    public static void LJIIL(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void LJIILJJIL(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void LJIILLIIL(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void LJIIZILJ(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void LJIJ(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean LJIIIZ(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void LJIILIIL(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void LJIIJJI(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }
}
