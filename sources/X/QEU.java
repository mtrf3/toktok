package X;

import Y.ARunnableS30S0200000_11;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class QEU implements QF3 {
    public final /* synthetic */ QET LIZ;

    public static URLConnection LIZ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-8110991224624356431"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    @Override // X.QF3
    public final void run() {
        Object LIZ;
        Object LIZ2;
        RuntimeException runtimeException;
        Object obj;
        if (this.LIZ.LIZJ.get() == 8) {
            return;
        }
        java.net.URL url = new java.net.URL(this.LIZ.LJII);
        HttpURLConnection httpURLConnection = this.LIZ.LJIIJJI;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.LIZ.LJIIJJI = null;
        }
        QET qet = this.LIZ;
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
        qet.LJIIJJI = (HttpURLConnection) LIZ;
        boolean z = false;
        this.LIZ.LJIIJJI.setInstanceFollowRedirects(false);
        if (!((TreeMap) this.LIZ.LIZ).containsKey("User-Agent")) {
            QET qet2 = this.LIZ;
            java.util.Map<String, String> map = qet2.LIZ;
            qet2.getClass();
            ((TreeMap) map).put("User-Agent", null);
        }
        for (Map.Entry entry : ((TreeMap) this.LIZ.LIZ).entrySet()) {
            this.LIZ.LJIIJJI.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        QET qet3 = this.LIZ;
        if (qet3.LJ == null) {
            qet3.LJ = "GET";
        }
        qet3.LJIIJJI.setRequestMethod(qet3.LJ);
        QET qet4 = this.LIZ;
        C66663QEh c66663QEh = qet4.LJFF;
        if (c66663QEh != null) {
            Executor executor = qet4.LJI;
            qet4.getClass();
            qet4.LJIIL = new QEZ(qet4, executor, null, qet4.LJIIJJI, c66663QEh);
            QET qet5 = this.LIZ;
            QEZ qez = qet5.LJIIL;
            if (((ArrayList) qet5.LIZIZ).size() == 1) {
                z = true;
            }
            qez.getClass();
            qez.LLLLZ(new QEV(qez, z));
            return;
        }
        qet4.LJIIJJI.connect();
        QET qet6 = this.LIZ;
        qet6.getClass();
        new ARunnableS30S0200000_11(qet6, new QES(qet6), 25);
        throw null;
    }

    public QEU(QET qet) {
        this.LIZ = qet;
    }
}
