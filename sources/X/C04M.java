package X;

/* renamed from: X.04M, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04M {
    public static final C45221q2 LIZ = C45221q2.LJLIL;

    public static final void LIZ(float[] fArr, float[] fArr2) {
        float LIZIZ = LIZIZ(fArr2, 0, fArr, 0);
        float LIZIZ2 = LIZIZ(fArr2, 0, fArr, 1);
        float LIZIZ3 = LIZIZ(fArr2, 0, fArr, 2);
        float LIZIZ4 = LIZIZ(fArr2, 0, fArr, 3);
        float LIZIZ5 = LIZIZ(fArr2, 1, fArr, 0);
        float LIZIZ6 = LIZIZ(fArr2, 1, fArr, 1);
        float LIZIZ7 = LIZIZ(fArr2, 1, fArr, 2);
        float LIZIZ8 = LIZIZ(fArr2, 1, fArr, 3);
        float LIZIZ9 = LIZIZ(fArr2, 2, fArr, 0);
        float LIZIZ10 = LIZIZ(fArr2, 2, fArr, 1);
        float LIZIZ11 = LIZIZ(fArr2, 2, fArr, 2);
        float LIZIZ12 = LIZIZ(fArr2, 2, fArr, 3);
        float LIZIZ13 = LIZIZ(fArr2, 3, fArr, 0);
        float LIZIZ14 = LIZIZ(fArr2, 3, fArr, 1);
        float LIZIZ15 = LIZIZ(fArr2, 3, fArr, 2);
        float LIZIZ16 = LIZIZ(fArr2, 3, fArr, 3);
        fArr[0] = LIZIZ;
        fArr[1] = LIZIZ2;
        fArr[2] = LIZIZ3;
        fArr[3] = LIZIZ4;
        fArr[4] = LIZIZ5;
        fArr[5] = LIZIZ6;
        fArr[6] = LIZIZ7;
        fArr[7] = LIZIZ8;
        fArr[8] = LIZIZ9;
        fArr[9] = LIZIZ10;
        fArr[10] = LIZIZ11;
        fArr[11] = LIZIZ12;
        fArr[12] = LIZIZ13;
        fArr[13] = LIZIZ14;
        fArr[14] = LIZIZ15;
        fArr[15] = LIZIZ16;
    }

    public static final float LIZIZ(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[0 + i2]);
    }
}
