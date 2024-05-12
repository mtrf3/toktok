package X;

import android.graphics.Matrix;
import kotlin.jvm.internal.o;

/* renamed from: X.Vtr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81199Vtr {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(Matrix matrix) {
        o.LJIIIZ(matrix, "matrix");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[0];
    }
}
