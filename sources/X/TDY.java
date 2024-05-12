package X;

import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TDY {
    public static final float[] LJI = new float[0];
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public Float LJ;
    public float[] LJFF = LJI;

    public final GradientDrawable LIZ() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.LIZ;
        if (num != null) {
            gradientDrawable.setShape(num.intValue());
        }
        Integer num2 = this.LIZIZ;
        if (num2 != null) {
            gradientDrawable.setColor(num2.intValue());
        }
        Integer num3 = this.LIZJ;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.LIZLLL;
            o.LJI(num4);
            gradientDrawable.setStroke(num4.intValue(), intValue);
        }
        Float f = this.LJ;
        if (f != null) {
            gradientDrawable.setCornerRadius(f.floatValue());
        }
        float[] fArr = this.LJFF;
        if (fArr != LJI) {
            gradientDrawable.setCornerRadii(fArr);
        }
        return gradientDrawable;
    }

    public final void LIZIZ(int i) {
        this.LIZIZ = Integer.valueOf(i);
    }

    public final void LIZJ(float f) {
        this.LJ = Float.valueOf(f);
    }

    public final void LIZLLL(int i) {
        this.LIZ = Integer.valueOf(i);
    }

    public final void LJ(int i, int i2) {
        this.LIZJ = Integer.valueOf(i);
        this.LIZLLL = Integer.valueOf(i2);
    }
}
