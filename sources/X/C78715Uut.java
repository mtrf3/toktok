package X;

import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: X.Uut, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C78715Uut extends AbstractC78707Uul {
    public static final C78715Uut LJLIL = new C78715Uut();

    public final String toString() {
        return "center";
    }

    @Override // X.AbstractC78707Uul
    public final void LIZ(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
    }
}
