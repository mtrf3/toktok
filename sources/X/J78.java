package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J78 {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static void LIZ(Context context) {
        try {
            Object LLILL = C16880lQ.LLILL(context, "window");
            if (!(LLILL instanceof WindowManager)) {
                LLILL = null;
            }
            WindowManager windowManager = (WindowManager) LLILL;
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    return;
                }
                defaultDisplay.getRealSize(point);
                LIZ = point.y;
                LIZIZ = point.x;
            } else {
                Resources resources = context.getResources();
                o.LJFF(resources, "context.resources");
                DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                LIZ = displayMetrics.heightPixels;
                LIZIZ = displayMetrics.widthPixels;
            }
        } catch (Exception unused) {
        }
    }
}
