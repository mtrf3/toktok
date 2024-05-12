package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.MutableLiveData;

/* renamed from: X.O9r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61447O9r {
    public static final boolean LJIIIZ;
    public static final int LJIIJ;
    public static final int LJIIJJI;
    public static final int LJIIL;
    public static int LJIILIIL;
    public static int LJIILJJIL;
    public static final MutableLiveData<Integer> LJIILL;
    public static final MutableLiveData LJIILLIIL;
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public final C3D9 LJ = new C3D9();
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;

    public static int LIZ() {
        return C17N.LJIILL(LJIIJJI);
    }

    static {
        boolean z;
        int i;
        Display defaultDisplay = ((WindowManager) C16880lQ.LLILL(EF7.LIZIZ(), "window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (Exception e) {
            C36922EeM.LJFF(e);
        }
        if (((int) (Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels) / displayMetrics.density)) <= 640) {
            z = true;
        } else {
            z = false;
        }
        LJIIIZ = z;
        if (C34051DXz.LIZ() && !DY1.LIZ()) {
            LJIIIZ = true;
            LJIIJ = 42;
        }
        if (LJIIIZ) {
            i = LJIIJ;
        } else {
            C34045DXt.LIZ.getClass();
            if (((Boolean) C34045DXt.LIZIZ.getValue()).booleanValue()) {
                i = 58;
            } else {
                i = 49;
            }
        }
        LJIIJJI = i;
        LJIIL = C17N.LJIILL(i - 47);
        C17N.LJIILL(8.0d);
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        LJIILL = mutableLiveData;
        LJIILLIIL = mutableLiveData;
    }

    public static int LIZIZ(Context context) {
        if (!FCD.LIZLLL()) {
            return 0;
        }
        int[] iArr = {0, 0};
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((int[]) loadClass.getMethod("getNotchSize", new Class[0]).invoke(loadClass, new Object[0]))[1];
        } catch (Throwable th) {
            try {
                C36922EeM.LJFF(th);
                return iArr[1];
            } catch (Throwable unused) {
                return iArr[1];
            }
        }
    }

    public static int LIZJ(Context context) {
        if (FCD.LIZLLL()) {
            return LIZIZ(context);
        }
        return C63081OpJ.LJJJJLI(context);
    }

    public static int LIZLLL(Activity activity) {
        int height;
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(EF7.LIZIZ(), "window");
        int i = 0;
        if (windowManager == null) {
            return 0;
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            Class.forName("android.view.Display").getMethod("getRealMetrics", DisplayMetrics.class).invoke(defaultDisplay, displayMetrics);
            int i2 = displayMetrics.heightPixels;
            if (TextUtils.equals("OnePlus", Build.BRAND)) {
                View decorView = activity.getWindow().getDecorView();
                Rect rect = new Rect();
                decorView.getWindowVisibleDisplayFrame(rect);
                height = rect.bottom;
            } else {
                height = defaultDisplay.getHeight();
            }
            i = i2 - height;
            return i;
        } catch (Exception e) {
            C36922EeM.LJFF(e);
            return i;
        }
    }
}
