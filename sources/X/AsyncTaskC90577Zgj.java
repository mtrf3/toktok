package X;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.Zgj, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class AsyncTaskC90577Zgj extends PthreadAsyncTask<Void, Void, Bitmap> {
    public final Bitmap LIZ;
    public final android.net.Uri LIZIZ;
    public int LIZJ;
    public long LIZLLL;
    public final /* synthetic */ DialogC90914ZmA LJ;

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "7075348565944959935"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.LIZLLL = SystemClock.uptimeMillis();
        DialogC90914ZmA dialogC90914ZmA = this.LJ;
        dialogC90914ZmA.LLILZ = false;
        dialogC90914ZmA.LLILZIL = null;
        dialogC90914ZmA.LLILZLL = 0;
    }

    public AsyncTaskC90577Zgj(DialogC90914ZmA dialogC90914ZmA) {
        Bitmap bitmap;
        this.LJ = dialogC90914ZmA;
        MediaDescriptionCompat mediaDescriptionCompat = dialogC90914ZmA.LLILL;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.mIcon;
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap = null;
            }
        }
        this.LIZ = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dialogC90914ZmA.LLILL;
        this.LIZIZ = mediaDescriptionCompat2 != null ? mediaDescriptionCompat2.mIconUri : null;
    }

    public final InputStream LIZIZ(android.net.Uri uri) {
        InputStream openInputStream;
        URLConnection LIZ;
        URLConnection LIZ2;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        String lowerCase = uri.getScheme().toLowerCase();
        if ("android.resource".equals(lowerCase) || "content".equals(lowerCase) || "file".equals(lowerCase)) {
            openInputStream = this.LJ.LJLJL.getContentResolver().openInputStream(uri);
        } else {
            java.net.URL url = new java.net.URL(uri.toString());
            if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
                LIZ = LIZ(url);
            } else {
                PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
                PPD ppd = LJFF.LJFF;
                if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
                    LIZ = uRLConnection;
                    if (LIZ instanceof HttpsURLConnection) {
                        LIZ2 = new PYT((HttpsURLConnection) LIZ);
                    } else if (LIZ instanceof HttpURLConnection) {
                        LIZ2 = new PYU((HttpURLConnection) LIZ);
                    }
                    LIZ = LIZ2;
                } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                    LIZ2 = LIZ(url);
                    if (LIZ2 instanceof HttpsURLConnection) {
                        LIZ = new PYT((HttpsURLConnection) LIZ2);
                    } else {
                        if (LIZ2 instanceof HttpURLConnection) {
                            LIZ = new PYU((HttpURLConnection) LIZ2);
                        }
                        LIZ = LIZ2;
                    }
                } else {
                    throw runtimeException;
                }
            }
            int i = DialogC90914ZmA.LLJJIJIL;
            LIZ.setConnectTimeout(i);
            LIZ.setReadTimeout(i);
            openInputStream = LIZ.getInputStream();
        }
        if (openInputStream == null) {
            return null;
        }
        return new BufferedInputStream(openInputStream);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012 A[ORIG_RETURN, RETURN] */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doInBackground(java.lang.Object[] r11) {
        /*
            r10 = this;
            android.graphics.Bitmap r0 = r10.LIZ
            r5 = 0
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L4b
        L7:
            if (r0 == 0) goto L49
            boolean r1 = r0.isRecycled()
            if (r1 == 0) goto L49
            r1 = 1
        L10:
            if (r1 == 0) goto L13
        L12:
            return r3
        L13:
            if (r0 == 0) goto L38
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            if (r2 >= r1) goto L38
            X.Zg3 r1 = new X.Zg3
            r1.<init>(r0)
            r1.LIZJ = r4
            X.Zg6 r2 = r1.LIZ()
            java.util.List<X.Zg5> r1 = r2.LIZ
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3a
        L36:
            r10.LIZJ = r5
        L38:
            r3 = r0
            goto L12
        L3a:
            java.util.List<X.Zg5> r1 = r2.LIZ
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.Object r1 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r5)
            X.Zg5 r1 = (X.C90537Zg5) r1
            int r5 = r1.LIZLLL
            goto L36
        L49:
            r1 = 0
            goto L10
        L4b:
            android.net.Uri r0 = r10.LIZIZ
            if (r0 == 0) goto Lbd
            java.io.InputStream r2 = r10.LIZIZ(r0)     // Catch: java.io.IOException -> Lb7 java.lang.Throwable -> Lc3
            if (r2 != 0) goto L56
            goto L12
        L56:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r6.<init>()     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r6.inJustDecodeBounds = r4     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            android.graphics.BitmapFactory.decodeStream(r2, r3, r6)     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            int r0 = r6.outWidth     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            if (r0 == 0) goto Lb2
            int r0 = r6.outHeight     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            if (r0 != 0) goto L69
            goto Lb2
        L69:
            r2.reset()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> Lc0
            goto L79
        L6d:
            r2.close()     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            android.net.Uri r0 = r10.LIZIZ     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            java.io.InputStream r2 = r10.LIZIZ(r0)     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            if (r2 != 0) goto L79
            goto L12
        L79:
            r6.inJustDecodeBounds = r5     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            X.ZmA r0 = r10.LJ     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            int r9 = r6.outWidth     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            int r8 = r6.outHeight     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r7 = 1056964608(0x3f000000, float:0.5)
            if (r9 < r8) goto La0
            int r0 = r0.LJLL     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            float r1 = (float) r0     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            float r0 = (float) r8     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            float r1 = r1 * r0
            float r0 = (float) r9     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
        L8b:
            float r1 = r1 / r0
            float r1 = r1 + r7
            int r0 = (int) r1     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            int r8 = r8 / r0
            int r0 = java.lang.Integer.highestOneBit(r8)     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            int r0 = java.lang.Math.max(r4, r0)     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r6.inSampleSize = r0     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            boolean r0 = r10.isCancelled()     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            if (r0 == 0) goto La9
            goto Lb2
        La0:
            int r0 = r0.LJLL     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            float r1 = (float) r0     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r0 = 1091567616(0x41100000, float:9.0)
            float r1 = r1 * r0
            r0 = 1098907648(0x41800000, float:16.0)
            goto L8b
        La9:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2, r3, r6)     // Catch: java.io.IOException -> Lb8 java.lang.Throwable -> Lc0
            r2.close()     // Catch: java.io.IOException -> L7
            goto L7
        Lb2:
            r2.close()     // Catch: java.io.IOException -> L12
            goto L12
        Lb7:
            r2 = r3
        Lb8:
            if (r2 == 0) goto Lbd
            r2.close()     // Catch: java.io.IOException -> Lbd
        Lbd:
            r0 = r3
            goto L7
        Lc0:
            r0 = move-exception
            r3 = r2
            goto Lc4
        Lc3:
            r0 = move-exception
        Lc4:
            if (r3 == 0) goto Lc9
            r3.close()     // Catch: java.io.IOException -> Lc9
        Lc9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC90577Zgj.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        DialogC90914ZmA dialogC90914ZmA = this.LJ;
        dialogC90914ZmA.LLILLIZIL = null;
        if (!Objects.equals(dialogC90914ZmA.LLILLJJLI, this.LIZ) || !Objects.equals(this.LJ.LLILLL, this.LIZIZ)) {
            DialogC90914ZmA dialogC90914ZmA2 = this.LJ;
            dialogC90914ZmA2.LLILLJJLI = this.LIZ;
            dialogC90914ZmA2.LLILZIL = bitmap;
            dialogC90914ZmA2.LLILLL = this.LIZIZ;
            dialogC90914ZmA2.LLILZLL = this.LIZJ;
            boolean z = true;
            dialogC90914ZmA2.LLILZ = true;
            long uptimeMillis = SystemClock.uptimeMillis() - this.LIZLLL;
            DialogC90914ZmA dialogC90914ZmA3 = this.LJ;
            if (uptimeMillis <= 120) {
                z = false;
            }
            dialogC90914ZmA3.LJJIIJ(z);
        }
    }
}
