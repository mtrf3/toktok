package X;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: X.0kX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16330kX {
    public static int LIZ(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean LIZIZ(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean LIZJ(View view) {
        return view.isLaidOut();
    }

    public static boolean LIZLLL(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void LJFF(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void LJI(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    public static void LJ(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }
}
