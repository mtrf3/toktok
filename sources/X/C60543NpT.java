package X;

import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.NpT, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60543NpT {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ() {
        WindowManager windowManager;
        Display defaultDisplay;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object LLILL = C16880lQ.LLILL(C58127Mrb.LIZIZ.getApplicationContext(), "window");
        if ((LLILL instanceof WindowManager) && (windowManager = (WindowManager) LLILL) != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
            defaultDisplay.getRealMetrics(displayMetrics);
        }
        return displayMetrics.widthPixels;
    }
}
