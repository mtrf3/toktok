package X;

import android.graphics.Matrix;

/* renamed from: X.VsI, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81102VsI extends AbstractC81101VsH<Matrix> {
    @Override // X.AbstractC81101VsH
    public final Matrix LIZ() {
        return new Matrix();
    }

    @Override // X.AbstractC81101VsH
    public final Matrix LIZIZ(Matrix matrix) {
        Matrix matrix2 = matrix;
        if (matrix2 == null) {
            return new Matrix();
        }
        matrix2.reset();
        return matrix2;
    }
}
