package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uur, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78713Uur extends AbstractC78707Uul {
    public static final C78713Uur LJLIL = new C78713Uur();

    public final String toString() {
        return "fit_center";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(f3, f4);
        float width = ((rect.width() - (i * min)) * 0.5f) + rect.left;
        float height = ((rect.height() - (i2 * min)) * 0.5f) + rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
    }
}
