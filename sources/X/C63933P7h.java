package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.P7h, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63933P7h implements InterfaceC63935P7j {
    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-3618738157968364525"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static Bitmap LIZLLL(C63934P7i c63934P7i) {
        Object LIZIZ;
        Object LIZIZ2;
        RuntimeException runtimeException;
        Object obj;
        java.net.URL url = new java.net.URL(c63934P7i.LIZ.toString());
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZIZ = LIZIZ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LIZIZ = (URLConnection) obj;
                if (LIZIZ instanceof HttpsURLConnection) {
                    LIZIZ2 = new PYT((HttpsURLConnection) LIZIZ);
                } else if (LIZIZ instanceof HttpURLConnection) {
                    LIZIZ2 = new PYU((HttpURLConnection) LIZIZ);
                }
                LIZIZ = LIZIZ2;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                LIZIZ2 = LIZIZ(url);
                if (LIZIZ2 instanceof HttpsURLConnection) {
                    LIZIZ = new PYT((HttpsURLConnection) LIZIZ2);
                } else {
                    if (LIZIZ2 instanceof HttpURLConnection) {
                        LIZIZ = new PYU((HttpURLConnection) LIZIZ2);
                    }
                    LIZIZ = LIZIZ2;
                }
            } else {
                throw runtimeException;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) LIZIZ;
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setUseCaches(true);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode < 300) {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream == null) {
                return null;
            }
            if (httpURLConnection.getHeaderFieldInt("Content-Length", -1) != 0) {
                try {
                    return LIZJ(inputStream, c63934P7i);
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                    return null;
                } finally {
                    C38891fp.LJIIJJI(inputStream);
                }
            }
            C38891fp.LJIIJJI(inputStream);
            throw new IOException("Received response with 0 content-length header.");
        }
        httpURLConnection.disconnect();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(responseCode);
        LIZ.append(" ");
        LIZ.append(httpURLConnection.getResponseMessage());
        throw new IOException(X1D.LIZIZ(LIZ));
    }

    @Override // X.InterfaceC63935P7j
    public final Bitmap LIZ(C63934P7i c63934P7i) {
        try {
            return LIZLLL(c63934P7i);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            return null;
        }
    }

    public static Bitmap LIZJ(InputStream inputStream, C63934P7i c63934P7i) {
        boolean z;
        P9T p9t = new P9T(inputStream);
        long LIZJ = p9t.LIZJ(65536);
        c63934P7i.getClass();
        byte[] bArr = new byte[12];
        if (p9t.read(bArr, 0, 12) == 12 && "RIFF".equals(new String(bArr, 0, 4, "US-ASCII")) && "WEBP".equals(new String(bArr, 8, 4, "US-ASCII"))) {
            z = true;
        } else {
            z = false;
        }
        p9t.LIZIZ(LIZJ);
        if (z) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[4096];
            while (true) {
                int read = p9t.read(bArr2);
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, null);
                }
            }
        } else {
            Bitmap decodeStream = BitmapFactory.decodeStream(p9t, null, null);
            if (decodeStream != null) {
                return decodeStream;
            }
            throw new IOException("Failed to decode stream.");
        }
    }
}
