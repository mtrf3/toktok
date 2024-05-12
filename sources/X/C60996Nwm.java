package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.Nwm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60996Nwm {
    public static int LIZ = -1;
    public static int LIZIZ = -1;
    public static int LIZJ;
    public static int LIZLLL;

    public static int LJII() {
        return LJIIIIZZ(EF7.LIZIZ());
    }

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
        int LJIIIIZZ = LJIIIIZZ(context);
        int LJ = LJ(context);
        if (LJIIIIZZ > LJ) {
            return LJ;
        }
        return LJIIIIZZ;
    }

    public static int LIZJ(Context context) {
        WindowManager windowManager;
        Activity LJIJJ = C45804HyK.LJIJJ(context);
        if (LJIJJ != null) {
            windowManager = LJIJJ.getWindowManager();
        } else {
            windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            return displayMetrics.heightPixels;
        } catch (Exception e) {
            int LJ = LJ(context);
            C16880lQ.LLLLIIL(e);
            return LJ;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r2.getBoolean(r0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.content.Context r7) {
        /*
            java.lang.String r3 = "android"
            r6 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "get"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L34
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L34
            java.lang.reflect.Method r2 = r5.getMethod(r2, r1)     // Catch: java.lang.Exception -> L34
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "qemu.hw.mainkeys"
            r1[r6] = r0     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r2.invoke(r5, r1)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L34
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L2b
            goto L48
        L2b:
            java.lang.String r0 = "0"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            goto L49
        L34:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "bool"
            java.lang.String r0 = "config_showNavigationBar"
            int r0 = r2.getIdentifier(r0, r1, r3)
            if (r0 <= 0) goto L48
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L49
        L48:
            return r6
        L49:
            android.content.res.Resources r2 = r7.getResources()
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r0 = "dimen"
            int r0 = r2.getIdentifier(r1, r0, r3)
            if (r0 <= 0) goto L5c
            int r0 = r2.getDimensionPixelSize(r0)
            return r0
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60996Nwm.LIZLLL(android.content.Context):int");
    }

    public static int LJ(Context context) {
        int i = LIZIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] LJI = LJI(context);
        LIZ = LJI[0];
        int i2 = LJI[1];
        LIZIZ = i2;
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static int LJFF(Context context) {
        int i = LIZLLL;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if (LIZJ == 0 || LIZLLL == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZLLL;
    }

    public static int[] LJI(Context context) {
        if (context == null) {
            return new int[]{-1, -1};
        }
        try {
            WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
            if (windowManager != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    return new int[]{-1, -1};
                }
                defaultDisplay.getRealSize(point);
                return new int[]{point.x, point.y};
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new int[]{displayMetrics.widthPixels, displayMetrics.heightPixels};
        } catch (Exception unused) {
            return new int[]{-1, -1};
        }
    }

    public static int LJIIIIZZ(Context context) {
        int i = LIZ;
        if (i > 0) {
            return i;
        }
        if (context == null) {
            return 0;
        }
        int[] LJI = LJI(context);
        int i2 = LJI[0];
        LIZ = i2;
        LIZIZ = LJI[1];
        if (i2 <= 0) {
            return 0;
        }
        return i2;
    }

    public static int LJIIIZ(Context context) {
        if (context == null) {
            return 0;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                i = i2;
            }
            if (i != 0) {
                return i;
            }
        }
        return LJIIIIZZ(context);
    }

    public static int LJIIJ(Context context) {
        int i = LIZJ;
        if (i != 0) {
            return i;
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getSize(point);
            LIZJ = point.x;
            LIZLLL = point.y;
        }
        if (LIZJ == 0 || LIZLLL == 0) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            LIZJ = displayMetrics.widthPixels;
            LIZLLL = displayMetrics.heightPixels;
        }
        return LIZJ;
    }
}
