package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* renamed from: X.Vrx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81081Vrx {
    public static final C81084Vs0 LIZ = new C81084Vs0();
    public static final C81085Vs1 LIZIZ = new C81085Vs1();

    public static Matrix LIZLLL() {
        Matrix LIZJ = LIZ.LIZJ();
        if (LIZJ == null) {
            return new Matrix();
        }
        return LIZJ;
    }

    public static RectF LJI() {
        RectF LIZJ = LIZIZ.LIZJ();
        if (LIZJ == null) {
            return new RectF();
        }
        return LIZJ;
    }

    public static float[] LIZIZ(Matrix matrix) {
        if (matrix != null) {
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }
        return new float[2];
    }

    public static void LIZJ(Matrix matrix) {
        o.LJIIIZ(matrix, "matrix");
        C81084Vs0 c81084Vs0 = LIZ;
        if (((LinkedList) c81084Vs0.LIZIZ).size() < c81084Vs0.LIZ) {
            ((LinkedList) c81084Vs0.LIZIZ).offer(matrix);
        }
    }

    public static Matrix LJ(Matrix matrix) {
        Matrix LIZJ = LIZ.LIZJ();
        if (LIZJ == null) {
            LIZJ = new Matrix();
        }
        if (matrix != null) {
            LIZJ.set(matrix);
        }
        return LIZJ;
    }

    public static void LJFF(RectF rectF) {
        C81085Vs1 c81085Vs1 = LIZIZ;
        if (((LinkedList) c81085Vs1.LIZIZ).size() < c81085Vs1.LIZ) {
            ((LinkedList) c81085Vs1.LIZIZ).offer(rectF);
        }
    }

    public static RectF LJII(float f, float f2) {
        RectF LIZJ = LIZIZ.LIZJ();
        if (LIZJ == null) {
            LIZJ = new RectF();
        }
        LIZJ.set(0.0f, 0.0f, f, f2);
        return LIZJ;
    }

    public static float LIZ(float f, float f2, float f3, float f4) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        return (float) Math.sqrt((f6 * f6) + (f5 * f5));
    }
}
