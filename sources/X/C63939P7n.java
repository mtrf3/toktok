package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.Future;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.P7n, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63939P7n implements Closeable {
    public final java.net.URL LJLIL;
    public volatile Future<?> LJLILLLLZI;
    public C67646Qgk LJLJI;

    public static URLConnection LIZIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "5510025991537253784"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public final Bitmap LIZ() {
        URLConnection LIZIZ;
        URLConnection LIZIZ2;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        java.net.URL url = this.LJLIL;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZIZ = LIZIZ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
                LIZIZ = uRLConnection;
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
        if (LIZIZ.getContentLength() <= 1048576) {
            InputStream inputStream = LIZIZ.getInputStream();
            try {
                byte[] LIZIZ3 = C63940P7o.LIZIZ(new P9U(inputStream));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (LIZIZ3.length <= 1048576) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(LIZIZ3, 0, LIZIZ3.length);
                    if (decodeByteArray != null) {
                        return decodeByteArray;
                    }
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("Failed to decode image: ");
                    LIZ.append(this.LJLIL);
                    throw new IOException(X1D.LIZIZ(LIZ));
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        throw new IOException("Content-Length exceeds max size of 1048576");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLILLLLZI.cancel(true);
    }

    public C63939P7n(java.net.URL url) {
        this.LJLIL = url;
    }
}
