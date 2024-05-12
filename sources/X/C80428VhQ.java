package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.VhQ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80428VhQ extends AbstractC80432VhU {
    public float LIZIZ;
    public float LIZJ;

    @Override // X.AbstractC80432VhU
    public final void LIZ(Matrix matrix, Path path) {
        Matrix matrix2 = this.LIZ;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.LIZIZ, this.LIZJ);
        path.transform(matrix);
    }
}
