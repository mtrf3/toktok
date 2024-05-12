package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.8hE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C218128hE {
    public static final float[] LJFF = new float[0];
    public Integer LIZ;
    public Integer LIZIZ;
    public Integer LIZJ;
    public Integer LIZLLL;
    public final float[] LJ = LJFF;

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
            if (num4 != null) {
                gradientDrawable.setStroke(num4.intValue(), intValue);
            }
        }
        float[] fArr = this.LJ;
        if (fArr != LJFF) {
            gradientDrawable.setCornerRadii(fArr);
        }
        return gradientDrawable;
    }
}
