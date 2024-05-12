package X;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P7Z implements InterfaceC63926P7a {
    public static final P7Z LIZ = new P7Z();
    public static final int LIZIZ;
    public static final int LIZJ;

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-6894031328284784810"));
        return LIZJ2.LIZ ? (URLConnection) LIZJ2.LIZIZ : url.openConnection();
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LIZIZ = (int) timeUnit.toMillis(15L);
        LIZJ = (int) timeUnit.toMillis(10L);
    }

    public static final HttpURLConnection LIZIZ(android.net.Uri uri) {
        Object LIZ2;
        Object LIZ3;
        RuntimeException runtimeException;
        Object obj;
        T2R.LJIILLIIL(uri, "url must not be null");
        T2R.LJIILJJIL("only https connections are permitted", "https".equals(uri.getScheme()));
        java.net.URL url = new java.net.URL(uri.toString());
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            LIZ2 = LIZ(url);
        } else {
            PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
            PPD ppd = LJFF.LJFF;
            if (ppd == PPD.INTERCEPT && (obj = LJFF.LIZIZ) != null) {
                LIZ2 = (URLConnection) obj;
                if (LIZ2 instanceof HttpsURLConnection) {
                    LIZ3 = new PYT((HttpsURLConnection) LIZ2);
                } else if (LIZ2 instanceof HttpURLConnection) {
                    LIZ3 = new PYU((HttpURLConnection) LIZ2);
                }
                LIZ2 = LIZ3;
            } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
                LIZ3 = LIZ(url);
                if (LIZ3 instanceof HttpsURLConnection) {
                    LIZ2 = new PYT((HttpsURLConnection) LIZ3);
                } else {
                    if (LIZ3 instanceof HttpURLConnection) {
                        LIZ2 = new PYU((HttpURLConnection) LIZ3);
                    }
                    LIZ2 = LIZ3;
                }
            } else {
                throw runtimeException;
            }
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) LIZ2;
        httpURLConnection.setConnectTimeout(LIZIZ);
        httpURLConnection.setReadTimeout(LIZJ);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
