package X;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;

/* renamed from: X.Wd2, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82704Wd2 {
    public static void LIZ(Context context) {
        Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        C82705Wd3.LIZIZ = displayMetrics.heightPixels + C82705Wd3.LIZJ;
        C82705Wd3.LIZ = displayMetrics.widthPixels;
    }
}
