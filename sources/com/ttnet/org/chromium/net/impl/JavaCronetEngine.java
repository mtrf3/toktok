package com.ttnet.org.chromium.net.impl;

import X.AbstractC66659QEd;
import X.AbstractC66666QEk;
import X.C16880lQ;
import X.PPC;
import X.PPD;
import X.PPY;
import X.PU3;
import X.PY7;
import X.PYR;
import X.PYT;
import X.PYU;
import X.QE8;
import X.QEH;
import X.QEM;
import X.QEN;
import X.QER;
import X.QET;
import X.QF2;
import X.QFK;
import X.QFM;
import X.QFS;
import X.QFU;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes12.dex */
public final class JavaCronetEngine extends QEM {
    @Override // X.QEK
    public final QFS LIZ() {
        return null;
    }

    @Override // X.AbstractC66650QDu
    public final void LJI(AbstractC66666QEk abstractC66666QEk) {
    }

    @Override // X.AbstractC66650QDu
    public final int LJIIL() {
        return -1;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIILIIL() {
        return 0;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIJ() {
        return -1;
    }

    @Override // X.AbstractC66650QDu
    public final int LJIJJLI() {
        return -1;
    }

    @Override // X.QEM
    public final QFU LJJJJI(QF2 qf2, Executor executor, int i, List<String> list, int i2, int i3, int i4) {
        return null;
    }

    @Override // X.QEM
    public final QFK LJJJJJ(QFM qfm, Executor executor, List list, int i, String str, long j, int i2, long j2, String str2, int i3, Map map, Map map2, boolean z) {
        return null;
    }

    @Override // X.QEM
    public final QFK LJJJJJL(QFM qfm, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    static {
        C16880lQ.LJLLJ(JavaCronetEngine.class);
    }

    @Override // X.QEK
    public final URLConnection LJ(URL url) {
        URLConnection openConnection;
        RuntimeException runtimeException;
        URLConnection uRLConnection;
        if (!PYR.LIZLLL() || !PPY.LIZ().enableUrlConnectionMonitor) {
            return url.openConnection();
        }
        PPC<URL, URLConnection> LJFF = PY7.LIZLLL.LJFF(new PPC<>(url, null, null, null, null, PPD.CONTINUE));
        PPD ppd = LJFF.LJFF;
        if (ppd == PPD.INTERCEPT && (uRLConnection = LJFF.LIZIZ) != null) {
            URLConnection uRLConnection2 = uRLConnection;
            if (uRLConnection2 instanceof HttpsURLConnection) {
                openConnection = new PYT((HttpsURLConnection) uRLConnection2);
            } else {
                if (!(uRLConnection2 instanceof HttpURLConnection)) {
                    return uRLConnection2;
                }
                openConnection = new PYU((HttpURLConnection) uRLConnection2);
            }
        } else if (ppd != PPD.EXCEPTION || (runtimeException = LJFF.LJ) == null) {
            openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                return new PYT((HttpsURLConnection) openConnection);
            }
            if (openConnection instanceof HttpURLConnection) {
                return new PYU((HttpURLConnection) openConnection);
            }
        } else {
            throw runtimeException;
        }
        return openConnection;
    }

    @Override // X.QEM, X.AbstractC66650QDu, X.QEK
    public final QEH LIZJ(String str, QE8 qe8, PU3 pu3) {
        return new QEN(str, qe8, pu3, this);
    }

    @Override // X.QEM
    public final AbstractC66659QEd LJJJJIZL(String str, QER qer, Executor executor, int i, boolean z, boolean z2, int i2, boolean z3, int i3, long j) {
        if (j == -1) {
            new QET(this, qer, executor, str, z2, i2, z3, i3);
            throw null;
        }
        throw new UnsupportedOperationException("The multi-network API is not supported by the Java implementation of Cronet Engine");
    }
}
