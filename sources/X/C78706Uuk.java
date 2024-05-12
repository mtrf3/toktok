package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uuk, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78706Uuk extends AbstractC78707Uul {
    public static final C78706Uuk LJLIL = new C78706Uuk();

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float height;
        float abs;
        int i3;
        if (rect != null) {
            float f6 = i;
            float LJIIL = C15380j0.LJIIL() / f6;
            float f7 = i2;
            float LJIIJJI = C15380j0.LJIIJJI() / f7;
            if (LJIIJJI > LJIIL) {
                f5 = ((rect.width() - (f6 * LJIIJJI)) * 0.5f) + rect.left;
                if (f2 == 0.0f) {
                    i3 = rect.top;
                } else if (f2 == 1.0f) {
                    abs = (rect.height() - (f7 * LJIIJJI)) + rect.top;
                    LJIIL = LJIIJJI;
                } else {
                    i3 = rect.top;
                }
                abs = i3;
                LJIIL = LJIIJJI;
            } else {
                f5 = rect.left;
                float f8 = f7 * LJIIL;
                float LJIIJJI2 = (C15380j0.LJIIJJI() - f8) * 0.5f;
                if (f2 == 0.0f) {
                    height = rect.top;
                } else if (f2 == 1.0f) {
                    abs = ((Math.abs(LJIIJJI2) + rect.height()) - f8) + rect.top;
                } else {
                    LJIIJJI2 = rect.top;
                    height = (rect.height() - f8) * 0.5f;
                }
                abs = height + LJIIJJI2;
            }
            if (matrix != null) {
                matrix.setScale(LJIIL, LJIIL);
                matrix.postTranslate((int) (f5 + 0.5f), (int) (abs + 0.5f));
            }
        }
    }
}
