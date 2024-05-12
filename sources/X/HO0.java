package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* loaded from: classes8.dex */
public final class HO0 implements InterfaceC78716Uuu {
    @Override // X.InterfaceC78716Uuu
    public final Matrix LJJJJI(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        float width = rect.width() / i;
        float height = rect.height() / i2;
        float max = Math.max(width, height);
        float f3 = rect.left;
        float f4 = rect.top;
        if (width > height) {
            matrix.postTranslate(f3, 0.0f);
        } else {
            matrix.postTranslate(0.0f, f4);
        }
        matrix.setScale(max, max);
        return matrix;
    }
}
