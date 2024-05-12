package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JF7 {
    public static int LIZ;

    public static int LIZ(Context context, Window window) {
        View decorView = window.getDecorView();
        o.LJFF(decorView, "window.decorView");
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        Resources resources = context.getResources();
        o.LJFF(resources, "context.resources");
        int dimensionPixelSize = resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        Resources resources2 = context.getResources();
        o.LJFF(resources2, "context.resources");
        if (abs <= resources2.getDimensionPixelSize(resources2.getIdentifier("navigation_bar_height", "dimen", "android")) + dimensionPixelSize) {
            LIZ = abs;
            return 0;
        }
        return abs - LIZ;
    }
}
