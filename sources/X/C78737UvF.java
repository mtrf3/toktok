package X;

import android.graphics.Matrix;

/* renamed from: X.UvF, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78737UvF extends QXX {
    public static final C78737UvF LJLIL = new C78737UvF();

    public final String toString() {
        return "fit_xy";
    }

    @Override // X.QXX
    public final void LLJILJIL(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        matrix.setScale(f / f3, f2 / f4);
        matrix.postTranslate(f5, f6);
    }
}
