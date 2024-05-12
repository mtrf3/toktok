package X;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* renamed from: X.0kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16310kV {
    public static Display LIZIZ(View view) {
        return view.getDisplay();
    }

    public static int LIZJ(View view) {
        return view.getLabelFor();
    }

    public static int LIZLLL(View view) {
        return view.getLayoutDirection();
    }

    public static int LJ(View view) {
        return view.getPaddingEnd();
    }

    public static int LJFF(View view) {
        return view.getPaddingStart();
    }

    public static boolean LJI(View view) {
        return view.isPaddingRelative();
    }

    public static void LJII(View view, int i) {
        view.setLabelFor(i);
    }

    public static void LJIIIIZZ(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static void LJIIIZ(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static void LJIIJ(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}
