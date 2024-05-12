package X;

import android.graphics.drawable.GradientDrawable;

/* renamed from: X.aWV, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C93787aWV {
    public static C93788aWW LIZ(float f, float f2, float f3, float f4, int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.mutate();
        gradientDrawable2.setColor(i2);
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadii(new float[]{f, f, f2, f2, f4, f4, f3, f3});
        return new C93788aWW(gradientDrawable, gradientDrawable2);
    }
}
