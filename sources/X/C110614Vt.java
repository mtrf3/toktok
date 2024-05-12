package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import kotlin.jvm.internal.o;

/* renamed from: X.4Vt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110614Vt {
    public Integer LIZ;
    public Integer LIZIZ;
    public Float LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Float LJIIIIZZ;
    public Float LJIIIZ;
    public Float LJIIJ;
    public Float LJIIJJI;
    public int LJI = -1;
    public int LJII = -1;
    public final boolean LJIIL = true;

    public final Drawable LIZ(Context ctx) {
        float f;
        float f2;
        float f3;
        float[] fArr;
        o.LJIIIZ(ctx, "ctx");
        GradientDrawable gradientDrawable = new GradientDrawable();
        Integer num = this.LIZIZ;
        if (num != null) {
            Integer LJI = C79045V0n.LJI(num.intValue(), ctx);
            if (LJI != null) {
                gradientDrawable.setColor(LJI.intValue());
            }
        } else {
            Integer num2 = this.LIZ;
            if (num2 != null) {
                gradientDrawable.setColor(num2.intValue());
            }
        }
        Integer num3 = this.LIZLLL;
        if (num3 != null) {
            int intValue = num3.intValue();
            Integer num4 = this.LJFF;
            if (num4 != null) {
                Integer LJI2 = C79045V0n.LJI(num4.intValue(), ctx);
                if (LJI2 != null) {
                    gradientDrawable.setStroke(intValue, LJI2.intValue());
                }
            } else {
                Integer num5 = this.LJ;
                if (num5 != null) {
                    gradientDrawable.setStroke(intValue, num5.intValue());
                }
            }
        }
        Float f4 = this.LIZJ;
        if (f4 != null) {
            gradientDrawable.setCornerRadius(f4.floatValue());
        }
        Float f5 = this.LJIIIIZZ;
        if (f5 != null || this.LJIIIZ != null || this.LJIIJ != null || this.LJIIJJI != null) {
            float f6 = 0.0f;
            if (f5 != null) {
                f = f5.floatValue();
            } else {
                f = 0.0f;
            }
            Float f7 = this.LJIIIZ;
            if (f7 != null) {
                f2 = f7.floatValue();
            } else {
                f2 = 0.0f;
            }
            Float f8 = this.LJIIJJI;
            if (f8 != null) {
                f3 = f8.floatValue();
            } else {
                f3 = 0.0f;
            }
            Float f9 = this.LJIIJ;
            if (f9 != null) {
                f6 = f9.floatValue();
            }
            if (this.LJIIL && C26338AVi.LIZJ(ctx)) {
                fArr = new float[]{f2, f2, f, f, f6, f6, f3, f3};
            } else {
                fArr = new float[]{f, f, f2, f2, f3, f3, f6, f6};
            }
            gradientDrawable.setCornerRadii(fArr);
        }
        int i = this.LJII;
        if (i >= 0 || this.LJI >= 0) {
            gradientDrawable.setSize(i, this.LJI);
        }
        return gradientDrawable;
    }
}
