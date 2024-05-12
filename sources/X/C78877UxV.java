package X;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: X.UxV, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78877UxV implements TypeEvaluator<Matrix> {
    public final float[] LIZ = new float[9];
    public final float[] LIZIZ = new float[9];
    public final Matrix LIZJ = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.LIZ);
        matrix2.getValues(this.LIZIZ);
        int i = 0;
        do {
            float[] fArr = this.LIZIZ;
            float f2 = fArr[i];
            float f3 = this.LIZ[i];
            fArr[i] = C06420Na.LIZIZ(f2, f3, f, f3);
            i++;
        } while (i < 9);
        this.LIZJ.setValues(this.LIZIZ);
        return this.LIZJ;
    }
}
