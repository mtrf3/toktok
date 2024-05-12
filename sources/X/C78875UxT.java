package X;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.UxT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78875UxT implements TypeEvaluator<Matrix> {
    public final float[] LIZ = new float[9];
    public final float[] LIZIZ = new float[9];
    public final Matrix LIZJ = new Matrix();

    @Override // android.animation.TypeEvaluator
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        Matrix startValue = matrix;
        Matrix endValue = matrix2;
        o.LJIIIZ(startValue, "startValue");
        o.LJIIIZ(endValue, "endValue");
        startValue.getValues(this.LIZ);
        endValue.getValues(this.LIZIZ);
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
