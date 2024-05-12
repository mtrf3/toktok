package X;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: X.P7c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C63928P7c implements InterfaceC63930P7e {
    public final ExecutorService LIZ = C16880lQ.LLLLZ(3);

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-8175355227177315879"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public static HttpURLConnection LIZIZ(C63932P7g c63932P7g, int i) {
        Object LIZ;
        String LLLZ;
        Object LIZ2;
        RuntimeException runtimeException;
        Object obj;
        String str = c63932P7g.LIZ;
        java.net.URL url = new java.net.URL(str);
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZ = LIZ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LIZ = (URLConnection) obj;
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
        HttpURLConnection httpURLConnection = (HttpURLConnection) LIZ;
        long j = c63932P7g.LIZIZ;
        if (j > 0) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bytes=");
            LIZ3.append(j);
            LIZ3.append("-");
            httpURLConnection.setRequestProperty("range", X1D.LIZIZ(LIZ3));
        }
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(5000);
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode >= 200) {
            if (responseCode < 300) {
                return httpURLConnection;
            }
            if (responseCode != 307 && responseCode != 308) {
                switch (responseCode) {
                }
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            httpURLConnection.disconnect();
            if (headerField != null && i > 0) {
                c63932P7g.LIZ = headerField;
                LIZIZ(c63932P7g, i - 1);
                return httpURLConnection;
            }
            if (i == 0) {
                LLLZ = C16880lQ.LLLZ("URL %1$s too many redirects", new Object[]{str});
            } else {
                LLLZ = C16880lQ.LLLZ("URL %1$s invalid redirect", new Object[]{str});
            }
            throw new IOException(LLLZ);
        }
        httpURLConnection.disconnect();
        throw new C63929P7d(KMP.LJ("error response code:", responseCode), responseCode);
    }
}
