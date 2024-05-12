package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.0vF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22970vF {
    public static WindowManager LIZ;
    public static final Point LIZIZ = new Point();

    public static final int LIZ() {
        Object obj;
        Context LLLLL;
        if (LIZ == null) {
            Context LIZLLL = C15380j0.LIZLLL();
            WindowManager windowManager = null;
            if (LIZLLL != null && (LLLLL = C16880lQ.LLLLL(LIZLLL)) != null) {
                obj = C16880lQ.LLILL(LLLLL, "window");
            } else {
                obj = null;
            }
            if (obj instanceof WindowManager) {
                windowManager = (WindowManager) obj;
            }
            LIZ = windowManager;
        }
        WindowManager windowManager2 = LIZ;
        if (windowManager2 != null) {
            Display defaultDisplay = windowManager2.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(LIZIZ);
            }
            return LIZIZ.y;
        }
        return C15380j0.LJIIL();
    }

    public static final int LIZIZ() {
        Object obj;
        Context LLLLL;
        if (LIZ == null) {
            Context LIZLLL = C15380j0.LIZLLL();
            WindowManager windowManager = null;
            if (LIZLLL != null && (LLLLL = C16880lQ.LLLLL(LIZLLL)) != null) {
                obj = C16880lQ.LLILL(LLLLL, "window");
            } else {
                obj = null;
            }
            if (obj instanceof WindowManager) {
                windowManager = (WindowManager) obj;
            }
            LIZ = windowManager;
        }
        WindowManager windowManager2 = LIZ;
        if (windowManager2 != null) {
            Display defaultDisplay = windowManager2.getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getSize(LIZIZ);
            }
            return LIZIZ.x;
        }
        return C15380j0.LJIIL();
    }
}
