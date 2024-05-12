package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Size;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* renamed from: X.Vtc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81184Vtc {
    public static int LIZ;
    public static volatile WindowMetrics LIZIZ;

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

    public static int LIZIZ(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics LJI = LJI(context);
            if (LJI == null) {
                return 0;
            }
            return LJI.getBounds().height();
        }
        Display LIZ2 = LIZ(context);
        if (LIZ2 == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        LIZ2.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int LIZJ(Context context) {
        int i;
        boolean z;
        String str;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = 0;
        }
        Rect rect = new Rect();
        Activity LIZ2 = C105574Cj.LIZ(context);
        if (LIZ2 != null) {
            LIZ2.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
            return Math.min(Math.max((LIZIZ(context) - LJFF(context)) - rect.height(), 0), i);
        }
        Resources resources2 = context.getResources();
        int identifier2 = resources2.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier2 > 0 && resources2.getBoolean(identifier2)) {
            z = true;
        } else {
            z = false;
        }
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            str = (String) cls.getMethod("get", String.class).invoke(cls, "qemu.hw.mainkeys");
        } catch (Exception unused) {
        }
        if (!CardStruct.IStatusCode.DEFAULT.equals(str)) {
            if ("1".equals(str)) {
                return 0;
            }
            if (!z) {
                return 0;
            }
            return i;
        }
        return i;
    }

    public static int LIZLLL(Context context) {
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics LJI = LJI(context);
            if (LJI == null) {
                return 0;
            }
            Insets insetsIgnoringVisibility = LJI.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout());
            int i = insetsIgnoringVisibility.right + insetsIgnoringVisibility.left;
            int i2 = insetsIgnoringVisibility.top + insetsIgnoringVisibility.bottom;
            Rect bounds = LJI.getBounds();
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
        if (context == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics LJI = LJI(context);
            if (LJI == null) {
                return 0;
            }
            return LJI.getBounds().width();
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

    public static WindowMetrics LJI(Context context) {
        WindowManager windowManager;
        if (LIZIZ == null) {
            synchronized (C81184Vtc.class) {
                if (LIZIZ == null) {
                    if (context instanceof Activity) {
                        windowManager = ((Activity) context).getWindowManager();
                    } else {
                        windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
                    }
                    LIZIZ = windowManager.getCurrentWindowMetrics();
                }
            }
        }
        return LIZIZ;
    }
}
