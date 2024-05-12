package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes15.dex */
public abstract class W8W implements W95 {
    public static final Class<?> LIZJ = W8W.class;
    public static final byte[] LIZLLL = {-1, -39};
    public final WB5 LIZ;
    public final C43051mX<ByteBuffer> LIZIZ;

    public abstract int LIZJ(int i, int i2, BitmapFactory.Options options);

    public static BitmapFactory.Options LIZLLL(W8X w8x, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = w8x.LJLJLJ;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(w8x.LJFF(), null, options);
        if (options.outWidth != -1 && options.outHeight != -1) {
            options.inJustDecodeBounds = false;
            options.inDither = true;
            options.inPreferredConfig = config;
            options.inMutable = true;
            return options;
        }
        throw new IllegalArgumentException(C81792W8e.LIZIZ(w8x));
    }

    public W8W(WB5 wb5, int i, C43051mX c43051mX) {
        this.LIZ = wb5;
        this.LIZIZ = c43051mX;
        for (int i2 = 0; i2 < i; i2++) {
            this.LIZIZ.LIZ(ByteBuffer.allocate(16384));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:14|15|16|(8:31|32|33|34|35|(2:37|38)|21|(2:23|24)(2:26|27))|18|19|20|21|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008c, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81392Vwy<android.graphics.Bitmap> LIZIZ(java.io.InputStream r16, android.graphics.BitmapFactory.Options r17, android.graphics.Rect r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8W.LIZIZ(java.io.InputStream, android.graphics.BitmapFactory$Options, android.graphics.Rect, boolean):X.Vwy");
    }

    @Override // X.W95
    public final C81392Vwy<Bitmap> decodeFromEncodedImageWithColorSpace(W8X w8x, Bitmap.Config config, Rect rect, boolean z) {
        boolean z2;
        BitmapFactory.Options LIZLLL2 = LIZLLL(w8x, config);
        if (LIZLLL2.inPreferredConfig != Bitmap.Config.ARGB_8888) {
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            return LIZIZ(w8x.LJFF(), LIZLLL2, rect, z);
        } catch (RuntimeException e) {
            if (z2) {
                return decodeFromEncodedImageWithColorSpace(w8x, Bitmap.Config.ARGB_8888, rect, z);
            }
            throw e;
        }
    }

    public Bitmap LIZ(InputStream inputStream, BitmapFactory.Options options, int i, int i2, Bitmap bitmap) {
        return BitmapFactory.decodeStream(inputStream, null, options);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006e  */
    @Override // X.W95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C81392Vwy<android.graphics.Bitmap> decodeJPEGFromEncodedImageWithColorSpace(X.W8X r6, android.graphics.Bitmap.Config r7, android.graphics.Rect r8, int r9, boolean r10) {
        /*
            r5 = this;
            X.W9o r1 = r6.LJLJI
            X.W9o r3 = X.C81796W8i.LIZ
            r4 = 1
            if (r1 == r3) goto L38
            X.W9o r0 = X.C81796W8i.LJIIIZ
            if (r1 == r0) goto L38
            X.W9o r0 = X.C81796W8i.LJIIJJI
            if (r1 == r0) goto L38
        Lf:
            r1 = 1
        L10:
            android.graphics.BitmapFactory$Options r3 = LIZLLL(r6, r7)
            java.io.InputStream r2 = r6.LJFF()
            r2.getClass()
            int r0 = r6.LJI()
            if (r0 <= r9) goto L27
            X.P9V r0 = new X.P9V
            r0.<init>(r2, r9)
            r2 = r0
        L27:
            if (r1 != 0) goto L31
            X.P9W r1 = new X.P9W
            byte[] r0 = X.W8W.LIZLLL
            r1.<init>(r2, r0)
            r2 = r1
        L31:
            android.graphics.Bitmap$Config r1 = r3.inPreferredConfig
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            if (r1 == r0) goto L6e
            goto L6f
        L38:
            X.W4P<java.io.FileInputStream> r0 = r6.LJLILLLLZI
            if (r0 == 0) goto L3d
            goto Lf
        L3d:
            X.Vwy<X.Vwk> r0 = r6.LJLIL
            r0.getClass()
            java.lang.Object r2 = r0.LJI()
            X.Vwk r2 = (X.InterfaceC81378Vwk) r2
            X.W9o r1 = r6.LJLJI
            if (r1 != r3) goto L60
            int r0 = r9 + (-2)
            byte r1 = r2.read(r0)
            r0 = -1
            if (r1 != r0) goto L6c
            int r0 = r9 + (-1)
            byte r1 = r2.read(r0)
            r0 = -39
            if (r1 != r0) goto L6c
            goto Lf
        L60:
            X.W9o r0 = X.C81796W8i.LJIIIZ
            if (r1 != r0) goto Lf
            int r1 = r6.LJLLILLLL
            if (r1 == 0) goto Lf
            r0 = 3
            if (r1 != r0) goto L6c
            goto Lf
        L6c:
            r1 = 0
            goto L10
        L6e:
            r4 = 0
        L6f:
            X.Vwy r0 = r5.LIZIZ(r2, r3, r8, r10)     // Catch: java.lang.RuntimeException -> L74
            return r0
        L74:
            r0 = move-exception
            if (r4 == 0) goto L7e
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            X.Vwy r0 = r5.decodeJPEGFromEncodedImageWithColorSpace(r6, r7, r8, r9, r10)
            return r0
        L7e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W8W.decodeJPEGFromEncodedImageWithColorSpace(X.W8X, android.graphics.Bitmap$Config, android.graphics.Rect, int, boolean):X.Vwy");
    }
}
