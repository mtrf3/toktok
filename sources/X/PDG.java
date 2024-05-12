package X;

import java.net.HttpURLConnection;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class PDG implements Runnable {
    public final java.net.URL LJLIL;
    public final byte[] LJLILLLLZI;
    public final InterfaceC51050K1u LJLJI;
    public final String LJLJJI;
    public final java.util.Map LJLJJL;
    public final /* synthetic */ C68186QpS LJLJJLL;

    public static URLConnection LIZJ(java.net.URL url) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400000, "java/net/URL", "openConnection", url, new Object[0], "java.net.URLConnection", new C65300Pk0(false, "()Ljava/net/URLConnection;", "-8261907262454631787"));
        return LIZJ.LIZ ? (URLConnection) LIZJ.LIZIZ : url.openConnection();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0144, code lost:
    
        if (r4 == null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0102, code lost:
    
        if (r4 == null) goto L54;
     */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00cf: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:207), block:B:76:0x00cf */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00d2: MOVE (r10 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:210), block:B:74:0x00d2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PDG.LIZIZ():void");
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

    public static URLConnection LIZ(java.net.URL url) {
        URLConnection pyu;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        URLConnection pyu2;
        if (!PY7.LIZJ() || !PPY.LIZ().enableUrlConnectionMonitor) {
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

    public PDG(C68186QpS c68186QpS, String str, java.net.URL url, byte[] bArr, C1HQ c1hq, InterfaceC51050K1u interfaceC51050K1u) {
        this.LJLJJLL = c68186QpS;
        QH7.LJI(str);
        this.LJLIL = url;
        this.LJLILLLLZI = bArr;
        this.LJLJI = interfaceC51050K1u;
        this.LJLJJI = str;
        this.LJLJJL = c1hq;
    }
}
