package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uul, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC78707Uul implements InterfaceC78716Uuu {
    public abstract void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

    @Override // X.InterfaceC78716Uuu
    public final Matrix LJJJJI(float f, float f2, int i, int i2, Rect rect, Matrix matrix) {
        LIZ(matrix, rect, i, i2, f, f2, rect.width() / i, rect.height() / i2);
        return matrix;
    }
}
