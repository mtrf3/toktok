package X;

import java.util.Arrays;

/* renamed from: X.VFr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79439VFr {
    public final float[] LIZ;

    public final float LIZIZ(float f) {
        float f2 = 1.0f;
        float f3 = 1.0f;
        for (float f4 : this.LIZ) {
            f3 *= f;
            f2 += Float.valueOf(f4).floatValue() * f3;
        }
        return f2;
    }

    public C79439VFr(int i, float[] fArr) {
        float[] copyOf = Arrays.copyOf(fArr, fArr.length);
        this.LIZ = copyOf;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("new BrownDistortion:");
        LIZ.append(Arrays.toString(copyOf));
        C48284IxE.LIZ(2, i, "TR_BrownDistortion", X1D.LIZIZ(LIZ));
    }

    public final float[] LIZ(float f, float f2) {
        float LIZIZ = LIZIZ((f2 * f2) + (f * f));
        return new float[]{f * LIZIZ, LIZIZ * f2};
    }
}
