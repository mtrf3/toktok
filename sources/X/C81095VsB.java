package X;

import android.graphics.Matrix;

/* renamed from: X.VsB, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81095VsB extends AbstractC81094VsA<Matrix> {
    @Override // X.AbstractC81094VsA
    public final Matrix LIZ() {
        return new Matrix();
    }

    @Override // X.AbstractC81094VsA
    public final Matrix LIZIZ(Matrix matrix) {
        Matrix matrix2 = matrix;
        if (matrix2 == null) {
            return new Matrix();
        }
        matrix2.reset();
        return matrix2;
    }
}
