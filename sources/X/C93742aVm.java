package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.aVm, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93742aVm {
    public static final /* synthetic */ int LIZ = 0;

    public static float LJ() {
        Resources system = Resources.getSystem();
        o.LJIIIIZZ(system, "Resources.getSystem()");
        return system.getDisplayMetrics().density;
    }

    public static float LIZ(float f) {
        return f * LJ();
    }

    public static int LIZIZ(int i) {
        return (int) ((i * LJ()) + 0.5f);
    }

    public static int LIZJ(float f) {
        return (int) ((f * LJ()) + 0.5f);
    }

    public static float LIZLLL(float f) {
        return (f * LJ()) + 0.5f;
    }

    public static int LJFF(Context context) {
        Point point = new Point();
        Object LLILL = C16880lQ.LLILL(context, "window");
        if (LLILL != null) {
            ((WindowManager) LLILL).getDefaultDisplay().getRealSize(point);
            return point.x;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
