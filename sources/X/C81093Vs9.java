package X;

import android.graphics.Matrix;
import java.util.LinkedList;

/* renamed from: X.Vs9, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81093Vs9 {
    public static final C81095VsB LIZ = new C81095VsB();
    public static final C81096VsC LIZIZ = new C81096VsC();

    public static Matrix LIZJ() {
        return LIZ.LIZJ();
    }

    public static float[] LIZ(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }
        return new float[2];
    }

    public static void LIZIZ(Matrix matrix) {
        C81095VsB c81095VsB = LIZ;
        if (matrix != null) {
            if (((LinkedList) c81095VsB.LIZIZ).size() < c81095VsB.LIZ) {
                ((LinkedList) c81095VsB.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c81095VsB.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix LIZJ = LIZ.LIZJ();
        if (matrix != null) {
            LIZJ.set(matrix);
        }
        return LIZJ;
    }
}
