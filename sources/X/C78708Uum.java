package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uum, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78708Uum extends AbstractC78707Uul {
    public static final C78708Uum LJLIL = new C78708Uum();

    public final String toString() {
        return "fit_end";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float min = Math.min(f3, f4);
        float width = (rect.width() - (i * min)) + rect.left;
        float height = (rect.height() - (i2 * min)) + rect.top;
        matrix.setScale(min, min);
        matrix.postTranslate((int) (width + 0.5f), (int) (height + 0.5f));
    }
}
