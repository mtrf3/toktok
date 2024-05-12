package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Size;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* renamed from: X.Vtd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81185Vtd {
    public static int LIZ;

    public static int LIZIZ() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int LIZLLL() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static Display LIZ(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            if (Build.VERSION.SDK_INT >= 30) {
                return ((Activity) context).getDisplay();
            }
            windowManager = ((Activity) context).getWindowManager();
        } else {
            windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        }
        return windowManager.getDefaultDisplay();
    }

    public static int LIZJ(Context context) {
        WindowManager windowManager;
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (context instanceof Activity) {
                windowManager = ((Activity) context).getWindowManager();
            } else {
                windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            }
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics == null) {
                return 0;
            }
            Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = currentWindowMetrics.getBounds();
            return new Size(bounds.width() - i, bounds.height() - i2).getHeight();
        }
        Display LIZ2 = LIZ(context);
        if (LIZ2 == null) {
            return 0;
        }
        Point point = new Point();
        LIZ2.getSize(point);
        return point.y;
    }

    public static int LJ(Context context) {
        WindowManager windowManager;
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (context instanceof Activity) {
                windowManager = ((Activity) context).getWindowManager();
            } else {
                windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            }
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            if (currentWindowMetrics == null) {
                return 0;
            }
            return currentWindowMetrics.getBounds().width();
        }
        Display LIZ2 = LIZ(context);
        if (LIZ2 == null) {
            return 0;
        }
        Point point = new Point();
        LIZ2.getSize(point);
        return point.x;
    }

    public static int LJFF(Context context) {
        int i;
        int i2 = LIZ;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        LIZ = i;
        return i;
    }
}
