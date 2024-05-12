package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import kotlin.jvm.internal.o;

/* renamed from: X.5iF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142315iF {
    public static final Bitmap LIZ(Bitmap originalBitmap, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4, float f) {
        o.LJIIIZ(originalBitmap, "originalBitmap");
        float abs = Math.abs(pointF3.x - pointF.x);
        float abs2 = Math.abs(pointF4.x - pointF2.x);
        float abs3 = Math.abs(pointF2.y - pointF.y);
        float abs4 = Math.abs(pointF4.y - pointF3.y);
        if (abs < abs2) {
            abs = abs2;
        }
        int i = (int) abs;
        if (abs3 < abs4) {
            abs3 = abs4;
        }
        int i2 = (int) abs3;
        Bitmap croppedBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Matrix matrix = new Matrix();
        float f2 = i;
        float f3 = i2;
        matrix.setPolyToPoly(new float[]{pointF.x, pointF.y, pointF3.x, pointF3.y, pointF2.x, pointF2.y, pointF4.x, pointF4.y}, 0, new float[]{0.0f, 0.0f, f2, 0.0f, 0.0f, f3, f2, f3}, 0, 4);
        new Canvas(croppedBitmap).drawBitmap(originalBitmap, matrix, null);
        o.LJIIIIZZ(croppedBitmap, "croppedBitmap");
        Matrix matrix2 = new Matrix();
        matrix2.postRotate(f);
        Bitmap createBitmap = Bitmap.createBitmap(croppedBitmap, 0, 0, croppedBitmap.getWidth(), croppedBitmap.getHeight(), matrix2, true);
        o.LJIIIIZZ(createBitmap, "Bitmap.createBitmap(bitm…th, height, matrix, true)");
        return createBitmap;
    }
}
