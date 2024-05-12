package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uuo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78710Uuo extends AbstractC78707Uul {
    public static final C78710Uuo LJLIL = new C78710Uuo();

    public final String toString() {
        return "fit_bottom_start";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(f3, f4);
        float f5 = rect.left;
        float height = (rect.height() - (i2 * min)) + rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
    }
}
