package X;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.Vok, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80882Vok extends Property<C80881Voj, Float> {
    public C80882Vok(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final Float get(C80881Voj c80881Voj) {
        return Float.valueOf(c80881Voj.LJIIIIZZ);
    }

    @Override // android.util.Property
    public final void set(C80881Voj c80881Voj, Float f) {
        C80881Voj c80881Voj2 = c80881Voj;
        float floatValue = f.floatValue();
        c80881Voj2.LJIIIIZZ = floatValue;
        int i = (int) (5400.0f * floatValue);
        float[] fArr = (float[]) c80881Voj2.LIZIZ;
        float f2 = floatValue * 1520.0f;
        fArr[0] = (-20.0f) + f2;
        fArr[1] = f2;
        int i2 = 0;
        do {
            float f3 = 667;
            float[] fArr2 = (float[]) c80881Voj2.LIZIZ;
            fArr2[1] = (c80881Voj2.LJFF.getInterpolation((i - C80881Voj.LJIIJJI[i2]) / f3) * 250.0f) + fArr2[1];
            float[] fArr3 = (float[]) c80881Voj2.LIZIZ;
            fArr3[0] = (c80881Voj2.LJFF.getInterpolation((i - C80881Voj.LJIIL[i2]) / f3) * 250.0f) + fArr3[0];
            i2++;
        } while (i2 < 4);
        float[] fArr4 = (float[]) c80881Voj2.LIZIZ;
        float f4 = fArr4[0];
        float f5 = fArr4[1];
        float f6 = ((f5 - f4) * c80881Voj2.LJIIIZ) + f4;
        fArr4[0] = f6;
        fArr4[0] = f6 / 360.0f;
        fArr4[1] = f5 / 360.0f;
        int i3 = 0;
        while (true) {
            float f7 = (i - C80881Voj.LJIILIIL[i3]) / 333;
            if (f7 >= 0.0f && f7 <= 1.0f) {
                int i4 = i3 + c80881Voj2.LJII;
                int[] iArr = c80881Voj2.LJI.LIZJ;
                int length = i4 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                ((int[]) c80881Voj2.LIZJ)[0] = C80390Vgo.LIZ(c80881Voj2.LJFF.getInterpolation(f7), Integer.valueOf(C78966Uyw.LJIILJJIL(iArr[length], ((AbstractC80872Voa) c80881Voj2.LIZ).LJLL)), Integer.valueOf(C78966Uyw.LJIILJJIL(c80881Voj2.LJI.LIZJ[length2], ((AbstractC80872Voa) c80881Voj2.LIZ).LJLL))).intValue();
                break;
            }
            i3++;
            if (i3 >= 4) {
                break;
            }
        }
        ((Drawable) c80881Voj2.LIZ).invalidateSelf();
    }
}
