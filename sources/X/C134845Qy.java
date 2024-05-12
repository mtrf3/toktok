package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* renamed from: X.5Qy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C134845Qy {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(float f) {
        return (int) ((Resources.getSystem().getDisplayMetrics().density * f) + 0.5f);
    }

    public static Point LIZIZ(Context context) {
        o.LJIIIZ(context, "context");
        Point point = new Point();
        Object LLILL = C16880lQ.LLILL(context, "window");
        o.LJII(LLILL, "null cannot be cast to non-null type android.view.WindowManager");
        ((WindowManager) LLILL).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static int LIZJ(Context context) {
        o.LJIIIZ(context, "context");
        return LIZIZ(context).x;
    }
}
