package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.Olz, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62875Olz implements WER {
    public static Bitmap LIZIZ(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f = width;
        if (f <= 2000.0f) {
            return bitmap;
        }
        float f2 = height;
        if (f2 <= 2000.0f) {
            return bitmap;
        }
        float max = Math.max(f / 2000.0f, f2 / 2000.0f);
        Matrix matrix = new Matrix();
        float f3 = 1.0f / max;
        matrix.setScale(f3, f3);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public final Drawable LIZ(String str) {
        String LJIIJJI = C78765Uvh.LJIIJJI(str);
        if (!C38354F3m.LJ(LJIIJJI)) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(LJIIJJI, options);
                float f = options.outWidth;
                if (f > 2000.0f) {
                    float f2 = options.outHeight;
                    if (f2 > 2000.0f) {
                        float min = Math.min(f / 2000.0f, f2 / 2000.0f);
                        float f3 = 1.0f;
                        while (true) {
                            float f4 = 2.0f * f3;
                            if (f4 <= min) {
                                f3 = f4;
                            } else {
                                options.inSampleSize = (int) f3;
                                options.inJustDecodeBounds = false;
                                return new BitmapDrawable(BitmapFactory.decodeFile(LJIIJJI, options));
                            }
                        }
                    }
                }
                return BitmapDrawable.createFromPath(LJIIJJI);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
                return null;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
