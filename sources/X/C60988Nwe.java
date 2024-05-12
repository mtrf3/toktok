package X;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;

/* renamed from: X.Nwe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60988Nwe {
    public static final /* synthetic */ int LIZ = 0;

    public static Rect LIZ(Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int LIZIZ = C61410O8g.LIZIZ(activity);
            int i = rect.bottom + LIZIZ;
            if (i == point.y) {
                rect.bottom = i;
            } else {
                int i2 = rect.right + LIZIZ;
                if (i2 == point.x) {
                    rect.right = i2;
                }
            }
        }
        return rect;
    }
}
