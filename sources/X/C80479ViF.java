package X;

import android.graphics.Matrix;

/* renamed from: X.ViF, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80479ViF extends C80480ViG {
    public final /* synthetic */ C80475ViB LIZLLL;

    public C80479ViF(C80475ViB c80475ViB) {
        this.LIZLLL = c80475ViB;
    }

    @Override // android.animation.TypeEvaluator
    public final Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        this.LIZLLL.LJIIL = f;
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
