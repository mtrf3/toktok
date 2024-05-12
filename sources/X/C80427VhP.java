package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.VhP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80427VhP extends AbstractC80432VhU {
    public static final RectF LJII = new RectF();
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public float LJFF;
    public float LJI;

    @Override // X.AbstractC80432VhU
    public final void LIZ(Matrix matrix, Path path) {
        Matrix matrix2 = this.LIZ;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = LJII;
        rectF.set(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ);
        path.arcTo(rectF, this.LJFF, this.LJI, false);
        path.transform(matrix);
    }

    public C80427VhP(float f, float f2, float f3, float f4) {
        this.LIZIZ = f;
        this.LIZJ = f2;
        this.LIZLLL = f3;
        this.LJ = f4;
    }
}
