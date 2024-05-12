package X;

import android.content.Context;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: X.5R9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5R9 {
    public static final float LIZ(Context context) {
        Object LLILL = C16880lQ.LLILL(context, "window");
        if (LLILL != null) {
            Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getSize(point);
            int i = point.x;
            float LIZIZ = C74275TDb.LIZIZ(context, 12.0f);
            float LIZIZ2 = C74275TDb.LIZIZ(context, 20.0f);
            float LIZIZ3 = C74275TDb.LIZIZ(context, 52.0f);
            float LIZIZ4 = C74275TDb.LIZIZ(context, 80.0f);
            float f = (float) (((i - LIZIZ2) - (LIZIZ * 5)) / 5.3d);
            if (f >= LIZIZ3) {
                if (f > LIZIZ4) {
                    LIZIZ3 = LIZIZ4;
                } else {
                    LIZIZ3 = f;
                }
            }
            return C74275TDb.LIZIZ(context, 12.0f) + LIZIZ3;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.WindowManager");
    }
}
