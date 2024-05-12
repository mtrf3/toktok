package X;

import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.RectShape;
import kotlin.jvm.internal.o;

/* renamed from: X.949, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass949 {
    public static final PointF LIZ = new PointF();
    public static final PointF LIZIZ = new PointF();
    public static Drawable LIZJ;

    public static Drawable LIZ(float f, int i) {
        if (LIZJ == null) {
            PointF pointF = LIZ;
            pointF.x = 0.42f;
            pointF.y = 0.0f;
            PointF pointF2 = LIZIZ;
            pointF2.x = 0.58f;
            pointF2.y = 1.0f;
            PaintDrawable paintDrawable = new PaintDrawable();
            paintDrawable.setShape(new RectShape());
            int[] iArr = new int[4096];
            int i2 = 0;
            do {
                float f2 = (i2 * 1.0f) / 4095;
                float f3 = 1 - f2;
                float f4 = f2 * f2;
                float f5 = f3 * f3;
                float f6 = 3;
                iArr[i2] = (((int) Math.ceil(255 * C1I1.LIZ(f4 * f2, r9, (((f6 * f3) * f4) * LIZIZ.y) + ((((f5 * f6) * f2) * LIZ.y) + ((f5 * f3) * 0)), f))) << 24) & i;
                i2++;
            } while (i2 < 4096);
            paintDrawable.setShaderFactory(new DI2(iArr));
            LIZJ = paintDrawable;
        }
        Drawable drawable = LIZJ;
        if (drawable != null) {
            return drawable;
        }
        o.LJIJI("drawableStore");
        throw null;
    }
}
