package com.lynx.tasm.utils;

import X.C16880lQ;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.lynx.tasm.LynxEnv;

/* loaded from: classes15.dex */
public class DisplayMetricsHolder {
    public static DisplayMetrics LIZ = null;
    public static DisplayMetrics LIZIZ = null;
    public static int LIZJ = -1;
    public static float LIZLLL = -1.0f;
    public static boolean LJ;

    public static native void nativeUpdateDevice(int i, int i2, float f);

    public static DisplayMetrics LIZIZ() {
        synchronized (DisplayMetricsHolder.class) {
            if (LIZIZ == null) {
                return null;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setTo(LIZIZ);
            return displayMetrics;
        }
    }

    public static DisplayMetrics LIZJ() {
        synchronized (DisplayMetricsHolder.class) {
            if (LIZ == null) {
                return null;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayMetrics.setTo(LIZ);
            return displayMetrics;
        }
    }

    public static DisplayMetrics LIZ(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        if (LIZJ() != null) {
            displayMetrics.setTo(LIZJ());
        }
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            return displayMetrics;
        }
        throw new AssertionError("WindowManager is null!");
    }

    public static void LIZLLL(DisplayMetrics displayMetrics) {
        LynxEnv LJIIIZ = LynxEnv.LJIIIZ();
        LJIIIZ.LJIIL();
        boolean z = LJIIIZ.LJIILIIL;
        synchronized (DisplayMetricsHolder.class) {
            LIZIZ = displayMetrics;
            if (z) {
                LJ = true;
                nativeUpdateDevice(displayMetrics.widthPixels, displayMetrics.heightPixels, displayMetrics.density);
            }
        }
    }

    public static void LJ(int i, int i2) {
        synchronized (DisplayMetricsHolder.class) {
            DisplayMetrics displayMetrics = LIZ;
            if (displayMetrics != null) {
                displayMetrics.widthPixels = i;
                displayMetrics.heightPixels = i2;
            }
            DisplayMetrics displayMetrics2 = LIZIZ;
            if (displayMetrics2 != null) {
                displayMetrics2.widthPixels = i;
                displayMetrics2.heightPixels = i2;
            }
        }
    }
}
