package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.ss.android.vesdk.VEUtils;

/* renamed from: X.5fS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140585fS {
    public static Bitmap LIZ(Bitmap bitmap, int i, int i2, int i3, int i4) {
        Bitmap bitmap2;
        Bitmap bitmap3;
        if (Math.min(i, i2) <= C00F.LIZ(31744, 0, "resolution_of_sticker_optimization_threshold", true)) {
            if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
                return bitmap;
            }
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            Matrix matrix = new Matrix();
            if (i3 > 0 && i4 > 0 && (width > i3 || height > i4)) {
                matrix.setTranslate((width - i3) * 0.5f, (height - i4) * 0.5f);
                bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix, true);
            } else {
                bitmap2 = bitmap;
            }
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            boolean resizeImageWithEffect = VEUtils.resizeImageWithEffect(bitmap2, createBitmap);
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("StickerBitmapGenerator.java -> resizeImageWithEffect.result = ");
            LIZ.append(resizeImageWithEffect);
            H7B.LIZ(X1D.LIZIZ(LIZ));
            if (!resizeImageWithEffect) {
                bitmap3 = LIZIZ(bitmap, i, i2, i3, i4);
            } else {
                bitmap3 = createBitmap;
            }
            bitmap2.recycle();
            return bitmap3;
        }
        return LIZIZ(bitmap, i, i2, i3, i4);
    }

    public static Bitmap LIZIZ(Bitmap bitmap, int i, int i2, int i3, int i4) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == i && height == i2) {
            return bitmap;
        }
        if (i3 > 0 && i4 > 0 && width > i3 && height > i4) {
            Matrix matrix = new Matrix();
            matrix.setTranslate((width - i3) * 0.5f, (height - i4) * 0.5f);
            matrix.postScale(i / i3, i2 / i4);
            return Bitmap.createBitmap(bitmap, 0, 0, i3, i4, matrix, true);
        }
        Matrix matrix2 = new Matrix();
        matrix2.postScale(i / width, i2 / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix2, true);
    }
}
