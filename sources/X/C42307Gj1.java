package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Rect;

/* renamed from: X.Gj1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42307Gj1 {
    public static int LIZIZ(String str) {
        if (!C44687HgJ.LIZIZ(str)) {
            return 0;
        }
        try {
            int attributeInt = C44694HgQ.LJIIIZ(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return 180;
            }
            if (attributeInt != 6) {
                if (attributeInt != 8) {
                    return 0;
                }
                return 270;
            }
            return 90;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return 0;
        }
    }

    public static int[] LIZJ(String str) {
        if (!C44687HgJ.LIZIZ(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(str, options);
        int i = options.outWidth;
        int i2 = options.outHeight;
        int[] iArr = {i, i2};
        if (i == 0 || i2 == 0) {
            return null;
        }
        return iArr;
    }

    public static void LIZLLL(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static Bitmap LIZ(String str, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i3 = 1;
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(str, options);
        if (i != 0 && i2 != 0) {
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            if (i4 > i || i5 > i2) {
                int i6 = i4 >> 1;
                int i7 = i5 >> 1;
                while (i6 / i3 > i && i7 / i3 > i2 && (i3 = i3 << 1) != 0) {
                }
            }
        }
        options.inSampleSize = i3;
        options.inJustDecodeBounds = false;
        return C44694HgQ.LIZLLL(str, options);
    }

    public static Bitmap LJII(int i, int i2, Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f4 = 0.0f;
        if (i > i2) {
            float f5 = (i * 1.0f) / i2;
            float f6 = width / f5;
            if (height > f6) {
                f = (height - f6) / 2.0f;
                height = f6;
            } else {
                f3 = f5 * height;
                f2 = (width - f3) / 2.0f;
                f4 = f2;
                width = f3;
                f = 0.0f;
            }
        } else if (i < i2) {
            float f7 = (i2 * 1.0f) / i;
            f3 = height / f7;
            if (width > f3) {
                f2 = (width - f3) / 2.0f;
                f4 = f2;
                width = f3;
                f = 0.0f;
            } else {
                float f8 = f7 * width;
                f = (height - f8) / 2.0f;
                height = f8;
            }
        } else if (width > height) {
            f2 = (width - height) / 2.0f;
            f3 = height;
            f4 = f2;
            width = f3;
            f = 0.0f;
        } else {
            f = (height - width) / 2.0f;
            height = width;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Rect rect = new Rect((int) f4, (int) f, (int) (f4 + width), (int) (f + height));
        Rect rect2 = new Rect(0, 0, i, i2);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawBitmap(bitmap, rect, rect2, paint);
        LIZLLL(bitmap);
        return createBitmap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002d, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJ(android.graphics.Bitmap r4, java.io.File r5, int r6, android.graphics.Bitmap.CompressFormat r7) {
        /*
            r3 = 0
            r2 = 0
            boolean r0 = r4.isRecycled()     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            if (r0 == 0) goto L9
            return r3
        L9:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r0.<init>(r5)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r1.<init>(r0)     // Catch: java.lang.Exception -> L23 java.lang.Throwable -> L28
            r4.compress(r7, r6, r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.flush()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.close()     // Catch: java.lang.Throwable -> L1c
        L1c:
            r3 = 1
            goto L33
        L1e:
            r0 = move-exception
            goto L2d
        L20:
            r0 = move-exception
            r2 = r1
            goto L24
        L23:
            r0 = move-exception
        L24:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L28
            goto L31
        L28:
            r0 = move-exception
            r1 = r2
            if (r2 != 0) goto L2d
        L2c:
            throw r0
        L2d:
            r1.close()     // Catch: java.lang.Throwable -> L2c
            goto L2c
        L31:
            if (r2 != 0) goto L34
        L33:
            return r3
        L34:
            r2.close()     // Catch: java.lang.Throwable -> L33
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42307Gj1.LJ(android.graphics.Bitmap, java.io.File, int, android.graphics.Bitmap$CompressFormat):boolean");
    }

    public static Bitmap LJFF(int i, int i2, int i3, int i4, String str) {
        try {
            Bitmap LIZ = LIZ(str, i, i2);
            if (LIZ == null) {
                return null;
            }
            return LJI(LIZ, i, i2, i3, i4);
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
    
        if (r11 < r9) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c0, code lost:
    
        if (r11 < r9) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LJI(android.graphics.Bitmap r13, int r14, int r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42307Gj1.LJI(android.graphics.Bitmap, int, int, int, int):android.graphics.Bitmap");
    }
}
