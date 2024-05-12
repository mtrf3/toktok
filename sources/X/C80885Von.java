package X;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.Arrays;

/* renamed from: X.Von, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C80885Von extends Property<C80884Vom, Float> {
    public C80885Von(Class cls) {
        super(cls, "animationFraction");
    }

    @Override // android.util.Property
    public final Float get(C80884Vom c80884Vom) {
        return Float.valueOf(c80884Vom.LJIIIIZZ);
    }

    @Override // android.util.Property
    public final void set(C80884Vom c80884Vom, Float f) {
        C80884Vom c80884Vom2 = c80884Vom;
        float floatValue = f.floatValue();
        c80884Vom2.LJIIIIZZ = floatValue;
        int i = (int) (floatValue * 1800.0f);
        int i2 = 0;
        do {
            ((float[]) c80884Vom2.LIZIZ)[i2] = Math.max(0.0f, Math.min(1.0f, c80884Vom2.LJ[i2].getInterpolation((i - C80884Vom.LJIIL[i2]) / C80884Vom.LJIIJJI[i2])));
            i2++;
        } while (i2 < 4);
        if (c80884Vom2.LJII) {
            Arrays.fill((int[]) c80884Vom2.LIZJ, C78966Uyw.LJIILJJIL(c80884Vom2.LJFF.LIZJ[c80884Vom2.LJI], ((AbstractC80872Voa) c80884Vom2.LIZ).LJLL));
            c80884Vom2.LJII = false;
        }
        ((Drawable) c80884Vom2.LIZ).invalidateSelf();
    }
}
