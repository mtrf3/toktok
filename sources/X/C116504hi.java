package X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: X.4hi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116504hi {
    public static int LIZ(Context context) {
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static int LIZIZ(Context context) {
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }
}
