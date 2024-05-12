package X;

/* loaded from: classes15.dex */
public final class VGT {
    public static void LIZ(VGU vgu) {
        float f = vgu.LIZ - 0.5f;
        float f2 = vgu.LIZIZ - 0.5f;
        float f3 = vgu.LIZJ - 0.5f;
        float f4 = vgu.LIZLLL - 0.5f;
        vgu.LIZ = f * 2.0f;
        vgu.LIZJ = f3 * 2.0f;
        vgu.LIZIZ = -(f2 * 2.0f);
        vgu.LIZLLL = -(f4 * 2.0f);
    }

    public static void LIZIZ(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr != null && fArr.length >= 8) {
            fArr[0] = f;
            fArr[1] = f4;
            fArr[2] = f3;
            fArr[3] = f4;
            fArr[4] = f;
            fArr[5] = f2;
            fArr[6] = f3;
            fArr[7] = f2;
            return;
        }
        throw new RuntimeException("data is invalid");
    }
}
