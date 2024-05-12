package X;

import android.app.Activity;
import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class J7B {
    public static int LIZ;

    public static Display LIZ(Context context) {
        WindowManager windowManager;
        if (context instanceof Activity) {
            windowManager = ((Activity) context).getWindowManager();
        } else {
            Object LLILL = C16880lQ.LLILL(context, "window");
            if (LLILL != null) {
                windowManager = (WindowManager) LLILL;
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
            }
        }
        if (windowManager != null) {
            return windowManager.getDefaultDisplay();
        }
        return null;
    }

    public static int LIZIZ(double d, Context context) {
        o.LJIIJ(context, "context");
        o.LJFF(context.getResources(), "context.resources");
        return (int) ((d / r1.getDisplayMetrics().density) + 0.5f);
    }
}
