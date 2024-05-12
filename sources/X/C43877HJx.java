package X;

import android.util.Size;

/* renamed from: X.HJx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43877HJx {
    public static final int LIZ;
    public static final int LIZIZ;

    static {
        int i;
        int i2;
        Size size;
        int i3 = 720;
        int i4 = 1280;
        if (!C52531KjX.LIZ()) {
            size = new Size(720, 1280);
        } else {
            int[] LJIIIZ = C44739Hh9.LJIIIZ(false);
            if (LJIIIZ != null) {
                i2 = Math.max(720, LJIIIZ[0]);
                i = Math.max(1280, LJIIIZ[1]);
            } else {
                i = 1280;
                i2 = 720;
            }
            size = new Size(i2, i);
        }
        if (C52531KjX.LIZ()) {
            i3 = size.getWidth();
        } else if (C44739Hh9.LJIIIZ(false) != null) {
            i3 = Math.max(720, C44739Hh9.LJIIIZ(false)[0]);
        }
        LIZ = i3;
        if (C52531KjX.LIZ()) {
            i4 = size.getHeight();
        } else if (C44739Hh9.LJIIIZ(false) != null) {
            i4 = Math.max(1280, C44739Hh9.LJIIIZ(false)[1]);
        }
        LIZIZ = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: all -> 0x00c5, TryCatch #1 {all -> 0x00c5, blocks: (B:3:0x0001, B:6:0x005e, B:9:0x0028, B:11:0x003a, B:12:0x0040, B:14:0x0048, B:15:0x004d, B:19:0x0064, B:22:0x00a3, B:24:0x00a8, B:26:0x00ae, B:32:0x00c4, B:35:0x00c1, B:31:0x00bc, B:21:0x006d), top: B:2:0x0001, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae A[Catch: all -> 0x00c5, TryCatch #1 {all -> 0x00c5, blocks: (B:3:0x0001, B:6:0x005e, B:9:0x0028, B:11:0x003a, B:12:0x0040, B:14:0x0048, B:15:0x004d, B:19:0x0064, B:22:0x00a3, B:24:0x00a8, B:26:0x00ae, B:32:0x00c4, B:35:0x00c1, B:31:0x00bc, B:21:0x006d), top: B:2:0x0001, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.photo.PhotoContext LIZ(java.lang.String r8, X.HD2 r9, int r10, int r11) {
        /*
            r7 = 0
            android.app.Application r0 = X.C60903NvH.LJ     // Catch: java.lang.Throwable -> Lc5
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lc5
            android.graphics.Bitmap r6 = com.ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(r0, r8, r10, r11)     // Catch: java.lang.Throwable -> Lc5
            X.HTP r0 = X.HTP.LJLJL     // Catch: java.lang.Throwable -> Lc5
            r0.getClass()     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = " totalPss: "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lc5
            r0 = 0
            r2.append(r0)     // Catch: java.lang.Throwable -> Lc5
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lc5
            X.H7B.LIZJ(r0)     // Catch: java.lang.Throwable -> Lc5
            if (r6 != 0) goto L28
            goto L5e
        L28:
            int r3 = r6.getWidth()     // Catch: java.lang.Throwable -> Lc5
            int r0 = r6.getHeight()     // Catch: java.lang.Throwable -> Lc5
            int r1 = r6.getWidth()     // Catch: java.lang.Throwable -> Lc5
            r5 = 1
            r1 = r1 & 1
            r4 = 0
            if (r1 != r5) goto L58
            int r3 = r6.getWidth()     // Catch: java.lang.Throwable -> Lc5
            int r3 = r3 - r5
            r2 = 1
        L40:
            int r1 = r6.getHeight()     // Catch: java.lang.Throwable -> Lc5
            r1 = r1 & 1
            if (r1 != r5) goto L55
            int r0 = r6.getHeight()     // Catch: java.lang.Throwable -> Lc5
            int r0 = r0 - r5
        L4d:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r4, r4, r3, r0)     // Catch: java.lang.Throwable -> Lc5
            r6.recycle()     // Catch: java.lang.Throwable -> Lc5
            goto L5a
        L55:
            if (r2 != 0) goto L4d
            goto L64
        L58:
            r2 = 0
            goto L40
        L5a:
            r6 = r0
            if (r0 == 0) goto L5e
            goto L64
        L5e:
            java.lang.String r0 = "bitmap = null"
            X.H7B.LIZJ(r0)     // Catch: java.lang.Throwable -> Lc5
            goto Ldd
        L64:
            java.lang.String r5 = r9.LIZ()     // Catch: java.lang.Throwable -> Lc5
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc5
            r4.<init>(r5)     // Catch: java.lang.Throwable -> Lc5
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "PhotoServiceMonitor===> enter bitmap.compress "
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lbb
            X.H7B.LJ(r0)     // Catch: java.lang.Throwable -> Lbb
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> Lbb
            r0 = 100
            boolean r3 = r6.compress(r1, r0, r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.StringBuilder r2 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = "PhotoServiceMonitor===> return bitmap.compress"
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> Lbb
            r2.append(r0)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r0 = X.X1D.LIZIZ(r2)     // Catch: java.lang.Throwable -> Lbb
            X.H7B.LJ(r0)     // Catch: java.lang.Throwable -> Lbb
            r4.close()     // Catch: java.lang.Throwable -> Lc5
            if (r3 != 0) goto Lae
            java.lang.String r0 = "compress bitmap fail"
            X.H7B.LIZJ(r0)     // Catch: java.lang.Throwable -> Lc5
            goto Lba
        Lae:
            int r1 = r6.getWidth()     // Catch: java.lang.Throwable -> Lc5
            int r0 = r6.getHeight()     // Catch: java.lang.Throwable -> Lc5
            com.ss.android.ugc.aweme.photo.PhotoContext r7 = com.ss.android.ugc.aweme.photo.PhotoContext.fromUpload(r5, r1, r0)     // Catch: java.lang.Throwable -> Lc5
        Lba:
            return r7
        Lbb:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lc4
        Lc0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lc5
        Lc4:
            throw r1     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "PhotoServiceMonitor===> "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.H7B.LIZJ(r0)
        Ldd:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43877HJx.LIZ(java.lang.String, X.HD2, int, int):com.ss.android.ugc.aweme.photo.PhotoContext");
    }
}
