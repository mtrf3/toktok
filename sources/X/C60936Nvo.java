package X;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Nvo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60936Nvo {
    public static final /* synthetic */ int LIZ = 0;

    public static final int LIZ(float f) {
        Resources system = Resources.getSystem();
        o.LJFF(system, "Resources.getSystem()");
        return (int) ((f * system.getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r2.getBoolean(r0) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZIZ(android.content.Context r7) {
        /*
            java.lang.String r3 = "android"
            r6 = 0
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L3e
            java.lang.String r2 = "get"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L3e
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch: java.lang.Exception -> L3e
            java.lang.reflect.Method r2 = r5.getMethod(r2, r1)     // Catch: java.lang.Exception -> L3e
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "qemu.hw.mainkeys"
            r1[r6] = r0     // Catch: java.lang.Exception -> L3e
            java.lang.Object r1 = r2.invoke(r5, r1)     // Catch: java.lang.Exception -> L3e
            if (r1 == 0) goto L36
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "1"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L2d
            goto L58
        L2d:
            java.lang.String r0 = "0"
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r1)     // Catch: java.lang.Exception -> L3e
            if (r0 == 0) goto L3e
            goto L59
        L36:
            X.Eqm r1 = new X.Eqm     // Catch: java.lang.Exception -> L3e
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3e
            throw r1     // Catch: java.lang.Exception -> L3e
        L3e:
            if (r7 == 0) goto L58
            android.content.res.Resources r2 = r7.getResources()
            if (r2 == 0) goto L58
            java.lang.String r1 = "bool"
            java.lang.String r0 = "config_showNavigationBar"
            int r0 = r2.getIdentifier(r0, r1, r3)
            if (r0 <= 0) goto L58
            if (r2 == 0) goto L58
            boolean r0 = r2.getBoolean(r0)
            if (r0 != 0) goto L59
        L58:
            return r6
        L59:
            if (r7 == 0) goto L71
            android.content.res.Resources r2 = r7.getResources()
            if (r2 == 0) goto L71
            java.lang.String r1 = "navigation_bar_height"
            java.lang.String r0 = "dimen"
            int r0 = r2.getIdentifier(r1, r0, r3)
            if (r0 <= 0) goto L71
            if (r2 == 0) goto L71
            int r6 = r2.getDimensionPixelSize(r0)
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60936Nvo.LIZIZ(android.content.Context):int");
    }

    public static final int LIZJ(Window window) {
        Display defaultDisplay;
        if (window == null) {
            FCH.LIZIZ.getClass();
            Activity LIZIZ = FCG.LIZIZ();
            if (LIZIZ == null || (window = LIZIZ.getWindow()) == null) {
                Resources system = Resources.getSystem();
                o.LJFF(system, "Resources.getSystem()");
                return system.getDisplayMetrics().heightPixels;
            }
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        return displayMetrics.heightPixels;
    }

    public static final int LIZLLL(Window window) {
        Display defaultDisplay;
        if (window == null) {
            FCH.LIZIZ.getClass();
            Activity LIZIZ = FCG.LIZIZ();
            if (LIZIZ == null || (window = LIZIZ.getWindow()) == null) {
                Resources system = Resources.getSystem();
                o.LJFF(system, "Resources.getSystem()");
                return system.getDisplayMetrics().widthPixels;
            }
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = window.getWindowManager();
        if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }
}
