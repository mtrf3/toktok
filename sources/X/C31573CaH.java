package X;

import android.graphics.Bitmap;
import kotlin.jvm.internal.o;

/* renamed from: X.CaH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31573CaH {
    public static Bitmap LIZ(Bitmap bitmap, float f) {
        float f2;
        int i;
        o.LJIIIZ(bitmap, "bitmap");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < 100 || height < 100) {
            f2 = 0.6f;
        } else if (width < 200 || height < 200) {
            f2 = 0.3f;
        } else {
            f2 = 0.1f;
        }
        int round = Math.round(width * f2);
        int round2 = Math.round(height * f2);
        boolean z = false;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, round, round2, false);
        if (f == 0.0f) {
            z = true;
        }
        if (!z) {
            float f3 = round;
            float f4 = round2;
            if (Math.abs((f3 / f4) - 5) > 0.2f) {
                int i2 = (int) (f3 / f);
                if (i2 > round2) {
                    i = (int) (f4 * f);
                    i2 = round2;
                } else {
                    i = round;
                }
                Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap, (round - i) >> 1, (round2 - i2) >> 1, i, i2);
                createScaledBitmap.recycle();
                createScaledBitmap = createBitmap;
                round2 = i2;
                round = i;
            }
        }
        Bitmap createBitmap2 = Bitmap.createBitmap(round, round2, Bitmap.Config.ARGB_8888);
        C61673OIj.LIZ(createScaledBitmap, createBitmap2, 5);
        createScaledBitmap.recycle();
        return createBitmap2;
    }
}
