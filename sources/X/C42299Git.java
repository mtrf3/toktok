package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* renamed from: X.Git, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42299Git {
    public static int[] LIZJ(String str) {
        if (!C44687HgJ.LIZIZ(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        C44694HgQ.LIZLLL(str, options);
        return new int[]{options.outWidth, options.outHeight};
    }

    public static void LJ(Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
    }

    public static Bitmap LIZ(String str, int[] iArr) {
        return LIZIZ(str, iArr, Bitmap.Config.RGB_565);
    }

    public static Bitmap LIZLLL(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap.isRecycled()) {
            return bitmap2;
        }
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return bitmap;
        }
        Paint paint = new Paint(2);
        Bitmap copy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
        new Canvas(copy).drawBitmap(bitmap2, new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight()), new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), paint);
        return copy;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0025, code lost:
    
        if (r3 <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap LIZIZ(java.lang.String r6, int[] r7, android.graphics.Bitmap.Config r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            android.graphics.BitmapFactory$Options r5 = new android.graphics.BitmapFactory$Options
            r5.<init>()
            r4 = 1
            r5.inJustDecodeBounds = r4
            r5.inPreferredConfig = r8
            X.C44694HgQ.LIZLLL(r6, r5)
            r0 = 0
            r5.inJustDecodeBounds = r0
            int r3 = r5.outWidth
            int r2 = r5.outHeight
            r1 = r7[r0]
            r0 = r7[r4]
            if (r3 < r2) goto L2e
            if (r3 <= r1) goto L2e
            int r3 = r3 / r1
        L25:
            if (r3 > 0) goto L36
        L27:
            r5.inSampleSize = r4
            android.graphics.Bitmap r0 = X.C44694HgQ.LIZLLL(r6, r5)
            return r0
        L2e:
            if (r3 >= r2) goto L35
            if (r2 <= r0) goto L35
            int r3 = r2 / r0
            goto L25
        L35:
            r3 = 1
        L36:
            r4 = r3
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42299Git.LIZIZ(java.lang.String, int[], android.graphics.Bitmap$Config):android.graphics.Bitmap");
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
    public static boolean LJFF(android.graphics.Bitmap r4, java.io.File r5, int r6, android.graphics.Bitmap.CompressFormat r7) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C42299Git.LJFF(android.graphics.Bitmap, java.io.File, int, android.graphics.Bitmap$CompressFormat):boolean");
    }
}
