package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* loaded from: classes9.dex */
public final class J83 {
    public static int LIZ = -1;
    public static int LIZIZ = -1;

    public static int[] LIZ(Context context) {
        Display defaultDisplay;
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
                return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
            }
            return new int[]{-1, -1};
        } catch (Exception unused) {
            return new int[]{-1, -1};
        }
    }

    public static int LIZIZ(Context context) {
        WindowManager windowManager;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            windowManager = LJIJJ.getWindowManager();
        } else {
            windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        int i = 0;
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            int i2 = LIZIZ;
            if (i2 <= 0) {
                LIZJ(context);
                int i3 = LIZIZ;
                if (i3 > 0) {
                    i = i3;
                }
                i2 = i;
            }
            C16880lQ.LLLLIIL(e);
            return i2;
        }
    }

    public static void LIZJ(Context context) {
        int[] iArr;
        if (context == null) {
            iArr = new int[]{-1, -1};
        } else {
            try {
                WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
                if (windowManager != null) {
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    if (defaultDisplay == null) {
                        iArr = new int[]{-1, -1};
                    } else {
                        defaultDisplay.getRealSize(point);
                        iArr = new int[]{point.x, point.y};
                    }
                } else {
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    iArr = new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
                }
            } catch (Exception unused) {
                iArr = new int[]{-1, -1};
            }
        }
        LIZ = iArr[0];
        LIZIZ = iArr[1];
    }
}
