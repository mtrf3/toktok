package X;

import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GvU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43080GvU {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd-HHmmssSSS", Locale.US);
        Date time = Calendar.getInstance(TimeZone.getTimeZone("GMT+8")).getTime();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(simpleDateFormat.format(time));
        LIZ2.append(str);
        return X1D.LIZIZ(LIZ2);
    }

    public static void LIZIZ(OutputStream outputStream) {
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.close();
        } catch (Throwable th) {
            StringBuilder LIZ2 = X1D.LIZ();
            C170666ms.LIZIZ(C03090Af.LIZJ(LIZ2, "CutoutImageHelper#saveImageBitmap failed. Msg:", th, LIZ2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.File LIZJ(com.ss.android.ugc.aweme.creative.CreativeInfo r5, android.graphics.Bitmap r6, android.graphics.Bitmap.CompressFormat r7) {
        /*
            java.lang.String r0 = "creativeInfo"
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.o.LJIIIZ(r7, r0)
            r4 = 0
            if (r6 != 0) goto Le
            return r4
        Le:
            X.HEe r0 = X.C60903NvH.LJIIJJI()
            X.GpZ r0 = r0.LJJIJL()
            X.6nc r0 = r0.getPathAdapter()
            java.lang.String r2 = X.C164746dK.LIZIZ(r0, r5)
            boolean r0 = X.C1B6.LIZIZ(r2)
            if (r0 != 0) goto L27
            X.C1I0.LIZJ(r2)
        L27:
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG
            if (r7 != r0) goto L49
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = X.C78966Uyw.LJIJJLI(r2)
            r1.append(r0)
            java.lang.String r0 = ".png"
            java.lang.String r0 = LIZ(r0)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
        L43:
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            goto L62
        L49:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = X.C78966Uyw.LJIJJLI(r2)
            r1.append(r0)
            java.lang.String r0 = ".jpg"
            java.lang.String r0 = LIZ(r0)
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            goto L43
        L62:
            boolean r0 = r6.isRecycled()     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La9
            if (r0 == 0) goto L69
            goto L9f
        L69:
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La9
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La9
            r0.<init>(r3)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La9
            r1.<init>(r0)     // Catch: java.lang.Exception -> L84 java.lang.Throwable -> La9
            r0 = 80
            r6.compress(r7, r0, r1)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r1.flush()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            LIZIZ(r1)
            goto L9f
        L7f:
            r0 = move-exception
            goto Lab
        L81:
            r2 = move-exception
            r4 = r1
            goto L85
        L84:
            r2 = move-exception
        L85:
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = "CutoutImageHelper#saveImageBitmap failed. Msg:"
            r1.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = r2.getMessage()     // Catch: java.lang.Throwable -> La9
            r1.append(r0)     // Catch: java.lang.Throwable -> La9
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> La9
            X.C170666ms.LIZIZ(r0)     // Catch: java.lang.Throwable -> La9
            LIZIZ(r4)
        L9f:
            boolean r0 = r6.isRecycled()
            if (r0 != 0) goto La8
            r6.recycle()
        La8:
            return r3
        La9:
            r0 = move-exception
            r1 = r4
        Lab:
            LIZIZ(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43080GvU.LIZJ(com.ss.android.ugc.aweme.creative.CreativeInfo, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat):java.io.File");
    }
}
