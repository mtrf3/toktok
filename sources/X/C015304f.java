package X;

import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.04f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C015304f<T> {
    public final InterfaceC88471Ynr<T, Matrix, C76800UCe> LIZ;
    public Matrix LIZIZ;
    public Matrix LIZJ;
    public float[] LIZLLL;
    public float[] LJ;
    public boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final void LIZJ() {
        this.LJFF = true;
        this.LJI = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C015304f(InterfaceC88471Ynr<? super T, ? super Matrix, C76800UCe> getMatrix) {
        o.LJIIIZ(getMatrix, "getMatrix");
        this.LIZ = getMatrix;
        this.LJFF = true;
        this.LJI = true;
        this.LJII = true;
    }

    public final float[] LIZ(T t) {
        float[] fArr = this.LJ;
        if (fArr == null) {
            fArr = C11520cm.LIZ();
            this.LJ = fArr;
        }
        if (this.LJI) {
            this.LJII = C79146V4k.LJJIZ(LIZIZ(t), fArr);
            this.LJI = false;
        }
        if (this.LJII) {
            return fArr;
        }
        return null;
    }

    public final float[] LIZIZ(T t) {
        float[] fArr = this.LIZLLL;
        if (fArr == null) {
            fArr = C11520cm.LIZ();
            this.LIZLLL = fArr;
        }
        if (!this.LJFF) {
            return fArr;
        }
        Matrix matrix = this.LIZIZ;
        if (matrix == null) {
            matrix = new Matrix();
            this.LIZIZ = matrix;
        }
        this.LIZ.invoke(t, matrix);
        Matrix matrix2 = this.LIZJ;
        if (matrix2 == null || !o.LJ(matrix, matrix2)) {
            C46104I7o.LJJJ(matrix, fArr);
            this.LIZIZ = matrix2;
            this.LIZJ = matrix;
        }
        this.LJFF = false;
        return fArr;
    }
}
