package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uun, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78709Uun extends AbstractC78707Uul {
    public static final C78709Uun LJLIL = new C78709Uun();

    public final String toString() {
        return "fit_xy";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }
}
