package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.WDs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public abstract class AbstractC81936WDs {
    public abstract View LIZ();

    public final Rect LIZIZ() {
        View LIZ = LIZ();
        if (LIZ == null || !C16330kX.LIZIZ(LIZ)) {
            return null;
        }
        int[] iArr = new int[2];
        LIZ.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, (int) ((LIZ.getScaleX() * LIZ.getWidth()) + i), (int) ((LIZ.getScaleY() * LIZ.getHeight()) + i2));
    }

    public final Rect LIZJ() {
        View LIZ = LIZ();
        if (LIZ == null || !C16330kX.LIZIZ(LIZ)) {
            return null;
        }
        return C73098SmU.LIZJ(LIZ);
    }
}
