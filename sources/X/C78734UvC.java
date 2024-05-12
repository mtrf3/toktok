package X;

import android.graphics.Matrix;

/* renamed from: X.UvC, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78734UvC extends QXX {
    public static final C78734UvC LJLIL = new C78734UvC();

    public final String toString() {
        return "center";
    }

    @Override // X.QXX
    public final void LLJILJIL(Matrix matrix, float f, float f2, float f3, float f4, float f5, float f6) {
        float LIZ = V9Y.LIZ(1.0f);
        float round = Math.round((f - (f3 * LIZ)) * 0.5f);
        float round2 = Math.round((f2 - (f4 * LIZ)) * 0.5f);
        matrix.setScale(LIZ, LIZ);
        matrix.postTranslate(round, round2);
    }
}
