package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uuv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78717Uuv extends AbstractC78707Uul {
    public static final C78717Uuv LJLIL = new C78717Uuv();

    public final String toString() {
        return "focus_crop";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float max;
        if (f4 > f3) {
            float f6 = i * f4;
            f5 = Math.max(Math.min((rect.width() * 0.5f) - (f * f6), 0.0f), rect.width() - f6) + rect.left;
            max = rect.top;
            f3 = f4;
        } else {
            f5 = rect.left;
            float f7 = i2 * f3;
            max = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f7), 0.0f), rect.height() - f7) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (max + 0.5f));
    }
}
