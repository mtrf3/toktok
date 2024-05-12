package X;

import android.graphics.Matrix;
import java.util.LinkedList;

/* renamed from: X.VsG, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81100VsG {
    public static final C81102VsI LIZ = new C81102VsI();
    public static final C81103VsJ LIZIZ = new C81103VsJ();

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
        C81102VsI c81102VsI = LIZ;
        if (matrix != null) {
            if (((LinkedList) c81102VsI.LIZIZ).size() < c81102VsI.LIZ) {
                ((LinkedList) c81102VsI.LIZIZ).offer(matrix);
                return;
            }
            return;
        }
        c81102VsI.getClass();
    }

    public static Matrix LIZLLL(Matrix matrix) {
        Matrix LIZJ = LIZ.LIZJ();
        if (matrix != null) {
            LIZJ.set(matrix);
        }
        return LIZJ;
    }
}
