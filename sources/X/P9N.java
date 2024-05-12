package X;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class P9N implements Runnable {
    public static final C64061PCf LJLJI = new C64061PCf("RevokeAccessOperation", new String[0]);
    public final String LJLIL;
    public final C67742QiI LJLILLLLZI;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "8504226235558951683"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    public final void LIZIZ() {
        Status status = Status.RESULT_INTERNAL_ERROR;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) LIZ(new java.net.URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.LJLIL));
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            if (httpURLConnection.getResponseCode() == 200) {
                status = Status.RESULT_SUCCESS;
            } else {
                LJLJI.getClass();
            }
            LJLJI.getClass();
        } catch (IOException e) {
            C64061PCf c64061PCf = LJLJI;
            "IOException when revoking access: ".concat(String.valueOf(e.toString()));
            c64061PCf.getClass();
        } catch (Exception e2) {
            C64061PCf c64061PCf2 = LJLJI;
            "Exception when revoking access: ".concat(String.valueOf(e2.toString()));
            c64061PCf2.getClass();
        }
        this.LJLILLLLZI.LIZ(status);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public P9N(String str) {
        QH7.LJI(str);
        this.LJLIL = str;
        this.LJLILLLLZI = new C67742QiI((AbstractC67709Qhl) null);
    }

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LIZJ(url);
        }
        PPC<java.net.URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                pyu2 = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                pyu2 = new PYU((HttpURLConnection) uRLConnection2);
            }
            return pyu2;
        }
        if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            URLConnection LIZJ = LIZJ(url);
            if (LIZJ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LIZJ);
            } else {
                if (!(LIZJ instanceof HttpURLConnection)) {
                    return LIZJ;
                }
                pyu = new PYU((HttpURLConnection) LIZJ);
            }
            return pyu;
        }
        throw runtimeException;
    }
}
