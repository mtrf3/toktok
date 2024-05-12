package X;

import android.graphics.drawable.Drawable;
import android.util.Property;

/* renamed from: X.Voo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80886Voo extends Property<C80883Vol, Float> {
    public C80886Voo(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final Float get(C80883Vol c80883Vol) {
        return Float.valueOf(c80883Vol.LJIIIIZZ);
    }

    @Override // android.util.Property
    public final void set(C80883Vol c80883Vol, Float f) {
        C80883Vol c80883Vol2 = c80883Vol;
        c80883Vol2.LJIIIIZZ = f.floatValue();
        float[] fArr = (float[]) c80883Vol2.LIZIZ;
        fArr[0] = 0.0f;
        float f2 = ((int) (r1 * 333.0f)) / 667;
        float interpolation = c80883Vol2.LJ.getInterpolation(f2);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = (float[]) c80883Vol2.LIZIZ;
        float interpolation2 = c80883Vol2.LJ.getInterpolation(f2 + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        float[] fArr3 = (float[]) c80883Vol2.LIZIZ;
        fArr3[5] = 1.0f;
        if (c80883Vol2.LJII && fArr3[3] < 1.0f) {
            int[] iArr = (int[]) c80883Vol2.LIZJ;
            iArr[2] = iArr[1];
            iArr[1] = iArr[0];
            iArr[0] = C78966Uyw.LJIILJJIL(c80883Vol2.LJFF.LIZJ[c80883Vol2.LJI], ((AbstractC80872Voa) c80883Vol2.LIZ).LJLL);
            c80883Vol2.LJII = false;
        }
        ((Drawable) c80883Vol2.LIZ).invalidateSelf();
    }
}
