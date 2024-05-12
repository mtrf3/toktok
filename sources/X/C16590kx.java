package X;

import android.view.View;
import android.view.ViewParent;

/* renamed from: X.0kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16590kx {
    public static void LJI(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }

    public static boolean LIZIZ(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static void LJ(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean LJFF(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static boolean LIZ(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    public static void LIZJ(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    public static void LIZLLL(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }
}
