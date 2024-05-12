package ms.bd.o;

import X.C16880lQ;
import X.X1D;
import android.hardware.SensorManager;
import java.util.Arrays;
import java.util.Locale;
import ms.bd.o.b;

/* loaded from: classes7.dex */
public final class t1 extends b.a {
    @Override // ms.bd.o.b.a
    public final Object LIZIZ(long j, int i, String str, Object obj) {
        d2 LIZ = d2.LIZ(a.LIZIZ.LIZ);
        float[] fArr = new float[9];
        SensorManager.getRotationMatrix(fArr, null, LIZ.LJLJLLL, LIZ.LJLL);
        SensorManager.getOrientation(fArr, new float[3]);
        float[] fArr2 = {(float) Math.toDegrees(r6[0]), (float) Math.toDegrees(r6[1]), (float) Math.toDegrees(r6[2])};
        float[] fArr3 = LIZ.LJLJJL;
        float[] fArr4 = new float[fArr3.length + LIZ.LJLJJLL.length + LIZ.LJLJL.length + LIZ.LJLJLJ.length + 3];
        System.arraycopy(fArr3, 0, fArr4, 0, fArr3.length);
        int length = LIZ.LJLJJL.length;
        float[] fArr5 = LIZ.LJLJJLL;
        System.arraycopy(fArr5, 0, fArr4, length, fArr5.length);
        int length2 = length + LIZ.LJLJJLL.length;
        float[] fArr6 = LIZ.LJLJL;
        System.arraycopy(fArr6, 0, fArr4, length2, fArr6.length);
        int length3 = length2 + LIZ.LJLJL.length;
        float[] fArr7 = LIZ.LJLJLJ;
        System.arraycopy(fArr7, 0, fArr4, length3, fArr7.length);
        System.arraycopy(fArr2, 0, fArr4, length3 + LIZ.LJLJLJ.length, 3);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append((String) k.a(16777217, 0, 0L, "f5dad0", new byte[]{100, 50, 4, 27, 84, 53, 118, 43, 52, 61, 123, 109, 87}));
        LIZ2.append(Arrays.toString(fArr4));
        X1D.LIZIZ(LIZ2);
        C16880lQ.LLLZI(Locale.getDefault(), (String) k.a(16777217, 0, 0L, "e24e15", new byte[]{103, 53, 84, 31, 1, 48, 117, 44, 100, 57, 120, 106, 7, 21, 7, 36, 96, 83, 32, 123, 34, 54, 7, 84, 64, 116, 96, 83, 32, 123, 34, 54}), new Object[]{Float.valueOf(LIZ.LJLJLJ[0] - fArr2[0]), Float.valueOf(LIZ.LJLJLJ[1] - fArr2[1]), Float.valueOf(LIZ.LJLJLJ[2] - fArr2[2])});
        return fArr4;
    }
}
