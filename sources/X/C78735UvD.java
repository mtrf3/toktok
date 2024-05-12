package X;

import android.graphics.Matrix;

/* renamed from: X.UvD, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78735UvD extends QXX {
    public static final C78735UvD LJLIL = new C78735UvD();

    public final String toString() {
        return "center_crop";
    }

    @Override // X.QXX
    public final void LLJILJIL(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f / f3;
        float f8 = f2 / f4;
        if (f7 > f8) {
            matrix.setScale(f7, f7);
            matrix.postTranslate(f5, ((f2 - (f4 * f7)) / 2.0f) + f6);
        } else {
            matrix.setScale(f8, f8);
            matrix.postTranslate(((f - (f3 * f8)) / 2.0f) + f5, f6);
        }
    }
}
