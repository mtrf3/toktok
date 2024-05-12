package X;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JCN {
    public static float LIZ = -1.0f;

    public static final JCO LIZIZ(ActivityC45651qj activityC45651qj) {
        int i;
        Object LLILL;
        int i2 = -1;
        try {
            LLILL = C16880lQ.LLILL(activityC45651qj, "window");
        } catch (Exception unused) {
            i = -1;
        }
        if (LLILL != null) {
            Display defaultDisplay = ((WindowManager) LLILL).getDefaultDisplay();
            Point point = new Point();
            if (defaultDisplay == null) {
                return new JCO(-1, -1);
            }
            defaultDisplay.getRealSize(point);
            i2 = LIZJ(point.x, activityC45651qj);
            i = LIZJ(point.y, activityC45651qj);
            return new JCO(i2, i);
        }
        throw new C37692Eqm("null cannot be cast to non-null type android.view.WindowManager");
    }

    public static final int LIZ(int i, ActivityC45651qj activityC45651qj) {
        if (LIZ < 0) {
            Resources resources = activityC45651qj.getResources();
            o.LJFF(resources, "context.resources");
            LIZ = resources.getDisplayMetrics().density;
        }
        return O6R.LJJIIZ((i * LIZ) + 0.5f);
    }

    public static final int LIZJ(int i, ActivityC45651qj activityC45651qj) {
        if (LIZ < 0) {
            Resources resources = activityC45651qj.getResources();
            o.LJFF(resources, "context.resources");
            LIZ = resources.getDisplayMetrics().density;
        }
        return (int) ((i / LIZ) + 0.5f);
    }
}
