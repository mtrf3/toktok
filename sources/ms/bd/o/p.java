package ms.bd.o;

import X.C03880Dg;
import X.C39519Ff9;
import X.C65300Pk0;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PY7;
import X.PYR;
import X.PYT;
import X.PYU;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes12.dex */
public final class p extends o {
    public volatile SSLSocketFactory LIZ;

    public static URLConnection LJIIIZ(URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "96173685894156"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // ms.bd.o.o
    public final Object[] LJ(String str, String str2, String str3) {
        return LJIIIIZZ(str, null, str3, str2, false, null);
    }

    @Override // ms.bd.o.o
    public final Object[] LJFF(String str, String str2, String str3, byte[] bArr) {
        return LJIIIIZZ(str, str2, str3, null, true, bArr);
    }

    @Override // ms.bd.o.o
    public final Object[] LJI(String str, String str2, String str3) {
        return LJIIIIZZ(str, str2, str3, null, false, null);
    }

    public static URLConnection LJII(URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return LJIIIZ(url);
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
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
            URLConnection LJIIIZ = LJIIIZ(url);
            if (LJIIIZ instanceof HttpsURLConnection) {
                pyu = new PYT((HttpsURLConnection) LJIIIZ);
            } else {
                if (!(LJIIIZ instanceof HttpURLConnection)) {
                    return LJIIIZ;
                }
                pyu = new PYU((HttpURLConnection) LJIIIZ);
            }
            return pyu;
        }
        throw runtimeException;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x047e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object[] LJIIIIZZ(java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, boolean r42, byte[] r43) {
        /*
            Method dump skipped, instructions count: 1242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ms.bd.o.p.LJIIIIZZ(java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, byte[]):java.lang.Object[]");
    }
}
