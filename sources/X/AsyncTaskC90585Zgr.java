package X;

import android.graphics.Bitmap;
import android.support.v4.media.MediaDescriptionCompat;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadAsyncTask;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Objects;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.Zgr, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class AsyncTaskC90585Zgr extends PthreadAsyncTask<Void, Void, Bitmap> {
    public final Bitmap LIZ;
    public final android.net.Uri LIZIZ;
    public int LIZJ;
    public final /* synthetic */ DialogC90863ZlL LIZLLL;

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-4829078628094117304"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        DialogC90863ZlL dialogC90863ZlL = this.LIZLLL;
        dialogC90863ZlL.LLIILII = false;
        dialogC90863ZlL.LLIILZL = null;
        dialogC90863ZlL.LLIIZ = 0;
    }

    public AsyncTaskC90585Zgr(DialogC90863ZlL dialogC90863ZlL) {
        Bitmap bitmap;
        this.LIZLLL = dialogC90863ZlL;
        MediaDescriptionCompat mediaDescriptionCompat = dialogC90863ZlL.LLIIIZ;
        if (mediaDescriptionCompat == null) {
            bitmap = null;
        } else {
            bitmap = mediaDescriptionCompat.mIcon;
            if (bitmap != null && bitmap.isRecycled()) {
                bitmap = null;
            }
        }
        this.LIZ = bitmap;
        MediaDescriptionCompat mediaDescriptionCompat2 = dialogC90863ZlL.LLIIIZ;
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
            openInputStream = this.LIZLLL.LJLLI.getContentResolver().openInputStream(uri);
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
            LIZ.setConnectTimeout(30000);
            LIZ.setReadTimeout(30000);
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
    public final java.lang.Object doInBackground(java.lang.Object[] r8) {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.LIZ
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
            r7.LIZJ = r5
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
            android.net.Uri r0 = r7.LIZIZ
            if (r0 == 0) goto Lb2
            java.io.InputStream r2 = r7.LIZIZ(r0)     // Catch: java.io.IOException -> Lac java.lang.Throwable -> Lb8
            if (r2 != 0) goto L56
            goto L12
        L56:
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            r6.<init>()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            r6.inJustDecodeBounds = r4     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            android.graphics.BitmapFactory.decodeStream(r2, r3, r6)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            int r0 = r6.outWidth     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            if (r0 == 0) goto La7
            int r0 = r6.outHeight     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            if (r0 != 0) goto L69
            goto La7
        L69:
            r2.reset()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> Lb5
            goto L79
        L6d:
            r2.close()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            android.net.Uri r0 = r7.LIZIZ     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            java.io.InputStream r2 = r7.LIZIZ(r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            if (r2 != 0) goto L79
            goto L12
        L79:
            r6.inJustDecodeBounds = r5     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            X.ZlL r0 = r7.LIZLLL     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            android.content.Context r0 = r0.LJLLI     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            r0 = 1812267045(0x6c050025, float:6.431513E26)
            int r1 = r1.getDimensionPixelSize(r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            int r0 = r6.outHeight     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            int r0 = r0 / r1
            int r0 = java.lang.Integer.highestOneBit(r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            int r0 = java.lang.Math.max(r4, r0)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            r6.inSampleSize = r0     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            boolean r0 = r7.isCancelled()     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            if (r0 == 0) goto L9e
            goto La7
        L9e:
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r2, r3, r6)     // Catch: java.io.IOException -> Lad java.lang.Throwable -> Lb5
            r2.close()     // Catch: java.io.IOException -> L7
            goto L7
        La7:
            r2.close()     // Catch: java.io.IOException -> L12
            goto L12
        Lac:
            r2 = r3
        Lad:
            if (r2 == 0) goto Lb2
            r2.close()     // Catch: java.io.IOException -> Lb2
        Lb2:
            r0 = r3
            goto L7
        Lb5:
            r0 = move-exception
            r3 = r2
            goto Lb9
        Lb8:
            r0 = move-exception
        Lb9:
            if (r3 == 0) goto Lbe
            r3.close()     // Catch: java.io.IOException -> Lbe
        Lbe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AsyncTaskC90585Zgr.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        DialogC90863ZlL dialogC90863ZlL = this.LIZLLL;
        dialogC90863ZlL.LLIIJI = null;
        if (!Objects.equals(dialogC90863ZlL.LLIIJLIL, this.LIZ) || !Objects.equals(this.LIZLLL.LLIIL, this.LIZIZ)) {
            DialogC90863ZlL dialogC90863ZlL2 = this.LIZLLL;
            dialogC90863ZlL2.LLIIJLIL = this.LIZ;
            dialogC90863ZlL2.LLIILZL = bitmap;
            dialogC90863ZlL2.LLIIL = this.LIZIZ;
            dialogC90863ZlL2.LLIIZ = this.LIZJ;
            dialogC90863ZlL2.LLIILII = true;
            dialogC90863ZlL2.LJJIFFI();
        }
    }
}
