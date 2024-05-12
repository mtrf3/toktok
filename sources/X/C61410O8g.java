package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* renamed from: X.O8g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61410O8g {
    public static final String LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C62822Ol8 LJ;
    public static final C62822Ol8 LJFF;
    public static final C62822Ol8 LJI;
    public static final C62822Ol8 LJII;

    static {
        String BRAND = Build.BRAND;
        o.LJIIIIZZ(BRAND, "BRAND");
        Locale locale = Locale.ENGLISH;
        LIZ = C141415gn.LIZIZ(locale, "ENGLISH", BRAND, locale, "this as java.lang.String).toLowerCase(locale)");
        LIZIZ = C221108m2.LIZIZ(C61417O8n.LJLIL);
        LIZJ = C221108m2.LIZIZ(C61414O8k.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C61416O8m.LJLIL);
        LJ = C221108m2.LIZIZ(C61412O8i.LJLIL);
        LJFF = C221108m2.LIZIZ(C61411O8h.LJLIL);
        LJI = C221108m2.LIZIZ(C61415O8l.LJLIL);
        LJII = C221108m2.LIZIZ(C61413O8j.LJLIL);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (android.provider.Settings.Secure.getInt(r7.getContentResolver(), "buttons_show_on_screen_navkeys", 0) != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        r2 = LIZIZ(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r3 - r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r1 == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e8, code lost:
    
        if (((java.lang.Boolean) X.C61410O8g.LJII.getValue()).booleanValue() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(android.content.Context r7) {
        /*
            r2 = 0
            if (r7 != 0) goto L4
            return r2
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 >= r0) goto Lf
        La:
            int r3 = X.C60996Nwm.LJ(r7)
        Le:
            return r3
        Lf:
            int r4 = X.C60996Nwm.LJ(r7)
            int r3 = X.C60996Nwm.LJIIIIZZ(r7)
            int r0 = java.lang.Math.max(r4, r3)
            float r1 = (float) r0
            int r0 = java.lang.Math.min(r4, r3)
            float r0 = (float) r0
            float r1 = r1 / r0
            double r5 = (double) r1
            r3 = 4611055514479556035(0x3ffdc28f5c28f5c3, double:1.86)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto La
            int r3 = X.C60996Nwm.LJ(r7)
            X.Ol8 r0 = X.C61410O8g.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5d
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "navigation_mode"
            int r1 = android.provider.Settings.Secure.getInt(r1, r0, r2)
            r0 = 2
            if (r1 != r0) goto L75
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "buttons_show_on_screen_navkeys"
            int r0 = android.provider.Settings.Secure.getInt(r1, r0, r2)
            if (r0 == 0) goto L5b
        L57:
            int r2 = LIZIZ(r7)
        L5b:
            int r3 = r3 - r2
            goto Le
        L5d:
            X.Ol8 r0 = X.C61410O8g.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L78
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "force_fsg_nav_bar"
            int r1 = android.provider.Settings.Secure.getInt(r1, r0, r2)
        L75:
            if (r1 == 0) goto L57
            goto L5b
        L78:
            X.Ol8 r0 = X.C61410O8g.LIZLLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L91
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "navigation_gesture_on"
            int r1 = android.provider.Settings.Secure.getInt(r1, r0, r2)
            goto L75
        L91:
            X.Ol8 r0 = X.C61410O8g.LJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Laa
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "hide_navigationbar_enable"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            goto L75
        Laa:
            X.Ol8 r0 = X.C61410O8g.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc3
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "navigationbar_is_min"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            goto L75
        Lc3:
            X.Ol8 r0 = X.C61410O8g.LJI
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Ldc
            android.content.ContentResolver r1 = r7.getContentResolver()
            java.lang.String r0 = "navigationbar_trigger_mode"
            int r1 = android.provider.Settings.Global.getInt(r1, r0, r2)
            goto L75
        Ldc:
            X.Ol8 r0 = X.C61410O8g.LJII
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5b
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61410O8g.LIZ(android.content.Context):int");
    }

    public static int LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int LIZJ(Activity activity) {
        Rect rect = new Rect();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        activity.getWindowManager().getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels - (rect.height() + rect.top);
    }

    public static final int LIZLLL(Context context) {
        WindowManager windowManager;
        if (context == null) {
            return 0;
        }
        try {
            Object LLILL = C16880lQ.LLILL(context, "window");
            if ((LLILL instanceof WindowManager) && (windowManager = (WindowManager) LLILL) != null) {
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                if (defaultDisplay == null) {
                    return 0;
                }
                defaultDisplay.getSize(point);
                return point.x;
            }
            return C60996Nwm.LJIIIIZZ(context);
        } catch (Exception unused) {
            return 0;
        }
    }

    public static final int LJ(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        int i = displayMetrics.heightPixels;
        Object LLILL2 = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL2, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay2 = ((WindowManager) LLILL2).getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay2.getMetrics(displayMetrics2);
        if (i == displayMetrics2.heightPixels) {
            return 0;
        }
        int i2 = Settings.Secure.getInt(context.getContentResolver(), "navigation_gesture_on", 0);
        int i3 = Settings.Secure.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0);
        if (i2 != 0 || i3 != 0) {
            return 0;
        }
        Object LLILL3 = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL3, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay3 = ((WindowManager) LLILL3).getDefaultDisplay();
        DisplayMetrics displayMetrics3 = new DisplayMetrics();
        defaultDisplay3.getRealMetrics(displayMetrics3);
        int i4 = displayMetrics3.heightPixels;
        Object LLILL4 = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL4, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay4 = ((WindowManager) LLILL4).getDefaultDisplay();
        DisplayMetrics displayMetrics4 = new DisplayMetrics();
        defaultDisplay4.getMetrics(displayMetrics4);
        return i4 - displayMetrics4.heightPixels;
    }

    public static boolean LJFF(Context context) {
        if (context == null || Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 1) {
            return false;
        }
        return true;
    }
}
