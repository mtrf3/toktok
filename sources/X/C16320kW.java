package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.0kW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16320kW {
    public static Rect LIZ(View view) {
        return view.getClipBounds();
    }

    public static boolean LIZIZ(View view) {
        return view.isInLayout();
    }

    public static void LIZJ(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}
