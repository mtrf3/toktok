package X;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: X.0kK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16200kK {
    public static List<Rect> LIZIZ(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int LIZJ(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int LIZLLL(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int LJ(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int LJFF(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static DisplayCutout LIZ(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }
}
